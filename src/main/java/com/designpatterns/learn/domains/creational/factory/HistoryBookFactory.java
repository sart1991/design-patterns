package com.designpatterns.learn.domains.creational.factory;

public class HistoryBookFactory extends BookFactory {

    @Override
    public Book buildBook(String name) {
        Chapter intro = this.chapterFactory.createChapter(ChapterTypeEnum.INTRODUCTION);
        Chapter content1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content2 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content3 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content4 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content5 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content6 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content7 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content8 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content9 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter content10 = this.chapterFactory.createChapter(ChapterTypeEnum.CONTENT);
        Chapter conclusion1 = this.chapterFactory.createChapter(ChapterTypeEnum.CONCLUSION);
        Chapter bibliography1 = this.chapterFactory.createChapter(ChapterTypeEnum.BIBLIOGRAPHY);
        Book book = new ScienceBook();
        book.setName(name);
        book.addChapters(intro, content1, content2, content3, content4, content5,
                content6, content7, content8, content9, content10, conclusion1, bibliography1);
        return book;
    }
}
