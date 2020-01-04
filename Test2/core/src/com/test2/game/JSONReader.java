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

        try {

             if (!obj.getJSONObject("pack").getString("pageName").contains(Var.actpack)&&!!obj.getJSONObject("pack").getString("pageName").contains(Var.jsonversion)) {
                  System.out.println("Fehler im JSON File");
                  System.out.println(Var.actpack);
                  System.out.println(obj.getJSONObject("pack").getString("pageName"));
                  System.out.println("-----------------");
                  System.out.println(Var.jsonversion);
                  System.out.println(obj.getJSONObject("pack").getString("version"));



             } else {

                  array[0] = obj.getJSONObject("pack").getBoolean("b1");
                  array[1] = obj.getJSONObject("pack").getBoolean("b2");
                  array[2] = obj.getJSONObject("pack").getBoolean("b3");
                  array[3] = obj.getJSONObject("pack").getBoolean("b4");
                  array[4] = obj.getJSONObject("pack").getBoolean("b5");
                  array[5] = obj.getJSONObject("pack").getBoolean("b6");
                  array[6] = obj.getJSONObject("pack").getBoolean("b7");
                  array[7] = obj.getJSONObject("pack").getBoolean("b8");
                  array[8] = obj.getJSONObject("pack").getBoolean("b9");
                  array[9] = obj.getJSONObject("pack").getBoolean("b10");


             }

       }catch(Exception e) {
            System.out.println("Ganz großer Fehler im JSON File");
       }
        //System.out.println("Search for it "+ array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5] + " " + array[6] + " " + array[7] + " " + array[8] + " " + array[9] + " ");

        return array;
    }
}
