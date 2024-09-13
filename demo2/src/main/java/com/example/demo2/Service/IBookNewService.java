package com.example.demo2.Service;

import com.example.demo2.Model.BookNew;
import com.example.demo2.Model.BorrowCard;

import java.util.List;

public interface IBookNewService {
    List<BookNew> findAll() throws Exception;

}
