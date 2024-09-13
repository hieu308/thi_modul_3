package com.example.demo2.Service;

import com.example.demo2.Model.BorrowCard;

import java.util.List;

public interface IBorrowBookService {
    public List<BorrowCard> getBorrowedBooks() throws Exception;

}
