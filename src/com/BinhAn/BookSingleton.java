package com.BinhAn;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isloanedOut;

    private BookSingleton() {
        author = " Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isloanedOut = false;
    }
    public static BookSingleton borrowBook(){
        if (!isloanedOut){
            if (book == null){
                book = new BookSingleton();
            }
            isloanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton  bookReturned){
        isloanedOut =false;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthorAndTitle(){
        return getTitle()+ "by" + getAuthor();
    }
}

