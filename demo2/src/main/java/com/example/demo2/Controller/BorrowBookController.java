package com.example.demo2.Controller;

import com.example.demo2.Model.BorrowCard;
import com.example.demo2.Service.BorrowBookService;
import com.example.demo2.Service.IBorrowBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="BorrowBookController", value ="/borrow")
public class BorrowBookController extends HttpServlet {
    IBorrowBookService borrowBookService = new BorrowBookService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {

                default:
                    listBorrow(request, response);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
private void listBorrow(HttpServletRequest request, HttpServletResponse response) throws Exception {
    List<BorrowCard> list = borrowBookService.getBorrowedBooks();
    request.setAttribute("list", list);
    request.getRequestDispatcher("borrow.jsp").forward(request, response);
}
}
