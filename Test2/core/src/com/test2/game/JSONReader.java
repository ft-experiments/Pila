package com.test2.game;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import org.json.JSONObject;



public class JSONReader {



   static public boolean[] reader() {
        FileHandle handle = Gdx.files.internal(Var.actpack + "/pack.json");



        boolean array[];

        array = new boolean[10];


        JSONObject obj = new JSONObject(handle.readString());
        array[0] = obj.getJSONObject("packinfo").getBoolean("b1");
        array[1] = obj.getJSONObject("packinfo").getBoolean("b2");
        array[2] = obj.getJSONObject("packinfo").getBoolean("b3");
        array[3] = obj.getJSONObject("packinfo").getBoolean("b4");
        array[4] = obj.getJSONObject("packinfo").getBoolean("b5");
        array[5] = obj.getJSONObject("packinfo").getBoolean("b6");
        array[6] = obj.getJSONObject("packinfo").getBoolean("b7");
        array[7] = obj.getJSONObject("packinfo").getBoolean("b8");
        array[8] = obj.getJSONObject("packinfo").getBoolean("b9");
        array[9] = obj.getJSONObject("packinfo").getBoolean("b10");

        //System.out.println("Search for it "+ array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5] + " " + array[6] + " " + array[7] + " " + array[8] + " " + array[9] + " ");

        return array;
    }
}
