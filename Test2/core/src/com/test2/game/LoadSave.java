package com.test2.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.files.FileHandle;

import javax.naming.Context;
import java.io.File;
import java.util.ArrayList;

public class LoadSave {

    static int bi=0;

    static Preferences prefs = Gdx.app.getPreferences("einstellungen");
    static Preferences EigeneLevel = Gdx.app.getPreferences("EigeneLevel");
    public LoadSave(){

    }

    static void loadall(){

        Var.beiballberurungvibrieren = prefs.getInteger("vibrieren");
       // Var.showfps= prefs.getInteger("showfps");
        if(prefs.getInteger("showfps")==0){
            Var.showfps=false;
        }
        if(prefs.getInteger("showfps")==1){
            Var.showfps=true;
        }

        Var.steuerung=prefs.getInteger("steuerung");

        Var.ballstartmode=prefs.getInteger("ballstartmode");
        Var.levelbesitz=prefs.getInteger("levelbesitz");
        if(Var.levelbesitz==0){Var.levelbesitz=1;}
    }


    static void saveall(){

        prefs.putInteger("vibrieren", Var.beiballberurungvibrieren);

        if(Var.showfps==true){
            bi=1;
        }
        if(Var.showfps==false){
            bi=0;
        }
        prefs.putInteger("showfps", bi);

        prefs.putInteger("steuerung", Var.steuerung);

        prefs.putInteger("ballstartmode", Var.ballstartmode);

        prefs.putInteger("levelbesitz", Var.levelbesitz);


        prefs.flush();
    }


    public static void setArrayPrefs(String arrayName, int[] array) {
        Preferences el = Gdx.app.getPreferences("preferencename");
        el.putInteger(arrayName +"_size", array.length);
        for(int i=0;i<array.length;i++)
            el.putInteger(arrayName + "_" + i, array[i]);
            el.flush();
    }
    public static int[] getArrayPrefs(String arrayName) {
        Preferences prefs = Gdx.app.getPreferences("preferencename");
        int size = prefs.getInteger(arrayName + "_size", 0);
       // ArrayList<String> array = new ArrayList<>(size);
        int[] array = new int[140];
        for(int i=0;i<size;i++) {
            System.out.println((prefs.getInteger(arrayName + "_" + i)));
            LevelBaukastenScreen.LevelBa[i] = (prefs.getInteger(arrayName + "_" + i));
        }
        return array;
    }



    int loadvibr(){
        return prefs.getInteger("vibrieren");
    }
}



