package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class touchinput {
    public static class Switch {
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



        int isswitched() {
            if(Gdx.input.isTouched()) {
                if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h) {


                    u = 1;

                }

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


            return status;
        }






    }



    public static class Button {
        int x;
        int y;
        int w;
        int h;
        int u;
        Button(int _x,int _y, int _w, int _h){
            x=_x;
            y=_y;
            w=_w;
            h=_h;
        }

        int isPressed(){
            int ip=0;

            if(Gdx.input.isTouched()) {
                if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h) {
                    u = 1;
                }
            }else {
                if(u==1 && !Gdx.input.isTouched()) {
                    ip=1;
                    u=0;
            }

        }
            return ip;
    }


}

}
