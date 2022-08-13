package practice;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=row;j++)
			{
				if(j>i)
				System.out.print(" ");	
				else
					System.out.print("*");
			}System.out.println();
		}
	}

}
