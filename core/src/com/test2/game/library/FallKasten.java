package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.test2.game.Var;

import java.util.ArrayList;
import java.util.Timer;

public class FallKasten {
    public static ArrayList<FallKasten> Fallkasten = new ArrayList<FallKasten>();
    public static float de;
    static Timer e;
    public int x = 0;
    public int y = 0;
    public int art = 0;
    public boolean fragezeichen;


    FallKasten(int _x, int _y, int _art, boolean _fragezeichen) {
        x = _x;
        y = _y;
        art = _art;
        fragezeichen = _fragezeichen;


    }

    public static void zuruecksetzen() {
        Var.r_l = Gdx.graphics.getWidth() / 3.5f;
        Var.ballmode = 0;
        Var.kleben = 0;
    }

    static void trigger(int Kastenx, int Kasteny) {
        FallKasten FK;
        //System.out.println("möglich");

        if (Var.existfallbox <= 3) {
            if (Math.floor(Math.random() * Math.floor(3)) == 1) {
                //System.out.println("placed");
                int zblock = (int) Math.floor((Math.random() * 10));
                if (Math.floor(Math.random() * Math.floor(3)) == 1) {
                    FK = new FallKasten(Kastenx, Kasteny, zblock, true);
                } else {

                    if (zblock == 7 && Var.leben == 1) {
                        zblock = 8;
                    }

                    FK = new FallKasten(Kastenx, Kasteny, zblock, false);
                }
                if (zblock == 0) {
                    //fragezeichen=true;
                }
                Fallkasten.add(FK);

            }

        } else {
            //System.out.println("Zu viele");
        }


    }

    public void update() {

        y -= (Gdx.graphics.getHeight() / 7) * de;


    }

    public int check() {
        int k = 0;


        if (y > Var.r_y - 50 && y < Var.r_y && x > Var.r_x - 100 && x < Var.r_x + Var.r_l) {

            k = 1;


        }
        if (y < Var.r_y - 400) {
            art = 0;


        }


        return k;
    }
}
