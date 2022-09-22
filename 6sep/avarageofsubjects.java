/*
Program: Average of 4subjects
@author: Tanushka Gupta
@date: 6th sept 2022
*/

//declaring class
class AverageDemo
{
		//calling main method
	
	public static void main(String args[])
	{	
		float marks1= Float.parseFloat(args[0]);
		float marks2= Float.parseFloat(args[1]);
		float marks3= Float.parseFloat(args[2]);
		float marks4= Float.parseFloat(args[3]);
		
		float averageMarks= (marks1+marks2+marks3+marks4)/3;
		
		System.out.println("Average marks are: "+averageMarks);
	
	}
}