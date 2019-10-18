package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.loaders.BitmapFontLoader;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;
import java.util.ArrayList;

public class LevelBaukastenScreen extends ScreenAdapter {
    SpriteBatch batch;
    BitmapFont font;
    ShapeRenderer shapeRenderer;
    Texture img;
    Texture startge;
    Texture hintergrund2;
    Texture switchon;
    Texture switchoff;
    Texture buttonimage;
    Texture blockrot;
    Texture blockgruen;
    Texture blockblau;
    Texture doppeltblock;
    Texture unzer;

    touchinput.Button rot;
    touchinput.Button gruen;
    touchinput.Button blau;
    touchinput.Button doppelt;
    touchinput.Button unzers;
    touchinput.Button leer;
    touchinput.Button wpopup;

    touchinput.Button zuruck;

    int popup=0;

    static int x_pop=0;
    static int y_pop=0;
    static int b_pop=0;

    static int w=0;
    static int h=0;

    static int[] LevelBa = new int[140];

    static ArrayList<LevelBauBlock> blocks = new ArrayList<LevelBauBlock>();

    public LevelBaukastenScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();


        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        buttonimage = new Texture("Button.png");

        blockrot=new Texture("block_rot.png");
        blockgruen=new Texture("block_gruen.png");
        blockblau=new Texture("block_blau.png");
        doppeltblock=new Texture("block_2mal.png");
        unzer=new Texture("block_unzerstoerbar.png");

        rot=new touchinput.Button(0,0,150,75);
        gruen=new touchinput.Button(0,0,150,75);
        blau=new touchinput.Button(0,0,150,75);
        doppelt=new touchinput.Button(0,0,150,75);
        unzers=new touchinput.Button(0,0,150,75);
        leer=new touchinput.Button(0,0,150,75);
        wpopup=new touchinput.Button(0,0,200,525);

