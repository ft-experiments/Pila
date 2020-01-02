package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;


public class AssetManagerExample  {
    public static BitmapFont font;

    public static Texture b1;
    public static Texture b2;
    public static Texture b3;
    public static Texture b4;
    public static Texture b5;
    public static Texture b6;
    public static Texture b7;
    public static Texture b8;
    public static Texture b9;
    public static Texture b10;
    public static Texture switchon;
    public static Texture switchoff;
    public static Texture buttonimage;

    public static Texture los;
    public static Texture countdown1;
    public static Texture countdown2;
    public static Texture countdown3;
    public static Texture block_l;
    public static Texture block_rot;
    public static Texture block_gruen;
    public static Texture block_blau;
    public static Texture paddelimg;
    public static Texture block_k;
    public static Texture block_kleber;


   public static Texture block_feuer;
   public static Texture paddelklebimg;
   public static Texture block_schneller;
   public static Texture block_langsamer;
   public static Texture block_2mal;
   public static Texture block_unzerstoerbar;
   public static Texture status_bar;

   public static Texture pause;
   public static Texture weiter;
   public static Texture einstellungen;
   public static Texture bigpause;


   public static Texture info;
    public static Texture info1;
    public static Texture info2;
    public static Texture info3;

   public static Texture start;

   public static Texture startge;
    public static Texture Touch;
    public static Texture Gyro;

    public static Texture neustart;
    public static Texture gameover;

    public static Texture Levelbutton;
    public static Texture Levelbuttonrot;

    public static Sound click;

    public static AssetManager manager = new AssetManager();
    public static void loader() {

        //schriftart
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("comicsans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        font = generator.generateFont(parameter); // font size 12 pixels
        generator.dispose(); // don't forget to dispose to avoid memory leaks!





       manager.load(Var.background1, Texture.class);
        manager.load(Var.background2, Texture.class);
        manager.load(Var.background3, Texture.class);
        manager.load(Var.background4, Texture.class);
        manager.load(Var.background5, Texture.class);
        manager.load(Var.background6, Texture.class);
        manager.load(Var.background7, Texture.class);
        manager.load(Var.background8, Texture.class);
        manager.load(Var.background9, Texture.class);
        manager.load(Var.background10, Texture.class);

        manager.load("switchon.png", Texture.class);
        manager.load("switchoff.png", Texture.class);

        manager.load("Button.png", Texture.class);

        manager.load("block_l.png",Texture.class);
        manager.load("block_rot.png",Texture.class);
        manager.load("block_gruen.png",Texture.class);
        manager.load("block_blau.png",Texture.class);
        manager.load("paddel.png",Texture.class);
        manager.load("block_k.png",Texture.class);
        manager.load("block_kleber.png",Texture.class);

        manager.load("countdown1.png",Texture.class);
        manager.load("countdown2.png",Texture.class);
        manager.load("countdown3.png",Texture.class);
        manager.load("los.png",Texture.class);

        manager.load("block_feuer.png",Texture.class);
        manager.load("paddelkleb.png",Texture.class);
        manager.load("block_schneller.png",Texture.class);
        manager.load("block_langsamer.png",Texture.class);
        manager.load("block_2mal.png",Texture.class);
        manager.load("block_unzerstoerbar.png",Texture.class);
        manager.load("statusbar.png",Texture.class);
        manager.load("Pause.png",Texture.class);
        manager.load("Weiter.png",Texture.class);
        manager.load("einstellungen.png",Texture.class);
        manager.load("bigpause.png",Texture.class);

        manager.load("info.png", Texture.class);

        manager.load("start.png", Texture.class);
        manager.load("startge.png", Texture.class);
        manager.load("Touch.png", Texture.class);
        manager.load("Gyro.png", Texture.class);

        manager.load("neustart.png", Texture.class);

        manager.load("gameover.png", Texture.class);
        manager.load("Levelauswahlbutton.png", Texture.class);
        manager.load("Levelauswahlbuttonrot.png", Texture.class);
        manager.load("sound/click.mp3", Sound.class);

       /*
        manager.load("data/myfont.fnt", BitmapFont.class);
        manager.load("data/mymusic.ogg", Music.class);

        */


    }

    public static void save() {

        b1 = manager.get(Var.background1, Texture.class);
        b2 = manager.get(Var.background2, Texture.class);
        b3 = manager.get(Var.background3, Texture.class);
        b4 = manager.get(Var.background4, Texture.class);
        b5 = manager.get(Var.background5, Texture.class);
        b6 = manager.get(Var.background6, Texture.class);
        b7 = manager.get(Var.background7, Texture.class);
        b8 = manager.get(Var.background8, Texture.class);
        b9 = manager.get(Var.background9, Texture.class);
        b10 = manager.get(Var.background10, Texture.class);

        switchon =  manager.get("switchon.png", Texture.class);
        switchoff = manager.get("switchoff.png", Texture.class);

        buttonimage = manager.get("Button.png", Texture.class);


        block_l = manager.get("block_l.png",Texture.class);
        block_rot =  manager.get("block_rot.png",Texture.class);
        block_gruen = manager.get("block_gruen.png",Texture.class);
        block_blau = manager.get("block_blau.png",Texture.class);
        paddelimg = manager.get("paddel.png",Texture.class);
        block_k = manager.get("block_k.png",Texture.class);
        block_kleber = manager.get("block_kleber.png",Texture.class);

        countdown1 = manager.get("countdown1.png",Texture.class);
        countdown2 = manager.get("countdown2.png",Texture.class);
        countdown3 = manager.get("countdown3.png",Texture.class);
        los = manager.get("los.png",Texture.class);

       block_feuer = manager.get("block_feuer.png",Texture.class);
       paddelklebimg = manager.get("paddelkleb.png",Texture.class);
       block_schneller = manager.get("block_schneller.png",Texture.class);
       block_langsamer = manager.get("block_langsamer.png",Texture.class);
       block_2mal = manager.get("block_2mal.png",Texture.class);
       block_unzerstoerbar = manager.get("block_unzerstoerbar.png",Texture.class);
        status_bar = manager.get("statusbar.png",Texture.class);
       pause = manager.get("Pause.png",Texture.class);
       weiter = manager.get("Weiter.png",Texture.class);
       einstellungen = manager.get("einstellungen.png",Texture.class);
       bigpause = manager.get("bigpause.png",Texture.class);

       info = info1 = info2 = info3 = manager.get("info.png", Texture.class);

        start = manager.get("start.png",Texture.class);
        startge = manager.get("startge.png",Texture.class);
        Touch = manager.get("Touch.png",Texture.class);
        Gyro = manager.get("Gyro.png",Texture.class);
        neustart = manager.get("neustart.png", Texture.class);

        gameover = manager.get("gameover.png", Texture.class);
        Levelbutton = manager.get("Levelauswahlbutton.png", Texture.class);
        Levelbuttonrot = manager.get("Levelauswahlbuttonrot.png", Texture.class);
        click = manager.get("sound/click.mp3", Sound.class);

    }


}