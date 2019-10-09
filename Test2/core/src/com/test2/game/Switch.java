package com.test2.game;

import com.badlogic.gdx.Gdx;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Switch {
    int y;
    int x;
    int w;
    int h;
    int status=0;
    int u;



    static ArrayList<Switch> switchs = new ArrayList<Switch>();



    Switch(int _x,int _y, int _w, int _h, int _status) {
        x=_x;
        y=_y;
        w=_w;
        h=_h;
        status=_status;


    }

    static void Create() {


    }

    void update() {
        if(Gdx.input.getX() < w+x && Gdx.input.getX() >x && Gdx.input.getY() < Gdx.graphics.getHeight()-y && Gdx.input.getY() > Gdx.graphics.getHeight()-y-h)
        {

            if(Gdx.input.isTouched()){
                u=1;
            }else {
                if(u==1 && !Gdx.input.isTouched()) {
                    if (status == 0) {
                        status = 1;
                    }else if (status == 1) {
                        status = 0;
                    }
                    u = 0;
                }
            }
        }



    }






}
