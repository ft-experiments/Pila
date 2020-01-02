package com.test2.game;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.ScreenAdapter;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


import java.util.ArrayList;

public class LevelBaukastenScreen extends ScreenAdapter {
    SpriteBatch batch;
    BitmapFont font;
    ShapeRenderer shapeRenderer;

    Texture buttonimage;
    Texture blockrot;
    Texture blockgruen;
    Texture blockblau;

    Texture unzer;

    touchinput.Button rot;
    touchinput.Button gruen;
    touchinput.Button blau;
    touchinput.Button doppelt;
    touchinput.Button unzers;
    touchinput.Button leer;
    touchinput.Button wpopup;

    touchinput.Button zuruck;
    touchinput.Button speichern;
    touchinput.Button neu;

    int popup=0;

    static int x_pop=0;
    static int y_pop=0;
    static int b_pop=0;
    static int f_select=0;

    static int w=0;
    static int h=0;

    static int[] LevelBa = new int[140];

    static ArrayList<LevelBauBlock> blocks = new ArrayList<LevelBauBlock>();

    public LevelBaukastenScreen() {
        batch = new SpriteBatch();




        shapeRenderer = new ShapeRenderer();



        buttonimage = new Texture("Button.png");

        blockrot=new Texture("block_rot.png");
        blockgruen=new Texture("block_gruen.png");
        blockblau=new Texture("block_blau.png");

        unzer=new Texture("block_unzerstoerbar.png");




        rot=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        gruen=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        blau=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        doppelt=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        unzers=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        leer=new touchinput.Button(0,0,(int)(Gdx.graphics.getWidth()/2)/3,Gdx.graphics.getWidth()/10);
        wpopup=new touchinput.Button(0,0,200,525);



        zuruck = new touchinput.Button(0,0,Gdx.graphics.getWidth()/4,Gdx.graphics.getWidth()/10);
        speichern = new touchinput.Button(0,Gdx.graphics.getWidth()/10,Gdx.graphics.getWidth()/4,Gdx.graphics.getWidth()/10);
        neu = new touchinput.Button(Gdx.graphics.getWidth()/4,Gdx.graphics.getWidth()/10,Gdx.graphics.getWidth()/4,Gdx.graphics.getWidth()/10);




        if(EigeneLevelManageScreen.LoadEigenesLevel==0) {
            if (Var.LBSsho == 0) {
                levelcreater(10, 12);
            }
        }
        if(EigeneLevelManageScreen.LoadEigenesLevel!=0) {
            if(Var.EnableAndroidSave==true) {
                LoadSave.getArrayPrefs("EigeneLevel" + EigeneLevelManageScreen.LoadEigenesLevel);
            }
        }




    }
    static  int wo;
    static int x;
    static int y;
    static int ao;
    static void levelcreater(int _w, int _h) {
        w=_w;
        h=_h;
        ao=200;
        y = 0;
        while (y < h) {
            x = 0;
            while (x < w) {
                wo = wo + 1;

                        blocks.add(new LevelBauBlock(x * Gdx.graphics.getWidth() / w, Gdx.graphics.getHeight() - y * 50 - ao, Gdx.graphics.getWidth() / w, 50, 5));

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
        if(Var.EnableAndroidSave==true) {
            LoadSave.setArrayPrefs("EigeneLevel" + EigeneLevelManageScreen.LoadEigenesLevel, LevelBa);
        }



    }


    static void spielen(){
        Var.gamestatus=0;
        Level.dispose();
        Var.createlevel=-1;
    }



    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        if(Var.actbackground==Var.background1) {
            batch.draw(AssetManagerExample.b1,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }

        if(Var.actbackground==Var.background2) {
            batch.draw(AssetManagerExample.b2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background3) {
            batch.draw(AssetManagerExample.b3,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background4) {
            batch.draw(AssetManagerExample.b4,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background5) {
            batch.draw(AssetManagerExample.b5,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background6) {
            batch.draw(AssetManagerExample.b6,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background7) {
            batch.draw(AssetManagerExample.b7,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background8) {
            batch.draw(AssetManagerExample.b8,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background9) {
            batch.draw(AssetManagerExample.b9,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background10) {
            batch.draw(AssetManagerExample.b10,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
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
                    batch.draw(AssetManagerExample.block_2mal, b.K_x, b.K_y, b.K_w, b.K_h);
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



        ModeButtons();



        batch.begin();

        //font.getData().setScale(3,3);
        font.draw(batch, "Spielen", zuruck.x+30, zuruck.y+(zuruck.h/2+20));
        batch.draw(buttonimage, zuruck.x,zuruck.y,zuruck.w,zuruck.h);
        if(zuruck.isPressed() == 1){
            save();
            spielen();
            Test2.INSTANCE.setScreen(new GameScreen());
        }

        //font.getData().setScale(3,3);
        font.draw(batch, "Speichern", speichern.x+30, speichern.y+(speichern.h/2+20));
        batch.draw(buttonimage, speichern.x,speichern.y,speichern.w,speichern.h);
        if(speichern.isPressed() == 1){
            save();
        }

        //font.getData().setScale(3,3);
        font.draw(batch, "neu", neu.x+30, neu.y+(neu.h/2+20));
        batch.draw(buttonimage, neu.x,neu.y,neu.w,neu.h);
        if(neu.isPressed() == 1){
            blocks.clear();
            levelcreater(10,12);
        }

        batch.end();
    }




    void Modepopup(){
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
    }



    void ModeButtons(){

        for(int i=0;i<blocks.size();i=i+1) {
            LevelBauBlock b;
            b = blocks.get(i);
            if(b.check()==1){
                b.marked=1;
            }
            if(Gdx.input.getY()<100){
                b.marked=0;
            }




            if(b.marked==1) {
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                shapeRenderer.setColor(255, 255, 0, 1);
                shapeRenderer.ellipse(b.K_x + b.K_w / 2 - 10, b.K_y - 10 + b.K_h / 2, 20, 20);
                shapeRenderer.end();
            }


            batch.begin();
            batch.setColor(0.3f,0.3f,0.3f,1f);

            rot.x=Gdx.graphics.getWidth()-rot.w;
            rot.y=0;
            if(f_select==1){
                batch.setColor(1,1,1,1);
            }
            batch.draw(blockrot, rot.x,rot.y,rot.w,rot.h);
            //font.getData().setScale(4);
            font.draw(batch, "rot", rot.x+30, rot.y+(rot.h/2+25));
            if(f_select==1){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(rot.isPressed() == 1){
                f_select=1;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=0;
                    }

                }

            }






            gruen.x=Gdx.graphics.getWidth()-gruen.w*2;
            gruen.y=0;
            if(f_select==2){
                batch.setColor(1,1,1,1);
            }
            batch.draw(blockgruen, gruen.x,gruen.y,gruen.w,gruen.h);
            //font.getData().setScale(4);
            font.draw(batch, "grün", gruen.x+30, gruen.y+(gruen.h/2+25));
            if(f_select==2){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(gruen.isPressed() == 1){
                f_select=2;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=1;
                    }

                }

            }

            blau.x=Gdx.graphics.getWidth()-blau.w*3;
            blau.y=0;
            if(f_select==3){
                batch.setColor(1,1,1,1);
            }
            batch.draw(blockblau, blau.x,blau.y,blau.w,blau.h);
           // font.getData().setScale(4);
            font.draw(batch, "blau", blau.x+30, blau.y+(blau.h/2+25));
            if(f_select==3){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(blau.isPressed() == 1){
                f_select=3;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=2;
                    }

                }

            }



            doppelt.x=Gdx.graphics.getWidth()-doppelt.w*1;
            doppelt.y=doppelt.h;
            if(f_select==4){
                batch.setColor(1,1,1,1);
            }
            batch.draw(AssetManagerExample.block_2mal, doppelt.x,doppelt.y,doppelt.w,doppelt.h);
            //font.getData().setScale(4);
            font.draw(batch, "dop", doppelt.x+30, doppelt.y+(doppelt.h/2+25));
            if(f_select==4){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(doppelt.isPressed() == 1){
                f_select=4;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=3;
                    }

                }

            }

            unzers.x=Gdx.graphics.getWidth()-unzers.w*2;
            unzers.y=unzers.h;
            if(f_select==5){
                batch.setColor(1,1,1,1);
            }
            batch.draw(unzer, unzers.x,unzers.y,unzers.w,unzers.h);
            //font.getData().setScale(4);
            font.draw(batch, "unz", unzers.x+30, unzers.y+(unzers.h/2+25));
            if(f_select==5){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(unzers.isPressed() == 1){
                f_select=5;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=4;
                    }

                }

            }

            leer.x=Gdx.graphics.getWidth()-leer.w*3;
            leer.y=leer.h;
            if(f_select==6){
                batch.setColor(1,1,1,1);
            }
            batch.draw(buttonimage, leer.x,leer.y,leer.w,leer.h);
            //font.getData().setScale(4);
            font.draw(batch, "leer", leer.x+30, leer.y+(leer.h/2+25));
            if(f_select==6){
                batch.setColor(0.3f,0.3f,0.3f,1f);
            }
            if(leer.isPressed() == 1){
                f_select=6;
                for(int a=0;a<blocks.size();a=a+1) {
                    LevelBauBlock bb;
                    bb = blocks.get(a);
                    if(bb.marked==1){
                        bb.K_art=5;
                    }

                }

            }







            batch.setColor(1,1,1,1);
            batch.end();
            if(b.check()==1) {
                shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
                switch (f_select) {
                    case 1:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(rot.x, rot.y, 20, 20);
                        b.K_art = 0;

                        break;
                    case 2:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(gruen.x, gruen.y, 20, 20);
                        b.K_art = 1;
                        break;
                    case 3:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(blau.x, blau.y, 20, 20);
                        b.K_art = 2;
                        break;
                    case 4:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(doppelt.x, doppelt.y, 20, 20);
                        b.K_art = 3;
                        break;
                    case 5:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(unzers.x, unzers.y, 20, 20);
                        b.K_art = 4;
                        break;
                    case 6:
                        shapeRenderer.setColor(255, 255, 0, 1);
                        shapeRenderer.ellipse(leer.x, leer.y, 20, 20);
                        b.K_art = 5;
                        break;
                }
                shapeRenderer.end();
            }

        }





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
            //font.getData().setScale(4);
            font.draw(batch, "rot", rot.x+30, rot.y+(rot.h/2+25));
            if(rot.isPressed() == 1){
                b.K_art=0;
            }

            gruen.x=x_pop+b.K_w/2+25;
            gruen.y=y_pop-180+b.K_h/2;
            batch.draw(blockgruen, gruen.x,gruen.y,gruen.w,gruen.h);
            //font.getData().setScale(4);
            font.draw(batch, "grün", gruen.x+30, gruen.y+(gruen.h/2+25));
            if(gruen.isPressed() == 1){
                b.K_art=1;
            }

            blau.x=x_pop+b.K_w/2+25;
            blau.y=y_pop-260+b.K_h/2;
            batch.draw(blockblau, blau.x,blau.y,blau.w,blau.h);
            //font.getData().setScale(4);
            font.draw(batch, "blau", blau.x+30, blau.y+(blau.h/2+25));
            if(blau.isPressed() == 1){
                b.K_art=2;
            }

            doppelt.x=x_pop+b.K_w/2+25;
            doppelt.y=y_pop-340+b.K_h/2;
            batch.draw(AssetManagerExample.block_2mal, doppelt.x,doppelt.y,doppelt.w,doppelt.h);
            //font.getData().setScale(4);
            font.draw(batch, "dop", doppelt.x+30, doppelt.y+(doppelt.h/2+25));
            if(doppelt.isPressed() == 1){
                b.K_art=3;
            }

            unzers.x=x_pop+b.K_w/2+25;
            unzers.y=y_pop-420+b.K_h/2;
            batch.draw(unzer, unzers.x,unzers.y,unzers.w,unzers.h);
            //font.getData().setScale(4);
            font.draw(batch, "unz", unzers.x+30, unzers.y+(unzers.h/2+25));
            if(unzers.isPressed() == 1){
                b.K_art=4;
            }

            leer.x=x_pop+b.K_w/2+25;
            leer.y=y_pop-500+b.K_h/2;
            batch.draw(buttonimage, leer.x,leer.y,leer.w,leer.h);
            //font.getData().setScale(4);
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


    @Override
    public void dispose() {
        Var.LBSsho=1;
        super.dispose();
    }


}
