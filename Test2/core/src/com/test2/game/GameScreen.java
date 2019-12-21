package com.test2.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;


import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import static java.lang.System.currentTimeMillis;


public class GameScreen extends ScreenAdapter {

    public static GameScreen INSTANCE;


    Test2 game;

    LoadSave LoadSave;
    SpriteBatch batch;
    Texture los;
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
    float Random_x[] = new float[100];
    float Random_y[] = new float[100];
    int datacounter = 0;
    static float min = 999999999;
    static float max = 0;
    static float foundmax_x;
    static float foundmin_x;
    static float diff_x;
    static float foundmax_y;
    static float foundmin_y;
    static float diff_y;
    TimerTask temp;
    Timer getdata;
    float savediffx1 = 0;
    float savediffy1 = 0;
    float savediffx2 = 0;
    float savediffy2 = 0;
    float savediffx3 = 0;
    float savediffy3 = 0;
    float tempselection_x_max = 0;
    float tempselection_x_min = 0;
    float tempselection_y_max = 0;
    float tempselection_y_min = 0;
    float enddiff_x;
    float enddiff_y;

    //Kaesten k;
    public GameScreen() {





        INSTANCE = this;
        if(Var.EnableAndroidSave==true) {
            LoadSave = new LoadSave();
        }
        batch = new SpriteBatch();




        //schriftart
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("comicsans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        font = generator.generateFont(parameter); // font size 12 pixels
        generator.dispose(); // don't forget to dispose to avoid memory leaks!




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
        los = new Texture("los.png");
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


getdata = new Timer();

        getdata.scheduleAtFixedRate(temp =  new TimerTask() {
    @Override
    public void run() {
        if(datacounter<40) {

            Random_x[datacounter] = Ball.x;
            Random_y[datacounter] = Ball.y;
            datacounter++;


        }else{
            foundmin_y = findmin(Random_y);
           foundmax_y = findmax(Random_y);

           foundmax_x = findmax(Random_x);
           foundmin_x = findmin(Random_x);

           diff_y= foundmax_y - foundmin_y;




            foundmin_x = findmin(Random_x);
            foundmax_x = findmax(Random_x);

            diff_x= foundmax_x - foundmin_x;

            datacounter = 0;

            if(savediffx1==0) {
                savediffx1 = diff_x;
                savediffy1 = diff_y;

            }else if(savediffx2==0) {
                savediffx2 = diff_x;
                savediffy2 = diff_y;


            }else if(savediffx3==0) {
                savediffx3 = diff_x;
                savediffy3 = diff_y;

            }else{


                tempselection_x_max = Math.max(savediffx1, Math.max(savediffx2, savediffx3));
                tempselection_x_min = Math.min(savediffx1, Math.min(savediffx2, savediffx3));

               enddiff_x = tempselection_x_max - tempselection_x_min;

                tempselection_y_max = Math.max(savediffy1, Math.max(savediffy2, savediffy3));
                tempselection_y_min = Math.min(savediffy1, Math.min(savediffy2, savediffy3));

                enddiff_y = tempselection_y_max - tempselection_y_min;

                System.out.println("x: " + enddiff_x);
                System.out.println("y: " + enddiff_y);

                Ball_bring_out(enddiff_x, enddiff_y);

                savediffx1 = 0;
                savediffy1 = 0;
                savediffx2 = 0;
                savediffy2 = 0;
                savediffx3 = 0;
                savediffy3 = 0;

                Var.stopedbypaddel =false;
                
                
            }


        }
    }
    },0,50);

    }

    private void Ball_bring_out(float x, float y) {

        if(!Var.stopedbypaddel) {

            if (x > 0.2f && x < 40) {

                Ball.bx = -0.5f;
                System.out.println("Moment");

            } else if (y > 0.2f && y < 40) {

                if (Math.random() == 1) {
                    System.out.println("y triggered 1");
                    Ball.bx = 0.5f;
                } else {
                    Ball.bx = -0.5f;
                    System.out.println("y triggered 2");
                }

            }
        }
    }


    public static float findmin(float [] array) {
        min = 999999999;
        for(int i = 0; i<array.length; i++) {
            if(array[i]<min)min=array[i];
        }
        return min;
}

public static float findmax(float [] array) {
        max = 0;
        for(int i = 0; i< array.length; i++) {
            if(array[i]>max)max=array[i];
        }
        return max;
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

static double gamestcreendelta=0;
    @Override
    public void render(float delta) {





        if(GameOverScreen.restartgameaftergameover) {
            try {
                Ablauf.ablauf.cancel();
                Ablauf.ablauf2.cancel();
            }catch(Exception e) {}
            Ablauf.feuerballablauf=1000;
            Ablauf.feuerballablaufsoll=1000;
            Level.dispose();                //Level array clearen
            Level.LevelCreate(Level.Le);   //Das Level neu ins Levelarray schreiben
            FallKasten.Fallkasten.clear();//////Die Fallkästen Löschen
            GameOverScreen.restartgameaftergameover = false;
        }




        gamestcreendelta=delta;
        //System.out.println(delta);
        Var.ingame = true;




        //if(Var.EnableAndroidSave==true) {
         //   LoadSave.saveall();
        //}


        if(LevelAuswahlButtons.newlevel==1) {
            Level.dispose();
            Level.LevelCreate(Var.createlevel);
            LevelAuswahlButtons.newlevel=0;
        }


        if (Var.klebt == true) {
            klebt();
        }

        FallKasten.de = delta;

        if (Var.gamestatus == 0) {    //Ball erstellen
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





        if (Var.gamestatus != 3){                  //nur steuerbar wenn keine pause
            Paddel.steuerung(Var.steuerung);

    }
            Paddel.ballcollision();
        if(Ball.y < Var.r_y && Var.p==0){   //wenn ball verloren
            FallKasten.zuruecksetzen();
            Var.leben -= 1;
            Var.p=1;

            Var.gamestatus = 0;

            Ball.dispose();
        }




        if(Ball.y > Var.r_y){
            Var.p=0;
        }




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
                            Var.r_l += 30;
                        }
                        break;
                    case 2:       //paddel wird kleiner
                        if(Var.r_l > 100) {
                            Var.r_l -= 30;
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
                        Ball.by += Ball.by/4;
                        break;
                    case 6:         //Der Ball wird langsamer
                        Ball.by -= Ball.by/4;
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
        //font.getData().setScale(Gdx.graphics.getHeight()/426,Gdx.graphics.getHeight()/426);
        font.draw(batch, "Leben:" + Var.leben, Gdx.graphics.getWidth()-(Gdx.graphics.getHeight()/426)*62, Gdx.graphics.getHeight()-5);
        font.draw(batch, "Level:" + Level.Le + " ", Gdx.graphics.getWidth()/24*7, Gdx.graphics.getHeight()-5);
        //font.getData().setScale(3);

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

                Test2.INSTANCE.setScreen(new OptionScreen(Test2.INSTANCE));
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

            //font.getData().setScale(4);
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
            if(Weiter.isPressed()==1) {      ////////Wenn der weiterbutton gedrückt ist
                Var.pausebeenden = 1;

            }



            batch.begin();

        }

        if(Var.pausebeenden==1){
            Var.pausebeenden=2;
            c=currentTimeMillis();
            }
        if(Var.pausebeenden==2) {
            if(currentTimeMillis()>c+300){
                c=currentTimeMillis();
                countdown+=1;
        }

            if(countdown>=4){
                if(gamestatuspausesave==0){
                    Var.gamestatus=gamestatuspausesave;       ////wird die Pause Beendet
                    gamestatuspausesave=-1;
                }else {
                     Var.gamestatus=1;

                }
                Var.pausebeenden=0;
                countdown=0;
            }
            if(countdown==0){


                batch.end();
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                shapeRenderer.setColor(1, 1, 0, 0);
                shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);
                shapeRenderer.end();
                batch.begin();
                //batch.setColor(0,0,1f,1f);
                batch.draw(countdown1,Gdx.graphics.getWidth()/5*1,Gdx.graphics.getHeight()/7*5,250,250);
                //TODO HIER SONDEFFEKT PIEPEN
            }
            if(countdown==1){
                batch.end();
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                shapeRenderer.setColor(1, 1, 0, 0);
                shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);
                shapeRenderer.end();
                batch.begin();
                //batch.setColor(1f,0,0,1f);
                batch.draw(countdown2, Gdx.graphics.getWidth()/5*2,Gdx.graphics.getHeight()/7*4,250,250);
                //TODO HIER SONDEFFEKT PIEPEN
            }
            if(countdown==2){
                batch.end();
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                shapeRenderer.setColor(1, 1, 0, 0);
                shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);
                shapeRenderer.end();
                batch.begin();
                //batch.setColor(1f,0.3f,0,1f);
                batch.draw(countdown3, Gdx.graphics.getWidth()/5*1,Gdx.graphics.getHeight()/7*3,250,250);
                //TODO HIER SONDEFFEKT PIEPEN
            }
            if(countdown==3){
                batch.end();
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                shapeRenderer.setColor(1, 1, 0, 0);
                shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);
                shapeRenderer.end();
                batch.begin();
                //batch.setColor(0,0.3f,0,1f);
                batch.draw(los,        Gdx.graphics.getWidth()/5*2.5f,Gdx.graphics.getHeight()/7*2,250,250);
                //TODO HIER SONDEFFEKT PIEPEN
            }

        }
        batch.end();
