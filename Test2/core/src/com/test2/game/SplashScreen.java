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

import static com.test2.game.AssetManagerExample.*;


public class SplashScreen extends ScreenAdapter implements Screen {

    SpriteBatch batch;

    ShapeRenderer shapeRenderer;


    public SplashScreen() {
        batch = new SpriteBatch();


        shapeRenderer = new ShapeRenderer();

        if(!Var.newpack) {
            AssetManagerExample.loader();
        }else {
            AssetManagerExample.unload();

                Var.actpack = Var.gotopack;
                manager.clear();
                AssetManagerExample.loader();

        }
    }





    public void render(float delta) {


    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
    shapeRenderer.setColor(0, 1, 0, 1);
    shapeRenderer.rect(0, 200, AssetManagerExample.manager.getProgress() * 100 * (Gdx.graphics.getWidth() / 100), 100);
    // System.out.println(AssetManagerExample.manager.getProgress());
    shapeRenderer.end();
    batch.begin();
    if (AssetManagerExample.manager.getProgress() * 100 < 20) {
        font.draw(batch, "Das Laden wird geladen", 100, 100);
    }
    if (AssetManagerExample.manager.getProgress() * 100 > 20 && AssetManagerExample.manager.getProgress() * 100 < 50) {
        font.draw(batch, "Der Ladebalken wird heruntergeladen", 100, 100);
    }
    if (AssetManagerExample.manager.getProgress() * 100 > 50) {
        font.draw(batch, "Wlan-Kabel-Überprüfung..", 100, 100);
    }
    batch.end();


    if (AssetManagerExample.manager.update()) {
        AssetManagerExample.save();
        Var.gotopack ="";
        Var.newpack = false;
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
