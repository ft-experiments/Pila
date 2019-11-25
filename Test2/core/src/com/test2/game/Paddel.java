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

    public static void ballcollision(){
        if(Ball.x+Ball.r*2 > Var.r_x && Ball.y < Var.r_y+40 && Var.r_x+Var.r_l > Ball.x){               //Das abprallen des Balls am Paddel
            if(Var.kleben==0) {
                Ball.richtungsumkehr_y();
            }
            if(Var.kleben==1){
                Var.klebt=true;
                Var.ballklebposition=(int)Ball.x - (int)Var.r_x;
            }
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }

            Ball.bx -= ((Ball.x-Var.r_x)-Var.r_l/2)*Var.s;       //Ball ablenken je nach aufprall x

        }
    }


}
