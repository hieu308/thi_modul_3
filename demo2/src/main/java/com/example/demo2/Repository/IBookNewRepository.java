package com.example.demo2.Repository;

import com.example.demo2.Model.BookNew;

import java.util.List;

public interface IBookNewRepository {
    List<BookNew> findAll() throws Exception;
}
