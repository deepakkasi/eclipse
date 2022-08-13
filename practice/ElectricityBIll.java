package practice;

import java.util.Scanner;

public class ElectricityBIll 
{
	public static double bill(int unit)
	{
		double value;
		if (unit <201)
		{
			value=(unit-100)*1.5;
		}
		else if(unit>200 && unit<501)
		{
			value =(100*2)+(unit-200)*3;
		}
		else
		{
			value=(100*3.5)+300*4.6+(unit-500)*6.6;
		}
		
		return value;
		
	}

	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name :");		
		String name =sc.nextLine();
		System.out.println("Enter the unit");
		int unit =sc.nextInt();
		if(unit<=100)
		{
			System.out.println("Tamilnadu Electricity Board\nname:"+name+"ConsumerNumber: 10001"+"\nUsage :"+unit+"\nThe Generated Bill for "+name+" property is 0");
		}
		else
		{
		double value=bill(unit);
		System.out.println("Tamilnadu Electricity Board\nname:"+name+"ConsumerNumber: 10001"+"\nUsage :"+unit+"\nThe Generated Bill for "+name+" property is "+value);
		}
				

	}

}
