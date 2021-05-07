package com.designpatterns.learn.domains.structural.adapter;

import com.designpatterns.learn.domains.DesignPattern;

public class OldObjectAdapter implements NewObjectRepresentation, DesignPattern {

    private final OldObject instance;

    public OldObjectAdapter(OldObject instance) {
        this.instance = instance;
    }

    @Override
    public String getProperty1() {
        return instance.getOldProperty1();
    }

    @Override
    public String getProperty2() {
        return instance.getOldProperty2();
    }

    @Override
    public String getProperty3() {
        return instance.getOldProperty3();
    }

    @Override
    public String describe() {
        return "Structural -> Adapter";
    }
}
