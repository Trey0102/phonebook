package com.trey.service;

import com.trey.dao.PhonebookDAO;
import com.trey.entity.PhoneBook;
import com.trey.util.Util;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PhonebookService extends Util implements PhonebookDAO {

    Connection connection;

    @Override
    public void add(PhoneBook phoneBook) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO PHONESBOOK (NAME, PHONE, EMAIL) VALUES (?, ?, ?)";

        connection = getConnection();

        try
        {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, phoneBook.getName());
            preparedStatement.setString(2, phoneBook.getPhone());
            preparedStatement.setString(3, phoneBook.getEmail());

            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("something wrong");
        }
        finally
        {
            if(preparedStatement != null)
            {
                preparedStatement.close();
            }
            if(connection != null)
            {
                connection.close();
            }
        }
    }

    @Override
    public List<PhoneBook> getAll() throws SQLException {
        List<PhoneBook> phoneBookList = new ArrayList<PhoneBook>();

        String sql = "SELECT NAME, PHONE, EMAIL FROM PHONESBOOK";
        connection = getConnection();

        Statement statement = null;
        try
        {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                PhoneBook phoneBook = new PhoneBook();
                phoneBook.setName(resultSet.getString("NAME"));
                phoneBook.setPhone(resultSet.getString("PHONE"));
                phoneBook.setEmail(resultSet.getString("EMAIL"));

                phoneBookList.add(phoneBook);
            }

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally{
            if (statement!=null)
                statement.close();
            if(connection != null)
                connection.close();
        }
        return phoneBookList;
    }

    @Override
    public PhoneBook getByName(String name) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT NAME, PHONE, EMAIL FROM PHONESBOOK WHERE NAME=?";
        connection = getConnection();

        PhoneBook phoneBook = new PhoneBook();
        try
        {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();

            phoneBook.setName(resultSet.getString("NAME"));
            phoneBook.setPhone(resultSet.getString("PHONE"));
            phoneBook.setEmail(resultSet.getString("EMAIL"));

            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(preparedStatement != null)
                preparedStatement.close();
            if(connection != null)
                connection.close();
        }
        return phoneBook;
    }

    @Override
    public void update(PhoneBook phoneBook) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE PHONESBOOK SET  PHONE = ?, EMAIL = ? WHERE NAME = ?";
        connection = getConnection();

        try
        {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, phoneBook.getPhone());
            preparedStatement.setString(2, phoneBook.getEmail());
            preparedStatement.setString(3, phoneBook.getName());

            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            if (preparedStatement != null)
                preparedStatement.close();
            if (connection != null)
                connection.close();
        }
    }

    @Override
    public void remove(PhoneBook phoneBook) throws SQLException {
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        String sql = "DELETE FROM PHONESBOOK WHERE NAME = ?";

        try
        {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phoneBook.getName());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(preparedStatement != null)
                preparedStatement.close();
            if(connection != null)
                connection.close();
        }
    }
}
