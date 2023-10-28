package com.example.labnik.laba3;

import java.util.ArrayList;

public class Book {
    private String title;
    private String autor_name;

    public Book(String title, String autor_name) {
        this.title = title;
        this.autor_name = autor_name;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor_name() {
        return autor_name;
    }
    public static ArrayList<Book> get(String[] nam, String[] aut){
        ArrayList<Book> books = new ArrayList<Book>();
        for(int i = 0; i < nam.length; i++) books.add(new Book(nam[i],aut[i]));
        return books;

    }
}
