package nao.cycledev.ocpjavase7.c13.threads;

class Book {
    private int sellCopies = 0;
    private String title;

    public Book(String title) {
        this.title = title;
    }

    synchronized public void sellBook() {
        ++sellCopies;
    }

    synchronized public void returnBook() {
        --sellCopies;
    }

    @Override
    public String toString() {
        return "Book: " + title + "; copies: " + sellCopies;
    }
}

class BuyBook extends Thread {
    private Book book;

    public BuyBook(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        book.sellBook();
    }
}

class ReturnBook extends Thread {
    private Book book;

    public ReturnBook(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        book.returnBook();
    }
}


public class Library {

    public static void test() {
        Book book = new Book("Java");
        Thread thread1 = new BuyBook(book);
        thread1.start();
        System.out.println(book);
        Thread thread2 = new BuyBook(book);
        thread2.start();
        System.out.println(book);
        Thread thread3 = new ReturnBook(book);
        thread3.start();
        System.out.println(book);
    }
}
