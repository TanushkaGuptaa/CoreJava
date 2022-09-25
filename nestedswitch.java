 class NestedSwitchExample {    
    static void Nested()  
      {  
      //C - CSE, E - ECE, M - Mechanical  
        char branch = 'C';                 
        int collegeYear = 4;  
        switch( collegeYear )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case 'C' ->System.out.println("Operating System, Java, Data Structure");   
                    case 'E' ->System.out.println("Micro processors, Logic switching theory");   
                    case 'M' ->System.out.println("Drawing, Manufacturing Machines");   
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C' ->System.out.println("Computer Organization, MultiMedia"); 
                    case 'E' ->System.out.println("Fundamentals of Logic Design, Microelectronics"); 
                    case 'M' ->System.out.println("Internal Combustion Engines, Mechanical Vibration");
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C' ->System.out.println("Data Communication and Networks, MultiMedia");  
                    case 'E' ->System.out.println("Embedded System, Image Processing");
                    case 'M'->System.out.println("Production Technology, Thermal Engineering");    
                }  
                break;  
        }  
    }  
	public static void main(String args[])
	{
		Nested();
	}
}