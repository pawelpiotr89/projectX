package com.mygdx.game;

import com.mygdx.game.screens.SplashScreen;
import com.badlogic.gdx.Game;

public class ProjectX extends Game {

	public final static String GAME_NAME = "ProjectX";

	public final static int WIDTH = 1920;
	public final static int HEIGHT = 1080;

	private boolean paused;

	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}

	/**
	 * ---------------------
	 * getters and setters
	 *
	 */

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
