package pro.sky.java.course.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввожу в справочник book1:");
        Author bookTolstoy = new Author("Лев", "Толстой");
        Book book1 = new Book(bookTolstoy, "Война и мир", 1982);

        System.out.println("book1.authorName = " + book1.getAuthorName().getFirstName() + " " + book1.getAuthorName().getLastName());
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.publishingYear = " + book1.getPublishingYear());
        System.out.println();

        System.out.println("Ввожу в справочник book2:");
        Author bookSimonov = new Author("Константин", "Симонов");
        Book book2 = new Book(bookSimonov, "Живые и мёртвые", 1995);

        System.out.println("book2.authorName = " + book2.getAuthorName().getFirstName() + " " + book2.getAuthorName().getLastName());
        System.out.println("book2.bookName = " + book2.getBookName());
        System.out.println("book2.publishingYear = " + book2.getPublishingYear());
        System.out.println();

        System.out.println("Присваиваю изданию book2 новый год издания - 2000:");
        book2.setPublishingYear(2000);
        System.out.println("book2.publishingYear = " + book2.getPublishingYear());
        System.out.println();

        System.out.println("Вывожу весь объект book1 через переопределённый метод toString:");
        System.out.println("Найденная книга: " + book1);
        System.out.println("Вывожу весь объект book2 через переопределённый метод toString:");
        System.out.println("Найденная книга: " + book2);
        System.out.println();

        System.out.println("Создаю новый объект book3 со всеми заведомо одинаковыми свойствами с объектом book1 для последующего сравнения:");
        Author bookSearch = new Author("Лев", "Толстой");
        Book book3 = new Book(bookSearch, "Война и мир", 1982);

        System.out.println("book3.authorName = " + book3.getAuthorName().getFirstName() + " " + book3.getAuthorName().getLastName());
        System.out.println("book3.bookName = " + book3.getBookName());
        System.out.println("book3.publishingYear = " + book3.getPublishingYear());
        System.out.println("Найденная книга: " + book3);
        System.out.println();

        System.out.println("Сравнение объектов book3 и book1 между собой с помощью переопределения метода hashCode():");
        if (book3.hashCode() == book1.hashCode()) {
            System.out.println("book1.hashCode() = " + book1.hashCode());
            System.out.println("book3.hashCode() = " + book3.hashCode());
            System.out.println("Объекты по hash-коду равны между собой");
        }
        else {System.out.println("Объекты по hash-коду не равны");}
        System.out.println();
        System.out.println("Сравнение объектов book3 и book1 между собой с помощью переопределения метода equals():");
        if (book3.equals(book1)) {
            System.out.println("Объекты равны между собой");
        }
        else {System.out.println("Объекты не равны");}


    }
}

