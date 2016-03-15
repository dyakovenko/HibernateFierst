package main.java.general;

import main.java.dao.BookDao;
import main.java.dao.main.java.dao.impl.BookDaoImpl;


public class Factory {
    public static Factory instance = new Factory();
    public BookDao bookDao;

    private Factory(){}

    public static Factory getInstance(){
        return Factory.instance;
    }
    public  BookDao getBookDao(){
        if(bookDao==null)bookDao = new BookDaoImpl();
        return bookDao;
        }
    }

