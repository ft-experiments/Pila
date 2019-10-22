package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class Level {
int L;
    static int Le=0;
static ArrayList<Kaesten> kisten = new ArrayList<Kaesten>();

    static int[] Level1 = {11,2,Gdx.graphics.getHeight()/10,0   ,
            1,0,1,0,1,0,1,0,1,0,1,
            0,1,0,1,0,1,0,1,0,1,0
    };

    static int[] Level2 = {11,6,Gdx.graphics.getHeight()/3,0   ,
            0,1,0,1,0,1,0,1,0,1,0,
            1,0,1,0,1,0,1,0,1,0,5,
            0,1,0,1,0,1,0,5,5,5,5,
            1,0,1,0,1,5,5,5,5,5,5,
            0,1,0,5,5,5,5,5,5,5,5,
            1,5,5,5,5,5,5,5,5,5,5
    };

    static int[] Level3 = {14,6,Gdx.graphics.getHeight()/3,0   ,
            5,5,5,5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,5,5,5,5,
            3,3,3,3,3,3,3,3,0,0,5,5,5,5,
            0,1,0,0,1,0,1,3,0,0,0,0,5,5,
            1,0,1,0,1,1,0,3,0,0,0,0,0,0,
            1,0,1,0,1,0,1,3,0,0,0,0,0,0
    };

    static int[] Level4 = {11,9,Gdx.graphics.getHeight()/3,0   ,
            0,1,0,0,1,0,1,0,0,1,0,
            5,5,5,5,5,5,5,5,5,5,5,
            1,0,1,0,1,1,0,0,1,0,1,
            5,5,5,5,5,5,5,5,5,5,5,
            1,1,1,0,1,0,1,0,1,1,1,
            5,5,5,5,5,5,5,5,5,5,5,
            1,0,1,0,1,0,1,0,1,0,1,
            5,5,5,5,5,5,5,5,5,5,5,
            3,3,3,3,3,3,3,3,3,3,3
    };

    static int[] Level5 = {11,10,Gdx.graphics.getHeight()/4,0   ,
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


    static int[] Level6 = {10,5,Gdx.graphics.getHeight()/10,0   ,
            1,0,1,0,4,4,0,1,0,1,
            1,1,1,1,0,0,1,1,1,1,
            2,2,2,2,0,0,2,2,2,2,
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

    static int[] Level8 = {
            12,13,Gdx.graphics.getHeight()/10,0,
            5,5,5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,1,1,5,5,5,5,5,
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
                Le=1;
                Var.leben = 4;
                Level.wo=0;
                levelcreater(Level1);
                break;

            case 2:
                Le=2;
                Var.leben = 4;
                Level.wo=0;
                levelcreater(Level2);
                break;

            case 3:
                Le=3;
                Var.leben = 4;
                Level.wo=0;
                levelcreater(Level3);
                break;

            case 4:
                Le=4;
                Var.leben = 4;
                Level.wo=0;
                levelcreater(Level4);
                break;
            case 5:
                Le=5;
                Var.leben=3;
                Level.wo=0;
                levelcreater(Level5);
                break;
            case 6:
                Le=6;
                Var.leben=4;
                Level.wo=0;
                levelcreater(Level6);
                break;
            case 7:
                Le=7;
                Var.leben=4;
                Level.wo=0;
                levelcreater(Level7);
                break;
            case 8:
                Le=8;
                Var.leben=6;
                Level.wo=0;
                levelcreater(Level8);
                break;




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
        if(Le>Var.levelbesitz) {
            Var.levelbesitz += 1;
        }
    }

    static void dispose(){
        Level.kisten.clear();
        FallKasten.Fallkasten.clear();
        Ball.dispose();
        Var.gamestatus=0;
    }


}
