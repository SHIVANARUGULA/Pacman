package com.comp6442.assignment.pacman;

public class ClassToTestMethod {
    int width;
    int height;
    boolean left;
    boolean right;
    boolean top;
    boolean bottom;
    public boolean checkCollided(float x, float y, float lookahead) {
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
    public float midpointX(float x1, float x2){
        return (x1 + x2)/2;
    }
    public float midpointY(float y1, float y2){
        return (y1 + y2)/2;
    }
}
