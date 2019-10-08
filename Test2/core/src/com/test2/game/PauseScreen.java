package com.test2.game;





import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

public class PauseScreen extends ScreenAdapter {
    SpriteBatch batch;
    Texture neustart;
    Texture status_bar;
    ShapeRenderer shapeRenderer;
    BitmapFont font;
    Texture weiter;

    public PauseScreen() {

        batch = new SpriteBatch();
        font = new BitmapFont();
        shapeRenderer = new ShapeRenderer();
        status_bar = new Texture("statusbar.png");
        weiter = new Texture("Weiter.png");
    }

    @Override
    public void render(float delta) {






        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.setColor(1,1,1,0.5f);
        batch.draw(status_bar,0,Gdx.graphics.getHeight()-50,Gdx.graphics.getWidth(),50);
        batch.setColor(1,1,1,1f);
        font.getData().setScale(3);
        font.draw(batch, "Pause", Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-5);

        batch.draw(weiter,Var.Button_Pause_x,Var.Button_Pause_y,Var.Button_Pause_Width,Var.Button_Pause_Height);
        if(Gdx.input.getX() < Var.Button_Pause_Width+Var.Button_Pause_x && Gdx.input.getX() > Var.Button_Pause_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_Pause_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_Pause_y-Var.Button_Pause_Height){
            if(Gdx.input.isTouched()){
                Test2.INSTANCE.setScreen(new OptionScreen());
            }
        }








        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        neustart.dispose();
    }

    @Override
    public void hide() {
        this.dispose();
    }
}
