package com.brian.demo.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brian.demo.Demo;

/**
 * Created by Brian on 8/8/2016.
 */
public class MenuState extends State {

    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        //Open the screen to be drawn on
        sb.begin();
        //Draw image, at position x,y, on screen size x,y
        sb.draw(background,0,0, Demo.WIDTH, Demo.HEIGHT);
        sb.draw(playBtn, (Demo.WIDTH / 2) - (playBtn.getWidth()/2), Demo.HEIGHT/2);
        //Close the box for drawing.
        sb.end();
    }
    public void dispose(){
        background.dispose();
        playBtn.dispose();
    }
}
