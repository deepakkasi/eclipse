package set1;

import java.util.Scanner;

public class MaxMinTimesOfChar {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String : ");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char c[] = s.toCharArray();
		int a[]=new int[s.length()];
		for(int i =0 ;i<c.length;i++)
		{	a[i]=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[i]!=' '&& c[i]!='0')
				{
					a[i]++;
					c[j]='0';
				}
			}
		}
		int max =a[0],min=a[0],index=0,index1=0;
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				index=i;
			}

			if(min>a[i])
			{
				min=a[i];
				index1=i;
			}
		}
		System.out.println("The Maximum Occuring Character is "+ c[index]+" And Number Of Times Is "+max);
		System.out.println("The Minimum Occuring Character is "+ c[index1]+" And Number Of Times Is "+min);
		

	}

}
