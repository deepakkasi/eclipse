package edu.Practice;
import java.util.Scanner;
public class FactoryClass {
	
	public static Car getcar() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Car Name");
	String carname = sc.next();
	if (carname.equals("BMW")) {
		return new BMW();
		
	}
	else if (carname.equals("Benz")) 
	{
		return new Benz();
		
	}
	else 
	{ 
		return null;
		
	}
	
	}
}
