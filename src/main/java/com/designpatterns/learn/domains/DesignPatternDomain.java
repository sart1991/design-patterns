package com.designpatterns.learn.domains;

public class DesignPatternDomain {

    private String description;

    public DesignPatternDomain(DesignPattern dp) {
        description = dp.describe();
    }

    public String getDescription() {
        return description;
    }

}
