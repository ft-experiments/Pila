package com.test2.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import static java.lang.System.currentTimeMillis;


public class GameScreen extends ScreenAdapter {

    public static GameScreen INSTANCE;

    LoadSave LoadSave;
    SpriteBatch batch;
    Texture countdown1;
    Texture countdown2;
    Texture countdown3;
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
    Texture weiter;
    Texture einstellungen;
    touchinput.Button Levelauswahl;
    touchinput.Button Buttonstart;
    touchinput.Button Weiter;
    touchinput.Button neustartbutton;
    Texture buttonimage;
    Texture bigpause;
    Smooth ka;
    long c= currentTimeMillis();
    int u=0;
    int countdown=0;
    static int gamestatuspausesave= -1;
    int frame = 0;
    Texture imgfeuerball;
    Sprite feuerball;
    TextureRegion[][] regions;





    //Kaesten k;
    public GameScreen() {



        INSTANCE = this;
        LoadSave = new LoadSave();
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
        weiter = new Texture("Weiter.png");
        einstellungen = new Texture("einstellungen.png");
        buttonimage = new Texture("Button.png");
        bigpause = new Texture("bigpause.png");
        countdown1 = new Texture("countdown1.png");
        countdown2 = new Texture("countdown2.png");
        countdown3 = new Texture("countdown3.png");
        ka = new Smooth();

        Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,Gdx.graphics.getHeight()-500,600,300);
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-(int)(Gdx.graphics.getHeight()/2.732f),400,(int)(Gdx.graphics.getHeight()/14.8f));
        neustartbutton = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-(int)(Gdx.graphics.getHeight()/2.089f),400,(int)(Gdx.graphics.getHeight()/14.8));
        Weiter = new touchinput.Button(Gdx.graphics.getWidth()/2-100,Gdx.graphics.getHeight()/2-(int)(Gdx.graphics.getHeight()/5.92),200,200);


        new Ablauf();

        shapeRenderer = new ShapeRenderer();
        if(Var.gamestatus==0) {
            Level.LevelCreate(Var.createlevel);
        }
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
        },0, 100);








    }

    void statusBar(){


    }

    void klebt(){
        float bys=Ball.by;



        Ball.y=Var.r_y+40;
        Ball.x=Var.r_x+Var.ballklebposition;
        Var.ballupdate=false;

        if(DoppelKlick.DoppelKlick()==1) {
            Ball.bx=0;
            Ball.by=-bys;
            Var.klebt=false;
            Var.ballupdate=true;
            Ablauf.klebablauf-=100;

        }
    }


    @Override
    public void render(float delta) {
        //System.out.println(delta);
        Var.ingame = true;
        LoadSave.saveall();
        if(LevelAuswahlButtons.newlevel==1) {
            Level.dispose();
            Ball.dispose();
            Level.LevelCreate(Var.createlevel);
            LevelAuswahlButtons.newlevel=0;
        }

       

       // System.out.println("gamestatus "+ Var.gamestatus);
        if (Var.klebt == true) {
            klebt();
        }

        FallKasten.de = delta;

        if (Var.gamestatus == 0) {
            if(Var.ballstartmode==0) {
                 if (DoppelKlick.DoppelKlick() == 1 || Gdx.input.getAccelerometerY()>10) {

                new Ball((int) (Var.r_x + Var.r_l / 2) - Ball.r, (int) (Var.r_y + 100), 15, 0f, -15f, 0.0f, 1f);
                Var.gamestatus = 1;


                 }
            }else if(Var.ballstartmode==1){
                new Ball((int) (Var.r_x + Var.r_l / 2) - Ball.r, (int) (Var.r_y + 100), 15, 0f, -15f, 0.0f, 1f);
                Var.gamestatus = 1;
            }

        }

        if (Var.gamestatus != 3){

            /*if (Var.steuerung == 0) {
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
*/

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

                Var.r_x += Gdx.input.getAccelerometerX() * delta * 300 * -1;
                if(Var.r_x < 0){
                    Var.r_x=0;
                }
            if(Var.r_x > Gdx.graphics.getWidth()-Var.r_l){
                Var.r_x=Gdx.graphics.getWidth()-Var.r_l;
            }

        }
    }


        if(Ball.x+Ball.r*2 > Var.r_x && Ball.y < Var.r_y+40 && Var.r_x+Var.r_l > Ball.x){
            if(Var.kleben==0) {
                Ball.by = Ball.by * -1;
            }
            if(Var.kleben==1){
                Var.klebt=true;
                Var.ballklebposition=(int)Ball.x - (int)Var.r_x;
            }
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
            //System.out.println((Ball.x-Var.r_x)-Var.r_l/2);
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
            batch.setColor(Ablauf.feuerballablauf/100f,Ablauf.feuerballablauf/100f,Ablauf.feuerballablauf/100f,1);  //Die animation des feuerballs wird immer dunkler
            batch.draw(feuerball, Ball.x, Ball.y, 30, 30); //Der Feuerball wird gedrawd
            batch.setColor(1,1,1,1);
        }
        int zaeler = 0;
        for(int i=0;i<FallKasten.Fallkasten.size();i=i+1) {//Hier wird abgecheckt ob man einen Fallkasten eingesammelt hat und wenn, dann wird das entsprechende gestartet
            Var.i=i;
            FallKasten FK;
            FK =FallKasten.Fallkasten.get(i);
            if(Var.gamestatus==1) {
                FK.update();
            }
            FK.check();
            if(FK.check()==1 && FK.art !=0){
                switch (FK.art) {
                    case 1:        //paddel wird größer
                        if(Var.r_l < 400) {
                            Var.r_l += 50;
                        }
                        break;
                    case 2:       //paddel wird kleiner
                        if(Var.r_l > 100) {
                            Var.r_l -= 50;
                        }
                        break;
                    case 3:        //Der feuerball wird gestartet
                        Var.ballmode = 1;
                        Ablauf.feuerballablauf=1000;
                        Ablauf.feuerballzuruck();
                        break;
                    case 4:         //Das Klebepaddel wird gestartet
                        Var.kleben=1;
                        Ablauf.klebzuruck();
                        break;
                    case 5:         //Der Ball wird schneller
                        Ball.by += Ball.by/2;
                        break;
                    case 6:         //Der Ball wird langsamer
                        Ball.by -= Ball.by/2;
                        break;
                }
                FK.art=0;
            }
            if(FK.art != 0) {
                zaeler+=1;
                switch (FK.art) {               //hier werden die Fall kasten je nach art gedrawd


                    case 1://läner mach Block
                         batch.draw(block_l, FK.x, FK.y, 100, 50);
                    break;

                    case 2://kürzer mach Block
                        batch.draw(block_k, FK.x, FK.y, 100, 50);
                        break;

                    case 3://feuerball Block
                        batch.draw(block_feuer, FK.x, FK.y, 100, 50);
                        break;
                    case 4://Klebepaddel Block
                        batch.draw(block_kleber, FK.x, FK.y, 100, 50);
                        break;
                    case 5://Ball schneller mach Block
                        batch.draw(block_schneller, FK.x, FK.y, 100, 50);
                        break;
                    case 6://Ball langsamer mach Block
                        batch.draw(block_langsamer, FK.x, FK.y, 100, 50);
                        break;



                }
            }

        }
        Var.existfallbox=zaeler;


        if(Var.kleben==0) {
            batch.draw(paddelimg, Var.r_x, Var.r_y, Var.r_l, 30);
        }
        if(Var.kleben==1)   {
            batch.draw(paddelklebimg, Var.r_x, Var.r_y, Var.r_l, 30);
        }

        ////////////////////////////STATUS//BAR/////////////////////////////

        //status Bar wird grau gedrawd und die Lebgen und Level werden angezeigt
        batch.setColor(1,1,1,0.5f);
        batch.draw(status_bar,0,Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/25,Gdx.graphics.getWidth(),Gdx.graphics.getHeight()/25);
        batch.setColor(1,1,1,1f);
        font.getData().setScale(Gdx.graphics.getHeight()/426,Gdx.graphics.getHeight()/426);
        font.draw(batch, "Leben:" + Var.leben, Gdx.graphics.getWidth()-(Gdx.graphics.getHeight()/426)*53, Gdx.graphics.getHeight()-5);
        font.draw(batch, "Level:" + Level.Le + " ", Gdx.graphics.getWidth()/2-150/2, Gdx.graphics.getHeight()-5);
        font.getData().setScale(3);

        /////Pause//Button///////////
        if(Gdx.input.getX() < Var.Button_Pause_Width + Var.Button_Pause_x && Gdx.input.getX() > Var.Button_Pause_x && Gdx.input.getY() < Gdx.graphics.getHeight() - Var.Button_Pause_y && Gdx.input.getY() > Gdx.graphics.getHeight() - Var.Button_Pause_y - Var.Button_Pause_Height)
        {
            if(Gdx.input.isTouched()){
                u=1;
            }else{
                if(u==1 && !Gdx.input.isTouched()) {

                    if(Var.gamestatus==1){
                        Var.gamestatus=3;
                    }else if(Var.gamestatus==3){
                        if(gamestatuspausesave==0){
                            Var.gamestatus=gamestatuspausesave;
                            gamestatuspausesave=-1;
                        }else {
                            Var.gamestatus = 1;
                        }
                    }else if(Var.gamestatus==0){
                        Var.gamestatus=3;
                        gamestatuspausesave=0;
                    }



                    u=0;
                }

            }
        }
        if(Var.gamestatus != 3) {
            batch.draw(pause, Var.Button_Pause_x, Var.Button_Pause_y, Var.Button_Pause_Width, Var.Button_Pause_Height);
        }
        if(Var.gamestatus == 3 ){
           // batch.draw(weiter, Var.Button_Pause_x, Var.Button_Pause_y, Var.Button_Pause_Width, Var.Button_Pause_Height);
        }

        //////////////einstellungs//Button////////////
        if(Gdx.input.isTouched()) {
            if (Gdx.input.getX() < Var.Button_einstellungen_Width + Var.Button_einstellungen_x && Gdx.input.getX() > Var.Button_einstellungen_x && Gdx.input.getY() < Gdx.graphics.getHeight() - Var.Button_einstellungen_y && Gdx.input.getY() > Gdx.graphics.getHeight() - Var.Button_einstellungen_y - Var.Button_einstellungen_Height) {
                if(Var.gamestatus==0){
                    gamestatuspausesave=0;
                }
                Var.gamestatus=3;
                Test2.INSTANCE.setScreen(new OptionScreen());
            }
        }
        batch.draw(einstellungen, Var.Button_einstellungen_x, Var.Button_einstellungen_y, Var.Button_einstellungen_Width, Var.Button_einstellungen_Height);



        /////////////Status/Bar/Ende///////////////////


        int b_zahl=0;
        for(int i=0;i<Level.kisten.size();i=i+1) {    ////////////////DIE//SPIEL//BLÖCKE//WERDEN//GEDRAWD//////////
            Kaesten k;
            k = Level.kisten.get(i);





            if(k.v==1 && k.K_art!=4 && k.K_art!=5){
                    b_zahl += 1;
            }

                k.checkKolission();
                if(k.v==1) {
                    switch (k.K_art) {
                        case 0 :            //Roter Block
                            batch.draw(block_rot, k.K_x, k.K_y, k.K_w, k.K_h);
                        break;
                        case 1 :            //Gruener Block
                            batch.draw(block_gruen, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;
                        case 2 :            //Blauer Block
                            batch.draw(block_blau, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;
                        case 3 :            //zweimal beruehr Block
                            if(k.o==0) {
                                batch.draw(block_2mal, k.K_x, k.K_y, k.K_w, k.K_h);
                            }
                            if(k.o==1){
                                batch.setColor(1,1,1,0.5f);
                                batch.draw(block_2mal, k.K_x, k.K_y, k.K_w, k.K_h);
                                batch.setColor(1,1,1,1f);
                            }
                            break;
                        case 4 :            //unzerstoerbarer Block
                            batch.draw(block_unzerstoerbar, k.K_x, k.K_y, k.K_w, k.K_h);
                            break;

                    }

                }
                Var.KY = k.K_y;

           /* batch.end();
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(1,1,0,0f);
            shapeRenderer.rect(k.mx,k.my,2,2);
            shapeRenderer.rect(k.mx2,k.my2,2,2);
            shapeRenderer.end();
            batch.begin();*/
        }

        if(b_zahl == 0){        //////Wenn Keine SpielBlöcke mehr da sind gehts ein Level hoch///////////////////////
            Level.Levelup();
        }


        //////////////////DAS//PAUSE//POPUP//BEGINNT//HIER///////////////////////////////
        if(Var.gamestatus == 3 && Var.pausebeenden==0){
            batch.setColor(0,0,0,0.6f);
            batch.draw(status_bar,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());    //StatusBar wird grau gedrawd
            batch.end();



            batch.setColor(1f, 1f, 1f, 0.6f);


            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(0.4f, 0.2f, 0.8f, 0.6f);
            shapeRenderer.rect(Gdx.graphics.getWidth()/2-250,Gdx.graphics.getHeight()/2-350,500,Gdx.graphics.getHeight()/1.828f);//Der Popup Hintergrund wied lila gedrawd
            shapeRenderer.end();
            batch.begin();
            batch.setColor(0.4f, 0.2f, 0.8f, 0.6f);
            batch.draw(bigpause, Weiter.x, Weiter.y, Weiter.w, Weiter.h );  //Der BigPause Button wird gedrawd
            batch.setColor(1f,1f,1f,1f);




            font.getData().setScale(4);
///////LevelAuswhlButtonwird gedrawd
            font.draw(batch, "Levelauswahl" , Levelauswahl.x+30, Levelauswahl.y+Levelauswahl.h/2+25);
            batch.draw(buttonimage, Levelauswahl.x,Levelauswahl.y,Levelauswahl.w,Levelauswahl.h);
            if(Levelauswahl.isPressed()==1){       //Wenn der Levelauswahl button gedrückt ist








                Test2.INSTANCE.setScreen(new LevelAuswahlScreen("game")); //////wechsle den Screen zum LevelAuswahlScreen

            }
                ////////////////////////////Der Neustart Button//////////////////////////////
            font.draw(batch, "neustart" , neustartbutton.x+30, neustartbutton.y+neustartbutton.h/2+25);
            batch.draw(buttonimage, neustartbutton.x,neustartbutton.y,neustartbutton.w,neustartbutton.h);
            if(neustartbutton.isPressed()==1){/////wenn der Button gedrückt wird wird das Level Neugestartet
                Level.dispose();                //Level array clearen
                Level.LevelCreate(Level.Le);   //Das Level neu ins Levelarray schreiben
                FallKasten.Fallkasten.clear();//////Die Fallkästen Löschen
            }
            batch.end();
            if(Weiter.isPressed()==1){      ////////Wenn der weiterbutton gedrückt ist
                if(gamestatuspausesave==0){
                    Var.gamestatus=gamestatuspausesave;       ////wird die Pause Beendet
                    gamestatuspausesave=-1;
                }else {
                    if(Var.pausebeenden==0) {
                        Var.pausebeenden = 1;
                    }

                }

            }












            batch.begin();

        }
        if(Var.pausebeenden==1){
            Var.pausebeenden=2;
            c=currentTimeMillis();
            }
        if(Var.pausebeenden==2) {
            System.out.println("tata");
            if(currentTimeMillis()>c+1000){
                System.out.println("tatatiti");
                c=currentTimeMillis();
                countdown+=1;
        }

            if(countdown>=3){
                Var.gamestatus=1;
                Var.pausebeenden=0;
                countdown=0;
            }
            if(countdown==0){
                batch.draw(countdown1, 0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
            }
            if(countdown==1){
                batch.draw(countdown2, 0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
            }
            if(countdown==2){
                batch.draw(countdown3, 0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
            }

        }

/////////////////////////DAS//PAUSEPOPUP//ENDED//HIER//////////////////////////////

        batch.end();












        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(1,1,0,0f);

    if(Var.gamestatus!=3) {
        //shapeRenderer.rect(Var.r_x,20,Var.r_l,20);
        if (Var.ballupdate == true) {
            if (Var.gamestatus == 1) {
                Ball.update();
            }
        }

        if (true) {
            switch (Var.ballmode) {
                case 0:
                    shapeRenderer.setColor(1, 1, 0, 0);
                    shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);          ////Normale Ball wird gedrawd
                    break;

            }
        }
        if (Var.gamestatus == 0) {
            shapeRenderer.ellipse((int) (Var.r_x + Var.r_l / 2) - 15, (int) (Var.r_y + 100), 15 * 2, 15 * 2);
        }
        //shapeRenderer.ellipse(Var.r_x-Ball.x, 40, 5,5);

    }


    //ablauf der objekte
        if(Var.ballmode==1){
            shapeRenderer.setColor(1, 0, 0, 0);
            shapeRenderer.rect(0,Gdx.graphics.getHeight()-25,Ablauf.feuerballablauf/5,25);
            if(Ablauf.feuerballablauf<=0){
                Var.ballmode=0;
            }
        }

        if(Var.kleben==1){
            shapeRenderer.setColor(0, 1, 0, 0);
            shapeRenderer.rect(0,Gdx.graphics.getHeight()-50,Ablauf.klebablaufsoll/5,25);
            if(Ablauf.klebablaufsoll<=0){
                Var.kleben=0;
                Ablauf.klebablaufsoll=1000;
            }
        }





        shapeRenderer.end();
        batch.begin();
        if(Var.ballmode==1) {
            font.getData().setScale(2);
            font.draw(batch, ""+Ablauf.feuerballablauf/10+"%", 50, Gdx.graphics.getHeight()-3);  //Die Feuerball ablaufanzeige wird gedrawd

        }
        if(Var.kleben==1){
            font.getData().setScale(2);
            font.draw(batch, ""+Ablauf.klebablaufsoll/10+"%", 50, Gdx.graphics.getHeight()-3-25);   //Die Klebepaddel ablaufanzeige wird gerawd
        }
        batch.end();


        if(Var.leben <= 0){          //Wenn keine Leben mehr da sind dann
            Ball.dispose();
            Level.dispose();
            Test2.INSTANCE.setScreen(new GameOverScreen());        //gehe zu GameOverScreen

        }



///////////////////Die FPS Anzeige///////////////////////
        if(Var.showfps) {
            batch.begin();
            batch.setColor(1,0,0,1);
            font.setColor(Color.RED);

            font.draw(batch, Integer.toString(Gdx.graphics.getFramesPerSecond()), 10, 50);

            batch.end();
            batch.setColor(1,1,1,1);
            font.setColor(Color.WHITE);
        }
        //System.out.println(Gdx.graphics.getHeight());





    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        shapeRenderer.dispose();
        font.dispose();
        block_l.dispose();
        block_rot.dispose();
        block_gruen.dispose();
        block_blau.dispose();
        paddelimg.dispose();
        block_k.dispose();
        block_kleber.dispose();
        hintergrund.dispose();
        block_feuer.dispose();
        paddelklebimg.dispose();
        block_schneller.dispose();
        block_langsamer.dispose();
        block_2mal.dispose();
        block_unzerstoerbar.dispose();
        status_bar.dispose();
        hintergrund2.dispose();
        pause.dispose();
        weiter.dispose();
        einstellungen.dispose();

    }

    @Override
    public void pause() {
        super.pause();
        Var.gamestatus=3;
    }

    @Override
    public void hide() {
        LoadSave.saveall();
        this.dispose();
    }
}
