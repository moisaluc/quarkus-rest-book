package com.moisaluc;

import lombok.Data;

@Data
public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(int id, String title, String author, int year, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
}
