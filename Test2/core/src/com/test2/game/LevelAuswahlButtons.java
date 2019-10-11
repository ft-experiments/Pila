package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class LevelAuswahlButtons {
int Level;
int x;
int y;
int w;
int h;
static int newlevel=0;


    static ArrayList<LevelAuswahlButtons> Levelbuttons = new ArrayList<LevelAuswahlButtons>();



    LevelAuswahlButtons(int _Level,int _x,int _y,int _w,int _h, int _l) {
        Level=_Level;
        x=_x;
        y=_y;
        w=_w;
        h=_h;
        Level=_l;



    }



    void check() {
        if(Gdx.input.isTouched()) {
            if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h) {
                newlevel=1;
                Var.createlevel=Level;
                Test2.INSTANCE.setScreen(new GameScreen());
            }
        }

    }






}
