package com.designpatterns.learn.domains.singleton;

public class StaticSingleton implements Singleton {

    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return instance;
    }

    @Override
    public String describe() {
        return "Creational -> " + StaticSingleton.class.getSimpleName();
    }

    @Override
    public SingletonType type() {
        return SingletonType.STATIC;
    }
}
