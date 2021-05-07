package com.designpatterns.learn.domains.creational.factory;

import com.designpatterns.learn.domains.DesignPattern;

public abstract class BookFactory implements DesignPattern {

    protected final ChapterFactory chapterFactory = new ChapterFactory();

    public static BookFactory createFactory(BookGenreEnum genre) {
        switch (genre) {
            case FICTION:
                return new FictionBookFactory();
            case HISTORY:
                return new HistoryBookFactory();
            case SCIENCE:
                return new ScienceBookFactory();
        }
        return new ScienceBookFactory();
    }

    public abstract Book buildBook(String name);

    @Override
    public String describe() {
        return "Creational -> AbstractFactory (Factory of factories)";
    }
}
