package com.test2.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.files.FileHandle;

import javax.naming.Context;
import java.io.File;

public class LoadSave {

    static int bi=0;

    static Preferences prefs = Gdx.app.getPreferences("einstellungen");
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

    int loadvibr(){
        return prefs.getInteger("vibrieren");
    }
}



