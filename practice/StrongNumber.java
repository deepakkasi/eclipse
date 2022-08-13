package practice;

import java.util.Scanner;

public class StrongNumber 
{
	public static boolean strongNum(int num)
	{
		int num1=num,rem,sum=0;
		boolean flag=false;
		while(num1!=0) 
		{
			int fact=1;
			rem=num1%10;			
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			num1/=10;
			sum =sum+fact;			
		}
		if(sum==num)
		{
			flag=true;
		}
		return flag;
	}

	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		boolean pin=strongNum(num);
		if(pin)
		{
			System.out.println("The number  "+num+" StrongNumber" );
		}
		else
		{
			System.out.println(num+" not a Strong number");
		}
		
	}

}
