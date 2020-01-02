package com.test2.game;

import com.badlogic.gdx.assets.AssetManager;

import com.badlogic.gdx.graphics.Texture;





public class AssetManagerExample  {
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


    public static AssetManager manager = new AssetManager();
    public static void loader() {





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

    }


}