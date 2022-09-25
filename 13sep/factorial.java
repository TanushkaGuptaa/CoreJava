/*
Program : For loop : Factorial
5!= 1*2*3*4*5
@author: Tanushka Gupta
@date 13 sep 2022
*/
import java.util.Scanner;
import static java.lang.System.*;
class Factorial
{
	public static void main(String...args)
	{
		int i,num;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		out.println("Enter the number:");
		num= sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			out.println(i+""+num);
		}
		out.println("The factorial of" + num + "is:" + fact);
	}
}