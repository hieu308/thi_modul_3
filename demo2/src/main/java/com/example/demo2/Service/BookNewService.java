package com.example.demo2.Service;

import com.example.demo2.Model.BookNew;
import com.example.demo2.Repository.BookNewRepository;
import com.example.demo2.Repository.IBookNewRepository;

import java.util.List;

public class BookNewService implements IBookNewService {
    IBookNewRepository bookRepository = new BookNewRepository();

    @Override
    public List<BookNew> findAll() throws Exception {
        return bookRepository.findAll();
    }
}
