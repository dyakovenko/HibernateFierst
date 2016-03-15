package main.java.dao;

import main.java.table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 13.03.2016.
 */
public interface BookDao {
    public void addBook(Book book)throws SQLException;
    public void deleteBook(Book book)throws SQLException;
    public Book getBook(int id)throws SQLException;
    public Book getBook(String title) throws SQLException;
    public List<Book> getBooks()throws SQLException;


}
