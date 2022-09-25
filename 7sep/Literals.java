/*
program: Underscore Of literals
@author: Tanushka Gupta
@date: 7-Sep-2022 
*/
//declaring class
class NumericLiteral 
{  
	//calling main method
    public static void main(String[] args) 
	{  
        // Underscore in integral literal  
        int a = 10_00000;  
        System.out.println("a = "+a);  
        // Underscore in floating literal  
        float b = 10.5_000f;  
        System.out.println("b = "+b);  
        // Underscore in binary literal  
        int c = 0B10_10;  
        System.out.println("c = "+c);  
        // Underscore in hexadecimal literal  
        int d = 0x1_1;  
        System.out.println("d = "+d);  
        // Underscore in octal literal  
        int e = 01_1;  
        System.out.println("e = "+e);  
		int num= 5_4_8;
		System.out.println("Value: "+num);
    }  
}  