package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class FallKasten {
    static Timer e;

static ArrayList<FallKasten> Fallkasten = new ArrayList<FallKasten>();
static float de;
int x=0;
int y=0;
int art=0;



    FallKasten(int _x, int _y, int _art) {
        x=_x;
        y=_y;
        art=_art;


    }
    static void Create(){




    }

     void update(){

        y -= 200 * de;


    }

    int check(){
        int k=0;

        if(y<Var.r_y && x>Var.r_x && x<Var.r_x+Var.r_l){
            k=1;

        }
        if(y<Var.r_y-200){
            art=0;


        }




        return k;
    }

    static void zuruecksetzen(){
        Var.r_l = 200;
        Var.ballmode=0;
        Var.kleben=0;
    }

    static void autocreate(int oft){
        e= new Timer();

            e.scheduleAtFixedRate(new TimerTask(){

                @Override
                public void run() {
                    System.out.println("asdfasdfasdf");

                    FallKasten FK;

                    FK = new FallKasten(((int) Math.floor((Math.random() * (Gdx.graphics.getWidth()-100)))),Gdx.graphics.getHeight(),   (int)Math.floor((Math.random() * 8)) );//(int)Math.floor((Math.random() * 6))
                    Fallkasten.add(FK);




                }
            },0, oft);







}



}
