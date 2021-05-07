package com.designpatterns.learn.domains.prototype;

public interface GenericCloneable<G> extends Cloneable {

    G genericClone();

}
