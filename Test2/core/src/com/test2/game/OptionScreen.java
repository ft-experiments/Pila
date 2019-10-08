package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.loaders.BitmapFontLoader;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

public class OptionScreen extends ScreenAdapter {
    SpriteBatch batch;
    Texture img;
    Texture startge;
    Texture Touch;
    Texture Gyro;
    ShapeRenderer shapeRenderer;
    Texture hintergrund2;
    BitmapFont font;

    public OptionScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();



        img = new Texture("start.png");
        startge = new Texture("startge.png");
        Touch = new Texture("Touch.png");
        Gyro = new Texture("Gyro.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void render(float delta) {




        if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
        /*if(Gdx.input.isTouched()) {
            Gdx.input.vibrate(100);
        }*/

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hintergrund2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        font.getData().setScale(5);

        font.draw(batch, "Optionen" , Gdx.graphics.getWidth()/2-200, Gdx.graphics.getHeight()-30);


        if(Gdx.input.getX() < Var.Button_start_Width+Var.Button_start_x && Gdx.input.getX() > Var.Button_start_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_start_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_start_y-Var.Button_start_Height)
        {

            batch.draw(startge, Var.Button_start_x, Var.Button_start_y,Var.Button_start_Width,Var.Button_start_Height);
            if(Gdx.input.isButtonJustPressed(0)) {
                //Test2.INSTANCE.setScreen(new GameScreen());

            }
            if(Gdx.input.isTouched()){
                Test2.INSTANCE.setScreen(new GameScreen());
            }




        }else{batch.draw(img, Var.Button_start_x, Var.Button_start_y,Var.Button_start_Width,Var.Button_start_Height);}









        if(Gdx.input.getX() < Var.Button_steuerung_Width+Var.Button_steuerung_x && Gdx.input.getX() > Var.Button_steuerung_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_steuerung_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_steuerung_y-Var.Button_steuerung_Height)
        {


            if(Var.steuerung == 0) {
                batch.draw(Gyro, Var.Button_start_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
            }
            if(Var.steuerung == 1) {
                batch.draw(Touch, Var.Button_start_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
            }

            System.out.println(Var.steuerung);

            if(Gdx.input.justTouched()){
                if(Var.steuerung==0){
                    Var.steuerung=1;
                    Var.Button_steuerung_x+=300;
                }else if(Var.steuerung==1){
                    Var.steuerung=0;
                    Var.Button_steuerung_x-=300;
                }

            }
        }else{
            if(Var.steuerung == 0) {
                batch.draw(Touch, Var.Button_steuerung_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
            }
            if(Var.steuerung == 1){
                batch.draw(Gyro, Var.Button_steuerung_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
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
        img.dispose();
    }

    @Override
    public void hide() {
        this.dispose();
    }
}
