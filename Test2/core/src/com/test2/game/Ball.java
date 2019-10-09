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
            by=by * -1;
            y=y-1;
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }

        }
        if (y<0) {
            by=by * -1;
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x>Gdx.graphics.getWidth()-r*2) {
            bx = bx*-1;
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x<0) {
            bx = bx*-1;
            if(Var.beiballberurungvibrieren==1) {
                Gdx.input.vibrate(50);
            }
        }

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
