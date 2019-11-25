package com.test2.game;

import com.badlogic.gdx.Gdx;

public class Paddel {
    public void Paddel(){

    }
    public static void steuerung(int steuerung){
        if (steuerung == 0) {                                        //Touchsteuerung
            if (Gdx.input.isTouched() == true) {
              /*  //System.out.println(Gdx.input.getX());

                if (Gdx.input.getX() < Gdx.graphics.getWidth() / 2) {
                    if (Var.r_x > 0) {
                        Var.r_x -= Var.r_speed * delta;
                    }
                }
                if (Gdx.input.getX() > Gdx.graphics.getWidth() / 2) {
                    if (Var.r_x < Gdx.graphics.getWidth() - Var.r_l) {
                        Var.r_x += Var.r_speed * delta;
                    }
                }*/
                if (Gdx.input.getX() - Var.r_l / 2 > 0 && Gdx.input.getX() - Var.r_l / 2 < Gdx.graphics.getWidth() - Var.r_l) {
                    Var.r_x = Gdx.input.getX() - Var.r_l / 2;
                }
            }
        }




        if (steuerung == 1) {                                            //Gyrosteuerung

            Var.r_x += Gdx.input.getAccelerometerX() * GameScreen.gamestcreendelta * 300 * -1;
            if(Var.r_x < 0){
                Var.r_x=0;
            }
            if(Var.r_x > Gdx.graphics.getWidth()-Var.r_l){
                Var.r_x=Gdx.graphics.getWidth()-Var.r_l;
            }

        }
    }
}
