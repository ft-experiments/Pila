package com.test2.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kotcrab.vis.ui.widget.toast.Toast;

import static jdk.nashorn.internal.objects.NativeMath.round;


public class Test2 extends Game {

	public static Test2 INSTANCE;
	AndroidInterfaces aoi;
	public Test2(AndroidInterfaces maoi){
		aoi=maoi;
		INSTANCE = this;
	}
	public boolean backpressed=false;
	@Override
	public void create () {




		LoadSave.loadall();





		setScreen(new SplashScreen());




		


		
		

		//setScreen(new GameScreen());
		new DoppelKlick();
	}


}
