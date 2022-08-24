/*
	Program: Program to find minimum number in a array
	@author: Tanushaka Gupta
	@Date  : 23 Aug 2022
*/

// Creating a class named MinimumNumber
class MinimumNumber{
	
	// Creating getMiniumNumber method and setting the return type as int
	static int getMiniumNumber(){
		// Provided array 
		int [] arr={6,8,9,7,6,5,4,3,5,};	
		
		// Minimum number variable
		int minNum=100;
		
		// Traversing the array 
		for(int i=0;i<=arr.length-1;i++){
			// if element is less than minimum number set that element as minimum number
			if(minNum>arr[i]){
				minNum=arr[i];
			}
		}
		
		// return minimum number
		return minNum;
	}
	
	// calling the main method 
	public static void main(String args []){
		
		// printing the minimum number 
		System.out.println("The minimum number is : " + getMiniumNumber());
	}
}