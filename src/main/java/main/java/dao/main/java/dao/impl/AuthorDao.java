package main.java.dao.main.java.dao.impl;

import main.java.table.Author;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 15.03.2016.
 */
public interface AuthorDao {
    public void addAuthor(Author author)throws SQLException;
    public void deleteAuthor(Author author)throws SQLException;
    public Author getAuthor(int id)throws SQLException;
    //public Book getAuthor(String title) throws SQLException;
    public List<Author> getAuthor()throws SQLException;
}
