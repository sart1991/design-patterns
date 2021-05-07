package com.designpatterns.learn.services;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternType;
import com.designpatterns.learn.domains.builder.RegularBuiltObject;
import com.designpatterns.learn.domains.prototype.ProtoItem;
import com.designpatterns.learn.domains.singleton.Singleton;
import com.designpatterns.learn.domains.singleton.SingletonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignPatternService {

    @Autowired
    private final SingletonFactory singletonFactory;

    public DesignPatternService(SingletonFactory singletonFactory) {
        this.singletonFactory = singletonFactory;
    }

    public Optional<Singleton> requestSingleton(String code) {
        return singletonFactory.create(code);
    }

    public Optional<DesignPattern> requestBuilder() {
        return Optional.of(RegularBuiltObject
                .builder().fifthProp("first").secondProp("second")
                .thirdProp("third").fourthProp("fourth").fifthProp("fifth").build());
    }

    public Optional<DesignPattern> requestPrototype() {
        ProtoItem pi = ProtoItem.Factory.create();
        System.out.println(pi.getListStorageId());
        System.out.println(pi.getTextStorageId());
        return Optional.of(ProtoItem.Factory.create());
    }

}
