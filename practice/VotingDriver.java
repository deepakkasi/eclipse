package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingDriver {

	public static void main(String[] args)  throws NotEligible
	{
		Scanner ds=new Scanner(System.in);
		System.out.println("Enter the age");
		int age =ds.nextInt();
		Voting v=new Voting(age);
		try 
		{
			
			
			try {
				v.checkAge();
			}
			catch(NotEligible e)
			{
				System.out.println("Not eligible");
			}
			
		
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Invalid data");
			
		}
		finally
		{
			System.out.println("CONGRATULATION!");
		}
		
	
		
		

	}

}
