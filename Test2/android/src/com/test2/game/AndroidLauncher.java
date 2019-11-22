package com.test2.game;

import android.os.Bundle;

import android.os.Handler;
import android.view.KeyEvent;
import android.widget.Toast;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.test2.game.Test2;

public class AndroidLauncher extends AndroidApplication {
	boolean pressedOnce;
	@Override

	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.hideStatusBar = true;
		config.useWakelock = true;
		initialize(new Test2(), config);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(Var.ingame) {
			if (keyCode == event.KEYCODE_BACK) {
				if (!pressedOnce) {
					pressedOnce = true;
					Toast.makeText(getApplicationContext(), "Erneut drücken, um ins Hauptmneü zu kommen.", Toast.LENGTH_SHORT).show();
					new Handler().postDelayed(new Runnable() {
						@Override
						public void run() {
							pressedOnce = false;
						}
					}, 3000);

				} else if (pressedOnce) {
					pressedOnce = false;
					finish();
					Test2.INSTANCE.setScreen(new StartScreen());

				}
				return true;

			}
		}else{
			if (keyCode == event.KEYCODE_BACK) {
				if (!pressedOnce) {
					pressedOnce = true;
					Toast.makeText(getApplicationContext(), "Erneut drücken, um das Spiel zu beenden.", Toast.LENGTH_SHORT).show();
					new Handler().postDelayed(new Runnable() {
						@Override
						public void run() {
							pressedOnce = false;
						}
					}, 3000);

				} else if (pressedOnce) {
					pressedOnce = false;
					onBackPressed();

				}
				return true;

			}
			return super.onKeyDown(keyCode, event);
		}
		return false;
	}
}
