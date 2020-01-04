package com.test2.game;

import com.badlogic.gdx.Gdx;



public class Var {
   public static int geheinpause=0;

   public static float r_x = 10;
   public static float r_y = 200;
   public static float r_speed = 500.0f;
   public static float r_l = 200;
   public static float s=0.05f;
   public static int points = 0;
   public static int leben=0;
   public static int p=0;

   public static boolean stopedbypaddel = false;

   public static int Button_start_Height = 300;
   public static int Button_start_Width = 600;
   public static int Button_start_x = Gdx.graphics.getWidth()/2-Button_start_Width/2;
   public static int Button_start_y = 300;

   public static int Button_steuerung_Height = 300;
   public static int Button_steuerung_Width = 200;
   public static int Button_steuerung_x = Gdx.graphics.getWidth()/2-Button_steuerung_Width/2;
   public static int Button_steuerung_y = 800;

   public static int Button_Pause_Height = Gdx.graphics.getHeight()/25;
   public static int Button_Pause_Width = Gdx.graphics.getHeight()/25;
   public static float Button_Pause_x = Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/2.9f;
   public static int Button_Pause_y = Gdx.graphics.getHeight()-Button_Pause_Height;

   public static int Button_einstellungen_Height = Gdx.graphics.getHeight()/25;
   public static int Button_einstellungen_Width = Gdx.graphics.getHeight()/25;
   public static float Button_einstellungen_x = Button_Pause_x-Gdx.graphics.getHeight()/21;
   public static int Button_einstellungen_y = Gdx.graphics.getHeight()-Button_einstellungen_Height;


   public static int i;
   public static boolean klebt=false;
   public static int ballmode=0;
   public static int kleben=0;


   public static  int ballstartmode=0;
   public static int steuerung = 0;
   public static boolean showfps = true;
   public static int beiballberurungvibrieren=1;


   public static int createlevel=1;
   public static int levelbesitz=1;

   public static boolean ballupdate = true;
   public static int ballklebposition = 0;


   public static int KY=0;
   public static int starten=1;
   public static int gamestatus=0;


   public static int LBSsho=0;


   public static boolean ingame = false;


   public static int existfallbox = 0;

   public static boolean done = false;


   public static boolean gotostart=false;

   public static int pausebeenden=0;

// Hier auf true stellen um Levelbaukasten zu Aktivieren
   public static boolean EnableAlpha = false;



   public static boolean EnableAndroidSave=true;

   public static boolean sound_effects = true; //Zum deaktivieren der Sound Effekts
   public static boolean sound_music = true;  //Zum deaktivieren der Musik


   public static  String background1 = "hintergrund/hintergrund1.jpg";
   public static  String background2 = "hintergrund/hintergrund2.jpg";
   public static  String background3 = "hintergrund/hintergrund3.jpg";
   public static  String background4 = "hintergrund/hintergrund4.jpg";
   public static  String background5 = "hintergrund/hintergrund5.jpg";
   public static  String background6 = "hintergrund/hintergrund6.jpg";
   public static  String background7 = "hintergrund/hintergrund7.jpg";
   public static  String background8 = "hintergrund/hintergrund8.jpg";
   public static  String background9 = "hintergrund/hintergrund9.jpg";
   public static  String background10 = "hintergrund/hintergrund10.jpg";

   public static String actbackground = background1;

   public static String actpack = "default";
   public static String gotopack = "";

   public static boolean newpack = false;


   public static String jsonversion ="1.0";
}
