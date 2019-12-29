package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;



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




    public StartScreen() {
        if(Var.EnableAndroidSave==true) {
            LoadSavee = new LoadSave();
        }

        batch = new SpriteBatch();



//schriftart
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("comicsans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        font = generator.generateFont(parameter); // font size 12 pixels
        generator.dispose(); // don't forget to dispose to avoid memory leaks!
//




        hintergrund2 = new Texture(Var.actbackground);
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");
        bzs = new Texture("bzs.png");

        LevelBaukasten = new touchinput.Button(Gdx.graphics.getWidth() / 2 - (int) (Gdx.graphics.getWidth() / 2.7f / 2), (int) (Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 2.54), (int) (Gdx.graphics.getWidth() / 2.7f), (int) (Gdx.graphics.getHeight() / 17.76f));
        buttonimage = new Texture("Button.png");


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
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

    font.getData().setScale(0.7f);
        font.draw(batch, "weiter spielen", Start.x+30, Start.y+(Start.h/2+25));
        font.getData().setScale(1f);
        batch.draw(buttonimage, Start.x,Start.y,Start.w,Start.h);
        if(Start.isPressed()==1){
            Var.createlevel=Var.levelbesitz;
            Test2.INSTANCE.setScreen(new GameScreen());
        }


        font.getData().setScale(0.7f);
        font.draw(batch, "Levelauswahl", Levelauswahl.x+30, Levelauswahl.y+(Levelauswahl.h/2+25));
        font.getData().setScale(1f);
        batch.draw(buttonimage, Levelauswahl.x,Levelauswahl.y,Levelauswahl.w,Levelauswahl.h);
        if(Levelauswahl.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelAuswahlScreen("start"));
        }

        if(Var.EnableAlpha) {
            font.draw(batch, "LevelBaukasten", LevelBaukasten.x + 30, LevelBaukasten.y + (LevelBaukasten.h / 2 + 25));
            batch.draw(buttonimage, LevelBaukasten.x, LevelBaukasten.y, LevelBaukasten.w, LevelBaukasten.h);
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

