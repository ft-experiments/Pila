package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;


public class AssetManageLoader {
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

    public static Sound start_finish;

    public static Texture imgfeuerball;
    

    public static AssetManager manager = new AssetManager();
    public static void loader() {

            Var.background1=Var.actpack + "/hintergrund/hintergrund1.jpg";
            Var.background2=Var.actpack + "/hintergrund/hintergrund2.jpg";
            Var.background3=Var.actpack + "/hintergrund/hintergrund3.jpg";
            Var.background4=Var.actpack + "/hintergrund/hintergrund4.jpg";
            Var.background5=Var.actpack + "/hintergrund/hintergrund5.jpg";
            Var.background6=Var.actpack + "/hintergrund/hintergrund6.jpg";
            Var.background7=Var.actpack + "/hintergrund/hintergrund7.jpg";
            Var.background8=Var.actpack + "/hintergrund/hintergrund8.jpg";
            Var.background9=Var.actpack + "/hintergrund/hintergrund9.jpg";
            Var.background10=Var.actpack + "/hintergrund/hintergrund10.jpg";


        try {
            //schriftart
            FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(Var.actpack + "/comicsans.ttf"));
            FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
            parameter.size = 50;
            font = generator.generateFont(parameter); // font size 12 pixels
            generator.dispose(); // don't forget to dispose to avoid memory leaks!
        } catch (Exception e) {
            System.out.println("Fehler beim Laden der Schrift");
        }

