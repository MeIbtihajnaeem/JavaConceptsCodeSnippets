package com.practice.commons.iteratorProblemAndList.usingInnerClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection extends Utils {

	private final List<Book> books;

	public BookCollection() {
		super();
		this.books = new ArrayList<>();
	}

	public void addBooks(String title, String author, String iSBN, String publishingYear) {
		books.add(new Book(title, author, iSBN, publishingYear));
	}

	public void removeBookUsingIsbnOrAuthor(String author, String iSBN) {
		Book requestedBook = new Book(author, iSBN, null, null);
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book item = iterator.next();
			if (item.equals(requestedBook)) {
				iterator.remove();
			}
		}
	}
	

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		String data = "";
		for (Book b : books) {
			data += b.toString() + "\n";
		}
		return data;
	}

	public void updateBookUsingIsbnOrAuthor(String title, String author, String iSBN, String publishingYear) {
		Book requestedBook = new Book(title, null, iSBN, null);
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).equals(requestedBook)) {
				System.out.println("Found 1 record");
				books.set(i, books.get(i).copyWith(title, author, iSBN, publishingYear));
			}
		}
	}

	public class Book {
		private final String title;
		private final String author;
		private final String ISBN;
		private final String publishingYear;

		public Book(String title, String author, String iSBN, String publishingYear) {
			super();
			this.title = title;
			this.author = author;
			ISBN = iSBN;
			this.publishingYear = publishingYear;
		}

		public Book copyWith(String title, String author, String iSBN, String publishingYear) {
			return new Book(stringCopyWithMethod(this.title, title), stringCopyWithMethod(this.author, author),
					stringCopyWithMethod(this.ISBN, iSBN), stringCopyWithMethod(this.publishingYear, publishingYear));
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", publishingYear="
					+ publishingYear + "]"+"\n";
		}

		@Override
		public boolean equals(Object obj) {
			Book requestedBook = (Book) obj;
			return title == requestedBook.title || ISBN == requestedBook.ISBN;
		}

	}
}
