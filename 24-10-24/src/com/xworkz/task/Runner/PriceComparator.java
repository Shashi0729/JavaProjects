package com.xworkz.task.Runner;

import java.util.Comparator;

import com.xworkz.task.dto.Book;

class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b2.getPrice(), b1.getPrice()); 
    }
}
