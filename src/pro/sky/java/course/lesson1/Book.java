package pro.sky.java.course.lesson1;

import java.util.Objects;

public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;
    public Book(Author bookAuthor, String bookName, int publishingYear) {
        this.authorName = bookAuthor;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return this.authorName;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String toString() {
        return " Автор: " + this.authorName + ". Название книги: " + this.bookName + ". Год издания: " + this.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && authorName.equals(book.authorName) && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, publishingYear);
    }
}
