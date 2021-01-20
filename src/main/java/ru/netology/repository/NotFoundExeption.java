package ru.netology.repository;

public class NotFoundExeption extends RuntimeException {

    public NotFoundExeption(String message) {
        super(message);

    }

}
