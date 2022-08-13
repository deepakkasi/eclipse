package set1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = sc.nextInt();
		int num=1,num2=row;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==j )
				{ 
					System.out.print(num++);
				}
				else if(i+j==row+1 )
				{	
					
					if(row%2==0)
					{
						if(j==i/2)
						{
						 num2--;
						 continue;
						}
					}
					else if(j==i/2)
					{
					 num2--;		 
					}
					
					System.out.print(num2--);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
