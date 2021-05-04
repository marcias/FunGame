package com.msc.fungame;

import android.animation.ObjectAnimator;
import android.content.pm.ActivityInfo;
import android.graphics.Path;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GameFragment extends Fragment {

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mView = inflater.inflate(R.layout.fragment_game, container, false);

        mView.findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame(1);
            }
        });

        return mView;
    }

    private void startGame(int level) {

//        GameStrategy gameStrategy= new GameStrategy();
//        gameStrategy.createGame(g, 1);
        //encontrar posições dos circulos
        //criar animações
        //exibir circulos na tela
//
//        View view = new View(getContext());
//        view.setR


        Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);
        ObjectAnimator animator = ObjectAnimator.ofFloat(mView.findViewById(R.id.iv_circle), View.X, View.Y, path);
        animator.setDuration(2000);
        animator.start();

    }
}