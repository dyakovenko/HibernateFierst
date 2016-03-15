package main.java.dao.main.java.dao.impl;

import main.java.table.Author;
import main.java.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 15.03.2016.
 */
public class AuthorDaoImpl implements AuthorDao {
    @Override
    public void addAuthor(Author author) throws SQLException {
        Session session =null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(author);
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
    public void deleteAuthor(Author author) throws SQLException {
        Session session = null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(author);
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
    public Author getAuthor(int id) throws SQLException {
        Author result = null;
        Session session = null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            result = (Author)session.get(Author.class,id);
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
    public List<Author> getAuthor() throws SQLException {
        List<Author>authors = null;
        Session session =  null;
        try {
            session =HibernateUtil.getSessionFactory().openSession();
            authors=  session.createCriteria(Author.class).list();

        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {System.out.println(session.isOpen());
            if((session!=null)&&(session.isOpen()))

                session.close();
            System.out.println(session.isOpen());
        }

        return authors;
    }
}
