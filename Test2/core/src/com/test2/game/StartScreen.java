package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import javax.swing.text.html.Option;

public class StartScreen extends ScreenAdapter {
    Texture buttonimage;
    SpriteBatch batch;
    ShapeRenderer shapeRenderer;
    Texture hintergrund2;
    BitmapFont font;
    Texture switchon;
    Texture switchoff;
    Texture bzs;
    touchinput.Button Start;
    touchinput.Button Levelauswahl;
    touchinput.Button Buttonstart;

    LoadSave LoadSavee;


    int u=0;

    public StartScreen() {
        LoadSavee = new LoadSave();


        batch = new SpriteBatch();
        font = new BitmapFont();


        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");
        bzs = new Texture("bzs.png");

        Start = new touchinput.Button(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        buttonimage = new Texture("Button.png");


        Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,Gdx.graphics.getHeight()-500,600,300);
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-600,400,100);



    }

    @Override
    public void render(float delta) {


        LoadSavee.loadall();



        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.draw(bzs,Gdx.graphics.getWidth()/2-400,Gdx.graphics.getHeight()/2-50,800,200);

        if(Start.isPressed()==1){
            Test2.INSTANCE.setScreen(new GameScreen());
        }


        font.getData().setScale(4);
        font.draw(batch, "Levelauswahl      " + LoadSavee.loadvibr(), Levelauswahl.x+30, Levelauswahl.y+(Levelauswahl.h/2+25)-200);
        batch.draw(buttonimage, Levelauswahl.x,Levelauswahl.y-200,Levelauswahl.w,Levelauswahl.h);
        if(Levelauswahl.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }


        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1,0,0,1);
        //shapeRenderer.rect(0,0,100,100);

        shapeRenderer.end();
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
