package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.test2.game.AssetManagerExample.*;

public class StartScreen extends ScreenAdapter {

    SpriteBatch batch;
    ShapeRenderer shapeRenderer;



    touchinput.Button Start;
    touchinput.Button Levelauswahl;
    touchinput.Button Buttonstart;
    touchinput.Button LevelBaukasten;


    LoadSave LoadSavee;




    public StartScreen() {
        if(Var.EnableAndroidSave==true) {
            LoadSavee = new LoadSave();
        }

        batch = new SpriteBatch();




        shapeRenderer = new ShapeRenderer();




        LevelBaukasten = new touchinput.Button(Gdx.graphics.getWidth() / 2 - (int) (Gdx.graphics.getWidth() / 2.7f / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 2.54), (int) (Gdx.graphics.getWidth() / 2.7f), (int) (Gdx.graphics.getHeight() / 17.76f));



        //System.out.println(Gdx.graphics.getHeight());
        //Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,(int)(Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/3.55f),600,300);
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth() / 2 - (int) (Gdx.graphics.getWidth() / 2.7f / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 3.0f), (int) (Gdx.graphics.getWidth() / 2.7f), (int) (Gdx.graphics.getHeight() / 17.76f));
        Start = new touchinput.Button((int) (Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 2.16 / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 3.9f), (int) (Gdx.graphics.getWidth() / 2.16), (int) (Gdx.graphics.getHeight() / 17.76f));



    }

    @Override
    public void render(float delta) {
        Var.ingame=false;
        if(Var.EnableAndroidSave==true) {
            LoadSavee.loadall();
        }



        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        if(Var.actbackground==Var.background1) {
            batch.draw(AssetManagerExample.b1,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }

        if(Var.actbackground==Var.background2) {
            batch.draw(AssetManagerExample.b2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background3) {
            batch.draw(AssetManagerExample.b3,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background4) {
            batch.draw(AssetManagerExample.b4,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background5) {
            batch.draw(AssetManagerExample.b5,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background6) {
            batch.draw(AssetManagerExample.b6,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background7) {
            batch.draw(AssetManagerExample.b7,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background8) {
            batch.draw(AssetManagerExample.b8,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background9) {
            batch.draw(AssetManagerExample.b9,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background10) {
            batch.draw(AssetManagerExample.b10,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }



    AssetManagerExample.font.getData().setScale(0.7f);
        AssetManagerExample.font.draw(batch, "weiter spielen", Start.x+30, Start.y+(Start.h/2+25));
        AssetManagerExample.font.getData().setScale(1f);
        batch.draw(AssetManagerExample.buttonimage, Start.x,Start.y,Start.w,Start.h);
        if(Start.isPressed()==1){
            Var.createlevel=Var.levelbesitz;
            Test2.INSTANCE.setScreen(new GameScreen());
        }


        AssetManagerExample.font.getData().setScale(0.7f);
        AssetManagerExample.font.draw(batch, "Levelauswahl", Levelauswahl.x+30, Levelauswahl.y+(Levelauswahl.h/2+25));
        AssetManagerExample.font.getData().setScale(1f);
        batch.draw(AssetManagerExample.buttonimage, Levelauswahl.x,Levelauswahl.y,Levelauswahl.w,Levelauswahl.h);
        if(Levelauswahl.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }

        if(Var.EnableAlpha) {
            AssetManagerExample.font.draw(batch, "LevelBaukasten", LevelBaukasten.x + 30, LevelBaukasten.y + (LevelBaukasten.h / 2 + 25));
            batch.draw(AssetManagerExample.buttonimage, LevelBaukasten.x, LevelBaukasten.y, LevelBaukasten.w, LevelBaukasten.h);
            if (LevelBaukasten.isPressed() == 1) {
                Test2.INSTANCE.setScreen(new EigeneLevelManageScreen());
            }

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

