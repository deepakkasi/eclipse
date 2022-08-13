package set1;

import java.util.Scanner;

public class LargestAndSmallestWords
{
	public static void largest(String s) 
	{
		String s1[]=s.split(" ");
		String max=s1[0];
		String min=s1[0];
		for(int i=1;i<s1.length;i++)
		{
			
			if( max.length() <s1[i].length() )
			{
				max=s1[i];
				
			}
			
			if( min.length()> s1[i].length()  )
			{
				min=s1[i];
				
			}
			
		
			
		}
		System.out.println("The largest word is with the length of " + max.length() +" "+ max);
		System.out.println("The Smallest word is with the length of " + min.length() + " " + min);
		
	}

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the string ");
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		largest(s);
		
	}

}
