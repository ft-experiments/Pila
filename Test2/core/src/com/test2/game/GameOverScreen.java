package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

import static com.test2.game.AssetManagerExample.*;

public class GameOverScreen extends ScreenAdapter {
    SpriteBatch batch;

    ShapeRenderer shapeRenderer;


   public static boolean restartgameaftergameover = false;

    public GameOverScreen() {

        batch = new SpriteBatch();

        shapeRenderer = new ShapeRenderer();
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
        batch.draw(AssetManagerExample.gameover,Gdx.graphics.getWidth()/2-500,Gdx.graphics.getHeight()/2+200,1000,300);

        //font.draw(batch, "Game Over" , Gdx.graphics.getWidth()/2-300, Gdx.graphics.getHeight()/2+200);


        if(Gdx.input.getX() < Var.Button_start_Width+Var.Button_start_x && Gdx.input.getX() > Var.Button_start_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_start_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_start_y-Var.Button_start_Height)
        {

            batch.draw(AssetManagerExample.neustart, Var.Button_start_x, Var.Button_start_y,Var.Button_start_Width,Var.Button_start_Height);
        /*    if(Gdx.input.isButtonJustPressed(0)) {
                Var.gamestatus=0;
                Level.kisten.clear();
                Test2.INSTANCE.setScreen(new GameScreen());

         } */
            if(Gdx.input.isTouched()){
                //Var.gamestatus=0;
                Level.reset();
                restartgameaftergameover = true;
                Test2.INSTANCE.setScreen(new GameScreen());
            }




        }else{batch.draw(neustart, Var.Button_start_x, Var.Button_start_y,Var.Button_start_Width,Var.Button_start_Height);}

        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1,0,0,1);
        //shapeRenderer.rect(0,0,100,100);

        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        neustart.dispose();
    }

    @Override
    public void hide() {
        LoadSave.saveall();
        this.dispose();
    }
}
