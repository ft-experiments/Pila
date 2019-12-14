package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;


public class OptionScreen extends ScreenAdapter implements Screen {

    Test2 game;
    private Stage stage;
    private Skin skin;


    Texture buttonimage;
    SpriteBatch batch;
    Texture img;
    Texture info;
    Texture info1;
    Texture info2;
    Texture info3;
    Texture startge;
    Texture Touch;
    Texture Gyro;
    ShapeRenderer shapeRenderer;
    Texture hintergrund2;
    BitmapFont font;
    Texture switchon;
    Texture switchoff;
    touchinput.Button Levelauswahl;
    touchinput.Button Baukasten;
    touchinput.Button Buttonstart;
    touchinput.Switch fpsshow;
    touchinput.Switch SW;
    touchinput.Switch toggelcontrol;
    touchinput.Switch ballstartmode;

    touchinput.Button instant;
    touchinput.Button control;
    touchinput.Button fps;
    touchinput.Button vibrate;
    int bb;
    int switchy=Gdx.graphics.getHeight() / 8;
    int switchsx=Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/4;
    int switchh=(int)(Gdx.graphics.getHeight()/17.26f);
    int switchw=(int)(Gdx.graphics.getWidth()/5.4f);







    public OptionScreen(Test2 gg) {
        batch = new SpriteBatch();

        game=gg;

        //schriftart
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("comicsans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        font = generator.generateFont(parameter); // font size 12 pixels
        generator.dispose(); // don't forget to dispose to avoid memory leaks!





        info = new Texture("info.png");
        info1 = new Texture("info.png");
        info2 = new Texture("info.png");
        info3 = new Texture("info.png");

        img = new Texture("start.png");
        startge = new Texture("startge.png");
        Touch = new Texture("Touch.png");
        Gyro = new Texture("Gyro.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");


        Buttonstart = new touchinput.Button((int)(Gdx.graphics.getWidth()/2-(Gdx.graphics.getWidth()/1.8f/2)),Gdx.graphics.getHeight()/10,(int)(Gdx.graphics.getWidth()/1.8f),(int)(Gdx.graphics.getHeight()/5.753f));
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-600,400,70);
        Baukasten = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight() / 8 * 2,(int)(Gdx.graphics.getWidth()/2.7f),(int)(Gdx.graphics.getHeight()/17.26f));



            SW = new touchinput.Switch(switchsx, switchy * 3, switchw, switchh, Var.beiballberurungvibrieren);






        if(Var.showfps==true) {
            bb=1;
        }
        if(Var.showfps==false){
            bb=0;
        }

            SW = new touchinput.Switch(switchsx, switchy * 3, switchw, switchh, Var.beiballberurungvibrieren);

            fpsshow = new touchinput.Switch(switchsx, switchy * 4, switchw, switchh, bb);

            toggelcontrol = new touchinput.Switch(switchsx, switchy * 5, switchw, switchh, Var.steuerung);

            ballstartmode = new touchinput.Switch(switchsx, switchy * 6, switchw, switchh, Var.ballstartmode);



            vibrate = new touchinput.Button(SW.x - 535, SW.y + SW.h / 2-50, 70, 70);

            control = new touchinput.Button(toggelcontrol.x - 535, toggelcontrol.y + toggelcontrol.h / 2-50, 70 ,70);

            fps = new touchinput.Button(fpsshow.x - 535, fpsshow.y + fpsshow.h / 2-50, 70 ,70);

