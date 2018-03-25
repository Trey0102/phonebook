package com.trey;

import com.trey.dao.ServletDao;
import com.trey.entity.PhoneBook;
import com.trey.service.PhonebookService;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Servlet extends HttpServlet {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/phonesbook";
    private static final String DB_USERNAME = "trey";
    private static final String DB_PASSWORD = "uroboros";
    private String SELECT_ALL = "SELECT * FROM phonesbook.phonesbook";

//    private Connection getConnection()
//    {
//        try
//        {
//            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//        }
//        catch (SQLException e)
//        {
//            e.printStackTrace();
//            return getConnection();
//        }
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        Connection connection;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        List<PhoneBook>  list= new LinkedList<PhoneBook>();
//
//        try
//        {
//            connection = getConnection();
//            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
//            connection.setAutoCommit(false);
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(SELECT_ALL);
//
//            while(resultSet.next())
//            {
//                PhoneBook phoneBook = new PhoneBook();
//                phoneBook.setName(resultSet.getString("NAME"));
//                phoneBook.setPhone(resultSet.getString("PHONE"));
//                phoneBook.setEmail(resultSet.getString("EMAIL"));
//
//                list.add(phoneBook);
//            }
//            request.setAttribute("list", list);
//            request.getRequestDispatcher("test.jsp").forward(request, response);
//        }
//        catch (SQLException e)
//        {
//            e.printStackTrace();
//        }
    }



}