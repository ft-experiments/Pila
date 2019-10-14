package com.test2.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class LoadSave {
    static Preferences prefs = Gdx.app.getPreferences("vibrieren");
    public LoadSave(){

    }

    static void loadall(){

        Var.beiballberurungvibrieren = prefs.getInteger("vibrieren");
        System.out.println(prefs.getInteger("vibrieren"));
    }
    static void saveall(){
        prefs.putInteger("vibrieren", 1);
    }
}
