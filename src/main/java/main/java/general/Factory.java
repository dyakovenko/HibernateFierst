package main.java.general;

import main.java.dao.BookDao;
import main.java.dao.main.java.dao.impl.AuthorDao;
import main.java.dao.main.java.dao.impl.AuthorDaoImpl;
import main.java.dao.main.java.dao.impl.BookDaoImpl;


public class Factory {
    private static Factory instance = new Factory();
    private BookDao bookDao;
    private AuthorDao authorDao;


    private Factory(){}

    public static Factory getInstance(){
        return Factory.instance;
    }
    public  BookDao getBookDao(){
        if(bookDao==null)bookDao = new BookDaoImpl();
        return bookDao;
        }
    public  AuthorDao getAuthorDao(){
        if(authorDao==null)authorDao = new AuthorDaoImpl();
        return authorDao;
    }
    }

