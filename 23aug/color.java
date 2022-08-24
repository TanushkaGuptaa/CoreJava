/*
	Program: Program to print elements of an a anonymous array using enhanced for loop 
	@author: Tanushka Gupta
	@Date  : 23 Aug 2022
*/


// Creating a class named EnhancedForLoop
class color{
	
	//Creating method for printing colors
	static void printColors(String colors []){
		
		// Printing colors from the provided array using enhanced for loop
		for(String color:colors){
			System.out.println(color);		
		}
	}
	
	// Calling the main method 
	public static void main(String args []){
		
		// calling the printColors method and passing a anonymous array as a argument 
		printColors(new String[]{"orange","greay","green","yellow","black"});
	}
}
