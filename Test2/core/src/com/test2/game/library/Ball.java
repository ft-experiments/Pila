package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.test2.game.Var;

public class Ball {
    public static float x, y;
    public static int r;
    public static float bx;
    public static float by;
    public static float gravity;
    public static float resistance;


    public Ball(int _x, int _y, int _r, float _bx, float _by, float _g, float _res) {
        x = _x;
        y = _y;
        r = _r;
        bx = _bx;
        by = _by;
        gravity = _g;
        resistance = _res;
    }


    public static void update() {
        by = by + gravity;
        by = by * resistance;
        bx = bx * resistance;
        x = x - bx;
        y = y - by;
        //System.out.println(Gdx.graphics.getWidth());
        if (y > Gdx.graphics.getHeight() - r * 2 - 50) {
            richtungsumkehr_y();
            y = y - 1;
            if (Var.beiballberurungvibrieren == 1) {
                Gdx.input.vibrate(50);
            }

        }
        if (y < 0) {
            richtungsumkehr_y();
            if (Var.beiballberurungvibrieren == 1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x > Gdx.graphics.getWidth() - 2 * r) {


            richtungsumkehr_x();
            x = Gdx.graphics.getWidth() - Gdx.graphics.getWidth() / 18;

            if (Var.beiballberurungvibrieren == 1) {
                Gdx.input.vibrate(50);
            }
        }
        if (x < 0) {

            richtungsumkehr_x();
            x = 5;

            if (Var.beiballberurungvibrieren == 1) {
                Gdx.input.vibrate(50);
            }
        }

    }


    static void richtungsumkehr_y_kasten() {
        Ball.bx += (float)Math.random()*5-2.5f;
        Ball.by = (Ball.by * -1);
    }

    static void richtungsumkehr_x_kasten() {
        Ball.bx += (float)Math.random()*5-2.5f;
        Ball.bx = (Ball.bx * -1);
    }

    static void richtungsumkehr_y() {
        //Ball.by += (float)Math.random()*7-3.5f;
        Ball.by = (Ball.by * -1);

    }

    static void richtungsumkehr_x() {
        //Ball.by += (float)Math.random()*7-3.5f;
        Ball.bx = (Ball.bx * -1);

    }


    public static void dispose() {
        x = 0;
        y = 0;
        r = 0;
        bx = 0;
        by = 0;
        gravity = 0;
        resistance = 1;

    }
}
