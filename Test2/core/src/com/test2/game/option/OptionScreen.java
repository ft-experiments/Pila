package com.test2.game.option;

import com.badlogic.gdx.*;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.test2.game.JSONReader;
import com.test2.game.start.AssetManageLoader;
import com.test2.game.start.SplashScreen;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.game.GameScreen;
import com.test2.game.library.*;

import static com.test2.game.start.AssetManageLoader.*;


public class OptionScreen extends ScreenAdapter implements Screen {

    Test2 game;

    int temp = 0;

    SpriteBatch batch;

    ShapeRenderer shapeRenderer;


    touchinput.Button pack1;
    touchinput.Button pack2;
    touchinput.Button pack3;
    touchinput.Button pack4;
    touchinput.Button pack5;


    touchinput.Button Levelauswahl;
    touchinput.Button Baukasten;
    touchinput.Button Buttonstart;
    touchinput.Switch fpsshow;
    touchinput.Switch SW;
    touchinput.Switch toggelcontrol;
    touchinput.Switch ballstartmode;
    touchinput.Switch soundeffecte;

    touchinput.Button instant;
    touchinput.Button control;
    touchinput.Button fps;
    touchinput.Button vibrate;
    touchinput.Button sefecte;


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
    int[] d=new int[20];

    int gemeinsamverschieben;
    int federung=4;

    int effectstärkex=5;
    int effectstärkey=3;

    int ysave;
    int ys;



int v=0;

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



        shapeRenderer = new ShapeRenderer();

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




            SW = new touchinput.Switch(switchsx, switchy * 3, switchw, switchh, Var.beiballberurungvibrieren);





            pack1=new touchinput.Button(0,-Gdx.graphics.getHeight()/2,0,0);
            pack2=new touchinput.Button(0,-Gdx.graphics.getHeight()/2,0,0);
            pack3=new touchinput.Button(0,0,0,0);
            pack4=new touchinput.Button(0,0,0,0);
            pack5=new touchinput.Button(0,0,0,0);


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

            soundeffecte = new touchinput.Switch(switchsx,switchy*7,switchw,switchh,Var.sound_effects ? 1 : 0);



            vibrate = new touchinput.Button(SW.x - 535, SW.y + SW.h / 2-50, 70, 70);

            control = new touchinput.Button(toggelcontrol.x - 535, toggelcontrol.y + toggelcontrol.h / 2-50, 70 ,70);

            fps = new touchinput.Button(fpsshow.x - 535, fpsshow.y + fpsshow.h / 2-50, 70 ,70);

            instant = new touchinput.Button(ballstartmode.x - 535, ballstartmode.y + ballstartmode.h / 2-50, 70 ,70);

            sefecte = new touchinput.Button(soundeffecte.x - 535, soundeffecte.y + soundeffecte.h / 2-50, 70 ,70);




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

