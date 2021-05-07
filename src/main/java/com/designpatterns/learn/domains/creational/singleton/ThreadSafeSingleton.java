package com.designpatterns.learn.domains.creational.singleton;

public class ThreadSafeSingleton implements Singleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // Protecting class from reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String describe() {
        return "Creational -> " + ThreadSafeSingleton.class.getSimpleName();
    }

    @Override
    public SingletonType type() {
        return SingletonType.THREADSAFE;
    }
}
