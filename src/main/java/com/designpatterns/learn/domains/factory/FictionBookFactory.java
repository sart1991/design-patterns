package com.designpatterns.learn.domains.factory;

public class FictionBookFactory extends BookFactory {

    @Override
    public Book buildBook(String name) {
        Chapter intro = this.chapterFactory.createChapter(ChapterTypeEnum.INTRODUCTION);
        Chapter content1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content2 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content3 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter conclusion1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONCLUSION);
        Chapter bibliography1 = this.chapterFactory.createChapter(ChapterTypeEnum.BIBLIOGRAPHY);
        Book book = new ScienceBook();
        book.setName(name);
        book.addChapters(intro, content1, content2, content3, conclusion1, bibliography1);
        return book;
    }
}
