package set1;
import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2");
		int num2=sc.nextInt();
		System.out.println("The natural Number Between " +num1 +" And "+ num2+ " is ");
		for(int i=num1;i<=num2;i++)
		{
			if (i>0) 
			{
				System.out.print( i + " ");
				
			}
		}

	}

}
