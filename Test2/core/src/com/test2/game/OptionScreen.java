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

    int temp = 0;


    Texture b1;
    Texture b2;
    Texture b3;
    Texture b4;
    Texture b5;
    Texture b6;
    Texture b7;
    Texture b8;
    Texture b9;
    Texture b10;




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

    //hintergrundauswahlbuttons
    touchinput.Button Background_1;
    touchinput.Button Background_2;
    touchinput.Button Background_3;
    touchinput.Button Background_4;
    touchinput.Button Background_5;
    touchinput.Button Background_6;
    touchinput.Button Background_7;
    touchinput.Button Background_8;
    touchinput.Button Background_9;
    touchinput.Button Background_10;


    //


    int bb;
    int switchy=Gdx.graphics.getHeight() / 8;
    int switchsx=Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/4;
    int switchh=(int)(Gdx.graphics.getHeight()/17.26f);
    int switchw=(int)(Gdx.graphics.getWidth()/5.4f);

int tempold;
    int c=0;

    int xsave;
    int a;
    int[] b = new int[20];

    int gemeinsamverschieben;

    int effectstärkex=5;
    int effectstärkey=3;


    public OptionScreen(Test2 gg) {


        if(Var.actbackground==Var.background1) {
           temp = 1;
        }

        if(Var.actbackground==Var.background2) {
            temp = 2;
        }
        if(Var.actbackground==Var.background3) {
            temp = 3;
        }
        if(Var.actbackground==Var.background4) {
            temp = 4;
        }
        if(Var.actbackground==Var.background5) {
            temp = 5;
        }
        if(Var.actbackground==Var.background6) {
            temp = 6;
        }
        if(Var.actbackground==Var.background7) {
            temp = 7;
        }
        if(Var.actbackground==Var.background8) {
            temp = 8;
        }
        if(Var.actbackground==Var.background9) {
            temp = 9;
        }
        if(Var.actbackground==Var.background10) {
            temp = 10;
        }

        batch = new SpriteBatch();

        game=gg;

        //schriftart
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("comicsans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        font = generator.generateFont(parameter); // font size 12 pixels
        generator.dispose(); // don't forget to dispose to avoid memory leaks!


        b1 = new Texture(Var.background1);
        b2 = new Texture(Var.background2);
        b3 = new Texture(Var.background3);
        b4 = new Texture(Var.background4);
        b5 = new Texture(Var.background5);
        b6 = new Texture(Var.background6);
        b7 = new Texture(Var.background7);
        b8 = new Texture(Var.background8);
        b9 = new Texture(Var.background9);
        b10 = new Texture(Var.background10);







        info = new Texture("info.png");
        info1 = new Texture("info.png");
        info2 = new Texture("info.png");
        info3 = new Texture("info.png");

        img = new Texture("start.png");
        startge = new Texture("startge.png");
        Touch = new Texture("Touch.png");
        Gyro = new Texture("Gyro.png");
        hintergrund2 = new Texture(Var.actbackground);
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");


        Buttonstart = new touchinput.Button((int)(Gdx.graphics.getWidth()/2-(Gdx.graphics.getWidth()/1.8f/2)),Gdx.graphics.getHeight()-Gdx.graphics.getHeight(),(int)(Gdx.graphics.getWidth()/1.8f),(int)(Gdx.graphics.getHeight()/5.753f));
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-600,400,70);
        Baukasten = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight() / 8 * 2,(int)(Gdx.graphics.getWidth()/2.7f),(int)(Gdx.graphics.getHeight()/17.26f));



        Background_1 = new touchinput.Button(0,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_2 = new touchinput.Button(Gdx.graphics.getWidth()/7,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_3 = new touchinput.Button(Gdx.graphics.getWidth()/7*2,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_4 = new touchinput.Button(Gdx.graphics.getWidth()/7*3,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_5 = new touchinput.Button(Gdx.graphics.getWidth()/7*4,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_6 = new touchinput.Button(Gdx.graphics.getWidth()/7*5,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_7 = new touchinput.Button(Gdx.graphics.getWidth()/7*6,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);

        Background_8 = new touchinput.Button(Gdx.graphics.getWidth()/7*7,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_9 = new touchinput.Button(Gdx.graphics.getWidth()/7*8,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);
        Background_10 = new touchinput.Button(Gdx.graphics.getWidth()/7*9,(int)(Gdx.graphics.getHeight()/5.753f),Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);


        //hintergrundauswahlbuttons



        //


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
tempold=temp;



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



        if(temp==1) {
            batch.draw(b1, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

        if(temp==2) {
            batch.draw(b2, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==3) {
            batch.draw(b3, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==4) {
            batch.draw(b4, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==5) {
            batch.draw(b5, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==6) {
            batch.draw(b6, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==7) {
            batch.draw(b7, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==8) {
            batch.draw(b8, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==9) {
            batch.draw(b9, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==10) {
            batch.draw(b10, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

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

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        Gdx.gl.glLineWidth(20);
        shapeRenderer.setColor(1,0,0,1);
        shapeRenderer.rect(Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2,Buttonstart.h,Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);

        shapeRenderer.end();

        batch.begin();



        if(Background_1.h>Background_2.h){
            Var.actbackground = Var.background1;
            temp = 1;
        }else
        if(Background_2.h>Background_3.h){
            Var.actbackground = Var.background2;
            temp = 2;
        }else
        if(Background_3.h>Background_4.h){
            Var.actbackground = Var.background3;
            temp = 3;
        }else
        if(Background_4.h>Background_5.h){
            Var.actbackground = Var.background4;
            temp = 4;
        }else
        if(Background_5.h>Background_6.h){
            Var.actbackground = Var.background5;
            temp = 5;
        }else
        if(Background_6.h>Background_7.h){
            Var.actbackground = Var.background6;
            temp = 6;
        }else
        if(Background_7.h>Background_8.h){
            Var.actbackground = Var.background4;
            temp = 7;
        }else
        if(Background_8.h>Background_9.h){
            Var.actbackground = Var.background8;
            temp = 8;
        }else
        if(Background_9.h>Background_10.h){
            Var.actbackground = Var.background9;
            temp = 9;
        }else
        if(Background_10.h>0){
            Var.actbackground = Var.background10;
            temp = 10;
        }








        batch.draw(b1, Background_1.x,Background_1.y,Background_1.w,Background_1.h);


        batch.draw(b2, Background_2.x,Background_2.y,Background_2.w,Background_2.h);


        batch.draw(b3, Background_3.x,Background_3.y,Background_3.w,Background_3.h);

        batch.draw(b4, Background_4.x,Background_4.y,Background_4.w,Background_4.h);


        batch.draw(b5, Background_5.x,Background_5.y,Background_5.w,Background_5.h);


        batch.draw(b6, Background_6.x,Background_6.y,Background_6.w,Background_6.h);

        batch.draw(b7, Background_7.x,Background_7.y,Background_7.w,Background_7.h);

        batch.draw(b8, Background_8.x,Background_8.y,Background_8.w,Background_8.h);

        batch.draw(b9, Background_9.x,Background_9.y,Background_9.w,Background_9.h);

        batch.draw(b10, Background_10.x,Background_10.y,Background_10.w,Background_10.h);








if(Gdx.input.isTouched() || c==0){
    c=1;
    if(a==0) {
        xsave = Gdx.input.getX()-gemeinsamverschieben;
        b[1]=Background_1.x;
        b[2]=Background_2.x;
        b[3]=Background_3.x;
        b[4]=Background_4.x;
        b[5]=Background_5.x;
        b[6]=Background_6.x;
        b[7]=Background_7.x;
        b[8]=Background_8.x;
        b[9]=Background_9.x;
        b[10]=Background_10.x;
        a = 1;
    }

    Background_1.x=(Gdx.input.getX()-xsave)+b[1];
    Background_2.x=(Gdx.input.getX()-xsave)+b[2];
    Background_3.x=(Gdx.input.getX()-xsave)+b[3];
    Background_4.x=(Gdx.input.getX()-xsave)+b[4];
    Background_5.x=(Gdx.input.getX()-xsave)+b[5];
    Background_6.x=(Gdx.input.getX()-xsave)+b[6];
    Background_7.x=(Gdx.input.getX()-xsave)+b[7];
    Background_8.x=(Gdx.input.getX()-xsave)+b[8];
    Background_9.x=(Gdx.input.getX()-xsave)+b[9];
    Background_10.x=(Gdx.input.getX()-xsave)+b[10];


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_1.x)/effectstärkex<0) {
        Background_1.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_1.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_1.x)/effectstärkex>0) {
        Background_1.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_1.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_2.x)/effectstärkex<0) {
        Background_2.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_2.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_2.x)/effectstärkex>0) {
        Background_2.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_2.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_3.x)/effectstärkex<0) {
        Background_3.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_3.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_3.x)/effectstärkex>0) {
        Background_3.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_3.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_4.x)/effectstärkex<0) {
        Background_4.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_4.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_4.x)/effectstärkex>0) {
        Background_4.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_4.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_5.x)/effectstärkex<0) {
        Background_5.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_5.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_5.x)/effectstärkex>0) {
        Background_5.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_5.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_6.x)/effectstärkex<0) {
        Background_6.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_6.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_6.x)/effectstärkex>0) {
        Background_6.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_6.x)/effectstärkex;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_7.x)/effectstärkex<0) {
        Background_7.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_7.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_7.x)/effectstärkex>0) {
        Background_7.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_7.x)/effectstärkex;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_8.x)/effectstärkex<0) {
        Background_8.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_8.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_8.x)/effectstärkex>0) {
        Background_8.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_8.x)/effectstärkex;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_9.x)/effectstärkex<0) {
        Background_9.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_9.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_9.x)/effectstärkex>0) {
        Background_9.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_9.x)/effectstärkex;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_10.x)/effectstärkex<0) {
        Background_10.w = Gdx.graphics.getWidth()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_10.x)/effectstärkex;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_10.x)/effectstärkex>0) {
        Background_10.w = Gdx.graphics.getWidth()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_10.x)/effectstärkex;
    }


















    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_1.x)/effectstärkey<0) {
        Background_1.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_1.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_1.x)/effectstärkey>0) {
        Background_1.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_1.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_2.x)/effectstärkey<0) {
        Background_2.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_2.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_2.x)/effectstärkey>0) {
        Background_2.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_2.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_3.x)/effectstärkey<0) {
        Background_3.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_3.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_3.x)/effectstärkey>0) {
        Background_3.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_3.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_4.x)/effectstärkey<0) {
        Background_4.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_4.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_4.x)/effectstärkey>0) {
        Background_4.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_4.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_5.x)/effectstärkey<0) {
        Background_5.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_5.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_5.x)/effectstärkey>0) {
        Background_5.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_5.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_6.x)/effectstärkey<0) {
        Background_6.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_6.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_6.x)/effectstärkey>0) {
        Background_6.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_6.x)/effectstärkey;
    }



    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_7.x)/effectstärkey<0) {
        Background_7.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_7.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_7.x)/effectstärkey>0) {
        Background_7.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_7.x)/effectstärkey;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_8.x)/effectstärkey<0) {
        Background_8.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_8.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_8.x)/effectstärkey>0) {
        Background_8.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_8.x)/effectstärkey;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_9.x)/effectstärkey<0) {
        Background_9.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_9.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_9.x)/effectstärkey>0) {
        Background_9.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_9.x)/effectstärkey;
    }


    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_10.x)/effectstärkey<0) {
        Background_10.h = Gdx.graphics.getHeight()/7 + ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_10.x)/effectstärkey;
    }
    if(((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2))-Background_10.x)/effectstärkey>0) {
        Background_10.h = Gdx.graphics.getHeight()/7 - ((Gdx.graphics.getWidth() / 2-(Gdx.graphics.getWidth()/7/2)) - Background_10.x)/effectstärkey;
    }




if(tempold!=temp){
    System.out.println("änderung");
    Gdx.input.vibrate(20);
}


}
if(!Gdx.input.isTouched()){
    a=0;
    c=0;
    gemeinsamverschieben=0;
    if(temp==1){
        if(Background_1.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==2){
        if(Background_2.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==3){
        if(Background_3.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==4){
        if(Background_4.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==5){
        if(Background_5.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==6){
        if(Background_6.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==7){
        if(Background_7.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==8){
        if(Background_8.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==9){
        if(Background_9.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
    if(temp==10){
        if(Background_10.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = 2;
        }else{
            gemeinsamverschieben = -2;
        }

    }
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
