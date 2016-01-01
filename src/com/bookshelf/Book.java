package com.bookshelf;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {

	private String bookName;
	private String autherName;
	private String isbn;

	public Book(String bookName, String autherName, String isbn) {

		this.bookName = bookName;
		this.autherName = autherName;
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int compareTo(Book book) {

		return this.bookName.compareTo(book.bookName);
	}

	@Override
	public int hashCode() {

		int hash = 7;
		hash = 53 * hash + Objects.hashCode(this.bookName);
		return hash;

	}
	@Override
	public String toString(){
		return bookName +" "+autherName + " "+isbn;
	}

}

interface SortingComparator extends Comparator<Book> {}
class AutherComparator implements SortingComparator {
	@Override
	public int compare(Book b1, Book b2) {
		return (b1.getAutherName().toUpperCase()).compareTo((b2.getAutherName().toUpperCase()));
	}
}
class BookNameComparator implements Comparator<Book>,SortingComparator {
	@Override
	public int compare(Book b1, Book b2) {
		return (b1.getBookName().toUpperCase()).compareTo((b2.getBookName().toUpperCase()));
	}
}
