package com.trey.dao;

import com.trey.entity.PhoneBook;

import java.sql.SQLException;
import java.util.List;

public interface PhonebookDAO {

    //create
    void add(PhoneBook phoneBook) throws SQLException;

    //read
    List<PhoneBook> getAll() throws SQLException;

    PhoneBook getByName(String name) throws SQLException;

    //update
    void update(PhoneBook phoneBook) throws SQLException;

    //delete
    void remove(PhoneBook phoneBook) throws SQLException;
}
