package com.practice.commons.iteratorProblemAndList.impementIterator;

public class Book extends Utils {
	private final String title;
	private final String author;
	private final String ISBN;
	private final int publishingYear;

	public Book(String title, String author, String iSBN, int publishingYear) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.publishingYear = publishingYear;
	}

	public Book copyWith(String title, String author, String iSBN, int publishingYear) {
		return new Book(stringCopyWithMethod(this.title, title), stringCopyWithMethod(this.author, author),
				stringCopyWithMethod(this.ISBN, iSBN), publishingYear);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", publishingYear=" + publishingYear
				+ "]" + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Book requestedBook = (Book) obj;
		return title == requestedBook.title || ISBN == requestedBook.ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getPublishingYear() {
		return publishingYear;
	}
	
	
}
