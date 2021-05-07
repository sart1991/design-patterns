package com.designpatterns.learn.domains.creational.prototype;

public interface GenericCloneable<G> extends Cloneable {

    G genericClone();

}
