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
    touchinput.Button LevelBaukasten;

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

        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-(int)(Gdx.graphics.getWidth()/2.7f/2), (int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/2.54),(int)(Gdx.graphics.getWidth()/2.7f),(int)(Gdx.graphics.getHeight()/17.76f));
        buttonimage = new Texture("Button.png");


        System.out.println(Gdx.graphics.getHeight());
        //Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,(int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/3.55f),600,300);
        LevelBaukasten = new touchinput.Button(Gdx.graphics.getWidth()/2-(int)(Gdx.graphics.getWidth()/2.7f/2),(int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/2.96f),(int)(Gdx.graphics.getWidth()/2.7f),(int)(Gdx.graphics.getHeight()/17.76f));
        Start = new touchinput.Button((int)(Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/2.16/2),(int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/3.55f),(int)(Gdx.graphics.getWidth()/2.16),(int)(Gdx.graphics.getHeight()/17.76f));



    }

    @Override
    public void render(float delta) {


        LoadSavee.loadall();



        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //batch.draw(bzs,Gdx.graphics.getWidth()/2-400,Gdx.graphics.getHeight()/2-50,800,200);
        font.getData().setScale(Gdx.graphics.getWidth()/270,Gdx.graphics.getHeight()/444);
        font.draw(batch, "weiter spielen", Start.x+30, Start.y+(Start.h/2+25));
        batch.draw(buttonimage, Start.x,Start.y,Start.w,Start.h);
        if(Start.isPressed()==1){
            Var.createlevel=Var.levelbesitz;
            Test2.INSTANCE.setScreen(new GameScreen());
        }



        font.draw(batch, "Levelauswahl", Levelauswahl.x+30, Levelauswahl.y+(Levelauswahl.h/2+25));
        batch.draw(buttonimage, Levelauswahl.x,Levelauswahl.y,Levelauswahl.w,Levelauswahl.h);
        if(Levelauswahl.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }

        font.draw(batch, "LevelBaukasten", LevelBaukasten.x+30, LevelBaukasten.y+(LevelBaukasten.h/2+25));
        batch.draw(buttonimage, LevelBaukasten.x,LevelBaukasten.y,LevelBaukasten.w,LevelBaukasten.h);
        if(LevelBaukasten.isPressed() == 1){
            Test2.INSTANCE.setScreen(new EigeneLevelManageScreen());
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

