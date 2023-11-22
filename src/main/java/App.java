import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();



        /*

        // Yayınevi Ekleme
        Publisher publisher = new Publisher();
        publisher.setName("Yapı Kredi Yayınları");
        publisher.setAddress("İstanbul");
        publisher.setEstablishmentYear(1992);
        entityManager.persist(publisher);


        // Yazar Ekleme
        Author author = new Author();
        author.setName("Sabahattin Ali");
        author.setBirthDate(LocalDate.parse("1907-02-25"));
        author.setCountry("Türkiye");
        entityManager.persist(author);


        // Kitap ekleme
        Book book = new Book();
        book.setName("İçimizdeki Şeytan");
        book.setStock(10);
        book.setPublicationYear(1940);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager.persist(book);


        // Ödünç Alan ekleme

        BookBorrowing borrowing = new BookBorrowing();
        borrowing.setBorrower_name("İrfan Anık");
        borrowing.setBorrowing_date(LocalDate.parse("2023-11-18"));
        borrowing.setReturn_date(LocalDate.now());
        borrowing.setBook(book);
        entityManager.persist(borrowing);





        Category roman = new Category("Roman");
        Category tarih = new Category("Tarih");
        Category cocuk = new Category("Çocuk");

        entityManager.persist(roman);
        entityManager.persist(tarih);
        entityManager.persist(cocuk);

        Book book = entityManager.find(Book.class,1);
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(roman);
        categoryList.add(tarih);
        book.setCategoryList(categoryList);

        entityManager.persist(book);

         */



        transaction.commit();





    }
}
