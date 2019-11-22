package com.test2.game.desktop;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.test2.game.Test2;
import com.test2.game.Var;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Akandoid");
		config.useVsync(true);
		config.setWindowIcon("badlogic.jpg");
		config.setWindowPosition(0,0);
		config.setWindowedMode(720,1280);
		//config.setFullscreenMode(Lwjgl3ApplicationConfiguration.getDisplayMode());    //fullscreen
		new Lwjgl3Application(new Test2(), config);
		//com.test2.game.Var.
	}
}
