package pro.sky.java.course.lesson1;

public class Main {
    public static void main(String[] args) {
        Author bookAuthorTolstoy = new Author("Лев", "Толстой");
        Book book = new Book(bookAuthorTolstoy, "Война и мир", 1982);
        System.out.println("book.authorName = " + book.authorName.firstName + " " + book.authorName.lastName);
        System.out.println("book.bookName = " + book.bookName);
        System.out.println("book.publishingYear = " + book.publishingYear);

        System.out.println();
        Author bookAuthorSimonov = new Author("Константин", "Симонов");
        Book book2 = new Book(bookAuthorSimonov, "Живые и мёртвые", 1995);
        System.out.println("book.authorName = " + book2.authorName.firstName + " " + book2.authorName.lastName);
        System.out.println("book.bookName = " + book2.bookName);
        System.out.println("book.publishingYear = " + book2.publishingYear);
    }
}

