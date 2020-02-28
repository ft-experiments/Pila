package com.test2.game.start;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.game.GameScreen;
import com.test2.game.game.LevelAuswahlScreen;
import com.test2.game.library.LoadSave;
import com.test2.game.library.touchinput;
import com.test2.game.option.EigeneLevelManageScreen;

import static com.test2.game.start.AssetManageLoader.manager;

public class StartScreen extends ScreenAdapter {

    SpriteBatch batch;
    ShapeRenderer shapeRenderer;


    com.test2.game.library.touchinput.Button Start;
    com.test2.game.library.touchinput.Button Levelauswahl;
    com.test2.game.library.touchinput.Button Buttonstart;
    com.test2.game.library.touchinput.Button LevelBaukasten;


    com.test2.game.library.LoadSave LoadSavee;


    public StartScreen() {
        if (Var.EnableAndroidSave == true) {
            LoadSavee = new LoadSave();
        }

        batch = new SpriteBatch();


        shapeRenderer = new ShapeRenderer();


        LevelBaukasten = new com.test2.game.library.touchinput.Button(Gdx.graphics.getWidth() / 2 - (int) (Gdx.graphics.getWidth() / 2.7f / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 2.54), (int) (Gdx.graphics.getWidth() / 2.7f), (int) (Gdx.graphics.getHeight() / 17.76f));


        //System.out.println(Gdx.graphics.getHeight());
        //Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,(int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/3.55f),600,300);
        Levelauswahl = new com.test2.game.library.touchinput.Button(Gdx.graphics.getWidth() / 2 - (int) (Gdx.graphics.getWidth() / 2.7f / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 3.0f), (int) (Gdx.graphics.getWidth() / 2.7f), (int) (Gdx.graphics.getHeight() / 17.76f));
        Start = new touchinput.Button((int) (Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 2.16 / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 3.9f), (int) (Gdx.graphics.getWidth() / 2.16), (int) (Gdx.graphics.getHeight() / 17.76f));


    }

    @Override
    public void render(float delta) {
        Var.ingame = false;
        if (Var.EnableAndroidSave == true) {
            LoadSave.loadall();
        }


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        if (Var.actbackground == Var.background1) {
            batch.draw(AssetManageLoader.b1, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

        if (Var.actbackground == Var.background2) {
            batch.draw(AssetManageLoader.b2, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background3) {
            batch.draw(AssetManageLoader.b3, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background4) {
            batch.draw(AssetManageLoader.b4, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background5) {
            batch.draw(AssetManageLoader.b5, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background6) {
            batch.draw(AssetManageLoader.b6, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background7) {
            batch.draw(AssetManageLoader.b7, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background8) {
            batch.draw(AssetManageLoader.b8, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background9) {
            batch.draw(AssetManageLoader.b9, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
        if (Var.actbackground == Var.background10) {
            batch.draw(AssetManageLoader.b10, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }


        AssetManageLoader.font.getData().setScale(Gdx.graphics.getWidth() / 900f, Gdx.graphics.getHeight() / 1480f);
        AssetManageLoader.font.draw(batch, "weiter spielen", Start.x + 30, Start.y + (Start.h / 2 + 25));
        AssetManageLoader.font.getData().setScale(1f);
        batch.draw(AssetManageLoader.buttonimage, Start.x, Start.y, Start.w, Start.h);
        if (Start.isPressed() == 1) {
            Var.createlevel = Var.levelbesitz;
            Test2.INSTANCE.setScreen(new GameScreen());
        }


        AssetManageLoader.font.getData().setScale(Gdx.graphics.getWidth() / 900f, Gdx.graphics.getHeight() / 1480f);
        AssetManageLoader.font.draw(batch, "Levelauswahl", Gdx.graphics.getWidth() / 2.92f, Gdx.graphics.getHeight() / 1.404f);


        AssetManageLoader.font.getData().setScale(Gdx.graphics.getWidth() / 900f, Gdx.graphics.getHeight() / 1480f);

        batch.draw(AssetManageLoader.buttonimage, Levelauswahl.x, Levelauswahl.y, Levelauswahl.w, Levelauswahl.h);
        if (Levelauswahl.isPressed() == 1) {
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }

        if (Var.EnableAlpha) {
            AssetManageLoader.font.draw(batch, "LevelBaukasten", LevelBaukasten.x + 30, LevelBaukasten.y + (LevelBaukasten.h / 2 + 25));
            batch.draw(AssetManageLoader.buttonimage, LevelBaukasten.x, LevelBaukasten.y, LevelBaukasten.w, LevelBaukasten.h);
            if (LevelBaukasten.isPressed() == 1) {
                Test2.INSTANCE.setScreen(new EigeneLevelManageScreen());
            }

        }
        batch.end();


        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1, 0, 0, 1);
        //shapeRenderer.rect(0,0,100,100);

        shapeRenderer.end();


    }


    @Override
    public void resize(int width, int height) {
        manager.update();
        super.resize(width, height);
    }

    @Override
    public void resume() {
        manager.update();
        super.resume();
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

