package main.java.general;


import main.java.dao.BookDao;
import main.java.table.Book;

import java.sql.SQLException;
import java.util.List;

public class Projeck {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
       BookDao bookDao =  factory.getBookDao();
        for (int i = 0 ;i<10;i++){
      Book book =  new Book();
        book.setTitle("к");
        book.setIsbn(i+1000);
            book.setDescription("iii"+i);

        bookDao.addBook(book);}


        //System.out.println(">>>>>>>>>>>"+bookDao.getBook("к"));


      List<Book> books= bookDao.getBooks();
        System.out.println("id  isdn title description");
        for (Book boo : books){
    //if(boo.getId()==6)bookDao.deleteBook(boo);


            System.out.println(  boo.getId()+" "+ boo.getIsbn()+"  "+
                    boo.getDescription()+"  " +boo.getTitle());
        }


    }


}


