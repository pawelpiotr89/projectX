package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.ProjectX;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = ProjectX.GAME_NAME;
		config.width = ProjectX.WIDTH;
		config.height = ProjectX.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new ProjectX(), config);
	}
}
