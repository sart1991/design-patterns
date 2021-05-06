package com.designpatterns.learn.domains.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SingletonFactory {

    @Autowired
    private final SingletonTypeTransformer transformer;

    public SingletonFactory(SingletonTypeTransformer transformer) {
        this.transformer = transformer;
    }

    public Singleton create(SingletonType type) {
        if (SingletonType.STATIC == type) return StaticSingleton.getInstance();
        if (SingletonType.LAZY == type) return LazySingleton.getInstance();
        return ThreadSafeSingleton.getInstance();
    }

    public Optional<Singleton> create(String code) {
        Singleton s = null;
        try {
            s = this.create(transformer.transform(code));
        } catch (IllegalArgumentException e) {
            System.out.println("Error, IllegalArgumentException creating Singleton");
        }
        return Optional.ofNullable(s);
    }

}
