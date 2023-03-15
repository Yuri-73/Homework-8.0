package pro.sky.java.course.lesson1;

public class Main {
    public static void main(String[] args) {
        Author bookAuthorTolstoy = new Author("Лев", "Толстой");
        Book book = new Book(bookAuthorTolstoy, "Война и мир", 1982);
        System.out.println("book.authorName = " + book.getAuthorName().getFirstName() + " " + book.getAuthorName().getLastName());
        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("book.publishingYear = " + book.getPublishingYear());

        System.out.println();
        Author bookAuthorSimonov = new Author("Константин", "Симонов");
        Book book2 = new Book(bookAuthorSimonov, "Живые и мёртвые", 1995);
        System.out.println("book.authorName = " + book2.getAuthorName().getFirstName() + " " + book2.getAuthorName().getLastName());
        System.out.println("book.bookName = " + book2.getBookName());
        System.out.println("book.publishingYear = " + book2.getPublishingYear());
        book2.setPublishingYear(2000);
        System.out.println("book.publishingYear = " + book2.getPublishingYear());
    }
}

