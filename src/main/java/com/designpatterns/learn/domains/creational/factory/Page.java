package com.designpatterns.learn.domains.creational.factory;

public class Page {

    private String text;

    public Page(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
