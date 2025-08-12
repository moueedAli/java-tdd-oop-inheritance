package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddToStock() {
        Library lib = new Library();
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("Harry potter", author);
        lib.addToStock(book);

        Assertions.assertEquals(1, lib.items.size());
    }

    @Test
    public void testCheckInItem() {
        Library lib = new Library();
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("Harry potter", author);

        Assertions.assertEquals("item is not part of the library's collection", lib.checkInItem(book.title));
    }

    @Test
    public void testCheckOutItem() {
        Library lib = new Library();
        Author author = new Author("Bob", "007", "vg");
        Item book = new Book("Harry potter", author);
        lib.addToStock(book);

        Assertions.assertEquals("item has been checked out", lib.checkOutItem(book.title));
    }
}
