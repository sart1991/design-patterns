package com.designpatterns.learn.domains.creational.factory;

import com.designpatterns.learn.domains.DesignPattern;

public class ChapterFactory implements DesignPattern {

    private final BulkPageFactory pageFactory = new BulkPageFactory();

    public Chapter createChapter(ChapterTypeEnum chapterType) {
        Chapter chapter = null;
        switch (chapterType) {
            case INTRODUCTION:
                chapter = new IntroductionChapter();
                chapter.addAllPages(pageFactory.createPages(1));
                break;
            case CONTENT:
                chapter = new ContentChapter(100);
                chapter.addAllPages(pageFactory.createPages(100));
                break;
            case CONCLUSION:
                chapter = new ConclusionChapter();
                chapter.addAllPages(pageFactory.createPages(2));
                break;
            case BIBLIOGRAPHY:
                chapter = new BibliographyChapter();
                chapter.addAllPages(pageFactory.createPages(3));
                break;
        }
        return chapter;
    }

    @Override
    public String describe() {
        return "Creational -> RegularFactory";
    }
}
