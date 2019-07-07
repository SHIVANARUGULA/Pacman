package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class Ghost extends View  {
    Paint paint = new Paint();
    float posX1 = 30f;
    float posY1 = 30f;
    float posX2;
    float posY2;
    float SIZE = 100f;
    float SPEED = 4f;



    public void setPosX1(float posX1) {
        this.posX1 += posX1;
    }

    public void setPosY1(float posY1) {
        this.posY1 += posY1;
    }

    public void setPosX2(float posX2) {
        this.posX2 += posX2;
    }

    public void setPosY2(float posY2) {
        this.posY2 += posY2;
    }

    public Ghost(Context context, AttributeSet attr) {
        super(context, attr);
        posX2 = posX1 + SIZE;
        posY2 = posY1 + SIZE;

        //paint.setColor(Color.RED);


    }
    public float midpointX(float x1, float x2){
        return (x1 + x2)/2;
    }
    public float midpointY(float y1, float y2){
        return (y1 + y2)/2;
    }

    public void drawGhost(Canvas canvas) {
        canvas.drawRect(posX1, posY1, posX2, posY2, paint);

    }
    public double getDistance(PacMan pacman, float x, float y){
        return Math.sqrt(Math.pow(pacman.getPosX() - x, 2) + Math.pow(pacman.getPosY() - y, 2));
    }
    public void chase(PacMan pacman) {
        while (getDistance(pacman, this.midpointX(this.posX1, this.posX2), this.midpointY(this.posY1, this.posY2)) > 20) {
            double distance = getDistance(pacman, this.midpointX(this.posX1, this.posX2), this.midpointY(this.posY1, this.posY2));
            if (getDistance(pacman, this.posX2 + this.SIZE, this.posY1) < distance) {
                this.setPosX2(SPEED);
                this.setPosX1(SPEED);
            } else if (getDistance(pacman, this.posX1 - this.SIZE, this.posY1) < distance) {
                this.setPosX1(-SPEED);
                this.setPosX2(-SPEED);
            } else if (getDistance(pacman, this.posX1, this.posY1 - this.SIZE) < distance) {
                this.setPosY1(-SPEED);
                this.setPosY2(-SPEED);
            } else if (getDistance(pacman, this.posX1, this.posY2 + this.SIZE) < distance) {
                this.setPosY1(SPEED);
                this.setPosY2(SPEED);
            }


        }
    }

    }

