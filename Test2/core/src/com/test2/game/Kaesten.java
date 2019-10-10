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
            if (Ball.y > K_y-K_h+Ball.r && Ball.x >  K_x && Ball.x < K_x+K_w && Ball.y < K_y+K_h) {
                if(Var.ballmode==0) {
                    Ball.by = Ball.by * -1;
                }
                Ball.y -=2;

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

                }

                if(Var.beiballberurungvibrieren==1) {
                    Gdx.input.vibrate(50);
                }


            }





        }
    }
}
