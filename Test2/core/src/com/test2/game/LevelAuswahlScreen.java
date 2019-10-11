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
    int u = 0;

    public LevelAuswahlScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();


        img = new Texture("start.png");
        startge = new Texture("startge.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        Levelbutton = new Texture("Levelauswahlbutton.png");

        create();
    }
    int fw=5;
    int fh=5;

    void create() {
        for(int j=0;j<fh;j=j+1) {
            for (int i = 0; i < fw; i = i + 1) {
                LevelAuswahlButtons LAB;
                LAB = new LevelAuswahlButtons(i, i * Gdx.graphics.getWidth() / fw, j* Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw, i);
                LevelAuswahlButtons.Levelbuttons.add(LAB);
            }
        }
    }





    @Override
    public void render(float delta) {



        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        LevelAuswahlButtons LAB;
        for(int i=0;i<LevelAuswahlButtons.Levelbuttons.size();i=i+1) {
            LAB = LevelAuswahlButtons.Levelbuttons.get(i);
            batch.draw(Levelbutton, LAB.x, LAB.y, LAB.w, LAB.h);
            font.getData().setScale(8);
            font.draw(batch, ""+LAB.Level , LAB.x+LAB.w/2,LAB.y+LAB.h/2);
        }

        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1,0,0,1);
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
