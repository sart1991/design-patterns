package com.designpatterns.learn.domains.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Chapter {

    protected int pagesLimit = 1000;
    private final List<Page> pages = new ArrayList<>();

    public void addPage(Page page) {
        if (pagesLimit < pages.size()) {
            pages.add(page);
        } else {
            throw new RuntimeException("Page can't be added, number of pages exceeds limit for this chapter");
        }
    }

    public void addAllPages(List<Page> pages) {
        if (pagesLimit <= pages.size()) {
            this.pages.addAll(pages);
        } else {
            throw new RuntimeException("The amount of pages exceeds limit for this chapter");
        }
    }

}
