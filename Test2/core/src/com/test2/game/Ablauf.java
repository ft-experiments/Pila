package com.test2.game;

import java.util.Timer;
import java.util.TimerTask;

public class Ablauf {
    static Timer ablauf;
    static int feuerballablauf=1000; //promille
    static int klebablauf=1000;
    static int klebablaufsoll=1000;


    int smooth;
    static int T=0;

    public Ablauf(){
        ablauf = new Timer();
        ablauf.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if(Var.ballmode==1) {
                    //feuerballablauf -= 1;
                    feuerballablauf = feuerballablauf - 1000/200;
                }

            }
        },0, 50);

    }




    static void feuerballzuruck(){
        feuerballablauf=1000;
    }

    static void klebzuruck(){
        klebablauf=1000;
    }
}
