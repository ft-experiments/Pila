package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class Level {
int L;
    static int Le=0;
static ArrayList<Kaesten> kisten = new ArrayList<Kaesten>();

    static int[] Level6 = {10,5,200,0   ,
            1,0,1,0,4,4,0,1,0,1,
            1,1,1,1,0,0,1,1,1,1,
            2,2,2,2,0,0,2,2,2,2,
            0,0,4,0,0,0,0,4,0,0,
            3,3,0,0,1,1,0,0,3,3
    };
    static int[] Level7 = {
            10,12,100,0,
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
                /*
                int j=Gdx.graphics.getHeight()-300;
                while(j<Gdx.graphics.getHeight()-200) {
                    int i =0;
                    while (i < Gdx.graphics.getWidth()) {

                        Level.kisten.add( new Kaesten(i, j, 100, 50,(int)Math.floor((Math.random() * 3))));
                        i = i + 100;

                    }
                    j=j+50;
                }

                 */
                i=0;
                while(i<2) {
                    j = 0;
                    while (j < 11) {
                        Level.kisten.add(new Kaesten(j * Gdx.graphics.getWidth() / 11,Gdx.graphics.getHeight()-i*50-200, Gdx.graphics.getWidth() / 11, 50, (int) Math.floor((Math.random() * 3))));
                        j = j + 1;
                    }
                    i=i+1;
                }
                break;

            case 2:
                Le=2;
                Var.leben = 4;
                i=0;
                a=0;
                while(i<6) {
                    j = 0;
                    while (j < 11-a) {
                        Level.kisten.add(new Kaesten(j * Gdx.graphics.getWidth() / 11,Gdx.graphics.getHeight()-i*50-500, Gdx.graphics.getWidth() / 11, 50, (int) Math.floor((Math.random() * 3))));
                        j = j + 1;
                    }
                    i=i+1;
                    a=a+2f;

                }

                break;

            case 3:
                Le=3;
                Var.leben = 4;
                i=0;
                a=0;
                while(i<5) {
                    j = 0;
                    while (j < 0-a) {
                        Level.kisten.add(new Kaesten(j * Gdx.graphics.getWidth() / 15,Gdx.graphics.getHeight()-i*50-300, Gdx.graphics.getWidth() / 15, 50, (int) Math.floor((Math.random() * 3))));
                        j = j + 1;
                    }
                    i=i+1;
                    a=a-3f;

                }


                break;

            case 4:
                Le=4;
                Var.leben = 4;
                i=0;
                a=0;
                j=0;
                while(j<10) {
                    i=0;
                    while (i < 12) {
                        if(j==0){
                            Level.kisten.add(new Kaesten(i * Gdx.graphics.getWidth() / 12, Gdx.graphics.getHeight() - 500 + j * 50, Gdx.graphics.getWidth() / 12, 50, 3));
                        }else {
                            Level.kisten.add(new Kaesten(i * Gdx.graphics.getWidth() / 12, Gdx.graphics.getHeight() - 500 + j * 50, Gdx.graphics.getWidth() / 12, 50, (int) Math.floor((Math.random() * 3))));
                        }
                        i = i + 1;
                    }
                    j=j+2;
                }
                break;
            case 5:
                Le=5;
                Var.leben=6;
                i=0;
                j=0;
                a=0;
                while(j<10) {
                    i=0;
                    while (i < 11) {
                        if(i==5){
                            Level.kisten.add(new Kaesten(i * ((Gdx.graphics.getWidth())) / 11, Gdx.graphics.getHeight() - 900 + j * 50, ((Gdx.graphics.getWidth())) / 11, 50, 4));
                        }else {
                            if(j==1){
                                Level.kisten.add(new Kaesten(i * ((Gdx.graphics.getWidth())) / 11, Gdx.graphics.getHeight() - 900 + j * 50, ((Gdx.graphics.getWidth())) / 11, 50, 3));
                            }else {
                                Level.kisten.add(new Kaesten(i * ((Gdx.graphics.getWidth())) / 11, Gdx.graphics.getHeight() - 900 + j * 50, ((Gdx.graphics.getWidth())) / 11, 50, (int) Math.floor((Math.random() * 3))));
                            }
                            }
                        i = i + 1;
                    }
                    j=j+1;
                }


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
