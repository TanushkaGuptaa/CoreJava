/*Program :- Trenary Operator (Symbol (?:))
@author:- Tanushka Gupta
@date - 12-Sep-2022 
*/
import java.util.Scanner;

class Ternary {
  public static void main(String[] args) {
    
    // take input from users
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your marks: ");
    double marks = input.nextDouble();

    // ternary operator checks if
    // marks is greater than 40
    String result = (marks > 40) ? "pass" : "fail";

    System.out.println("You " + result + " the exam.");
    input.close();
  }
}