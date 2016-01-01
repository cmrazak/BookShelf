package com.bookshelf;

import java.util.ArrayList;

public class BookShelfMain {

	public static void main(String s[]) {

		BookShelf bookShelf = new BookShelf();

		bookShelf.addBook(new Book("Algorithm", "Toman", "12-34"));
		bookShelf.addBook(new Book("DataBase", "Sethi", "12-35"));
		bookShelf.addBook(new Book("DataStruture", "Ulman", "12-36"));
		bookShelf.addBook(new Book("Network", "Tanenbom", "12-37"));

		ArrayList<Book> list = bookShelf.bookList("auther");
		System.out.println("----Sort by Auther-----------");
		for (Book b : list) {
			System.out.println(b);
		}
		
		System.out.println("----Sort by Book Name-----------");
		list = bookShelf.bookList("bookname");

		for (Book b : list) {
			System.out.println(b);
		}
	}
}
