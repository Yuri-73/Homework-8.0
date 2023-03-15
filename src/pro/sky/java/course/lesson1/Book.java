package pro.sky.java.course.lesson1;
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
}
