package com.designpatterns.learn.domains.structural.adapter;

public class NewObject implements NewObjectRepresentation {

    private final String property1 = "prop1";
    private final String property2 = "prop2";
    private final String property3 = "prop3";

    @Override
    public String getProperty1() {
        return property1;
    }

    @Override
    public String getProperty2() {
        return property2;
    }

    @Override
    public String getProperty3() {
        return property3;
    }
}
