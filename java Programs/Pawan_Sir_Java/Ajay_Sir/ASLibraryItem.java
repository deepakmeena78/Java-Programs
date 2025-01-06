/*
 * .
 Library Management System
You are designing a library system to manage books and media.

Abstract Class:

Create an abstract class LibraryItem with the following:
Fields:
String title
String author
Constructor to initialize fields.
Abstract method checkout().
Abstract method returnItem().
Concrete method displayInfo() to print the title and author.
Subclasses:

Create the following subclasses:
Book:
Additional field: int pages.
Override checkout() to print "Checking out book: [title]."
Override returnItem() to print "Returning book: [title]."
DVD:
Additional field: int duration (in minutes).
Override checkout() to print "Checking out DVD: [title]."
Override returnItem() to print "Returning DVD: [title]."
Main Class:

Create objects of Book and DVD.
Call checkout(), returnItem(), and displayInfo() for each item.
 */

abstract class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract public void checkout();

    abstract public void returnItem();

    public void displayInfo() {
        System.out.println("Title : " + title + "\nAuthor : " + author);
    }
}

class Book extends LibraryItem {
    int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public void checkout() {
        System.out.println("Checking out book : " + title);
    }

    public void returnItem() {
        System.out.println("Book Pages : " + pages);
        System.out.println("Returning book : " + title);
    }
}

class DVD extends LibraryItem {
    int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public void checkout() {
        System.out.println("Checking out book : " + title);
    }

    public void returnItem() {
        System.out.println("Book Pages : ");
        System.out.println("Returning book : " + title);
    }
}

public class ASLibraryItem {
    public static void main(String[] args) {

        LibraryItem l = new Book("Machayenge", "Emiway", 140);
        l.checkout();
        l.returnItem();
        l.displayInfo();

        LibraryItem kk = new DVD("Love Dose", "YOYO", 200);
        kk.checkout();
        kk.returnItem();
        kk.displayInfo();
    }
}
