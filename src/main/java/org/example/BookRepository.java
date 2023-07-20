package org.example;

import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
       books.add(new Book("83471", "The Death of Night", "Horror", null, "S.K. Eleton",10,7));
       books.add(new Book("25274", "The Death", "Historical", null, "H.P. Anderson", 5, 1));
       books.add(new Book("51573", "The Knight's Sword", "FANTASY", null, "F.E. Anvil", 4, 0));

    }

    public Book findByIsbn(String isbn){

        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }

        return null;

    }

    public Book findByTitle(String title){

        for(Book book : books){

            if(book.getTitle().equals(title)){
                return book;
            }
        }

        return null;

    }

}
