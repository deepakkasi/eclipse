package sort;

import java.util.Scanner;

public class ReverseWords 
{
	public static String[] rev(String s[])
	{
		
		return rev(s.substring((s.length)-1,0));
	}

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String input = sc.nextLine();
	String [] s=input.split(" ");
	int length =s.length;
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.print(s[i]+" ");
	}
	String l[]=rev(s);
	

	}

}
