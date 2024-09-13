package com.example.demo2.Repository;

import com.example.demo2.Model.BookNew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookNewRepository implements IBookNewRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT*FROM Book";

    @Override
    public List<BookNew> findAll() throws Exception {
        List<BookNew> list = new ArrayList<>();
        try (Connection con = baseRepository.getConnection();
             PreparedStatement ps = con.prepareStatement(SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String author = rs.getString(3);
                String description = rs.getString(4);
                int quantity = rs.getInt(5);
                BookNew book = new BookNew(id, name, author, description, quantity);
                list.add(book);
            }
        }
        return list;
    }
}
