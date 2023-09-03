package com.practice.commons.iteratorProblemAndList.impementIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class BookCollection implements Iterable<Book> {
	private List<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public boolean removeBook(Book book) {
		return books.remove(book);
	}

	public int size() {
		return books.size();
	}

	public void updateBookUsingIsbnOrAuthor(Book book) {
		Book requestedBook = new Book(book.getTitle(), null, book.getISBN(), 0);
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).equals(requestedBook)) {
				System.out.println("Found 1 record");
				books.set(i, books.get(i).copyWith(book.getTitle(), book.getAuthor(), book.getISBN(),
						book.getPublishingYear()));
			}
		}
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookIterator();
	}

	private class BookIterator implements Iterator<Book> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return currentIndex < books.size();
		}

		@Override
		public Book next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return books.get(currentIndex++);
		}
	}
}