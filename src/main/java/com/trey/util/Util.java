package com.trey.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/phonesbook";
    private static final String DB_USERNAME = "trey";
    private static final String DB_PASSWORD = "uroboros";

    public Connection getConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection is OK");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("Connection is ERROR");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("Connection is ERROR");
        }
        return connection;
    }
}
