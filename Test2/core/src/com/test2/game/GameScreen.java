package com.test2.game;
/////hintergrund geändert das ist nicht sichtbar, weil ich keinen dateiname werändert habe oder hinzugefügt habe das krigt github nähmlich nicht mit
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


import java.util.Timer;
import java.util.TimerTask;

public class GameScreen extends ScreenAdapter {

    public static GameScreen INSTANCE;


    SpriteBatch batch;
    Texture img;
    Texture block_l;
    Texture block_rot;
    Texture block_gruen;
    Texture block_blau;
    Texture paddelimg;
    Texture block_k;
    Texture block_kleber;
    ShapeRenderer shapeRenderer;
    BitmapFont font;
    Texture hintergrund;
    Texture block_feuer;
    Texture paddelklebimg;
    Texture block_schneller;
    Texture block_langsamer;
    Texture block_2mal;
    Texture block_unzerstoerbar;
    Texture status_bar;
    Texture hintergrund2;
    Texture pause;

    int frame = 0;
    Texture imgfeuerball;
    Sprite feuerball;
    TextureRegion[][] regions;



    //Kaesten k;
    public GameScreen() {
        INSTANCE = this;
        batch = new SpriteBatch();
        font = new BitmapFont();
        block_l = new Texture("block_l.png");
        block_rot = new Texture("block_rot.png");
        block_gruen = new Texture("block_gruen.png");
        block_blau = new Texture("block_blau.png");
        paddelimg = new Texture("paddel.png");
        img = new Texture("badlogic.jpg");
        block_k= new Texture("block_k.png");
        block_kleber= new Texture("block_kleber.png");
        hintergrund= new Texture("hintergrund.png");
        block_feuer= new Texture("block_feuer.png");
        paddelklebimg= new Texture("paddelkleb.png");
        block_schneller= new Texture("block_schneller.png");
        block_langsamer= new Texture("block_langsamer.png");
        block_2mal = new Texture("block_2mal.png");
        block_unzerstoerbar = new Texture("block_unzerstoerbar.png");
        status_bar = new Texture("statusbar.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        pause = new Texture("Pause.png");



        shapeRenderer = new ShapeRenderer();
        Level.LevelCreate(1);

        imgfeuerball =new Texture("ballfeueranimation.png");
        final TextureRegion[][] regions = TextureRegion.split(imgfeuerball, 100,100);
        feuerball = new Sprite(regions[0][0]);
        Timer a;
        a= new Timer();

        a.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {

                frame++;
                if(frame>3){
                    frame=0;
                }

                feuerball.setRegion(regions[0][frame]);
            }
        },0, 10);



