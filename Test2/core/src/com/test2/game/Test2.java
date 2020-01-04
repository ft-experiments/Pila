package com.test2.game;


import com.badlogic.gdx.Game;
import com.test2.game.library.Ablauf;
import com.test2.game.library.DoppelKlick;
import com.test2.game.library.LoadSave;
import com.test2.game.start.SplashScreen;


public class Test2 extends Game {

	public static Test2 INSTANCE;
public AndroidInterfaces aoi;
	public Test2(AndroidInterfaces maoi){
		aoi=maoi;
		INSTANCE = this;
	}
	public boolean backpressed=false;
	@Override
	public void create () {




		LoadSave.loadall();


		new Ablauf();


		setScreen(new SplashScreen());



		//setScreen(new GameScreen());
		new DoppelKlick();
	}


}
