package com.xworkz.task.Runner;

import java.util.Comparator;

import com.xworkz.task.dto.Book;

class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle()); // Ascending order
    }
}
