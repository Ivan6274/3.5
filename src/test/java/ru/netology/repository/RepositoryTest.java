package ru.netology.repository;

import ru.netology.domein.Book;
import ru.netology.domein.Product;
import ru.netology.domein.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {




    @org.junit.jupiter.api.Test
    void findAll() {
        Repository repository = new Repository();
        Book javaCore = new Book(1, "javaCore", 100, "Java");
        Book firstBook = new Book(4,"firstBook",100,"i'm");
        Smartphone samsung = new Smartphone(2,"Samsung A1", 1000,"samsung");
        Book secondBook = new Book(3, "secondBook", 150, "i'm");
        repository.save(javaCore);
        repository.save(firstBook);
        repository.save(samsung);
        repository.save(secondBook);

        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{javaCore,firstBook,samsung,secondBook};

        assertArrayEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void removeById() {
        Repository repository = new Repository();
        Book javaCore = new Book(1, "javaCore", 100, "Java");
        Book firstBook = new Book(4,"firstBook",100,"i'm");
        Smartphone samsung = new Smartphone(2,"Samsung A1", 1000,"samsung");
        Book secondBook = new Book(3, "secondBook", 150, "i'm");

        repository.save(javaCore);
        repository.save(firstBook);
        repository.save(secondBook);
        repository.save(samsung);

        repository.removeById(1);

        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{firstBook,secondBook,samsung};

        assertArrayEquals(actual,expected);

    }
}