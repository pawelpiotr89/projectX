package com.mygdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.ProjectX;

/**
 * Created by Roxven89 on 20.05.2017.
 */

public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(ProjectX game) {
        super(game);
        init();
    }

    private void init() {
        splashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0);
        spriteBatch.end();
    }



}
