package pro.sky.java.course1.homework12;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearPublishingBook;

    public Book(String nameBook, Author authorBook, int yearPublishingBook) {
        this.nameBook = nameBook;
        this.yearPublishingBook = yearPublishingBook;
        this.authorBook = authorBook;
    }
    public String getNameBook(){
        return this.nameBook;
    }

    public int getYearPublishingBook() {
        return this.yearPublishingBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public void setYearPublishingBook(int yearPublishingBook) {
        this.yearPublishingBook = yearPublishingBook;
    }
}
