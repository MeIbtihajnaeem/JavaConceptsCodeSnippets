package com.practice.commons.iteratorProblemAndList.impementIterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookCollection library = new BookCollection();
		library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 1925));
		library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 1960));
		library.addBook(new Book("1984", "George Orwell", "978-0451524935", 1949));

		System.out.println("Books in the collection:");
		for (Book book : library) {
			System.out.println(book);
		}

		library.updateBookUsingIsbnOrAuthor(new Book("To Kill a Mockingbird", "Ibtihaj", "978-0061120084", 1960));
		System.out.println("Author updated ");
		System.out.println("Books in the collection:");
		for (Book book : library) {
			System.out.println(book);
		}
		Book removingBook = new Book(null, null, "978-0743273565", 0);
		library.removeBook(removingBook);
		System.out.println("Book removed ");

	}

}
