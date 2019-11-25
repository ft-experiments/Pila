package com.test2.game;

import com.badlogic.gdx.Gdx;

public class Ball {
    static float x,y;
    static int r;
    static float bx;
    static float by;
    static float gravity;
    static float resistance;


    Ball(int _x, int _y, int _r, float _bx, float _by,float _g, float _res) {
        x=_x;
        y=_y;
        r=_r;
        bx=_bx;
        by=_by;
        gravity=_g;
        resistance=_res;
    }







    static void update() {
        by=by+gravity;
        by=by*resistance;
        bx=bx*resistance;
        x=x-bx;
        y=y-by;
        //System.out.println(Gdx.graphics.getWidth());
        if (y > Gdx.graphics.getHeight()-r*2-50) {
            richtungsumkehr_y();
            y=y-1;
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }

        }
        if (y<0) {
            richtungsumkehr_y();
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x>Gdx.graphics.getWidth()-2*r) {

                x = Gdx.graphics.getWidth()-30;
                richtungsumkehr_x();


            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x<0) {

                richtungsumkehr_x();
                x = 5;

            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }

    }


    static void richtungsumkehr_y(){

            Ball.by=Ball.by*-1;

    }

    static void richtungsumkehr_x(){

        Ball.bx=Ball.bx*-1;

    }



    static void dispose(){
        x=0;
        y =0;
        r=0;
        bx=0;
        by=0;
        gravity=0;
        resistance=1;

    }
}
