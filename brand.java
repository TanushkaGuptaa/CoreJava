/*
program: write java program to check the tagline of the brand entered (take any 5 brands).
@Author:Tanushka Gupta
@Date: 18/08/2002
*/
class Brand
{
	//creating static method
	static void printTagline()
	{
		//int brand=5;
		String brand="Lenovo";
		switch (brand)    //(Tagline); //using switch case
		{
			//using different cases in switch case
			case "Hp":  
		
				System.out.println("They should make the world a better place.");	
			break;
			case "Apple": 
				System.out.println("Think different");
			break;
			case "Lenovo":
				System.out.println("Innovation Never Stands Still");
			break;
			case "Dell": 
				System.out.println("Innovation that stops at nothing");
			break;
			case "Microsoft":
			System.out.println("We believe in what people make possible.");
			break;
			//default value if conditions are not met
		default: System.out.println("only valid for - Hp,Apple,Lenovo,Dell and Microsoft");
		}
	}
	
public static void main(String args[])
{
	//for input of brand name and then printing it's tagline
	//System.output.println("the tagline of:"  +args[0] +"is" +printTagline()); 
	printTagline(); //calling static mehtod
}
}