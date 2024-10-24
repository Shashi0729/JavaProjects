package com.xworkz.task.Runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Book;

public class BookRunner {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
		books.add(new Book("Moby Dick", "Herman Melville", 15.50));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", 7.99));
		books.add(new Book("1984", "George Orwell", 8.99));

		// Sort by price in descending order
		Collections.sort(books, new PriceComparator());
		System.out.println("Books sorted by price (descending):");
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println();

		// Sort by title in alphabetical order
		Collections.sort(books, new TitleComparator());
		System.out.println("Books sorted by title (alphabetical):");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
