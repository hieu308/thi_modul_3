package com.example.demo2.Model;

public class BookNew {
    private String id_book;
    private String name_book;
    private String author_book;
    private String description_book;
    private int quantity_book;

    public BookNew(String id_book, String name_book, String author_book, String description_book, int quantity_book) {
        this.id_book = id_book;
        this.name_book = name_book;
        this.author_book = author_book;
        this.description_book = description_book;
        this.quantity_book = quantity_book;
    }

    public String getId_book() {
        return id_book;
    }

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getAuthor_book() {
        return author_book;
    }

    public void setAuthor_book(String author_book) {
        this.author_book = author_book;
    }

    public String getDescription_book() {
        return description_book;
    }

    public void setDescription_book(String description_book) {
        this.description_book = description_book;
    }

    public int getQuantity_book() {
        return quantity_book;
    }

    public void setQuantity_book(int quantity_book) {
        this.quantity_book = quantity_book;
    }
}
