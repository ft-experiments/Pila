package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.util.Timer;
import java.util.TimerTask;

public class DoppelKlick {
    Timer move;
    static int T=0;

    public DoppelKlick(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                T=0;
                Var.starten=0;
            }
        },0, 1000);

    }

    static int DoppelKlick(){
        if(T==2 && Gdx.input.isTouched()){
            T=3;
            Var.starten=1;
        }
        if(Gdx.input.isTouched()){
            T=1;
        }else{
            if(T==1){T=2;}
        }


        return Var.starten;
    }
}
