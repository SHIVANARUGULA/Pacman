package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Random;

public class Food extends View {
    Paint paint = new Paint();
    DisplayMetrics display;
    /*Random rand = new Random();
    int[] width_array = new int[50];
    int[] height_array= new int[50];
    public void Random_value(){
        for(int i=0;i<50;i++){
            int width= rand.nextInt(display.widthPixels);
            int height= rand.nextInt(display.heightPixels);
            width_array[i]=width;
            height_array[i]=height;
        }
    }*/
    public Food(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.WHITE);
        display= getContext().getResources().getDisplayMetrics();
    }
    public void drawFood(Canvas canvas) {
        //creates the barrier from top left corner
        int x=130;
        int y=140;
        int value=60;
        for(int i=0;i<12;i++){
        //canvas.drawCircle(x+value,y+value,20,paint);
        canvas.drawCircle(x+value,y,20,paint);
        value+=60;}
        for(int i=0;i<10;i++){
            //canvas.drawCircle(x+value,y+value,20,paint);
            int fix=y+value;
            canvas.drawCircle(x,y+value,20,paint);
            canvas.drawCircle(x+value,fix,20,paint);
            value+=60;}


        /*canvas.drawRect(0,200,100,700,paint);//towards left
        canvas.drawRect(800,600,400,700,paint);//middle
        canvas.drawRect(900,0,300,100,paint);//top
        canvas.drawRect(1200,700,1000,200,paint);//right
        canvas.drawRect(700,1200,200,1100,paint);//bottom
        canvas.drawRect(1200,1200,1000,900,paint);//rightbottom*/


        //canvas.drawRect(50,100,60,110,paint);
        //creates the barrier from in between
        //canvas.drawRect(getTop()/10,getBottom()/10,getLeft()/10,getBottom()/10,paint);


    }
}
