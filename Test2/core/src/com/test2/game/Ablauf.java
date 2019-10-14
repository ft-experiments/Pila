package com.test2.game;

import java.util.Timer;
import java.util.TimerTask;

public class Ablauf {
    static int feuerballablauf;
    static int klebablauf=100;

    static Timer ablauf;
    static int T=0;

    public Ablauf(){
        ablauf = new Timer();
        ablauf.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if(Var.ballmode==1) {
                    //feuerballablauf -= 1;
                    feuerballablauf = feuerballablauf -1;
                }

            }
        },0, 50);

    }
}
