package org.example;

public class LibraryApp {

    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("Searching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){

            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor", book.getTitle(), book.getGenre(), book.getAuthor());

        }
        else {

            System.out.printf("0 books found.");

        }

    }

    public void searchByTitle(String title) {

        System.out.printf("Searching for books with TITLE %s.\n", title);

        Book book = bookRepo.findByTitle(title);

        if(book != null){

            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor", book.getTitle(), book.getGenre(), book.getAuthor());


        }

        else {

            System.out.printf("0 books found.");

        }

    }

    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            if (book.checkOut()){
                System.out.println("Book checked out successfully.");
                System.out.printf("\n\tISBN: %s\n\tTITLE: %s\n\tAuthor", book.getTitle(), book.getGenre(), book.getAuthor());
            }
            else {
                System.out.println("Check out Failed: ");
                System.out.printf("\n\tISBN: %s\n\tTITLE: %s\n\tAuthor", book.getTitle(), book.getGenre(), book.getAuthor());
                System.out.println("Reason: More books checked out than recorded quantity ");


            }


        }
        else {
            System.out.printf("Failed to check out book.\n");
            System.out.printf("Reason: Thre is no book with ISBN on the record\n", isbn);

        }
        System.out.println();

    }

}
