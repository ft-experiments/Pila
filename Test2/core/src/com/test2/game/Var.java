package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Var {
    static float r_x = 10;
    static float r_y = 200;
    static float r_speed = 500.0f;
    static float r_l = 200;
    static float s=0.03f;
    static int points = 0;
    static int leben=0;
    static int p=0;



    static int Button_start_Height = 300;
    static int Button_start_Width = 600;
    static int Button_start_x = Gdx.graphics.getWidth()/2-Button_start_Width/2;
    static int Button_start_y = 300;

    static int Button_steuerung_Height = 300;
    static int Button_steuerung_Width = 200;
    static int Button_steuerung_x = Gdx.graphics.getWidth()/2-Button_steuerung_Width/2;
    static int Button_steuerung_y = 800;

    static int Button_Pause_Height = Gdx.graphics.getHeight()/25;
    static int Button_Pause_Width = Gdx.graphics.getHeight()/25;
    static float Button_Pause_x = Gdx.graphics.getWidth()-Gdx.graphics.getWidth()/3.5f;
    static int Button_Pause_y = Gdx.graphics.getHeight()-Button_Pause_Height;

    static int Button_einstellungen_Height = Gdx.graphics.getHeight()/25;
    static int Button_einstellungen_Width = Gdx.graphics.getHeight()/25;
    static float Button_einstellungen_x = Button_Pause_x-Gdx.graphics.getHeight()/25-Gdx.graphics.getWidth()/30;
    static int Button_einstellungen_y = Gdx.graphics.getHeight()-Button_einstellungen_Height;


    static int i;
    static boolean klebt=false;
    static int ballmode=0;
    static int kleben=0;


    static  int ballstartmode=0;
    static int steuerung = 0;
    static boolean showfps = true;
    static int beiballberurungvibrieren=1;


    static int createlevel=1;
    static int levelbesitz=1;

    static boolean ballupdate = true;
    static int ballklebposition = 0;


    static int KY=0;
    static int starten=1;
    static int gamestatus=0;


    static int LBSsho=0;


    static boolean ingame = false;


    static int existfallbox = 0;

    static boolean done = false;


    static boolean gotostart=false;

    static int pausebeenden=0;

//TODO Hier auf true stellen um Levelbaukasten zu Aktivieren
    static boolean EnableAlpha = true;

    static boolean EnableAndroidSave=true;









}
