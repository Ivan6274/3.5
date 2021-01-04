package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domein.Book;
import ru.netology.domein.Product;
import ru.netology.domein.Smartphone;
import ru.netology.repository.Repository;



import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void add() {
        ProductManager productManager = new ProductManager();
        Book javaCore = new Book(1, "javaCore", 100, "Java");
        Book firstBook = new Book(4, "firstBook", 100, "i'm");
        Smartphone samsung = new Smartphone(2, "Samsung A1", 1000, "samsung");
        Book secondBook = new Book(3, "secondBook", 150, "i'm");

        productManager.add(javaCore);
        productManager.add(firstBook);
        productManager.add(samsung);
        productManager.add(secondBook);

        Product[] actual = productManager.repository.findAll();
        Product[] expected = new Product[]{javaCore, firstBook, samsung, secondBook};

        assertArrayEquals(actual, expected);


    }

    @Test
    void searchBy() {
        ProductManager productManager = new ProductManager();
        Book javaCore = new Book(1, "javaCore", 100, "Java");
        Book firstBook = new Book(4, "firstBook", 100, "i'm");
        Smartphone samsungB2 = new Smartphone(2, "Samsung B2", 1000, "samsung");
        Book secondBook = new Book(3, "secondBook", 150, "i'm");
        Smartphone apple = new Smartphone(2, "Apple", 1000, "apple");
        Smartphone samsungA1 = new Smartphone(2, "Samsung A1", 1000, "samsung");
        Smartphone samsungT10 = new Smartphone(2, "Samsung A1", 1000, "samsung");

        productManager.add(javaCore);
        productManager.add(firstBook);
        productManager.add(samsungB2);
        productManager.add(secondBook);
        productManager.add(samsungA1);
        productManager.add(samsungT10);
        productManager.add(apple);

        Product[] actual = productManager.matches();
        Product[] expected = new Product[]{firstBook, secondBook};

        assertArrayEquals(actual,expected);

    }

    @Test
    void matches() {
    }
}