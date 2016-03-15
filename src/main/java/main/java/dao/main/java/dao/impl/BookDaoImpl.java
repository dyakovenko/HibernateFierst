package main.java.dao.main.java.dao.impl;

import main.java.dao.BookDao;
import main.java.table.Book;
import main.java.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 13.03.2016.
 */
public class BookDaoImpl implements BookDao {


@Override
    public void addBook(Book book) throws SQLException {
        Session session =null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            if((session!=null)&&(session.isOpen()))
            session.close();
        }
    }
    @Override
    public void deleteBook(Book book) throws SQLException {
        Session session = null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            if((session!=null)&&(session.isOpen()))
                session.close();
        }

    }
    @Override
    public Book getBook(int id) throws SQLException {
        Book result = null;
        Session session = null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
        result = (Book)session.load(Book.class,id);
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            System.out.println(session.isOpen());
            if((session!=null)&&(session.isOpen()))
                session.close();
            System.out.println(session.isOpen());
        }

        return result;
    }

    @Override
    public Book getBook(String title) throws SQLException {
        Book result = null;
        Session session = null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            result = (Book)session.get(Book.class,title);
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            if((session!=null)&&(session.isOpen()))
                session.close();
        }

        return result;

    }

    @Override
    public List<Book> getBooks() throws SQLException {
        List<Book>books = null;
        Session session =  null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
          books=  session.createCriteria(Book.class).list();

        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {System.out.println(session.isOpen());
            if((session!=null)&&(session.isOpen()))

                session.close();
            System.out.println(session.isOpen());
        }

        return books;
    }
}
