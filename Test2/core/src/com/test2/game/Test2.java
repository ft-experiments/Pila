package com.test2.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kotcrab.vis.ui.widget.toast.Toast;




public class Test2 extends Game {

	public static Test2 INSTANCE;

	public Test2(){
		INSTANCE = this;
	}
	
	@Override
	public void create () {

		setScreen(new StartScreen());
		//setScreen(new GameScreen());
		new DoppelKlick();
	}


}
