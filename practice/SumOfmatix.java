package practice;

import java.util.Scanner;

public class SumOfmatix 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size=sc.nextInt();
		int [][]a =new int [size][size];
		int [][]b=new int[size][size];
		System.out.print("ENTER THE VALUE FOR FIRST MATRIX\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
			
		}
		System.out.print("\nENTER THE VALUE FOR SECOND MATRIX\n");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.print("\nSum of matrix is \n");
		int c[][]=new int[size][size];
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=0;j<c[0].length;j++)
			{				
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				if(j==size-1 ) {		
					System.out.println();
				}
				
			}
			

	}

}
}
