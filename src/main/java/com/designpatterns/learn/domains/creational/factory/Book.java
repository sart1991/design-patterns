package com.designpatterns.learn.domains.creational.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Book {

    private String name = "";
    private final List<Chapter> chapters = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChapters(Chapter... chapters) {
        this.chapters.addAll(Arrays.asList(chapters));
    }

}
