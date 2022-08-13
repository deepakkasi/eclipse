package set1;

import java.util.Scanner;

public class OddNumbersInRange {

	public static void main(String[] deepak) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The Odd Numbers Between" + num1+" And "+num2+" is ");
		for(int i=num1;i<=num2;i++) 
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		
		}
		
		

	}

}
