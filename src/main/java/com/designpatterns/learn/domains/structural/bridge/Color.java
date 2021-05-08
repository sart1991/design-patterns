package com.designpatterns.learn.domains.structural.bridge;

public abstract class Color {

    abstract String colorDescription();

    void applyColor() {
        System.out.println("Applying " + this.colorDescription() + " color");
    }

}
