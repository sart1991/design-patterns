package com.designpatterns.learn.services;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.creational.builder.RegularBuiltObject;
import com.designpatterns.learn.domains.creational.factory.*;
import com.designpatterns.learn.domains.creational.prototype.ProtoItem;
import com.designpatterns.learn.domains.creational.singleton.Singleton;
import com.designpatterns.learn.domains.creational.singleton.SingletonFactory;
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

    public Optional<DesignPattern> requestFactory(String code) {
        if (code.equals("regular")) {
            ChapterFactory factory = new ChapterFactory();
            factory.createChapter(ChapterTypeEnum.CONTENT);
            return Optional.of(factory);
        } else if (code.equals("abstract")) {
            BookFactory factory = BookFactory.createFactory(BookGenreEnum.SCIENCE);
            factory.buildBook("The universe in a nutshell");
            return Optional.of(factory);
        }
        return Optional.empty();
    }

}
