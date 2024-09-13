package com.example.demo2.Service;

import com.example.demo2.Model.BorrowCard;
import com.example.demo2.Repository.BorrowBookRepository;
import com.example.demo2.Repository.IBorrowBookRepository;

import java.util.Collections;
import java.util.List;

public class BorrowBookService implements IBorrowBookService {
    IBorrowBookRepository borrowBookRepository = new BorrowBookRepository();

    @Override
    public List<BorrowCard> getBorrowedBooks() throws Exception {
        return borrowBookRepository.getBorrowedBooks();
    }
}