        FallKasten.autocreate(10000);




    }

    void statusBar(){


    }

    void klebt(){



        Ball.y=Var.r_y+40;
        Ball.x=Var.r_x+Var.ballklebposition;
        Var.ballupdate=false;

        if(DoppelKlick.DoppelKlick()==1) {
            Ball.bx=0;
            Ball.by=-15;
            Var.klebt=false;
            Var.ballupdate=true;
        }
    }


    @Override
    public void render(float delta) {
        SpeichernLesen.speichern();
        // SpeichernLesen.lesen();
        if (Var.klebt == true) {
            klebt();
        }

        FallKasten.de = delta;

        if (Var.gamestatus == 0) {
            if (DoppelKlick.DoppelKlick() == 1) {
                new Ball((int) (Var.r_x + Var.r_l / 2) - Ball.r, (int) (Var.r_y + 100), 15, 0f, -15f, 0.0f, 1f);

                Var.gamestatus = 1;


            }

        }

        if (Var.gamestatus != 3){
            if (Var.steuerung == 0) {
                if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                    if (Var.r_x > 0) {
                        Var.r_x -= Var.r_speed * delta;

                    }
                }
                if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
                    if (Var.r_x < Gdx.graphics.getWidth() - Var.r_l) {
                        Var.r_x += Var.r_speed * delta;
                    }
                }
            }


        if (Var.steuerung == 0) {
            if (Gdx.input.isTouched() == true) {
              /*  //System.out.println(Gdx.input.getX());

                if (Gdx.input.getX() < Gdx.graphics.getWidth() / 2) {
                    if (Var.r_x > 0) {
                        Var.r_x -= Var.r_speed * delta;
                    }
                }
                if (Gdx.input.getX() > Gdx.graphics.getWidth() / 2) {
                    if (Var.r_x < Gdx.graphics.getWidth() - Var.r_l) {
                        Var.r_x += Var.r_speed * delta;
                    }
                }*/
                if (Gdx.input.getX() - Var.r_l / 2 > 0 && Gdx.input.getX() - Var.r_l / 2 < Gdx.graphics.getWidth() - Var.r_l) {
                    Var.r_x = Gdx.input.getX() - Var.r_l / 2;
                }
            }
        }
        if (Var.steuerung == 1) {
            if (Var.r_x > 0 || Var.r_x < Gdx.graphics.getWidth() - Var.r_l) {
                Var.r_x += Gdx.input.getAccelerometerX() * delta * 300 * -1;
            }
        }
    }


        if(Ball.x > Var.r_x && Ball.y < Var.r_y+40 && Var.r_x+Var.r_l > Ball.x){
            if(Var.kleben==0) {
                Ball.by = Ball.by * -1;
            }
            if(Var.kleben==1){
                Var.klebt=true;
                Var.ballklebposition=(int)Ball.x - (int)Var.r_x;
            }
            Gdx.input.vibrate(50);
            System.out.println((Ball.x-Var.r_x)-Var.r_l/2);
            Ball.bx -= ((Ball.x-Var.r_x)-Var.r_l/2)*Var.s;
            Var.points += 1;
            Var.r_speed +=5;
        }
        if(Ball.y < Var.r_y && Var.p==0){
            FallKasten.zuruecksetzen();
            Var.leben -= 1;
            Var.p=1;
            Var.gamestatus=0;
            Ball.dispose();
        }
        if(Ball.y > Var.r_y){
            Var.p=0;
        }

        /*
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            Var.r_y += Var.r_speed * delta;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            Var.r_y -= Var.r_speed * delta;
        }

        */

        if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
        /*if(Gdx.input.isTouched()) {
            Gdx.input.vibrate(100);
        }*/



















        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());                ////////////
        if(Var.ballmode==1) {
            batch.draw(feuerball, Ball.x, Ball.y, 30, 30);
        }

        for(int i=0;i<FallKasten.Fallkasten.size();i=i+1) {
            Var.i=i;
            FallKasten FK;
            FK =FallKasten.Fallkasten.get(i);
            if(Var.gamestatus==1) {
                FK.update();
            }
            FK.check();
            if(FK.check()==1 && FK.art !=0){
                switch (FK.art) {
                    case 1:
                        if(Var.r_l < 400) {
                            Var.r_l += 50;
                        }
                        break;
                    case 2:
                        if(Var.r_l > 100) {
                            Var.r_l -= 50;
                        }
                        break;
                    case 3:
                        Var.ballmode = 1;
                        break;
                    case 4:
                        Var.kleben=1;
                        break;
                    case 5:
                        Ball.by += Ball.by/2;
                        break;
                    case 6:
                        Ball.by -= Ball.by/2;
                        break;
                }
                FK.art=0;
            }
            if(FK.art != 0) {
                switch (FK.art) {
                    case 1:
                    batch.draw(block_l, FK.x, FK.y, 100, 50);
                    break;

                    case 2:
                        batch.draw(block_k, FK.x, FK.y, 100, 50);
                        break;

                    case 3:
                        batch.draw(block_feuer, FK.x, FK.y, 100, 50);
                        break;
                    case 4:
                        batch.draw(block_kleber, FK.x, FK.y, 100, 50);
                        break;
                    case 5:
                        batch.draw(block_schneller, FK.x, FK.y, 100, 50);
                        break;
                    case 6:
                        batch.draw(block_langsamer, FK.x, FK.y, 100, 50);
                        break;



                }
            }
        }
        if(Var.kleben==0) {
            batch.draw(paddelimg, Var.r_x, Var.r_y, Var.r_l, 30);
        }
        if(Var.kleben==1)   {
            batch.draw(paddelklebimg, Var.r_x, Var.r_y, Var.r_l, 30);
        }

        batch.setColor(1,1,1,0.5f);
        batch.draw(status_bar,0,Gdx.graphics.getHeight()-50,Gdx.graphics.getWidth(),50);
        batch.setColor(1,1,1,1f);
        font.getData().setScale(3);
        font.draw(batch, "Leben:" + Var.leben, Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-5);
        font.getData().setScale(3);

        batch.draw(pause,Var.Button_Pause_x,Var.Button_Pause_y,Var.Button_Pause_Width,Var.Button_Pause_Height);
        if(Gdx.input.getX() < Var.Button_Pause_Width+Var.Button_Pause_x && Gdx.input.getX() > Var.Button_Pause_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_Pause_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_Pause_y-Var.Button_Pause_Height){
            if(Gdx.input.isTouched()){
                //Test2.INSTANCE.setScreen(new PauseScreen());
                Var.gamestatus=3;
            }
        }

        //font.draw(batch, "" + SpeichernLesen.input, 0, Gdx.graphics.getHeight()-30);



        int b_zahl=0;
        for(int i=0;i<Level.kisten.size();i=i+1) {
            Kaesten k;
            k = Level.kisten.get(i);




            if(k.v==1 && k.K_art!=4){
                b_zahl += 1;
            }

                k.checkKolission();
                if(k.v==1) {
                    switch (k.K_art) {
                        case 0 :
                            batch.draw(block_rot, k.K_x, k.K_y, k.K_w, k.K_h);
                        break;
                        case 1 :
                            batch.draw(block_gruen, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;
                        case 2 :
                            batch.draw(block_blau, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;
                        case 3 :
                            if(k.o==0) {
                                batch.draw(block_2mal, k.K_x, k.K_y, k.K_w, k.K_h);
                            }
                            if(k.o==1){
                                batch.setColor(1,1,1,0.5f);
                                batch.draw(block_2mal, k.K_x, k.K_y, k.K_w, k.K_h);
                                batch.setColor(1,1,1,1f);
                            }
                            break;
                        case 4 :
                            batch.draw(block_unzerstoerbar, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;

                    }

                }
                Var.KY = k.K_y;


        }

        if(b_zahl == 0){
            Level.Levelup();
        }


        batch.end();









        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(1,1,0,0f);


        //shapeRenderer.rect(Var.r_x,20,Var.r_l,20);
        if(Var.ballupdate==true) {
            if(Var.gamestatus==1) {
                Ball.update();
            }
        }

        if(true) {
            switch (Var.ballmode) {
                case 0:
                shapeRenderer.setColor(1,1,0,0);
                shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);
                    break;

            }
        }
        if(Var.gamestatus==0){
            shapeRenderer.ellipse((int)(Var.r_x+Var.r_l/2)-15, (int)(Var.r_y+100), 15 * 2, 15 * 2);
        }
        //shapeRenderer.ellipse(Var.r_x-Ball.x, 40, 5,5);



        shapeRenderer.end();


        if(Var.leben <= 0){
            Ball.dispose();
            Var.gamestatus = 3;
            Var.leben=3;
            Level.kisten.clear();
            Test2.INSTANCE.setScreen(new GameOverScreen());

        }

    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        shapeRenderer.dispose();
        font.dispose();
    }

    @Override
    public void hide() {
        this.dispose();
    }
}
