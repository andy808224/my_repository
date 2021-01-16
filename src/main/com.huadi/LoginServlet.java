package com.huadi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "LoginServlet",urlPatterns = ("/login"))
class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        System.out.println("--------servlet-------------");
        String username = req.getParameter("username");

        String password = req.getParameter("password");

        if(username.equals("admin") && password.equals("123456")){
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }
        else{
            req.getRequestDispatcher("fail.jsp").forward(req,resp);
        }
    }
}