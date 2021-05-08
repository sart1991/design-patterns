package com.designpatterns.learn.domains.structural.bridge;

public class OldRedSquare extends OldSquare {

    public OldRedSquare(int widthAndHeight) {
        super(widthAndHeight);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }

}
