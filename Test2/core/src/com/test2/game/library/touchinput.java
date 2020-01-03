package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class touchinput {
    public static class Switch {
       public int y;
       public int x;
       public int w;
       public int h;
       public int status=0;
       public int u;



        static ArrayList<Switch> switchs = new ArrayList<Switch>();



        public Switch(int _x, int _y, int _w, int _h, int _status) {
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
       public int x;
       public int y;
       public int w;
       public int h;
       public int u;
       public int a;
       public Button(int _x,int _y, int _w, int _h){
            x=_x;
            y=_y;
            w=_w;
            h=_h;
        }

       public int isPressed(){
            int ip=0;
            System.out.println(a);
            System.out.println(Gdx.input.getY());
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
