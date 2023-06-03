package pro.sky.java.course1.objects;

import java.util.Objects;

public class Book {
    private Author author; //Объявление объекта-поля автора
    private String bookName;
    private int publishingYear;
    public Book(Author author, String bookName, int publishingYear) {
        this.author = author; // Инициализация объекта!
        this.bookName = bookName; // Присвоение полю объекта "Название книги" значения из конструктора
        this.publishingYear = publishingYear; // Присвоение полю объекта "Год издания" значения из конструктора
    }

    public Author getAuthor() {
        return this.author;
    } //Вывод значения "Имя и фамилия автора"
    public String getBookName() {
        return this.bookName;
    } //Вывод значения "Название книги"
    public int getPublishingYear() {
        return this.publishingYear;
    } //Вывод значения "Год издания"
    public void setPublishingYear(int publishingYear) { //Сеттер изменения значения поля "Год издания"
        this.publishingYear = publishingYear;
    }
    public String toString() {
        return " Автор: " + this.author + ". Название книги: " + this.bookName + ". Год издания: " + this.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && author.equals(book.author) && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publishingYear);
    }
}
