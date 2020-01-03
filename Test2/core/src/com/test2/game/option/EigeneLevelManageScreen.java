package com.test2.game.option;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.test2.game.start.AssetManageLoader;
import com.test2.game.Test2;
import com.test2.game.Var;
import com.test2.game.library.touchinput;

import java.util.ArrayList;

import static com.test2.game.start.AssetManageLoader.Levelbutton;

public class EigeneLevelManageScreen extends ScreenAdapter {

    static ArrayList<com.test2.game.library.touchinput.Button> EigeneLevelButtons = new ArrayList<com.test2.game.library.touchinput.Button>();
    static int LoadEigenesLevel=0;
    static int marked=0;

    SpriteBatch batch;
    ShapeRenderer shapeRenderer;

    com.test2.game.library.touchinput.Button zurueck;
    com.test2.game.library.touchinput.Button newLevel;


    public EigeneLevelManageScreen() {
        batch = new SpriteBatch();



        shapeRenderer = new ShapeRenderer();



        zurueck = new com.test2.game.library.touchinput.Button(Gdx.graphics.getWidth()/2-110,Gdx.graphics.getHeight()-500,220,100);
        newLevel = new com.test2.game.library.touchinput.Button(0,Gdx.graphics.getHeight()-100,400,100);

        create();
    }
    int fw=5;
    int fh=5;

    void create() {
        int le=0;
        for(int j=0;j<fh;j=j+1) {
            for (int i = 0; i < fw; i = i + 1) {
                le=le+1;
                com.test2.game.library.touchinput.Button B;
                B = new com.test2.game.library.touchinput.Button(i * Gdx.graphics.getWidth() / fw,j* Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw, Gdx.graphics.getWidth() / fw) ;
                //LevelAuswahlButtons.Levelbuttons.add(LAB,i);
                EigeneLevelManageScreen.EigeneLevelButtons.add(i,B);
            }
        }
    }





    @Override
    public void render(float delta) {
        int b=0;


        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        if(Var.actbackground==Var.background1) {
        }

        if(Var.actbackground==Var.background2) {
            batch.draw(AssetManageLoader.b2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background3) {
            batch.draw(AssetManageLoader.b3,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background4) {
            batch.draw(AssetManageLoader.b4,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background5) {
            batch.draw(AssetManageLoader.b5,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background6) {
            batch.draw(AssetManageLoader.b6,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background7) {
            batch.draw(AssetManageLoader.b7,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background8) {
            batch.draw(AssetManageLoader.b8,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background9) {
            batch.draw(AssetManageLoader.b9,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        if(Var.actbackground==Var.background10) {
            batch.draw(AssetManageLoader.b10,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
        //font.getData().setScale(4);
        AssetManageLoader.font.draw(batch, "Edit", newLevel.x+30, newLevel.y+(newLevel.h/2+25));
        batch.draw(AssetManageLoader.buttonimage, newLevel.x,newLevel.y,newLevel.w,newLevel.h);
        if(newLevel.isPressed() == 1){
            Test2.INSTANCE.setScreen(new LevelBaukastenScreen());
        }




        touchinput.Button B;
        b=0;
        while(b<EigeneLevelButtons.size()) {
            B = EigeneLevelButtons.get(b);
            if(marked==b){
                batch.draw(Levelbutton,B.x,B.y,B.w,B.h);
            }else {
                batch.draw(AssetManageLoader.buttonimage, B.x, B.y, B.w, B.h);
            }
            //Data().setScale(4);
            AssetManageLoader.font.draw(batch, ""+(b+1),B.x+B.w/2,B.y+B.h/2);
            if(B.isPressed()==1){
                marked=b;
                EigeneLevelManageScreen.LoadEigenesLevel=b+1;
                b=0;
              //  Test2.INSTANCE.setScreen(new LevelBaukastenScreen());
            }
            b=b+1;
        }




        batch.end();




        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        //shapeRenderer.setColor(1,0,0,1);
        //shapeRenderer.rect(0,0,100,100);

        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();

    }

    @Override
    public void hide() {
        this.dispose();
    }
}
