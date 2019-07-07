package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.jar.Attributes;

public class PacMan extends View {
    private float RADIUS = 50;
    Paint mPaint = new Paint();
    float posX = 500f;
    float posY = 500f;

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosX(float posX) {
        this.posX += posX;
    }

    public void setPosY(float posY) {
        this.posY += posY;
    }

    public PacMan(Context context, AttributeSet attr){
        super(context, attr);
        mPaint.setColor(Color.YELLOW);


    }
    public void drawPacMan(Canvas canvas){
        canvas.drawCircle(posX, posY, RADIUS, mPaint);

    }

}