        try {

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

            manager.load(Var.actpack + "/option/switchon.png", Texture.class);
            manager.load(Var.actpack + "/option/switchoff.png", Texture.class);

            manager.load(Var.actpack + "/game/Button.png", Texture.class);

            manager.load(Var.actpack + "/blocks/block_l.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_rot.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_gruen.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_blau.png", Texture.class);
            manager.load(Var.actpack + "/game/paddel.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_k.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_kleber.png", Texture.class);

            manager.load(Var.actpack + "/game/countdown1.png", Texture.class);
            manager.load(Var.actpack + "/game/countdown2.png", Texture.class);
            manager.load(Var.actpack + "/game/countdown3.png", Texture.class);
            manager.load(Var.actpack + "/game/los.png", Texture.class);

            manager.load(Var.actpack + "/blocks/block_feuer.png", Texture.class);
            manager.load(Var.actpack + "/game/paddelkleb.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_schneller.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_langsamer.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_2mal.png", Texture.class);
            manager.load(Var.actpack + "/blocks/block_unzerstoerbar.png", Texture.class);
            manager.load(Var.actpack + "/game/statusbar.png", Texture.class);
            manager.load(Var.actpack + "/option/Pause.png", Texture.class);

            manager.load(Var.actpack + "/option/einstellungen.png", Texture.class);
            manager.load(Var.actpack + "/option/bigpause.png", Texture.class);

            manager.load(Var.actpack + "/option/info.png", Texture.class);

            manager.load(Var.actpack + "/game/start.png", Texture.class);
            manager.load(Var.actpack + "/game/startge.png", Texture.class);
            manager.load(Var.actpack + "/option/Touch.png", Texture.class);
            manager.load(Var.actpack + "/option/Gyro.png", Texture.class);

            manager.load(Var.actpack + "/game/neustart.png", Texture.class);

            manager.load(Var.actpack + "/game/gameover.png", Texture.class);
            manager.load(Var.actpack + "/game/Levelauswahlbutton.png", Texture.class);
            manager.load(Var.actpack + "/game/Levelauswahlbuttonrot.png", Texture.class);
            manager.load(Var.actpack + "/sound/start_last.mp3", Sound.class);
            manager.load(Var.actpack + "/sound/click.mp3", Sound.class);

            manager.load(Var.actpack + "/game/ballfeueranimation.png", Texture.class);

        }catch (Exception e) {
            System.out.println("Datein konnten nicht gefunden werden");
        }


    }

    public static void save() {

        try {

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

            switchon = manager.get(Var.actpack + "/option/switchon.png", Texture.class);
            switchoff = manager.get(Var.actpack + "/option/switchoff.png", Texture.class);

            buttonimage = manager.get(Var.actpack + "/game/Button.png", Texture.class);


            block_l = manager.get(Var.actpack + "/blocks/block_l.png", Texture.class);
            block_rot = manager.get(Var.actpack + "/blocks/block_rot.png", Texture.class);
            block_gruen = manager.get(Var.actpack + "/blocks/block_gruen.png", Texture.class);
            block_blau = manager.get(Var.actpack + "/blocks/block_blau.png", Texture.class);
            paddelimg = manager.get(Var.actpack + "/game/paddel.png", Texture.class);
            block_k = manager.get(Var.actpack + "/blocks/block_k.png", Texture.class);
            block_kleber = manager.get(Var.actpack + "/blocks/block_kleber.png", Texture.class);

            countdown1 = manager.get(Var.actpack + "/game/countdown1.png", Texture.class);
            countdown2 = manager.get(Var.actpack + "/game/countdown2.png", Texture.class);
            countdown3 = manager.get(Var.actpack + "/game/countdown3.png", Texture.class);
            los = manager.get(Var.actpack + "/game/los.png", Texture.class);

            block_feuer = manager.get(Var.actpack + "/blocks/block_feuer.png", Texture.class);
            paddelklebimg = manager.get(Var.actpack + "/game/paddelkleb.png", Texture.class);
            block_schneller = manager.get(Var.actpack + "/blocks/block_schneller.png", Texture.class);
            block_langsamer = manager.get(Var.actpack + "/blocks/block_langsamer.png", Texture.class);
            block_2mal = manager.get(Var.actpack + "/blocks/block_2mal.png", Texture.class);
            block_unzerstoerbar = manager.get(Var.actpack + "/blocks/block_unzerstoerbar.png", Texture.class);
            status_bar = manager.get(Var.actpack + "/game/statusbar.png", Texture.class);
            pause = manager.get(Var.actpack + "/option/Pause.png", Texture.class);

            einstellungen = manager.get(Var.actpack + "/option/einstellungen.png", Texture.class);
            bigpause = manager.get(Var.actpack + "/option/bigpause.png", Texture.class);

            info = info1 = info2 = info3 = manager.get(Var.actpack + "/option/info.png", Texture.class);

            start = manager.get(Var.actpack + "/game/start.png", Texture.class);
            startge = manager.get(Var.actpack + "/game/startge.png", Texture.class);
            Touch = manager.get(Var.actpack + "/option/Touch.png", Texture.class);
            Gyro = manager.get(Var.actpack + "/option/Gyro.png", Texture.class);
            neustart = manager.get(Var.actpack + "/game/neustart.png", Texture.class);

            gameover = manager.get(Var.actpack + "/game/gameover.png", Texture.class);
            Levelbutton = manager.get(Var.actpack + "/game/Levelauswahlbutton.png", Texture.class);
            Levelbuttonrot = manager.get(Var.actpack + "/game/Levelauswahlbuttonrot.png", Texture.class);
            click = manager.get(Var.actpack + "/sound/click.mp3", Sound.class);


            start_finish = manager.get(Var.actpack + "/sound/start_last.mp3", Sound.class);
            imgfeuerball = manager.get(Var.actpack + "/game/ballfeueranimation.png", Texture.class);


        }catch(Exception e) {
            System.out.println("Auf die geladenen Dateien konnte nicht zugegriffen werden");
        }

        


    }


    public static void unload() {


        try {

            manager.unload(Var.background1);
            manager.unload(Var.background2);
            manager.unload(Var.background3);
            manager.unload(Var.background4);
            manager.unload(Var.background5);
            manager.unload(Var.background6);
            manager.unload(Var.background7);
            manager.unload(Var.background8);
            manager.unload(Var.background9);
            manager.unload(Var.background10);

            manager.unload(Var.actpack + "/option/switchon.png");
            manager.unload(Var.actpack + "/option/switchoff.png");

            manager.unload(Var.actpack + "/game/Button.png");

            manager.unload(Var.actpack + "/blocks/block_l.png");
            manager.unload(Var.actpack + "/blocks/block_rot.png");
            manager.unload(Var.actpack + "/blocks/block_gruen.png");
            manager.unload(Var.actpack + "/blocks/block_blau.png");
            manager.unload(Var.actpack + "/game/paddel.png");
            manager.unload(Var.actpack + "/blocks/block_k.png");
            manager.unload(Var.actpack + "/blocks/block_kleber.png");

            manager.unload(Var.actpack + "/game/countdown1.png");
            manager.unload(Var.actpack + "/game/countdown2.png");
            manager.unload(Var.actpack + "/game/countdown3.png");
            manager.unload(Var.actpack + "/game/los.png");

            manager.unload(Var.actpack + "/blocks/block_feuer.png");
            manager.unload(Var.actpack + "/game/paddelkleb.png");
            manager.unload(Var.actpack + "/blocks/block_schneller.png");
            manager.unload(Var.actpack + "/blocks/block_langsamer.png");
            manager.unload(Var.actpack + "/blocks/block_2mal.png");
            manager.unload(Var.actpack + "/blocks/block_unzerstoerbar.png");
            manager.unload(Var.actpack + "/game/statusbar.png");
            manager.unload(Var.actpack + "/option/Pause.png");

            manager.unload(Var.actpack + "/option/einstellungen.png");
            manager.unload(Var.actpack + "/option/bigpause.png");

            manager.unload(Var.actpack + "/option/info.png");

            manager.unload(Var.actpack + "/game/start.png");
            manager.unload(Var.actpack + "/game/startge.png");
            manager.unload(Var.actpack + "/option/Touch.png");
            manager.unload(Var.actpack + "/option/Gyro.png");

            manager.unload(Var.actpack + "/game/neustart.png");

            manager.unload(Var.actpack + "/game/gameover.png");
            manager.unload(Var.actpack + "/game/Levelauswahlbutton.png");
            manager.unload(Var.actpack + "/game/Levelauswahlbuttonrot.png");
            manager.unload(Var.actpack + "/sound/start_last.mp3");
            manager.unload(Var.actpack + "/sound/click.mp3");
            manager.unload(Var.actpack + "/game/ballfeueranimation.png");
        }catch(Exception e) {
            System.out.println("Die Assets wurden nie geladen");
        }


    }


}