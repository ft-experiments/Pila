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

public class LevelAuswahlScreen extends ScreenAdapter {
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

   String back;
    int u = 0;

    public LevelAuswahlScreen(String referrer) {
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
        zurueck = new touchinput.Button(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()-100,220,100);

        back = referrer;
        create();
    }
    int fw=8;
    int fh=10;

    void create() {
        int le=1;
        for(int j=fh-1;j>-1;j=j-1) {
            for (int i = 0; i < fw; i = i + 1) {


                LevelAuswahlButtons LAB;
                LAB = new LevelAuswahlButtons(i, i * Gdx.graphics.getWidth() /fw, j* Gdx.graphics.getWidth() / (fh-2), Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw, le);
                //LevelAuswahlButtons.Levelbuttons.add(LAB,i);
                LevelAuswahlButtons.Levelbuttons.add(LAB);
                System.out.println(i);
                le=le+1;
            }
        }
    }





    @Override
    public void render(float delta) {
        Var.ingame = true;


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        font.getData().setScale(4);
        font.draw(batch, "zurück" , zurueck.x+30, zurueck.y+zurueck.h/2+25);
        batch.draw(buttonimage, zurueck.x,zurueck.y,zurueck.w,zurueck.h);
        if(zurueck.isPressed() == 1){
            Level.dispose();
            if(back=="game") {
                Test2.INSTANCE.setScreen(new GameScreen());
            }

            if(back=="start") {
                Test2.INSTANCE.setScreen(new StartScreen());
            }

        }

        LevelAuswahlButtons LAB;
        for(int b=0;b<LevelAuswahlButtons.Levelbuttons.size();b=b+1) {
            LAB = LevelAuswahlButtons.Levelbuttons.get(b);
            if(LAB.Level-1>=Var.levelbesitz) {
                batch.draw(Levelbuttonrot, LAB.x+5, LAB.y+5, LAB.w-5, LAB.h-5);
            }
            if(LAB.Level-1<Var.levelbesitz){
                batch.draw(Levelbutton, LAB.x+5, LAB.y+5, LAB.w-5, LAB.h-5);
            }

            font.getData().setScale(4);
            font.draw(batch, ""+(LAB.Level) , LAB.x+LAB.w/2-30,LAB.y+LAB.h/2+30);
            //System.out.println(b);
            if(LAB.Level<=Var.levelbesitz) {
                LAB.check();
            }
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