            instant = new touchinput.Button(ballstartmode.x - 535, ballstartmode.y + ballstartmode.h / 2-50, 70 ,70);


    }





    public void render(float delta) {




        if(vibrate.isPressed()==1) {
            game.aoi.toast("Wenn du das ausschaltest, deaktivierst du das Vibrieren, wenn der Ball an die Wände anstößst.");

        }

        if(control.isPressed()==1) {

            game.aoi.toast("Hiermit kannst du zwischen den beiden Modi Touch (Dabei steurst du das Paddel mit dem Finger) und Gyro (Dabei steuerst du das Paddel durch die bewegung des Handys) wechslen.");
        }

        if(fps.isPressed()==1) {
        game.aoi.toast("Wenn du das einschaltest bekommst du unten rechts eine Anzeige, wieviele Bilder pro Sekunde angezeigt werden.");
        }

        if(instant.isPressed()==1) {
            game.aoi.toast("Wenn du das ausschaltest dann musst du immer wenn du ein Leben verloren hast das Weitermachen mit einem Doppelklick bestätigen.");

        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
        /*if(Gdx.input.isTouched()) {
           
        }*/

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        if (Gdx.input.getAccelerometerY() > 12) {
            font.draw(batch, "" + Gdx.input.getAccelerometerY(), 70, 70);
        }


        //for(int i = 0; i< touchinput.Switch.switchs.size(); i=i+1) {
        //touchinput.Switch SW;
        // if(i==0) {
        // System.out.println(SW.status);

        if(Var.EnableAlpha) {
            //font.getData().setScale(Gdx.graphics.getWidth() / 270);
            font.draw(batch, "LevelBau", Baukasten.x + 30, Baukasten.y + (Baukasten.h / 2 + 25));
            batch.draw(buttonimage, Baukasten.x, Baukasten.y, Baukasten.w, Baukasten.h);
            if (Baukasten.isPressed() == 1) {
                Test2.INSTANCE.setScreen(new EigeneLevelManageScreen());
            }
        }

        //font.getData().setScale(4);
        // if (i == 0) {
        font.draw(batch, "Vibrieren", SW.x - 400, SW.y + SW.h / 2);
        batch.draw( info, SW.x - 535, SW.y + SW.h / 2-50, 70, 70);
        if (SW.isswitched() == 0) {
            batch.draw(switchoff, SW.x, SW.y, SW.w, SW.h);
            Var.beiballberurungvibrieren = 0;
        }
        if (SW.isswitched() == 1) {
            batch.draw(switchon, SW.x, SW.y, SW.w, SW.h);
            Var.beiballberurungvibrieren = 1;
        }

                    font.draw(batch, "FPS-Anzeigen", fpsshow.x - 400, fpsshow.y + fpsshow.h / 2);
                     batch.draw( info1, fpsshow.x - 535, fpsshow.y + fpsshow.h / 2-50, 70 ,70);
                    if (fpsshow.isswitched() == 0) {
                        batch.draw(switchoff, fpsshow.x, fpsshow.y, fpsshow.w, fpsshow.h);
                        Var.showfps = false;
                    }
                    if (fpsshow.isswitched()== 1) {
                        batch.draw(switchon, fpsshow.x, fpsshow.y, fpsshow.w, fpsshow.h);
                        Var.showfps = true;
                    }




        batch.draw( info2, toggelcontrol.x - 535, toggelcontrol.y + toggelcontrol.h / 2-50, 70 ,70);
        if (toggelcontrol.isswitched() == 0) {
            font.draw(batch, "Touch-Steuerung", toggelcontrol.x - 450, toggelcontrol.y + toggelcontrol.h / 2);
            batch.draw(switchoff, toggelcontrol.x, toggelcontrol.y, toggelcontrol.w, toggelcontrol.h);
            batch.draw(Touch, toggelcontrol.x-600, toggelcontrol.y-75, Gdx.graphics.getWidth()/10.8f, Gdx.graphics.getHeight()/8.63f);
            Var.steuerung = 0;
        }
        if (toggelcontrol.isswitched() == 1) {
            font.draw(batch, "Gyro-Steuerung", toggelcontrol.x - 425, toggelcontrol.y + toggelcontrol.h / 2);
            batch.draw(switchon, toggelcontrol.x, toggelcontrol.y, toggelcontrol.w, toggelcontrol.h);
            batch.draw(Gyro, toggelcontrol.x-600, toggelcontrol.y-75, Gdx.graphics.getWidth()/10.8f, Gdx.graphics.getHeight()/8.63f);
            Var.steuerung = 1;

        }

        batch.draw( info3, ballstartmode.x - 535, ballstartmode.y + ballstartmode.h / 2-50, 70 ,70);
        font.draw(batch, "Instant-Start", ballstartmode.x - 400, ballstartmode.y + ballstartmode.h / 2);

        if(ballstartmode.isswitched() == 0){

            batch.draw(switchoff, ballstartmode.x, ballstartmode.y, ballstartmode.w, ballstartmode.h);
            Var.ballstartmode=0;
        }
        if(ballstartmode.isswitched() == 1){

            batch.draw(switchon, ballstartmode.x, ballstartmode.y, ballstartmode.w, ballstartmode.h);

            Var.ballstartmode=1;
        }




        //font.getData().setScale(5);

        font.draw(batch, "Optionen" , Gdx.graphics.getWidth()/2-150, Gdx.graphics.getHeight()-30);


        batch.draw(img, Buttonstart.x,Buttonstart.y,Buttonstart.w,Buttonstart.h);
        if(Buttonstart.isPressed() == 1){
            Test2.INSTANCE.setScreen(new GameScreen());
        }












        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1,0,0,1);
        

        shapeRenderer.end();


    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }

    @Override
    public void hide() {
        if(Var.EnableAndroidSave==true) {
            LoadSave.saveall();
        }
        this.dispose();
    }
   public void toast(String text) {

    }
}
