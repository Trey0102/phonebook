package com.trey.dao;

import com.trey.entity.PhoneBook;

import java.sql.SQLException;
import java.util.List;

public interface ServletDao {


    List<PhoneBook> getAll() throws SQLException;

}
