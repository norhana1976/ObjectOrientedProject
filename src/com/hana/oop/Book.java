package com.hana.oop;

public class Book {

	//state
	private int noOfCopies; //member variable
	
	// using constructors to set the noOfCopies
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	
	// what are the actions we want to do for Book class?
	// getNoOfCopies, setNoOfCopies, increaseBookCopies, bookLeft
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		if(this.noOfCopies > 0) {
		System.out.println(this.noOfCopies);
		}
		else {
			System.out.println(this.noOfCopies+" - Need to re-stock!");
		}
	}
	
	public void increaseBookCopies(int howMuch) {
		//this.noOfCopies = this.noOfCopies + howMuch;
		//System.out.println("Increase to "+this.noOfCopies);
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseBookCopies(int howMuch) {
		//this.noOfCopies = this.noOfCopies + howMuch;
		//System.out.println("Increase to "+this.noOfCopies);
		setNoOfCopies(this.noOfCopies - howMuch);
	}

	void bookLeft(String bookname) {
	System.out.println("How many copies this "+ bookname +" has left?");
	}
}
