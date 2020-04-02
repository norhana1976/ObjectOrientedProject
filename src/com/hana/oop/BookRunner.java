package com.hana.oop;

public class BookRunner {
	public static void main(String[] args) {
		// declaring object/instances of the Book class
		// adding constructors to Book class
		// when adding constructors, we can set initial state of setNoOfCopies
		Book artofComputerProgramming = new Book(50);
		Book javaProgramming = new Book(30);
		Book cleanCode = new Book(0);
		
		//using the behaviour /action in class
		artofComputerProgramming.bookLeft("book1");
		//artofComputerProgramming.setNoOfCopies(50);		
		artofComputerProgramming.increaseBookCopies(50);
		artofComputerProgramming.decreaseBookCopies(10);
		
		javaProgramming.bookLeft("book2");
		//javaProgramming.setNoOfCopies(-10);
		javaProgramming.increaseBookCopies(50);
		javaProgramming.decreaseBookCopies(10);
		
		cleanCode.bookLeft("book3");
		//cleanCode.setNoOfCopies(1);
		cleanCode.increaseBookCopies(20);
		cleanCode.decreaseBookCopies(10);
		
		
		
	}
}
