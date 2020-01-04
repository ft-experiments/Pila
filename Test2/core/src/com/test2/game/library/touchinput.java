package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class touchinput {
    public static class Switch {
       public float y;
       public float x;
       public float w;
       public float h;
       public int status=0;
       public int u;



        static ArrayList<Switch> switchs = new ArrayList<Switch>();



        public Switch(float _x, float _y, float _w, float _h, int _status) {
            x=_x;
            y=_y;
            w=_w;
            h=_h;
            status=_status;


        }



       public int isswitched() {
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
       public float x;
       public float y;
       public float w;
       public float h;
       public int u;
       public int a;
       public Button(float _x,float _y, float _w, float _h){
            x=_x;
            y=_y;
            w=_w;
            h=_h;
        }

       public int isPressed(){
            int ip=0;
            if(Gdx.input.isTouched()) {
                if(u==0) {
                    if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h) {
                        u = 1;

                            a = Gdx.input.getY();
                        
                    }
                }
            }else {
                if(u==1 && !Gdx.input.isTouched()) {
                    if (Gdx.input.getX() < w + x && Gdx.input.getX() > x && Gdx.input.getY() < Gdx.graphics.getHeight() - y && Gdx.input.getY() > Gdx.graphics.getHeight() - y - h     &&     Gdx.input.getY()==a) {

                        ip = 1;
                        u = 0;
                    }else{
                        u=0;
                    }
                }

        }
            return ip;
    }


}

}