/////////////////////////DAS//PAUSEPOPUP//ENDED//HIER//////////////////////////////


















        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(1,1,0,0f);

    if(Var.gamestatus!=3) {
        //shapeRenderer.rect(Var.r_x,20,Var.r_l,20);
        if (Var.ballupdate == true) {
            if (Var.gamestatus == 1) {
                Ball.update();
            }
        }

        if (Var.ballmode==0){
                    shapeRenderer.setColor(1, 1, 0, 0);
                    shapeRenderer.ellipse(Ball.x, Ball.y, Ball.r * 2, Ball.r * 2);          ////Normale Ball wird gedrawd

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
            font.getData().setScale(0.5f);
            font.draw(batch, ""+Ablauf.feuerballablauf/10+"%", 50, Gdx.graphics.getHeight()-3);  //Die Feuerball ablaufanzeige wird gedrawd
            font.getData().setScale(1f);
        }
        if(Var.kleben==1){
            font.getData().setScale(0.5f);
            font.draw(batch, ""+Ablauf.klebablaufsoll/10+"%", 50, Gdx.graphics.getHeight()-3-25);   //Die Klebepaddel ablaufanzeige wird gerawd
            font.getData().setScale(1f);
        }
        batch.end();


        if(Var.leben <= 0){          //Wenn keine Leben mehr da sind dann


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



if(Var.geheinpause==1) {
    Var.gamestatus = 3;
    Var.geheinpause=0;
}
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
        if(Var.EnableAndroidSave==true) {
            LoadSave.saveall();
        }
        this.dispose();
    }
}
