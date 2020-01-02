package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import static com.test2.game.AssetManagerExample.switchoff;
import static com.test2.game.AssetManagerExample.switchon;


public class SplashScreen extends ScreenAdapter implements Screen {

    SpriteBatch batch;

    ShapeRenderer shapeRenderer;


    public SplashScreen() {
        batch = new SpriteBatch();


        shapeRenderer = new ShapeRenderer();



    }





    public void render(float delta) {
        AssetManagerExample.loader();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.rect(100,100,AssetManagerExample.manager.getProgress()*900,100);
        //System.out.println(AssetManagerExample.manager.getProgress());
        shapeRenderer.end();




if(AssetManagerExample.manager.update()) {
    AssetManagerExample.save();
    Test2.INSTANCE.setScreen(new StartScreen());

}


    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public void hide() {
        if(Var.EnableAndroidSave==true) {
            LoadSave.saveall();
        }
        this.dispose();
    }
    public void toast(String text) {

    }
}
