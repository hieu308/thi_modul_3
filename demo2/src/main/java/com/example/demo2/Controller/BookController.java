package com.example.demo2.Controller;

import com.example.demo2.Model.BookNew;
import com.example.demo2.Service.BookNewService;
import com.example.demo2.Service.IBookNewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="BookController",value ="/book" )
public class BookController extends HttpServlet {
    IBookNewService bookNewServices = new BookNewService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {

                default:
                    listBook(request, response);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void listBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<BookNew> list = bookNewServices.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
