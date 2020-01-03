package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LevelBauBlock {

   public int K_x;
   public int K_y;
   public int K_w;
   public int K_h;
   public int K_art;
   public int marked=0;



    public LevelBauBlock(int _kx, int _ky, int _kw, int _kh, int _art) {
        K_x = _kx;
        K_y = _ky;
        K_w = _kw;
        K_h = _kh;
        K_art=_art;





    }

   public int check() {
        int g = 0;
            if (Gdx.input.getX() < K_w + K_x && Gdx.input.getX() > K_x && Gdx.input.getY() < Gdx.graphics.getHeight() - K_y && Gdx.input.getY() > Gdx.graphics.getHeight() - K_y - K_h   && Gdx.input.isButtonPressed(0)) {
                g = 1;
            }

        return g;
    }



}
