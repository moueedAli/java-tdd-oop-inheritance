package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void testCheckAuthorInfo() {
        Author author = new Author("Bob", "007", "vg");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("Bob", book.getAuthor().getName());
    }
}
