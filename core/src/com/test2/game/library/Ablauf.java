package com.test2.game.library;


import com.test2.game.Var;

import java.util.Timer;
import java.util.TimerTask;

public class Ablauf {
    public static Timer ablauf;
    public static Timer ablauf2;
    public static int feuerballablauf = 1000; //promille
    public static int feuerballablaufsoll = 1000;
    public static int klebablauf = 1000;
    public static int klebablaufsoll = 1000;
    public static TimerTask test;
    public static TimerTask test2;
    static int T = 0;
    int smooth;

    public Ablauf() {
        ablauf = new Timer();
        ablauf.scheduleAtFixedRate(test = new TimerTask() {

            @Override
            public void run() {
                if (Var.ballmode == 1) {
                    //feuerballablauf -= 1;
                    feuerballablauf = feuerballablauf - 1000 / 200;
                }

            }
        }, 0, 50);

    }


    public static void feuerballzuruck() {

        ablauf2 = new Timer();

        ablauf2.scheduleAtFixedRate(test2 = new TimerTask() {
            int reached = 0;

            @Override
            public void run() {
                if (Var.ballmode == 1 && feuerballablauf < 1000 && reached == 0) {
                    //feuerballablauf -= 1;
                    feuerballablauf += 5;
                    if (feuerballablauf == 1000)
                        reached = 1;
                }
                // System.out.println(reached);

            }
        }, 0, 5);
    }

    public static void klebzuruck() {
        klebablauf = 1000;
    }
}
