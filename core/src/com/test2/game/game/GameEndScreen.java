package com.test2.game.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.library.LoadSave;
import com.test2.game.library.touchinput;
import com.test2.game.start.AssetManageLoader;
import com.test2.game.start.StartScreen;

import static com.test2.game.start.AssetManageLoader.*;

public class GameEndScreen extends ScreenAdapter {

touchinput.Button Weiter;

    touchinput.Button playstore;
    SpriteBatch batch;
    ShapeRenderer render;

    public GameEndScreen() {
        playstore = new touchinput.Button(Gdx.graphics.getWidth() / 2 - info.getWidth() / 2, Gdx.graphics.getHeight() / 28.75f * 13.39f, info.getWidth(), info.getHeight());
        Weiter = new touchinput.Button(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 7.2222222f, Gdx.graphics.getHeight() / 2 - (int) (Gdx.graphics.getHeight() / 5), Gdx.graphics.getWidth() / 3.6111f, Gdx.graphics.getHeight() / 6.3888f);
        render = new ShapeRenderer();
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {




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

        batch.end();

        render.begin(ShapeRenderer.ShapeType.Filled);
        render.setColor(0.4f, 0.2f, 0.8f, 0.6f);
        render.rect(Gdx.graphics.getWidth() / 6.5f, Gdx.graphics.getHeight() / 4.4230f, Gdx.graphics.getWidth() / 1.44444444f, Gdx.graphics.getHeight() / 1.828f);//Der Popup Hintergrund wied lila gedrawd
        render.end();

        batch.begin();

        batch.setColor(0.4f, 0.2f, 0.8f, 0.6f);
        batch.draw(bigpause, Weiter.x, Weiter.y, Weiter.w, Weiter.h);  //Der BigPause Button wird gedrawd

        batch.setColor(1f, 1f, 1f, 1f);
        font.getData().setScale(Gdx.graphics.getWidth() / 1450f, Gdx.graphics.getHeight() / 2284f);
        font.draw(batch, "Du hast es geschafft: Alle Level beendet", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 21.29f);
        font.draw(batch, "und bis hier hin gekommen.", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 20.5f);
        font.draw(batch, "Vielen Dank fürs Spielen!", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 19.71f);
        font.draw(batch, "Wenn dir es gefallen hat, lass doch gerne", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 18.92f);
        font.draw(batch, "eine Bewertung im Playstore da und", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 18.13f);
        font.draw(batch, "probiere andere Spiele von uns aus.", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 28.75f * 17.34f);
        batch.draw(info, Gdx.graphics.getWidth() / 2 - info.getWidth() / 2, Gdx.graphics.getHeight() / 28.75f * 13.39f);
        batch.end();
//0.79   3,95


        if (playstore.isPressed() == 1) {
            Gdx.net.openURI("http://google.de/"); //TODO LINK
        }

        super.render(delta);

        if (Weiter.isPressed() == 1) {
            Var.finish = true;
            LoadSave.saveall();
            Test2.INSTANCE.setScreen(new StartScreen());
        }
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
}
