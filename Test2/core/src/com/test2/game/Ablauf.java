package com.test2.game;



import java.util.Timer;
import java.util.TimerTask;

public class Ablauf {
    static Timer ablauf;
    static Timer ablauf2;
    static int feuerballablauf=1000; //promille
    static int feuerballablaufsoll= 1000;
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
                }else{
                    ablauf.cancel();

                }

            }
        },0, 50);

    }




    static void feuerballzuruck(){

        ablauf2 = new Timer();

        ablauf2.scheduleAtFixedRate(new TimerTask(){
            int reached=0;

            @Override
            public void run() {
                if(Var.ballmode==1&&feuerballablauf<1000&&reached==0) {
                    //feuerballablauf -= 1;
                    feuerballablauf+=5;
                    if(feuerballablauf==1000)
                        reached = 1;
                }
                System.out.println(reached);

            }
        },0, 5);
    }

    static void klebzuruck(){
        klebablauf=1000;
    }
}
