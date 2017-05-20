package com.mygdx.game.screens;

import com.mygdx.game.ProjectX;
import com.mygdx.game.entities.Player;

/**
 * Created by Roxven89 on 20.05.2017.
 */

public class GameplayScreen extends AbstractScreen {

    private Player player;
    
    public GameplayScreen(ProjectX game) {
        super(game);
        initialization();
    }

    private void initialization() {
        initPlayer();
    }

    private void initPlayer() {
        player = new Player();
        stage.addActor(player);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    private void update() {
        stage.act();
    }
}
