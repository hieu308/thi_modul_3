package com.example.demo2.Repository;

import com.example.demo2.Model.BorrowCard;

import java.util.List;

public interface IBorrowBookRepository {
    public List<BorrowCard> getBorrowedBooks() throws Exception;
}
