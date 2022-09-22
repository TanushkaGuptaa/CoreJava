/*
Program:  Data types in java
@author: Tanushka gupta
@date: 6th sept 2022

*/
import static java.lang.System.*;
//declaring class
class DataTypeDemo
{
		//calling main method
		static int number;
	public static void main(String args[])
	{	
		
		int number =134;
		short value= (short) -32770; //typecasting
		float marks= 56.6f;
		double percentage= 87.123; 
		char grade= 'A';
		long hugeNumber= 989895609584l;
		boolean status= true;
		byte b= (byte) number; //typecasting (byte range is -128 to 127 so if you write grater number it goes in -)
		String  Name= "Tanushka"; //  string is a class from java.lang.string
		
		out.println("The value of int is: "+number); 			  //Printing Integer value
		out.println("The value of number is: "+value);			 //Printing short value
		out.println("The value of marks is: "+marks);			 //Printing float value
		out.println("The value of percentage is: "+percentage);  //Printing double value
		out.println("The value of grade is: "+grade); 			//Printing character value
		out.println("The value of hugeNumber is: "+hugeNumber); //Printing long value
		out.println("The value of status is: "+status);		 //Printing boolean value
		out.println("The value of b is: "+b);				//Printing byte value
		out.println("The value of String is: "+Name); //Printing string value
		
	}
}