        if(sefecte.isPressed()==1) {
            game.aoi.toast("Hiermit kannst du die soundeffekte aktivieren und deaktivieren.");

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
            batch.draw(AssetManageLoader.b1, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

        if(temp==2) {
            batch.draw(AssetManageLoader.b2, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==3) {
            batch.draw(AssetManageLoader.b3, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==4) {
            batch.draw(AssetManageLoader.b4, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==5) {
            batch.draw(AssetManageLoader.b5, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==6) {
            batch.draw(AssetManageLoader.b6, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==7) {
            batch.draw(AssetManageLoader.b7, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==8) {
            batch.draw(AssetManageLoader.b8, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==9) {
            batch.draw(AssetManageLoader.b9, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if(temp==10) {
            batch.draw(AssetManageLoader.b10, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
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
        batch.draw( info, soundeffecte.x - 535, soundeffecte.y + soundeffecte.h / 2-50, 70, 70);
        font.draw(batch, "soundeffekte", soundeffecte.x - 400, soundeffecte.y + soundeffecte.h / 2);
        if(soundeffecte.isswitched() == 0){

            batch.draw(switchoff, soundeffecte.x, soundeffecte.y, soundeffecte.w, soundeffecte.h);
            Var.sound_effects=false;
        }
        if(soundeffecte.isswitched() == 1){

            batch.draw(switchon, soundeffecte.x, soundeffecte.y, soundeffecte.w, soundeffecte.h);

            Var.sound_effects=true;
        }




        //font.getData().setScale(5);

        font.draw(batch, "Optionen" , Gdx.graphics.getWidth()/2-150, Gdx.graphics.getHeight()-30);







        batch.draw(start, Buttonstart.x,Buttonstart.y,Buttonstart.w,Buttonstart.h);
        if(Buttonstart.isPressed() == 1){
            Test2.INSTANCE.setScreen(new GameScreen());
        }


        batch.end();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        Gdx.gl.glLineWidth(20);
        shapeRenderer.setColor(1,0,0,1);
        shapeRenderer.rect(Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2,Background_1.y,Gdx.graphics.getWidth()/7,Gdx.graphics.getHeight()/7);

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
            Var.actbackground = Var.background7;
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


        batch.draw(AssetManageLoader.b1, Background_1.x,Background_1.y,Background_1.w,Background_1.h);


        batch.draw(AssetManageLoader.b2, Background_2.x,Background_2.y,Background_2.w,Background_2.h);


        batch.draw(AssetManageLoader.b3, Background_3.x,Background_3.y,Background_3.w,Background_3.h);

        batch.draw(AssetManageLoader.b4, Background_4.x,Background_4.y,Background_4.w,Background_4.h);


        batch.draw(AssetManageLoader.b5, Background_5.x,Background_5.y,Background_5.w,Background_5.h);


        batch.draw(AssetManageLoader.b6, Background_6.x,Background_6.y,Background_6.w,Background_6.h);

        batch.draw(AssetManageLoader.b7, Background_7.x,Background_7.y,Background_7.w,Background_7.h);

        batch.draw(AssetManageLoader.b8, Background_8.x,Background_8.y,Background_8.w,Background_8.h);

        batch.draw(AssetManageLoader.b9, Background_9.x,Background_9.y,Background_9.w,Background_9.h);

        batch.draw(AssetManageLoader.b10, Background_10.x,Background_10.y,Background_10.w,Background_10.h);



if(Gdx.input.isTouched() || c==0){
    c=1;
    if(a==0) {

        ysave=Gdx.graphics.getHeight()-Gdx.input.getY();

        d[1]=SW.y;
        d[2]=fpsshow.y;
        d[3]=toggelcontrol.y;
        d[4]=ballstartmode.y;
        d[5]=soundeffecte.y;
        d[6]=Background_1.y;
        d[7]=Background_2.y;
        d[8]=Background_3.y;
        d[9]=Background_4.y;
        d[10]=Background_5.y;
        d[11]=Background_6.y;
        d[12]=Background_7.y;
        d[13]=Background_8.y;
        d[14]=Background_9.y;
        d[15]=Background_10.y;
        d[16]=pack1.y;
        d[17]=pack2.y;



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

    System.out.print(Background_1.y);
    System.out.print("    ");
    System.out.print(Gdx.input.getY());
    System.out.println();
    if(Gdx.graphics.getHeight()-Gdx.input.getY()>Background_1.y  && Gdx.graphics.getHeight()-Gdx.input.getY()<Background_1.y+Gdx.graphics.getHeight()/7) {

        Background_1.x = ((Gdx.input.getX() - xsave) + b[1]);
        Background_2.x = ((Gdx.input.getX() - xsave) + b[2]);
        Background_3.x = ((Gdx.input.getX() - xsave) + b[3]);
        Background_4.x = ((Gdx.input.getX() - xsave) + b[4]);
        Background_5.x = ((Gdx.input.getX() - xsave) + b[5]);
        Background_6.x = ((Gdx.input.getX() - xsave) + b[6]);
        Background_7.x = ((Gdx.input.getX() - xsave) + b[7]);
        Background_8.x = ((Gdx.input.getX() - xsave) + b[8]);
        Background_9.x = ((Gdx.input.getX() - xsave) + b[9]);
        Background_10.x = ((Gdx.input.getX() - xsave) + b[10]);

    }



    SW.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[1]);
    fpsshow.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[2]);
    toggelcontrol.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[3]);
    ballstartmode.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[4]);
    soundeffecte.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[5]);
    Background_1.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[6]);
    Background_2.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[7]);
    Background_3.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[8]);
    Background_4.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[9]);
    Background_5.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[10]);
    Background_6.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[11]);
    Background_7.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[12]);
    Background_8.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[13]);
    Background_9.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[14]);
    Background_10.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[15]);
    pack1.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[16]);
    pack2.y = ((Gdx.graphics.getHeight()-Gdx.input.getY() - ysave) + d[17]);


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

if(Var.sound_effects) {
    long id = click.play(1.0f); // play new sound and keep handle for further manipulation
}

    if(Var.beiballberurungvibrieren==1) {
        Gdx.input.vibrate(20);
    }

}

}
if(!Gdx.input.isTouched()){
    a=0;
    c=0;
    gemeinsamverschieben=0;
    if(temp==1){
        if(Background_1.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_1.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_1.x)/federung;
        }

    }
    if(temp==2){
        if(Background_2.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_2.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_2.x)/federung;
        }

    }
    if(temp==3){
        if(Background_3.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_3.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_3.x)/federung;
        }

    }
    if(temp==4){
        if(Background_4.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_4.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_4.x)/federung;
        }

    }
    if(temp==5){
        if(Background_5.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_5.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_5.x)/federung;
        }

    }
    if(temp==6){
        if(Background_6.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_6.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_6.x)/federung;
        }

    }
    if(temp==7){
        if(Background_7.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_7.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_7.x)/federung;
        }

    }
    if(temp==8){
        if(Background_8.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_8.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_8.x)/federung;
        }

    }
    if(temp==9){
        if(Background_9.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_9.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_9.x)/federung;
        }

    }
    if(temp==10){
        if(Background_10.x<Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2) {
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_10.x)/federung;
        }else{
            gemeinsamverschieben = ((Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/7/2)-Background_10.x)/federung;
        }

    }
}


        pack1.x=0;
        pack2.x=Gdx.graphics.getWidth()/2;

        pack1.w=Gdx.graphics.getWidth()/2;
        pack2.w=Gdx.graphics.getWidth()/2;

        pack1.h=Gdx.graphics.getHeight()/2;
        pack2.h=Gdx.graphics.getHeight()/2;


if(pack1.y>Buttonstart.h) {

    batch.draw(buttonimage, pack1.x, pack1.y, pack1.w, pack1.h);
    batch.draw(buttonimage, pack2.x, pack2.y, pack2.w, pack2.h);
    batch.draw(buttonimage, pack3.x, pack3.y, pack3.w, pack3.h);
    batch.draw(buttonimage, pack4.x, pack4.y, pack4.w, pack4.h);
    batch.draw(buttonimage, pack5.x, pack5.y, pack5.w, pack5.h);


    if(pack1.isPressed()==1){
        Var.newpack = true;
        Var.gotopack = "default";
        Test2.INSTANCE.setScreen(new SplashScreen());
    }
    if(pack2.isPressed()==1){
        Var.newpack = true;
        Var.gotopack = "pack2";
        Test2.INSTANCE.setScreen(new SplashScreen());
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

    }

    @Override
    public void hide() {
        if(Var.EnableAndroidSave==true) {
            LoadSave.saveall();
        }
        this.dispose();
    }


}