        zuruck = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-100,400,100);

    levelcreater(10,12);


    }
    static  int wo;
    static int x;
    static int y;
    static void levelcreater( int _w, int _h) {
        w=_w;
        h=_h;
        y = 0;
        while (y < h) {
            x = 0;
            while (x < w) {
                wo = wo + 1;

                        blocks.add(new LevelBauBlock(x * Gdx.graphics.getWidth() / w, Gdx.graphics.getHeight() - y * 50 - 200, Gdx.graphics.getWidth() / w, 50, 0));

                x = x + 1;
            }
            y = y + 1;
        }
    }



    static void save(){
        int a=0;
        LevelBa[0]=10;
        LevelBa[1]=12;
        LevelBa[2]=200;
        LevelBa[3]=0;
        a=4;
while(a<w*h+4) {
    LevelBa[a] = blocks.get(a-4).K_art;
a++;
}

    }



    @Override
    public void render(float delta) {
        save();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.end();



        for(int i=0;i<blocks.size();i=i+1) {
            LevelBauBlock b;
            b = blocks.get(i);
            batch.begin();
            switch(b.K_art) {
                case 0:
                    batch.draw(blockrot, b.K_x, b.K_y, b.K_w, b.K_h);
                break;
                case 1:
                    batch.draw(blockgruen, b.K_x, b.K_y, b.K_w, b.K_h);
                    break;
                case 2:
                    batch.draw(blockblau, b.K_x, b.K_y, b.K_w, b.K_h);
                    break;
                case 3:
                    batch.draw(doppeltblock, b.K_x, b.K_y, b.K_w, b.K_h);
                    break;
                case 4:
                    batch.draw(unzer, b.K_x, b.K_y, b.K_w, b.K_h);
                    break;
                case 5:
                    batch.draw(buttonimage, b.K_x, b.K_y, b.K_w, b.K_h);
                    break;
            }
            batch.end();








        }



        if (Gdx.input.getX() < wpopup.w + wpopup.x && Gdx.input.getX() > wpopup.x && Gdx.input.getY() < Gdx.graphics.getHeight() - wpopup.y && Gdx.input.getY() > Gdx.graphics.getHeight() - wpopup.y - wpopup.h) {   //x_pop+b.K_w/2-10,y_pop-10+b.K_h/2{
            System.out.println(b_pop);

        } else {
            popup = 0;
        }


        for(int i=0;i<blocks.size();i=i+1) {
            LevelBauBlock b;
            b = blocks.get(i);
            popup();

                if (b.check() == 1) {
                    popup = 1;
                    if (Gdx.input.getX() < wpopup.w + wpopup.x && Gdx.input.getX() > wpopup.x && Gdx.input.getY() < Gdx.graphics.getHeight() - wpopup.y && Gdx.input.getY() > Gdx.graphics.getHeight() - wpopup.y - wpopup.h) {   //x_pop+b.K_w/2-10,y_pop-10+b.K_h/2{
                        System.out.println(b_pop);

                    } else {
                        popup = 1;
                        b_pop = i;
                    }

                }





        }



        batch.begin();

        font.getData().setScale(4);
        font.draw(batch, "LevelAuswahl", zuruck.x+30, zuruck.y+(zuruck.h/2+25));
        batch.draw(buttonimage, zuruck.x,zuruck.y,zuruck.w,zuruck.h);
        if(zuruck.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }
        batch.end();
    }

    void popup(){

        //b_pop= _b;
        LevelBauBlock b;
        b = blocks.get(b_pop);
        x_pop = b.K_x;
        y_pop = b.K_y;
        if(popup==1){
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(255,100,255,1);
            //shapeRenderer.rect(x_pop+b.K_w/2,y_pop-525+b.K_h/2,200,525);
            wpopup.x=x_pop+b.K_w/2;
            wpopup.y=y_pop-525+b.K_h/2;
            shapeRenderer.setColor(255,255,0,1);
            shapeRenderer.ellipse(x_pop+b.K_w/2-10,y_pop-10+b.K_h/2,20,20);
            shapeRenderer.end();
            batch.begin();
            batch.draw(buttonimage, wpopup.x,wpopup.y,wpopup.w,wpopup.h);
            batch.end();

            batch.begin();
            //if(b.check()==1){

            rot.x=x_pop+b.K_w/2+25;
            rot.y=y_pop-100+b.K_h/2;
            batch.draw(blockrot, rot.x,rot.y,rot.w,rot.h);
            font.getData().setScale(4);
            font.draw(batch, "rot", rot.x+30, rot.y+(rot.h/2+25));
            if(rot.isPressed() == 1){
                b.K_art=0;
            }

            gruen.x=x_pop+b.K_w/2+25;
            gruen.y=y_pop-180+b.K_h/2;
            batch.draw(blockgruen, gruen.x,gruen.y,gruen.w,gruen.h);
            font.getData().setScale(4);
            font.draw(batch, "grün", gruen.x+30, gruen.y+(gruen.h/2+25));
            if(gruen.isPressed() == 1){
                b.K_art=1;
            }

            blau.x=x_pop+b.K_w/2+25;
            blau.y=y_pop-260+b.K_h/2;
            batch.draw(blockblau, blau.x,blau.y,blau.w,blau.h);
            font.getData().setScale(4);
            font.draw(batch, "blau", blau.x+30, blau.y+(blau.h/2+25));
            if(blau.isPressed() == 1){
                b.K_art=2;
            }

            doppelt.x=x_pop+b.K_w/2+25;
            doppelt.y=y_pop-340+b.K_h/2;
            batch.draw(doppeltblock, doppelt.x,doppelt.y,doppelt.w,doppelt.h);
            font.getData().setScale(4);
            font.draw(batch, "dop", doppelt.x+30, doppelt.y+(doppelt.h/2+25));
            if(doppelt.isPressed() == 1){
                b.K_art=3;
            }

            unzers.x=x_pop+b.K_w/2+25;
            unzers.y=y_pop-420+b.K_h/2;
            batch.draw(unzer, unzers.x,unzers.y,unzers.w,unzers.h);
            font.getData().setScale(4);
            font.draw(batch, "unz", unzers.x+30, unzers.y+(unzers.h/2+25));
            if(unzers.isPressed() == 1){
                b.K_art=4;
            }

            leer.x=x_pop+b.K_w/2+25;
            leer.y=y_pop-500+b.K_h/2;
            batch.draw(buttonimage, leer.x,leer.y,leer.w,leer.h);
            font.getData().setScale(4);
            font.draw(batch, "leer", leer.x+30, leer.y+(leer.h/2+25));
            if(leer.isPressed() == 1){
                b.K_art=5;
            }

            //}
            batch.end();




        }

    }



    @Override
    public void hide() {
        this.dispose();
    }
}
