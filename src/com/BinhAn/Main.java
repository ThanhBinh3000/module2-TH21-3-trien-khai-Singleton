package com.BinhAn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBookk();
        System.out.println("BookBorrower1 asked to borrow the book ");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBookk();
        System.out.println("BookBorrower2 asked to borrow the book ");
        System.out.println("BookBorrower2 Author anh Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBookk();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("EDM TESTING SINGLETON PATTERN");
    }
}
