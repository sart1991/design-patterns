package com.designpatterns.learn.domains.structural.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    void applyColor() {
        color.applyColor();
    }

}
