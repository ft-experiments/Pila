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

public class GameOverScreen extends ScreenAdapter {
    SpriteBatch batch;
    Texture neustart;
    Texture startge;
    Texture Touch;
    Texture Gyro;
    ShapeRenderer shapeRenderer;
    BitmapFont font;
    Texture hintergrund2;
    Texture gameover;

    public GameOverScreen() {

        batch = new SpriteBatch();
        font = new BitmapFont();

        neustart = new Texture("neustart.png");
        startge = new Texture("startge.png");
        Touch = new Texture("Touch.png");
        Gyro = new Texture("Gyro.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        gameover = new Texture("gameover.png");
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void render(float delta) {






        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.draw(gameover,Gdx.graphics.getWidth()/2-500,Gdx.graphics.getHeight()/2+200,1000,300);
        font.getData().setScale(8);
        //font.draw(batch, "Game Over" , Gdx.graphics.getWidth()/2-300, Gdx.graphics.getHeight()/2+200);






        if(Gdx.input.getX() < Var.Button_start_Width+Var.Button_start_x && Gdx.input.getX() > Var.Button_start_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_start_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_start_y-Var.Button_start_Height)
        {

            batch.draw(neustart, Var.Button_start_x, Var.Button_start_y,Var.Button_start_Width,Var.Button_start_Height);
        /*    if(Gdx.input.isButtonJustPressed(0)) {
                Var.gamestatus=0;
                Level.kisten.clear();
                Test2.INSTANCE.setScreen(new GameScreen());

         } */
            if(Gdx.input.isTouched()){
                Level.dispose();
                Var.gamestatus=0;
                Var.createlevel=Level.Le;
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
