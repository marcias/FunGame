package com.msc.fungame;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.view.View;

public class GameStrategy {

    public void createGame(View view, int level) {
        if (level == 1) {
            addGreenCircle(view);
        }
    }

    private void addMoreCircles(){

    }

    private void addGreenCircle(View view){
        Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.X, View.Y, path);
        animator.setDuration(2000);
        animator.start();
    }
}
