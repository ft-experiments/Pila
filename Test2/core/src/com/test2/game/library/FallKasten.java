package com.test2.game.library;

import com.test2.game.Var;

import java.util.ArrayList;
import java.util.Timer;

public class FallKasten {
    static Timer e;

   public static ArrayList<FallKasten> Fallkasten = new ArrayList<FallKasten>();
   public static float de;
   public int x = 0;
   public int y = 0;
   public int art = 0;



    FallKasten(int _x, int _y, int _art) {
        x = _x;
        y = _y;
        art = _art;


    }

    static void Create() {


    }

    public void update() {

        y -= 200 * de;




    }

    public int check() {
        int k = 0;





        if (y> Var.r_y-50&&y < Var.r_y && x > Var.r_x-100 && x < Var.r_x + Var.r_l) {

            k = 1;



        }
        if (y < Var.r_y - 400) {
            art = 0;



        }




        return k;
    }

    public static void zuruecksetzen() {
        Var.r_l = 200;
        Var.ballmode = 0;
        Var.kleben = 0;
    }


    static void trigger(int Kastenx, int Kasteny) {
        FallKasten FK;
        //System.out.println("möglich");

        if(Var.existfallbox <= 3) {
            if (Math.floor(Math.random() * Math.floor(3)) == 1) {
                //System.out.println("placed");
                int zblock = (int) Math.floor((3));
                FK = new FallKasten(Kastenx, Kasteny, zblock);
                Fallkasten.add(FK);

            }

        }else{
            //System.out.println("Zu viele");
        }


    }
}
