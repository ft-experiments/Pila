package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import javax.swing.text.html.Option;

public class StartScreen extends ScreenAdapter {
    Texture buttonimage;
    SpriteBatch batch;
    ShapeRenderer shapeRenderer;
    Texture hintergrund2;
    BitmapFont font;
    Texture switchon;
    Texture switchoff;
    Texture bzs;
    touchinput.Button Start;

    int u=0;

    public StartScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();


        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");
        bzs = new Texture("bzs.png");

        Start = new touchinput.Button(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());



    }

    @Override
    public void render(float delta) {





        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.draw(bzs,Gdx.graphics.getWidth()/2-400,Gdx.graphics.getHeight()/2-100,800,200);

        if(Start.isPressed()==1){
            Test2.INSTANCE.setScreen(new OptionScreen());
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
    }

    @Override
    public void hide() {
        this.dispose();
    }
}
