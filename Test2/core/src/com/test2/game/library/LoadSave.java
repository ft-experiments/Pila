package com.test2.game.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.test2.game.Var;
import com.test2.game.option.LevelBaukastenScreen;

public class LoadSave {

    static int bi = 0;

    static Preferences prefs = Gdx.app.getPreferences("einstellungen");
    static Preferences EigeneLevel = Gdx.app.getPreferences("EigeneLevel");

    public LoadSave() {

    }

    public static void loadall() {

        Var.beiballberurungvibrieren = prefs.getInteger("vibrieren");
        // Var.showfps= prefs.getInteger("showfps");
        if (prefs.getInteger("showfps") == 0) {
            Var.showfps = false;
        }
        if (prefs.getInteger("showfps") == 1) {
            Var.showfps = true;
        }
        switch (prefs.getInteger("background")) {
            case 1: {
                Var.actbackground = Var.background1;
                break;
            }

            case 2: {
                Var.actbackground = Var.background2;
                break;
            }
            case 3: {
                Var.actbackground = Var.background3;
                break;
            }
            case 4: {
                Var.actbackground = Var.background4;
                break;
            }
            case 5: {
                Var.actbackground = Var.background5;
                break;
            }
            case 6: {
                Var.actbackground = Var.background6;
                break;
            }
            case 7: {
                Var.actbackground = Var.background7;
                break;
            }
            case 8: {
                Var.actbackground = Var.background8;
                break;
            }
            case 9: {
                Var.actbackground = Var.background9;
                break;
            }
            case 10: {
                Var.actbackground = Var.background10;
                break;
            }

        }

        Var.sound_effects = prefs.getBoolean("soundeffecte");

        /*
        Var.steuerung=prefs.getInteger("steuerung");
        if(prefs.getInteger("effekts")==0){
            Var.sound_effects=false;
        }
        if(prefs.getInteger("effekts")==1){
            Var.sound_effects=true;
        }
*/
        Var.ballstartmode = prefs.getInteger("ballstartmode");
        Var.levelbesitz = prefs.getInteger("levelbesitz");
        if (Var.levelbesitz == 0) {
            Var.levelbesitz = 1;
            Var.beiballberurungvibrieren = 1;
            Var.ballstartmode = 1;
            saveall();
        }
    }


    public static void saveall() {

        prefs.putInteger("vibrieren", Var.beiballberurungvibrieren);

        if (Var.showfps == true) {
            bi = 1;
        }
        if (Var.showfps == false) {
            bi = 0;
        }

        prefs.putBoolean("soundeffecte", Var.sound_effects);

        prefs.putInteger("showfps", bi);

        prefs.putInteger("steuerung", Var.steuerung);

        prefs.putInteger("ballstartmode", Var.ballstartmode);

        prefs.putInteger("levelbesitz", Var.levelbesitz);


/*
        if(Var.sound_effects) {
        prefs.putInteger("effekts", 1);
        }else{
        prefs.putInteger("effekts", 0);
        }
*/


        if (Var.actbackground == Var.background1) {
            prefs.putInteger("background", 1);
        }

        if (Var.actbackground == Var.background2) {
            prefs.putInteger("background", 2);
        }
        if (Var.actbackground == Var.background3) {
            prefs.putInteger("background", 3);
        }
        if (Var.actbackground == Var.background4) {
            prefs.putInteger("background", 4);
        }
        if (Var.actbackground == Var.background5) {
            prefs.putInteger("background", 5);
        }
        if (Var.actbackground == Var.background6) {
            prefs.putInteger("background", 6);
        }
        if (Var.actbackground == Var.background7) {
            prefs.putInteger("background", 7);
        }
        if (Var.actbackground == Var.background8) {
            prefs.putInteger("background", 8);
        }
        if (Var.actbackground == Var.background9) {
            prefs.putInteger("background", 9);
        }
        if (Var.actbackground == Var.background10) {
            prefs.putInteger("background", 10);
        }


        prefs.flush();
    }


    public static void setArrayPrefs(String arrayName, int[] array) {
        Preferences el = Gdx.app.getPreferences("preferencename");
        el.putInteger(arrayName + "_size", array.length);
        for (int i = 0; i < array.length; i++)
            el.putInteger(arrayName + "_" + i, array[i]);
        el.flush();
    }

    public static int[] getArrayPrefs(String arrayName) {
        Preferences prefs = Gdx.app.getPreferences("preferencename");
        int size = prefs.getInteger(arrayName + "_size", 0);
        // ArrayList<String> array = new ArrayList<>(size);
        int[] array = new int[140];
        for (int i = 0; i < size; i++) {
            //System.out.println((prefs.getInteger(arrayName + "_" + i)));
            LevelBaukastenScreen.LevelBa[i] = (prefs.getInteger(arrayName + "_" + i));
        }
        return array;
    }


}



