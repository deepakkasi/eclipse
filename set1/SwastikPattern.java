package set1;

import java.util.Scanner;

public class SwastikPattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Note: For perfect Swastik Pattern Give Odd number. \nIf You Give Even number This Program Will Automatically Add Another Line");
		System.out.println();
		System.out.println("Enter The Value");
		int n =sc.nextInt();
		int row ;
		if (n%2==0) 
		{		
		
			row =n+1;
		}
		else
		{
			row =n;
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if (i==(row+1)/2 || j==(row+1)/2 ||(j==1 && i <=(row+1)/2) || (j==row && i >=(row+1)/2)|| (i==1 && j>=(row+1)/2) || (i==row && j <=(row+1)/2)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}System.out.println();
			
		}

	}

}
