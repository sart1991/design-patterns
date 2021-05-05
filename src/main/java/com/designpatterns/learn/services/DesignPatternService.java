package com.designpatterns.learn.services;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternType;
import com.designpatterns.learn.domains.singleton.SingletonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignPatternService {

    @Autowired
    private final SingletonFactory singletonFactory;

    public DesignPatternService(SingletonFactory singletonFactory) {
        this.singletonFactory = singletonFactory;
    }

    public DesignPattern requestDesignPattern(DesignPatternType type, String code) throws IllegalArgumentException {
        return this.requestSingleton(code);
    }

    public DesignPattern requestSingleton(String code) throws IllegalArgumentException {
        return singletonFactory.create(code);
    }

}
