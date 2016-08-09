package com.brian.demo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.brian.demo.Demo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Demo.WIDTH;
		config.height = Demo.HEIGHT;
		config.title = Demo.TITLE;


		new LwjglApplication(new Demo(), config);
	}
}
