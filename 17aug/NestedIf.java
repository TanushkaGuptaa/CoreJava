/*
 Program: Nested If
 @author: Tanushka Gupta
 @Date: 17 august 2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks=75.9f;
		float pcmMarks=87.9f;
		if(totalMarks>78)
		{
			if(pcmMarks>50)
				System.out.println("---You are eligible for our college(B.Sc)----");
			else
				System.out.println("---You are eligible for our college(BCA)----");
				
		}
		else
			System.out.println("---You are not eligible for our university---------");
		System.out.println("---Thank You !----");
		
		
	}	
	public static void main(String args[])
	{
		takeAdmission();
		
	}
	
}