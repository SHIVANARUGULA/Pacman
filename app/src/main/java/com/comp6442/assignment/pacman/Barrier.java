package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
        * Created by Kaushik on 05/05/18.
        */

public class Barrier extends View {
    Paint paint = new Paint();

    public Barrier(Context context,  AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.BLUE);
    }
    public void drawBarrier(Canvas canvas) {
        /** 
            * Creates the barriers on the screen.
            */
            
            canvas.drawRect(0,200,100,700,paint);//towards left
            canvas.drawRect(800,600,400,700,paint);//middle
            canvas.drawRect(900,0,300,100,paint);//top
            canvas.drawRect(1200,700,1000,200,paint);//right
            canvas.drawRect(700,1200,200,1100,paint);//bottom
            canvas.drawRect(1200,1200,1000,900,paint);//rightbottom


    }

}
