package com.pie.vs;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameBack_1 extends ApplicationAdapter {
	SpriteBatch batch;

	private Boolean isUp = false;

	@Override
	public void create () {
		if(isUp == false) {
			batch = new SpriteBatch();
			isUp = true;
		}
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float)0.1254901961, (float)0.1215686275, (float)0.1921568627, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void dispose () {
		if(isUp) {
			batch.dispose();
			isUp = false;
		}
	}
}
