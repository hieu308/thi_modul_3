package com.example.demo2.Repository;

import com.example.demo2.Model.BorrowCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BorrowBookRepository implements IBorrowBookRepository {
    String SELECT_Borrow = "SELECT BorrowCard.id_borrows, Students.name_student,Students.class, Book.name_book, Book.author, BorrowCard.date_borrow, BorrowCard.return_date, BorrowCard.status " +
            "FROM BorrowCard " +
            "JOIN Book ON BorrowCard.id_book = Book.id_book " +
            "JOIN Students ON BorrowCard.id_student = Students.id_student " +
            "WHERE BorrowCard.status = true";

    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<BorrowCard> getBorrowedBooks() throws Exception {
        List<BorrowCard> borrowedBooks = new ArrayList<>();
        try (Connection conn = baseRepository.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_Borrow)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BorrowCard borrowCard2 = new BorrowCard();
                borrowCard2.setId_borrow(rs.getString("id_borrows"));
                borrowCard2.setName_student(rs.getString("name_student"));
                borrowCard2.setName_book(rs.getString("name_book"));
                borrowCard2.setAuthor_book(rs.getString("author"));
                borrowCard2.setClas(rs.getString("class"));
                borrowCard2.setDate_borrow(rs.getString("date_borrow"));
                borrowCard2.setDate_return(rs.getString("return_date"));
                borrowCard2.setStatus_borrow(rs.getBoolean("status"));
                borrowedBooks.add(borrowCard2);
            }
            return borrowedBooks;
        }
    }
}
