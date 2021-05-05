package com.designpatterns.learn.domains.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonFactory {

    @Autowired
    private final SingletonTypeTransformer transformer;

    public SingletonFactory(SingletonTypeTransformer transformer) {
        this.transformer = transformer;
    }

    public Singleton create(SingletonType type) {
        if (SingletonType.STATIC == type) return StaticSingleton.getInstance();
        if (SingletonType.LAZY == type) return StaticSingleton.getInstance();
        return StaticSingleton.getInstance();
    }

    public Singleton create(String code) {
        return this.create(transformer.transform(code));
    }

}
