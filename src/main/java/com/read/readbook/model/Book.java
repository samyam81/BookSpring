package com.read.readbook.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
    
    private String name;
    private String detail;
    private int pages;
    private String Language;
    private String genre;
    private int bookID;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String language) {
        Language = language;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "book [name=" + name + ", detail=" + detail + ", pages=" + pages + ", Language=" + Language + ", genre="
                + genre + ", bookID=" + bookID + "]";
    }
}
