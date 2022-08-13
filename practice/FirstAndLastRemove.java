package practice;

import java.util.Scanner;

public class FirstAndLastRemove {
	public static String reverse(String s,int start,int length)
	{
		String s1="";	
		int a=0,i;

		for(i=0;i<s.length();i++)
		{	s1="";
			
			for(int j=start;j<length;j++)
			{
								
				s1=s1+s.charAt(j);
				
				
			}
			System.out.println(s1);
		
			if(a%2==1)
				start =start+1;
				
			else
				length=length-1;
			a++;
			//System.out.println(start);
			//System.out.println(length);
		
		}
		if(i<s.length())
		return reverse(s1,start,length);
		else
			return s1;
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		String s=sc.next();
		String a= reverse(s,0,s.length());
	}

}
