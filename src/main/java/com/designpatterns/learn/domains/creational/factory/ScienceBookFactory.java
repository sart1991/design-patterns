package com.designpatterns.learn.domains.creational.factory;

public class ScienceBookFactory extends BookFactory {

    @Override
    public Book buildBook(String name) {
        Chapter intro = this.chapterFactory.createChapter(ChapterTypeEnum.INTRODUCTION);
        Chapter content1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content2 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content3 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content4 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter conclusion1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONCLUSION);
        Chapter conclusion2 = this.chapterFactory.createChapter(ChapterTypeEnum.CONCLUSION);
        Chapter bibliography1 = this.chapterFactory.createChapter(ChapterTypeEnum.BIBLIOGRAPHY);
        Chapter bibliography2 = this.chapterFactory.createChapter(ChapterTypeEnum.BIBLIOGRAPHY);
        Book book = new ScienceBook();
        book.setName(name);
        book.addChapters(intro, content1, content2, content3, content4, conclusion1, conclusion2, bibliography1, bibliography2);
        return book;
    }
}
