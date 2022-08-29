/*
	Program: Creating a book class  
	@author: Tanushka Gupta
	@Date  : 29 Aug 2022
*/
	
// importing all method from system class
import static java.lang.System.*;

//Creating a class named book 
class Book
{
	// instance variables
	String bookName;
	String bookAuthor;
	int bookPrice;
	int bookRating;
	int bookPages;
	
	// creating getBookData method
	void getBookData(){
		// printing book data
		out.println("Book name : "+bookName);
		out.println("Book author : "+bookAuthor);		
		out.println("Book prize : "+bookPrice+"rs");
		out.println("Book rating : "+bookRating);
		out.println("Book pages : "+bookPages);
	}
	// Creating inputDetails method
	void inputDetails(){
		// initializing values
		bookName="Ramayn";
		bookAuthor="Tanushka";
		bookPrice=200;
		bookRating=5;
		bookPages=400;
	}
	
	//calling main method
	public static void main(String...args){
		// creating new book object
		Book harryPotter=new Book();
		
		// calling getBookData method
		harryPotter.inputDetails();
		
		
		// calling getBookData method
		harryPotter.getBookData();
		
	}
}