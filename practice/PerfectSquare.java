package practice;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PerfectSquare 
{
		public static boolean perfectSquare(int num) 
		{	
			int square;
			boolean flag=false;
			for(int i=1;i<num/2;i++)
			{
				square =i*i;
				if(square == num)
				{
					flag=true;
					break;
				}
			}
			return flag;
		}
public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag =perfectSquare(num);
		if(flag)
		{
			System.out.println("the number "+ num +" is perfect square" );
		}
		else
		{
			System.out.println(num +"not a perfect Square");
		}
	}
}
