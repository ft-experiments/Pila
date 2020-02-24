package com.test2.game.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.library.touchinput;
import com.test2.game.start.AssetManageLoader;
import com.test2.game.start.StartScreen;

import static com.test2.game.start.AssetManageLoader.*;
import static com.test2.game.start.AssetManageLoader.font;

public class GameEndScreen extends ScreenAdapter {

touchinput.Button Weiter;


    SpriteBatch batch;
    ShapeRenderer render;

    public GameEndScreen() {
        Weiter = new touchinput.Button(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 7.2222222f, Gdx.graphics.getHeight() / 2 - (int) (Gdx.graphics.getHeight() / 5.92), Gdx.graphics.getWidth() / 3.6111f, Gdx.graphics.getHeight() / 6.3888f);
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
        font.getData().setScale(Gdx.graphics.getWidth() / 750f, Gdx.graphics.getHeight() / 1184f);
        font.draw(batch, "Du hast es geschafft! ", Gdx.graphics.getWidth() / 6.2f, Gdx.graphics.getHeight() / 4.2f*3);


        //Alle Level beendet und bis hier hin gekommen. Vielen Dank fürs Spielen. Wenn dir es gefallen hat, lass doch gerne eine Bewertung im Playstore da und probiere andere Spiele von uns aus.
        batch.end();



        super.render(delta);

        if(Weiter.isPressed()==1) {
            Var.finish = true;
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
