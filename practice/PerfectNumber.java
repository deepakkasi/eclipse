package practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void perfectNumber(int num1)
	{
		int sum=0;
		//boolean flag=false;
		for(int i=1;i<=num1/2;i++)
		{
			if(num1%i==0)
			{
				sum =sum+i;
				
			}
		}
		if(sum==num1)
		{	
			System.out.println("This number"+ num1+" is a perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
		
	}

	public static void main(String[] args) 
		{
			Scanner sc =new Scanner(System.in);
			int num=sc.nextInt();
			perfectNumber(num);
			
		}

}
