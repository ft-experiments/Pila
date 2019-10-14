package com.test2.game;

import java.util.Timer;
import java.util.TimerTask;

public class Smooth {
    int smooth = 1000;
    int rum;
    static int r;


    static Timer ablauf;

    public Smooth(int _r) {
        r=_r;

        ablauf = new Timer();
        ablauf.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                Ablauf.klebablaufsoll -= 1;


            }
        }, 0, 10);
    }





}
