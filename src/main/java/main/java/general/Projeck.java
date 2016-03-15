package main.java.general;


import main.java.dao.main.java.dao.impl.AuthorDao;
import main.java.table.Author;

import java.sql.SQLException;
import java.util.List;

public class Projeck {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
       //BookDao bookDao =  factory.getBookDao();
        AuthorDao authorDao = factory.getAuthorDao();

        /*for (int i = 0 ;i<5;i++){
      Author author =  new Author();
        author.setFierstName("vasya"+1);
            author.setMidletName("vasilivich"+1);
            author.setLastName("Ivanov"+1);



        authorDao.addAuthor(author);}*/


        List<Author> authors= authorDao.getAuthor();
        System.out.println("id  isdn title description");
        for (Author aut : authors) {
            //if(boo.getId()==6)bookDao.deleteBook(boo);


            System.out.println(aut.getId() + " " + aut.getFierstName() + "  " +
                    aut.getMidletName() + "  " + aut.getLastName());

        }
        System.out.println("======================================");
     /* List<Book> books= bookDao.getBooks();
        System.out.println("id  isdn title description");
        for (Book boo : books){
    //if(boo.getId()==6)bookDao.deleteBook(boo);


            System.out.println(  boo.getId()+" "+ boo.getIsbn()+"  "+
                    boo.getDescription()+"  " +boo.getTitle());
        }*/


    }


}


