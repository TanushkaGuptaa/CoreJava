/*
Program: prime number using While Loop
@author: Abhishek Sharma
@date: 13th sept 2022
*/
import static java.lang.System.*;
import java.util.Scanner;
class primenum
    {
    public static void main(String args[]) 
    {
       int i,j,row;
       Scanner sc = new Scanner(System.in);
       out.println("Enter number:");
       row = sc.nextInt();//new input user value for row
       i=1;
       j=0;
       while(i<=row)
       {
           if((row%i)==0)
               j=j+1;
               i++;
       }
       if(j==2)
           out.println(row+"is  prime");
       else
           out.println(row+"is not prime");
   }
}
