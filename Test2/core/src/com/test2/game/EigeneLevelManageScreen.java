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

public class EigeneLevelManageScreen extends ScreenAdapter {

    static ArrayList<touchinput.Button> EigeneLevelButtons = new ArrayList<touchinput.Button>();

    SpriteBatch batch;
    BitmapFont font;
    ShapeRenderer shapeRenderer;
    Texture img;
    Texture startge;
    Texture hintergrund2;
    Texture switchon;
    Texture switchoff;
    Texture Levelbutton;
    Texture buttonimage;
    Texture Levelbuttonrot;
    touchinput.Button zurueck;
    touchinput.Button newLevel;

    String back;
    int u = 0;

    public EigeneLevelManageScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();


        img = new Texture("start.png");
        startge = new Texture("startge.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        Levelbutton = new Texture("Levelauswahlbutton.png");
        buttonimage = new Texture("Button.png");
        Levelbuttonrot = new Texture("Levelauswahlbuttonrot.png");
        zurueck = new touchinput.Button(Gdx.graphics.getWidth()/2-110,Gdx.graphics.getHeight()-500,220,100);
        newLevel = new touchinput.Button(0,Gdx.graphics.getHeight()-100,400,100);

        create();
    }
    int fw=5;
    int fh=5;

    void create() {
        int le=0;
        for(int j=0;j<fh;j=j+1) {
            for (int i = 0; i < fw; i = i + 1) {
                le=le+1;
                touchinput.Button B;
                B = new touchinput.Button(i * Gdx.graphics.getWidth() / fw,j* Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw) ;
                //LevelAuswahlButtons.Levelbuttons.add(LAB,i);
                EigeneLevelManageScreen.EigeneLevelButtons.add(i,B);
            }
        }
    }





    @Override
    public void render(float delta) {


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        font.getData().setScale(4);
        font.draw(batch, "Neues Level", newLevel.x+30, newLevel.y+(newLevel.h/2+25));
        batch.draw(buttonimage, newLevel.x,newLevel.y,newLevel.w,newLevel.h);
        if(newLevel.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelBaukastenScreen());
        }




        touchinput.Button B;
        for(int b=0;b<EigeneLevelButtons.size();b=b+1) {
            B = EigeneLevelButtons.get(b);
            batch.draw(buttonimage,B.x,B.y,B.w,B.h);
            font.getData().setScale(4);
            font.draw(batch, ""+b,B.x+B.w/2,B.y+B.h/2);
        }




        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        //shapeRenderer.setColor(1,0,0,1);
        //shapeRenderer.rect(0,0,100,100);

        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }

    @Override
    public void hide() {
        this.dispose();
    }
}
