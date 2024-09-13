package com.example.demo2.Model;

public class BorrowCard {
    private String id_borrow;
    private String id_book;
    private String id_student;
    private String name_student;
    private String clas;
    private String name_book;
    private String author_book;

    public String getName_student() {
        return name_student;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
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

    private boolean status_borrow;
    private String date_borrow;
    private String date_return;

    public BorrowCard(String id_borrow, String id_book, String id_student, String name_student, String name_book, String author_book, boolean status_borrow, String date_borrow, String date_return) {
        this.id_borrow = id_borrow;
        this.id_book = id_book;
        this.id_student = id_student;
        this.name_student = name_student;
        this.name_book = name_book;
        this.author_book = author_book;
        this.status_borrow = status_borrow;
        this.date_borrow = date_borrow;
        this.date_return = date_return;
    }

    public BorrowCard(String id_borrow, String id_book, String id_student, boolean status_borrow, String date_borrow, String date_return) {
        this.id_borrow = id_borrow;
        this.id_book = id_book;
        this.id_student = id_student;
        this.status_borrow = status_borrow;
        this.date_borrow = date_borrow;
        this.date_return = date_return;
    }

    public BorrowCard() {
    }

    public String getId_borrow() {
        return id_borrow;
    }

    public void setId_borrow(String id_borrow) {
        this.id_borrow = id_borrow;
    }

    public String getId_book() {
        return id_book;
    }

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public boolean isStatus_borrow() {
        return status_borrow;
    }

    public void setStatus_borrow(boolean status_borrow) {
        this.status_borrow = status_borrow;
    }

    public String getDate_borrow() {
        return date_borrow;
    }

    public void setDate_borrow(String date_borrow) {
        this.date_borrow = date_borrow;
    }

    public String getDate_return() {
        return date_return;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }
}
