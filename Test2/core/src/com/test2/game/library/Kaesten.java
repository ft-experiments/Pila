package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.test2.game.Var;


public class Kaesten {

    public int K_x;
    public int K_y;
    public int K_w;
    public int K_h;
    public int v = 1;
    public int K_art;
    public int o = 0;
    public int mx = 0;
    public int my = 0;
    public int mx2 = 0;
    public int my2 = 0;

    public float rechts;
    public float links;
    public float oben;
    public float unten;

    public float min;


    Kaesten(int _kx, int _ky, int _kw, int _kh, int _art) {
        K_x = _kx;
        K_y = _ky;
        K_w = _kw;
        K_h = _kh;
        K_art = _art;


    }


    public void checkKolission() {
        if (v == 1) {
            // System.out.println(Gdx.graphics.getHeight() - Var.KY);           Ball.y > Gdx.graphics.getHeight() - (Gdx.graphics.getHeight() - K_y) - Ball.r/4  && Ball.x > K_x && Ball.x < K_x+100 && Ball.y < Gdx.graphics.getHeight() - (Gdx.graphics.getHeight() - K_y) - Ball.r/4+50
            if (Ball.y + Ball.r > K_y && Ball.y < K_y + K_h && Ball.x < K_x + K_w && Ball.x + Ball.r > K_x) {                           //Ball.y > K_y-Ball.r*2 && Ball.x >  K_x-Ball.r*2 && Ball.x < K_x+K_w && Ball.y < K_y+K_h

                mx = K_x;
                my = K_y + 2;
                mx2 = K_x + K_w - 3;
                my2 = K_y + K_h - 2;


                if (Var.ballmode == 0) {

                    rechts = K_x + K_w - Ball.x;
                    links = (Ball.x + Ball.r - K_x);
                    oben = K_y + K_h - Ball.y;
                    unten = (Ball.y + Ball.r) - K_y;

                    min = Math.min(Math.min(rechts, links), Math.min(oben, unten));

                    System.out.println();
                    System.out.print("         rechts: ");
                    System.out.print(rechts);
                    System.out.print("  links: ");
                    System.out.print(links);
                    System.out.print("  oben: ");
                    System.out.print(oben);
                    System.out.print("    min: ");
                    System.out.print(min);
                    System.out.println();

/*
                    if(min==links){
                        Ball.richtungsumkehr_x();
                        Ball.x-= Ball.bx;
                    }
                    if(min==rechts){
                        Ball.richtungsumkehr_x();
                        Ball.x-= Ball.bx;
                    }
                    if(min==oben){
                        Ball.richtungsumkehr_y();
                        Ball.y-=Ball.by;
                    }
                    if(min==unten){
                        Ball.richtungsumkehr_y();
                        Ball.y-=Ball.by;
                    }
                    */

                    if (min == rechts || min == links) {
                        Ball.richtungsumkehr_x_kasten();
                        Ball.x -= Ball.bx;
                    }
                    if (min == unten || min == oben) {
                        Ball.richtungsumkehr_y_kasten();
                        Ball.y -= Ball.by;
                    }





                    /*
                    if(Ball.bx<0){
                        Ball.richtungsumkehr_x();
                        Ball.x-= Ball.bx;

                    }else
                    if(Ball.bx>0){
                        Ball.richtungsumkehr_x();
                        Ball.x-= Ball.bx;

                    }*/


                    // Ball.bx = Ball.bx * -1;
                }
                // Ball.y -=2;

                switch (K_art) {
                    case 0:
                    case 1:
                    case 2:
                        v = 0;
                        FallKasten.trigger(K_x, K_y);
                        break;

                    case 3:
                        o = o + 1;
                        if (o >= 2) {
                            v = 0;
                            FallKasten.trigger(K_x, K_y);
                        }
                        break;
                    case 4:
                        if (Var.ballmode == 1) {
                            v = 0;
                            FallKasten.trigger(K_x, K_y);
                        }

                        Rectangle rect1 = new Rectangle((int)Ball.x, (int)Ball.y, Ball.r*2, Ball.r*2);
                        Rectangle rect2 = new Rectangle(K_x, K_y, K_w, K_h);
                        if(rect1.overlaps(rect2)) {



                            Ball.y -=Gdx.graphics.getHeight()/200;

                        }

                        break;
                    case 5:
                        break;

                }

                if (K_art != 5) {
                    if (Var.beiballberurungvibrieren == 1) {
                        Gdx.input.vibrate(50);
                    }
                }


            }


        }
    }
}
