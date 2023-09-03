package com.practice.commons.iteratorProblemAndList.usingInnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookCollection library = new BookCollection();
		library.addBooks("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", "1925");
		library.addBooks("To Kill a Mockingbird", "Harper Lee", "978-0061120084", "1960");
		library.addBooks("1984", "George Orwell", "978-0451524935", "1949");

		System.out.println(library.getBooks().toString());

		library.updateBookUsingIsbnOrAuthor("To Kill a Mockingbird", "Ibtihaj", "978-0061120084", "1960");
		System.out.println("Author updated ");
		System.out.println(library.getBooks().toString());

		library.removeBookUsingIsbnOrAuthor(null, "978-0743273565");
		System.out.println("Book removed ");

	}

}
