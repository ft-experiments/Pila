package com.test2.game;

import android.app.Activity;
import android.os.Bundle;

import android.os.Handler;
import android.view.KeyEvent;
import android.widget.Toast;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.test2.game.Test2;



public class AndroidLauncher extends AndroidApplication implements AndroidInterfaces {
	boolean pressedOnce;


	final AndroidLauncher context=this;

	protected void onCreate (Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.hideStatusBar = true;
		config.useWakelock = true;
		initialize(new Test2(this), config);
	}


	public void toast(final String t) {
		handler.post(new Runnable()
		{

			@Override
			public void run() {
				//System.out.println("toatsing in launcher run");
				Toast.makeText(context, t, Toast.LENGTH_LONG).show();

			}

		});
	}

}
