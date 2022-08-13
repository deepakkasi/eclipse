package set1;

import java.util.Scanner;

public class ReverseStringWithoutStatement
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String to be Reversed");
		Scanner sc =new Scanner(System.in);
		String orgstr=sc.nextLine();
		String[] words = orgstr.split(" ");
		String reversedstring ="";
		for(String w:words)
		{
			StringBuilder sb =new StringBuilder(w);
			sb.reverse();
			reversedstring = reversedstring+sb.toString()+" ";
		}
		System.out.println("The Reversed String : " + reversedstring.trim());
		
		

	}
	

}
