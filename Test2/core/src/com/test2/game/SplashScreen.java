package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import static com.test2.game.AssetManageLoader.*;


public class SplashScreen extends ScreenAdapter implements Screen {

    SpriteBatch batch;

    ShapeRenderer shapeRenderer;


    public SplashScreen() {
        batch = new SpriteBatch();


        shapeRenderer = new ShapeRenderer();

        if(!Var.newpack) {
            AssetManageLoader.loader();
        }else {
            AssetManageLoader.unload();

                Var.actpack = Var.gotopack;
                manager.clear();
                AssetManageLoader.loader();

        }
    }





    public void render(float delta) {


    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
    shapeRenderer.setColor(0, 1, 0, 1);
    shapeRenderer.rect(0, 200, AssetManageLoader.manager.getProgress() * 100 * (Gdx.graphics.getWidth() / 100), 100);
    // System.out.println(AssetManagerExample.manager.getProgress());
    shapeRenderer.end();
    batch.begin();
    if (AssetManageLoader.manager.getProgress() * 100 < 20) {
        font.draw(batch, "Das Laden wird geladen", 25, 100);
    }
    if (AssetManageLoader.manager.getProgress() * 100 > 20 && AssetManageLoader.manager.getProgress() * 100 < 50) {
        font.draw(batch, "Der Ladebalken wird geladen", 25, 100);
    }
    if (AssetManageLoader.manager.getProgress() * 100 > 50) {
        font.draw(batch, "Wlan-Kabel-Überprüfung..", 25, 100);
    }
    batch.end();


    if (AssetManageLoader.manager.update()) {
        AssetManageLoader.save();
        Var.gotopack ="";

        if (Var.newpack) {


            Var.newpack = false;


            Test2.INSTANCE.setScreen(new OptionScreen(Test2.INSTANCE));

        }
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
