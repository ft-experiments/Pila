package com.test2.game;

import com.badlogic.gdx.Screen;

public class StartApp implements Screen {
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        System.out.println("Hallo !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Test2.INSTANCE.setScreen(new GameScreen());
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
