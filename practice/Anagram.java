package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean  isAnagram(String s1,String s2)
	{
		boolean flag=true;
		String str1=s1.replaceAll(" ", "");
		String str2 =s2.replaceAll(" ", "");
		if(str1.length()!=str2.length())
		{
			flag=false;
		}
		else {
			
		char c1[]=str1.toLowerCase().toCharArray();
		char c2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		flag=Arrays.equals(c1, c2);
		
		}
		return flag;
				
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.nextLine();
		System.out.println("ENter the second String");
		String s2=sc.nextLine();
		boolean flag=isAnagram(s1,s2);
		if(flag)
		{
			System.out.println("it is  anagram");
		}
		else
		{
			System.out.println("it is not an anagram");
		}
	}

}
