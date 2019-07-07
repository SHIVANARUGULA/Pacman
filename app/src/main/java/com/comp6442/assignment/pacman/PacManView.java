package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by declan on 9/04/18.
 */

class PacManView extends View implements Runnable, View.OnTouchListener{

        DisplayMetrics display;
        Handler timer;
        float xt = 0;
        float yt = 0;
        int width;
        int height;
        boolean rightTapped;
        boolean leftTapped;
        boolean topTapped;
        boolean bottomTapped;

        PacMan pm;
        Ghost g;
        Barrier b;



    public PacManView(Context context, AttributeSet attr) {
        super(context, attr);
        pm = new PacMan(context, attr);
        g = new Ghost(context, attr);
        b= new Barrier(context,attr);

        display = getContext().getResources().getDisplayMetrics();
        width = display.widthPixels;
        height = display.heightPixels;

        timer = new Handler();
        this.setOnTouchListener(this);
        timer.postDelayed(this,10);
        leftTapped = false;
        rightTapped = false;

        }





@Override
public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
        xt = event.getX();
        yt = event.getY();
        if(xt > width - width/3){
        rightTapped = true;
        leftTapped = false;
        bottomTapped = false;
        topTapped = false;

        }else if(xt < width/3){
        leftTapped = true;
        rightTapped = false;
        bottomTapped = false;
        topTapped = false;
        }
        if(yt > height/2 && xt > width/3 && xt < width - width/3){
        rightTapped = false;
        leftTapped = false;
        bottomTapped = true;
        topTapped = false;

        }else if(yt < height/2 && xt > width/3 && xt < width - width/3){
        leftTapped = false;
        rightTapped = false;
        bottomTapped = false;
        topTapped = true;
        }


        this.invalidate();
        }
        return true;
        }

public void onDraw(Canvas canvas){

        canvas.drawColor(Color.BLACK);
        pm.drawPacMan(canvas);
        g.drawGhost(canvas);
        b.drawBarrier(canvas);


        }




/*

public boolean checkCollided(float x, float y, float lookahead, float width, float height) {
        if (x + lookahead == width) {
        right = false;
        } else if (x - lookahead == 0) {
        left = false;
        }
        if (y + lookahead == height) {
        bottom = false;
        } else if (y - lookahead == 0) {
        top = false;

        }
        return true;
        }
        */
public void checkCollided() {
    if (pm.getPosX() + 50 == width) {
        rightTapped = false;
    } else if (pm.getPosX() - 50 == 0) {
        leftTapped = false;
    }
    if (pm.getPosY() + 50 == height - 100) {
        bottomTapped = false;
    } else if (pm.getPosY() - 50 == 0) {
        topTapped = false;

    }
}





    public void run() {
        checkCollided();

       // checkCollided(pm.getPosX(), pm.getPosY(), 50, width, height);
        g.chase(pm);

        if(rightTapped) {

        pm.setPosX(5);
        }
        else if(leftTapped){
        pm.setPosX(-5);
        }

        else if(topTapped) {
        pm.setPosY(-5);
        }

        else if(bottomTapped){
           pm.setPosY(5);
        }

        this.invalidate();
        timer.postDelayed(this,10);
        }

        }

