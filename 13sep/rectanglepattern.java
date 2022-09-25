
/*
Program :- Print Rectangle Pattern
*****
*****
*****
*****
@author:- Tanushka Gupta
@date - 12-Sep-2022 
 */
import static java.lang.System.*;
import java.util.Scanner;
class Rectangle
    {
    public static void main(String args[]) 
    {
       int i,j,row,n;
       Scanner sc = new Scanner(System.in);
       out.println("Enter number of rows:");
       row = sc.nextInt();//new input user value for row
       out.println("Enter number of coloumns:");
	   n = sc.nextInt();
	   for(i=0; i<row;i++)//outer loop
	   {
		   for(j=0; j<=n;j++)//inner loop
		   {
			   out.print("*");// print star
		   }
		   out.println(" ");//print space
	   }
   }
}
