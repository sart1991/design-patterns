package com.designpatterns.learn.domains.singleton;

public class LazySingleton implements Singleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public String describe() {
        return "Creational -> LazySingleton";
    }

    @Override
    public SingletonType type() {
        return SingletonType.LAZY;
    }
}
