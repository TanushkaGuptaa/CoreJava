/*
Program: Elgibility for college
@author: Tanushka Gupta
@date: 9th sept 2022
*/
// Importing Scanner class to
// take input from th user
import java.util.Scanner;
 
// declaring Class
import java.util.*;
class Eligibilty
{
	//declraing main method
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter Marks in Math:");
int mathMarks=scan.nextInt();
System.out.print("Enter Marks in Physics:");
int phyMarks=scan.nextInt();
System.out.print("Enter Marks in Chemistry:");
int chemMarks=scan.nextInt();
if (mathMarks >= 60) {
if (phyMarks >= 50) {
if (chemMarks >= 40) {
if (((mathMarks + phyMarks + chemMarks) >=200) || ((mathMarks + phyMarks) >=150)) {
System.out.println("you are not Eligible college");
}
}
}
}
else
{
System.out.println("you are not Eligible for college");
}
}
}