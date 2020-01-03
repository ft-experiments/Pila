package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.game.GameOverScreen;
import com.test2.game.game.GameScreen;

import java.util.ArrayList;

public class LevelAuswahlButtons {
public int Level;
public int x;
public int y;
public int w;
public int h;
public static int newlevel=0;


   public static ArrayList<LevelAuswahlButtons> Levelbuttons = new ArrayList<LevelAuswahlButtons>();



   public LevelAuswahlButtons(int _Level,int _x,int _y,int _w,int _h, int _l) {
        Level=_Level;
        x=_x;
        y=_y;
        w=_w;
        h=_h;
        Level=_l;



    }



   public void check() {
        if(Gdx.input.isTouched()) {
            if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h) {
                newlevel=1;
                Var.createlevel=Level;
                GameOverScreen.restartgameaftergameover =true;
                Test2.INSTANCE.setScreen(new GameScreen());
            }
        }

    }






}
