package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class OptionScreen extends ScreenAdapter {
    Texture buttonimage;
    SpriteBatch batch;
    Texture img;
    Texture startge;
    Texture Touch;
    Texture Gyro;
    ShapeRenderer shapeRenderer;
    Texture hintergrund2;
    BitmapFont font;
    Texture switchon;
    Texture switchoff;
    touchinput.Button Levelauswahl;
    touchinput.Button Buttonstart;
    int u=0;

    public OptionScreen() {
        batch = new SpriteBatch();
        font = new BitmapFont();


        img = new Texture("start.png");
        startge = new Texture("startge.png");
        Touch = new Texture("Touch.png");
        Gyro = new Texture("Gyro.png");
        hintergrund2 = new Texture("hintergrund2.jpg");
        switchon = new Texture("switchon.png");
        switchoff = new Texture("switchoff.png");
        shapeRenderer = new ShapeRenderer();

        buttonimage = new Texture("Button.png");


        Buttonstart = new touchinput.Button(Gdx.graphics.getWidth()/2-300,Gdx.graphics.getHeight()-500,600,300);
        Levelauswahl = new touchinput.Button(Gdx.graphics.getWidth()/2-200,Gdx.graphics.getHeight()-600,400,100);



        touchinput.Switch SW;
        SW = new touchinput.Switch(Gdx.graphics.getWidth()/2-100,Gdx.graphics.getHeight()-750,200,100,1);
        touchinput.Switch.switchs.add(SW);

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
if(Gdx.input.getAccelerometerY()>12) {
    font.draw(batch, "" + Gdx.input.getAccelerometerY(), 100, 100);
}


        for(int i = 0; i< touchinput.Switch.switchs.size(); i=i+1) {
            touchinput.Switch SW;
            SW = touchinput.Switch.switchs.get(i);
            SW.update();
           // System.out.println(SW.status);

            font.getData().setScale(4);
            if(i==0) {
                font.draw(batch, "Vibrieren" , SW.x-400, SW.y+SW.h/2);
                if (SW.status == 0) {
                    batch.draw(switchoff, SW.x, SW.y, SW.w, SW.h);
                    Var.beiballberurungvibrieren = 0;
                }
                if (SW.status == 1) {
                    batch.draw(switchon, SW.x, SW.y, SW.w, SW.h);
                    Var.beiballberurungvibrieren = 1;
                }
            }

        }



        /*Switch SW;
        SW = Switch.switchs.get(0);
        SW.update();
        font.getData().setScale(4);
        font.draw(batch, "Vibrieren" , SW.x-400, SW.y+SW.h/2);
        if (SW.status == 0) {
            batch.draw(switchoff, SW.x, SW.y, SW.w, SW.h);
            Var.beiballberurungvibrieren=0;
        }
        if (SW.status == 1) {
            batch.draw(switchon, SW.x, SW.y, SW.w, SW.h);
            Var.beiballberurungvibrieren=1;
        }*/








        font.getData().setScale(5);

        font.draw(batch, "Optionen" , Gdx.graphics.getWidth()/2-200, Gdx.graphics.getHeight()-30);


        batch.draw(img, Buttonstart.x,Buttonstart.y,Buttonstart.w,Buttonstart.h);
        if(Buttonstart.isPressed() == 1){
            Test2.INSTANCE.setScreen(new GameScreen());
        }








//System.out.println(Gdx.input.isTouched());
        if(Gdx.input.getX() < Var.Button_steuerung_Width+Var.Button_steuerung_x && Gdx.input.getX() > Var.Button_steuerung_x && Gdx.input.getY() < Gdx.graphics.getHeight()-Var.Button_steuerung_y && Gdx.input.getY() > Gdx.graphics.getHeight()-Var.Button_steuerung_y-Var.Button_steuerung_Height)
        {


            //System.out.println(Var.steuerung);

            if(Gdx.input.isTouched()){
                u=1;

            }else{
                if(u==1 && !Gdx.input.isTouched()) {
                    if (Var.steuerung == 0) {
                        Var.steuerung = 1;
                        //Var.Button_steuerung_x+=300;
                    } else if (Var.steuerung == 1) {
                        Var.steuerung = 0;
                        //Var.Button_steuerung_x-=300;
                    }
                    u=0;
                }

            }
        }
            if(Var.steuerung == 0) {
                batch.draw(Touch, Var.Button_steuerung_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
            }
            if(Var.steuerung == 1){
                batch.draw(Gyro, Var.Button_steuerung_x, Var.Button_steuerung_y, Var.Button_steuerung_Width, Var.Button_steuerung_Height);
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
