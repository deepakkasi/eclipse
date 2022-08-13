package practice;

import java.util.Scanner;

public class ArmStrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int num1 = num;
		int num2=num;
		int count=0;
		
		int sum=0;
		while(num1!=0)
		{
			count++;
			num1/=10;
		}
		while(num2!=0) 
		{
			int rem=num2%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*rem;
				
			}num2/=10;
			sum=sum+prod;
		}
		if(sum==num)
		{
			System.out.println("The Number "+ num + " is Armstrong NUmber");
		}
		else
		{
			System.out.println("It is Not a ArmstrongNumber");
		}
	}

}
