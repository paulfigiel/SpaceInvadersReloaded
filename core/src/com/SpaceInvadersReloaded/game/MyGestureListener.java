package com.SpaceInvadersReloaded.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import javafx.scene.Camera;

/**
 * Created by figiel-paul on 02/06/15.
 */
public class MyGestureListener implements GestureDetector.GestureListener {
    private CanonMan cm;
    private OrthographicCamera cam;
    public void initialize(CanonMan c,OrthographicCamera cam)
    {
        cm = c;
        this.cam = cam;
    }
    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {

        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        if (x>Gdx.graphics.getWidth()/2&&y<Gdx.graphics.getHeight()/2)
        {
            cm.gearUp();
        }
        if (x>Gdx.graphics.getWidth()/2&&y>Gdx.graphics.getHeight()/2)
        {
            cm.gearDown();
        }
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {

        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {

        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {

        return false;
    }

    @Override
    public boolean zoom (float originalDistance, float currentDistance){
        cam.zoom = originalDistance/currentDistance;

        return false;
    }

    @Override
    public boolean pinch (Vector2 initialFirstPointer, Vector2 initialSecondPointer, Vector2 firstPointer, Vector2 secondPointer){

        return false;
    }
}
