package com.test2.game;

import java.util.Timer;
import java.util.TimerTask;

public class Smooth {
    int smooth = 1000;
    int rum=10;
    static int r;


    static Timer ablauf;
    static Timer ablauf2;

    public Smooth() {

        Ablauf.klebablaufsoll=Ablauf.klebablaufsoll;
        ablauf = new Timer();
        ablauf.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if(Ablauf.klebablaufsoll > Ablauf.klebablauf) {
                    Ablauf.klebablaufsoll -= 1;
                }
                if(Ablauf.klebablaufsoll < Ablauf.klebablauf) {
                    Ablauf.klebablaufsoll += 1;
                }


            }
        }, 0, 5);


        ablauf2 = new Timer();
        ablauf2.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if(Ablauf.klebablaufsoll > Ablauf.klebablauf) {
                    Ablauf.klebablaufsoll -= 1;
                }
                if(Ablauf.klebablaufsoll < Ablauf.klebablauf) {
                    Ablauf.klebablaufsoll += 1;
                }


            }
        }, 0, 5);

    }





}
