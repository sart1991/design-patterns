package com.designpatterns.learn.domains.structural.bridge;

import com.designpatterns.learn.domains.DesignPattern;

public class Square extends Shape implements DesignPattern {

    private int widthAndHeight;

    public Square(int widthAndHeight, Color color) {
        super(color);
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

    @Override
    public String describe() {
        return "Structural -> Bridge";
    }
}
