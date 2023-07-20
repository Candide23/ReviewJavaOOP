package org.example;

public class Main {
    public static void main(String[] args) {

        LibraryApp app =new LibraryApp();
        app.searchByIsbn("25274");
        app.searchByTitle("The Death");
        app.checkOutBook("83471");
        app.checkOutBook("83472");


    }
}