package com.test2.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class Level {
int L;
    static int Le=0;
static ArrayList<Kaesten> kisten = new ArrayList<Kaesten>();

    static int[] Leveldebug = {
            10,10,Gdx.graphics.getHeight()/5,0, //TODO DEBUG

            5,4,4,4,4,4,4,4,4,4,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,4,4,4,4,4,4,4,4,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            0,0,0,0,4,0,0,5,5,5


    };


    static int[] Level1 = {11,2,Gdx.graphics.getHeight()/10,0   ,
            1,0,1,0,1,0,1,0,1,0,1,
            0,1,0,1,0,1,0,1,0,1,0
    };

    static int[] Level2 = {11,6,Gdx.graphics.getHeight()/4,0   ,
            0,1,0,1,0,1,0,1,0,1,0,
            1,0,1,0,1,0,1,0,1,0,5,
            0,1,0,1,0,1,0,5,5,5,5,
            1,0,1,0,1,5,5,5,5,5,5,
            0,1,0,5,5,5,5,5,5,5,5,
            1,5,5,5,5,5,5,5,5,5,5
    };

    static int[] Level3 = {12,6,Gdx.graphics.getHeight()/4,0   ,
            5,5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,5,
            3,3,3,3,3,3,3,3,0,0,5,5,
            0,1,0,0,1,0,1,3,0,0,0,0,
            1,0,1,0,1,1,0,3,0,0,0,0,
            1,0,1,0,1,0,1,3,0,0,0,0
    };

    static int[] Level4 = {11,9,Gdx.graphics.getHeight()/5,0   ,

            1,1,1,0,1,0,1,0,1,1,1,
            5,5,5,5,5,5,5,5,5,5,5,
            1,0,1,0,1,0,1,0,1,0,1,
            5,5,5,5,5,5,5,5,5,5,5,
            3,5,3,5,3,3,5,5,3,3,5,
            5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5

    };

    static int[] Level5 = {11,9,Gdx.graphics.getHeight()/5,0   ,


            0,5,5,5,5,3,5,5,5,5,0,
            5,1,5,3,1,0,1,3,5,1,5,
            5,5,5,5,0,1,0,1,5,5,5,
            5,5,5,5,5,0,5,5,5,5,5,
            5,5,5,5,5,1,5,5,5,5,5,
            5,5,5,5,3,3,3,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5


    };


    static int[] Level6 = {10,5,Gdx.graphics.getHeight()/8,0   ,
            1,0,1,0,4,4,0,1,0,1,
            1,1,1,1,0,0,1,1,1,1,
            5,5,5,5,5,5,5,5,5,5,
            0,0,4,0,0,0,0,4,0,0,
            3,3,0,0,1,1,0,0,3,3
    };
    static int[] Level7 = {
            10,12,Gdx.graphics.getHeight()/10,0,
            0,5,5,5,1,5,5,5,5,0,
            0,0,5,5,5,1,5,5,0,0,
            5,0,0,5,1,5,5,0,0,5,
            5,5,0,0,5,1,0,0,5,5,
            5,5,5,0,1,5,0,5,5,5,
            3,3,3,3,5,1,3,3,3,3,
            5,5,5,5,1,5,5,5,5,5,
            5,5,5,0,5,1,0,5,5,5,
            5,5,0,0,1,5,0,0,5,5,
            5,0,0,5,5,1,5,0,0,5,
            0,0,5,5,1,5,5,5,0,0,
            0,5,5,5,5,1,5,5,5,0,


    };

    static int[] Level8 = {9,5,Gdx.graphics.getHeight()/8,0   ,
            2,2,2,5,5,5,2,2,2,
            5,5,5,1,0,1,5,5,5,
            5,5,5,0,3,0,5,5,5,
            5,5,5,1,0,1,5,5,5,
            2,2,2,5,5,5,2,2,2
    };

    static int[] Level9 = {
            10,12,Gdx.graphics.getHeight()/10,0,

            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,4,4,4,4,4,
            3,0,5,0,3,3,3,3,3,3,
            0,0,5,0,0,0,0,0,0,0,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            1,0,1,0,1,0,1,0,1,0


    };

    static int[] Level10 = {
            10,10,Gdx.graphics.getHeight()/5,0,

            5,4,5,5,5,5,5,5,4,5,
            4,5,5,5,5,5,5,5,5,4,
            5,5,0,5,1,5,0,5,1,5,
            5,5,5,5,5,5,5,5,5,5,
            5,3,3,3,3,3,3,3,3,5,
            2,5,5,5,5,5,5,5,5,2,
            5,1,5,5,5,5,5,5,1,5,
            5,5,0,0,0,0,0,0,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5


    };



    static int[] Level11 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            1,5,5,5,5,5,5,5,5,1,
            1,5,5,5,3,3,5,5,5,1,
            5,1,5,5,5,5,5,5,1,5,
            5,5,2,0,5,5,0,2,5,5,
            5,5,5,0,5,5,0,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            1,0,1,0,1,0,1,0,1,0,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,



    };


    static int[] Level12 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,1,2,2,2,2,1,5,5,
            5,5,0,5,5,5,5,0,5,5,
            5,5,1,5,5,5,5,1,5,5,
            5,5,0,5,5,5,5,0,5,5,
            5,5,1,5,5,5,5,1,5,5,
            5,5,0,5,5,5,5,0,5,5,
            5,5,1,5,5,5,5,1,5,5,
            5,5,0,5,5,5,5,0,5,5,
            5,5,1,4,3,3,4,1,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5



    };


    static int[] Level13 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            2,0,1,2,0,1,2,0,1,2,
            3,5,5,5,5,5,5,5,5,3,
            3,5,5,5,5,5,5,5,5,3,
            1,5,5,2,0,1,2,5,5,1,
            5,1,4,2,5,5,2,4,1,5,
            5,5,4,2,5,5,2,4,5,5,
            5,5,5,2,1,0,2,5,5,5,
            5,5,5,5,5,5,5,5,5,5



    };

    static int[] Level14 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,2,5,5,5,5,2,5,5,
            5,5,2,5,5,5,5,2,5,5,
            5,5,2,5,5,5,5,2,5,5,
            5,5,2,4,0,0,4,2,5,5,
            5,5,2,4,4,4,4,2,5,5,
            5,5,2,1,1,1,1,2,5,5,
            5,5,2,2,1,1,2,2,5,5,
            5,5,5,5,1,1,5,5,5,5,
            5,5,5,5,1,1,5,5,5,5,
            5,5,5,5,1,1,5,5,5,5,
            5,5,5,5,1,1,5,5,5,5,
            5,5,5,5,1,1,5,5,5,5



    };


    static int[] Level15 = {
            8,9,Gdx.graphics.getHeight()/5,0,


            5,0,4,4,4,4,1,5,
            5,1,0,1,0,1,0,5,
            5,5,2,5,5,0,5,5,
            5,3,0,5,5,2,3,5,
            5,3,2,0,2,0,3,5,
            5,3,3,3,3,3,3,5,
            5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5



    };

    static int[] Level16 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,1,5,5,5,5,5,2,5,
            5,2,5,0,5,5,5,5,5,5,
            5,5,5,5,1,5,5,5,2,5,
            5,2,5,5,5,0,5,5,5,5,
            5,5,5,5,5,5,1,5,2,5,
            5,2,5,5,5,5,5,0,5,5,
            5,5,5,5,5,5,1,5,2,5,
            5,2,5,5,5,0,5,5,5,5,
            5,5,5,5,1,5,5,5,2,5,
            5,2,5,0,5,5,5,5,5,5,
            5,5,1,5,5,5,5,5,2,5,
            5,5,3,3,3,3,3,3,5,5



    };

    static int[] Level17 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            1,5,5,5,5,5,5,5,5,0,
            5,0,1,0,1,0,1,0,1,5,
            5,5,5,5,2,2,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,2,2,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,2,2,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,2,2,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,1,0,1,0,1,0,1,0,5,
            0,5,5,5,5,5,5,5,5,1



    };

    static int[] Level18 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,1,3,3,1,5,5,5,
            5,5,1,5,5,5,5,1,5,5,
            5,0,0,5,5,5,5,0,0,5,
            5,5,5,0,3,3,0,5,5,5,
            5,5,5,5,0,0,5,5,5,5,
            5,5,5,0,2,2,0,5,5,5,
            5,5,5,0,5,5,0,5,5,5,
            5,5,5,0,5,5,0,5,5,5,
            5,5,0,5,5,5,5,0,5,5



    };




    static int[] Level20 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,5,5,5,5,5,5,5,5,
            0,5,5,5,5,5,5,5,5,0,
            5,0,5,5,5,5,5,5,0,5,
            5,5,0,5,5,5,5,0,5,5,
            5,5,5,0,1,1,0,5,5,5,
            5,5,5,5,3,3,5,5,5,5,
            5,5,5,0,1,1,0,5,5,5,
            5,5,0,5,5,5,5,0,5,5,
            5,0,5,5,5,5,5,5,0,5,
            0,5,5,5,5,5,5,5,5,0,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5



    };


    static int[] Level25 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            4,5,5,5,5,5,5,5,5,4,
            0,5,4,5,5,5,5,4,5,0,
            5,5,0,5,5,5,5,0,5,5,
            4,5,5,5,5,5,5,5,5,4,
            0,5,5,4,5,5,4,5,5,0,
            5,5,5,0,5,5,0,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,4,4,5,5,5,5,
            5,4,5,5,0,0,5,5,4,5,
            5,0,5,5,5,5,5,5,0,5,
            5,5,5,2,5,5,2,5,5,5,
            3,3,3,4,3,3,4,3,3,3



    };




    static int[] Level30 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            4,4,5,5,4,4,5,5,4,4,
            4,1,5,5,4,4,5,5,1,4,
            4,4,5,5,4,4,5,5,4,4,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,2,2,5,5,5,5,
            0,5,5,5,2,2,5,5,5,0,
            0,0,5,5,2,2,5,5,0,0,
            5,0,0,5,5,5,5,0,0,5,
            5,5,0,0,5,5,0,0,5,5,
            5,5,5,0,0,0,0,5,5,5,
            5,5,5,5,0,0,5,5,5,5



    };




    static int[] Level33 = {11,10,Gdx.graphics.getHeight()/6,0   ,
            0,2,2,2,0,4,0,2,2,2,0,
            0,2,2,2,0,4,0,2,2,2,0,
            0,2,2,2,0,4,0,2,2,2,0,
            0,0,2,4,4,4,4,4,2,0,0,
            0,0,1,4,4,4,4,4,1,0,0,
            0,1,1,1,0,4,0,1,1,1,0,
            0,1,1,1,0,4,0,1,1,1,0,
            0,1,1,1,0,4,0,1,1,1,0,
            3,3,3,3,3,4,3,3,3,3,3,
            0,0,0,0,0,4,0,0,0,0,0
    };


    static int[] Level55 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,4,1,3,3,1,4,5,5,
            5,5,1,5,5,5,5,1,5,5,
            5,0,0,4,4,4,4,0,0,5,
            5,5,5,0,3,3,0,5,5,5,
            5,5,5,4,0,0,4,5,5,5,
            5,5,5,0,2,2,0,5,5,5,
            5,5,5,0,5,5,0,5,5,5,
            5,5,5,0,5,5,0,5,5,5,
            5,5,0,5,5,5,5,0,5,5



    };


    static int[] Level70 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            4,4,4,5,5,5,5,4,4,4,
            4,3,4,5,4,4,5,4,3,4,
            4,0,1,4,0,0,4,1,0,4,
            0,1,5,5,5,5,5,5,1,0,
            1,5,5,5,5,5,5,5,5,1,
            1,5,5,5,5,5,5,5,5,1,
            1,5,5,4,3,3,4,5,5,1,
            1,5,5,4,0,0,4,5,5,1,
            1,5,5,4,4,4,4,5,5,1,
            1,5,5,5,5,5,5,5,5,1,
            1,5,5,5,5,5,5,5,5,1,
            1,5,5,5,5,5,5,5,5,1



    };

    static int[] Level77 = {
            12,13,Gdx.graphics.getHeight()/10,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            1,5,5,5,5,5,5,5,5,5,5,1,
            0,0,4,4,4,4,4,4,4,4,0,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            0,0,0,4,4,4,4,4,4,4,0,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            0,0,0,4,4,4,4,4,4,4,0,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            0,0,0,4,4,4,4,4,4,4,0,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            0,0,0,0,4,4,4,4,4,0,0,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            0,0,0,4,4,4,4,4,4,4,0,0,


    };

    static int[] Level78 = {
            10,12,Gdx.graphics.getHeight()/10,0,
            0,5,5,5,1,4,5,5,5,0,
            0,0,5,5,4,1,5,5,0,0,
            5,0,0,5,1,4,5,0,0,5,
            5,5,0,0,4,1,0,0,5,5,
            5,5,5,0,1,4,0,5,5,5,
            3,3,3,3,4,1,3,3,3,3,
            5,5,5,5,1,4,5,5,5,5,
            5,5,5,0,4,1,0,5,5,5,
            5,5,0,0,1,4,0,0,5,5,
            5,0,0,5,4,1,5,0,0,5,
            0,0,5,5,1,4,5,5,0,0,
            0,5,5,5,4,1,5,5,5,0,


    };

    static int[] Level79 = {
            10,12,Gdx.graphics.getHeight()/5,0,


            5,5,5,5,5,5,5,5,5,5,
            0,5,5,5,5,5,5,5,5,0,
            4,0,5,5,5,5,5,5,0,4,
            5,4,0,5,5,5,5,0,4,5,
            5,5,4,0,1,1,0,4,5,5,
            5,5,5,4,3,3,4,5,5,5,
            5,5,4,0,1,1,0,4,5,5,
            5,4,0,5,5,5,5,0,4,5,
            4,0,5,5,5,5,5,5,0,4,
            0,5,5,5,5,5,5,5,5,0,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5



    };

    Level(int _L) {
        L=_L;

    }
    static int x=0;
    static int y=0;
    static int wo=0;
    static void levelcreater(int[] l) {
        y = 0;
        while (y < l[1]) {
            x = 0;
            while (x < l[0]) {
                wo = wo + 1;
                if (l[wo + 3] != 5) {
                    if (l[3] == 0){
                        Level.kisten.add(new Kaesten(x * Gdx.graphics.getWidth() / l[0], Gdx.graphics.getHeight() - y * 50 - l[2], Gdx.graphics.getWidth() / l[0], 50, l[wo + 3]));
                } else {
                    Level.kisten.add(new Kaesten(x * Gdx.graphics.getWidth() / l[0], Gdx.graphics.getHeight() - y * 50 - l[2], l[wo+3+(l[0]*l[1])], 50, l[wo + 3]));
                }
            }
                x = x + 1;
            }
            y = y + 1;
        }
    }


    static void LevelCreate(int l){
        int i;
        int j;
        float a;
        float b;


        switch (l){
            case 1:
                Le=l;
                Var.leben = 2;
                Level.wo=0;
                levelcreater(Level1);
                break;

            case 2:
                Le=l;
                Var.leben = 3;
                Level.wo=0;
                levelcreater(Level2);
                break;

            case 3:
                Le=l;
                Var.leben = 2;
                Level.wo=0;
                levelcreater(Level3);
                break;

            case 4:
                Le=l;
                Var.leben = 2;
                Level.wo=0;
                levelcreater(Level4);
                break;
            case 5:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level5);
                break;
            case 6:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level6);
                break;
            case 7:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level7);
                break;
            case 8:
                Le=l;
                Var.leben=1;
                Level.wo=0;
                levelcreater(Level8);
                break;
            case 9:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level9);
                break;
            case 10:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level10);
                break;
            case 11:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level11);
                break;
            case 12:
                Le=l;
                Var.leben=1;
                Level.wo=0;
                levelcreater(Level12);
                break;
            case 13:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level13);
                break;
            case 14:
                Le=l;
                Var.leben=2;
                Level.wo=0;
                levelcreater(Level14);
                break;
            case 15:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level15);
                break;
            case 16:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level16);
                break;
            case 17:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level17);
                break;
            case 18:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level18);
                break;
            case 19:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 20:
                Le=l;
                Var.leben=1;
                Level.wo=0;
                levelcreater(Level20);
                break;
            case 21:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 22:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 23:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 24:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 25:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level25);
                break;
            case 26:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 27:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 28:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 29:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 30:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level30);
                break;
            case 31:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 32:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 33:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level33);
                break;
            case 34:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 35:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 36:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 37:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 38:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 39:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 40:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 41:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 42:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 43:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 44:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 45:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 46:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 47:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 48:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 49:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 50:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 51:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 52:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 53:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 54:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 55:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 56:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 57:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 58:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 59:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 60:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 61:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 62:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 63:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 64:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 65:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 66:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 67:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 68:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 69:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 70:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level70);
                break;
            case 71:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 72:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 73:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 74:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 75:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 76:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;
            case 77:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level77);
                break;
            case 78:
                Le=l;
                Var.leben=5;
                Level.wo=0;
                levelcreater(Level78);
                break;
            case 79:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level79);
                break;
            case 80:
                Le=l;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Leveldebug);
                break;




        //Levelbaukasten

            case -1:
                Le=-1;
                Var.leben=4;
                Level.wo=0;
                levelcreater(LevelBaukastenScreen.LevelBa);
                break;



        }



    }



    static void Levelup() {
        Level.dispose();
        Level.LevelCreate(Le+1);
        Var.kleben=0;
        if(Le>Var.levelbesitz) {
            Var.levelbesitz += 1;
        }
        GameOverScreen.restartgameaftergameover = true; //Für Reset der Blöcke damit keine Fehler enstehen vgl. Gamescreen restartgameaftergameover
    }

    static void dispose(){
        Level.kisten.clear();
        FallKasten.Fallkasten.clear();
        Ball.dispose();
        Var.gamestatus=0;
    }

    static void reset(){

        Level.dispose();
        Level.LevelCreate(Level.Le);
    }


}
