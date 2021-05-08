package com.designpatterns.learn.domains.structural.bridge;

public abstract class OldSquare implements OldShape {

    private int widthAndHeight = 0;

    public OldSquare(int widthAndHeight) {
        this.widthAndHeight = widthAndHeight;
    }

    public int getWidthAndHeight() {
        return widthAndHeight;
    }

    public void setWidthAndHeight(int widthAndHeight) {
        this.widthAndHeight = widthAndHeight;
    }

    public int area() {
        return widthAndHeight * widthAndHeight;
    }

}
