package com.bookshelf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BookShelf {

	private ArrayList<Book> bookList = new ArrayList<Book>();

	public void addBook(Book book) {
		bookList.add(book);
	}

	public ArrayList<Book> bookList(String sortBy) {

		ArrayList<Book> list = new ArrayList<Book>(bookList);
		// SortingComparator comparator = null;
		if (sortBy.equals("auther")) {
			// comparator = new AutherComparator();
			Collections.sort(list, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					return (b1.getAutherName().toUpperCase()).compareTo((b2.getAutherName().toUpperCase()));
				}
			});
		} else if (sortBy.equals("bookname")) {
			// comparator = new BookNameComparator();
			Collections.sort(list, new Comparator<Book>() {
				public int compare(Book b1, Book b2) {
					return (b1.getBookName().toUpperCase()).compareTo((b2.getBookName().toUpperCase()));
				}
			});
		}

		return list;
	}
}
