package set1;

import java.util.Scanner;

public class DuplicateCharacter {
	public static char[] duplicateCharacters(String s) 
	{
		char[]c=s.toCharArray();
		int a[]=new int[c.length];
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			a[i]=1;
			for(int j=i+1;j<c.length;j++)
			{
				if (c[i]==c[j]&&c[i] !=' '&&c[i]!='0') 
				{
					a[i]++;
					c[j]='0';
					count++;
				}
			}
		}
		char c2[]=new char[count];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>1)
			c2[temp++]=c[i];
		}
		return c2;
		
	}

	public static void main(String[] args) 
	{	System.out.println("Enter the string");
		Scanner sc =new Scanner(System.in);
	
		String s=sc.nextLine();
		char c1[]=duplicateCharacters(s);
		for(int i =0;i<c1.length;i++)
		{
			System.out.println("The Duplicate charater is "+c1[i] + " ");
		}
		

	}

}
