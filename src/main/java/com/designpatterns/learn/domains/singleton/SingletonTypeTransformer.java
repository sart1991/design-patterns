package com.designpatterns.learn.domains.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonTypeTransformer {

    public SingletonType transform(String code) throws IllegalArgumentException {
        return SingletonType.valueOf(code.toUpperCase());
    }

}
