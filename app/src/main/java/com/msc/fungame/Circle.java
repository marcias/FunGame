package com.msc.fungame;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

public class Circle extends View {

    enum Type {
        Green, Red;
    }

    private Type mType;
    private OnTouchSpotListener mListener;

    public Circle(@NonNull Context context, Type type, OnTouchSpotListener listener) {
        super(context);
        mType = type;
        mListener = listener;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mListener.onTouchSpotListener(this);
        return super.onTouchEvent(event);
    }

    public Type getType(){
        return mType;
    }

}
