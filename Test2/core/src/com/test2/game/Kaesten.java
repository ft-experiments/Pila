package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Kaesten {

int K_x;
int K_y;
int K_w;
int K_h;
int v=1;
int K_art;
int o=0;
int mx=0;
int my=0;
int mx2=0;
int my2=0;



    Kaesten(int _kx, int _ky, int _kw, int _kh,int _art) {
        K_x = _kx;
        K_y = _ky;
        K_w = _kw;
        K_h = _kh;
        K_art=_art;





    }


     void checkKolission() {
        if(v==1) {
           // System.out.println(Gdx.graphics.getHeight() - Var.KY);           Ball.y > Gdx.graphics.getHeight() - (Gdx.graphics.getHeight() - K_y) - Ball.r/4  && Ball.x > K_x && Ball.x < K_x+100 && Ball.y < Gdx.graphics.getHeight() - (Gdx.graphics.getHeight() - K_y) - Ball.r/4+50
            if (Ball.y+ Ball.r>K_y && Ball.y<K_y+K_h && Ball.x<K_x+K_w && Ball.x+ Ball.r > K_x) {                           //Ball.y > K_y-Ball.r*2 && Ball.x >  K_x-Ball.r*2 && Ball.x < K_x+K_w && Ball.y < K_y+K_h

                mx=K_x;
                my=K_y+2;
                mx2=K_x+K_w-3;
                my2=K_y+K_h-2;


                if(Var.ballmode==0) {

                    if(Ball.bx<0){
                        Ball.richtungsumkehr_x();
                        Ball.x-= 10;

                    }else
                    if(Ball.bx>0){
                        Ball.richtungsumkehr_x();
                        Ball.x+= 10;

                    }




                   // Ball.bx = Ball.bx * -1;
                }
               // Ball.y -=2;

                switch(K_art){
                    case 0:
                    case 1:
                    case 2:
                        v = 0;
                        FallKasten.trigger(K_x, K_y);
                        break;

                    case 3:
                        o=o+1;
                        if(o>=2){
                            v = 0;
                            FallKasten.trigger(K_x, K_y);
                        }
                        break;
                    case 4:
                        if(Var.ballmode==1){
                            v = 0;
                            FallKasten.trigger(K_x, K_y);
                        }
                        break;
                    case 5:
                        break;

                }

                if(K_art!=5) {
                    if (Var.beiballberurungvibrieren == 1) {
                        Gdx.input.vibrate(50);
                    }
                }


            }





        }
    }
}
