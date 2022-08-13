package sort;

import java.util.Scanner;

public class Insertion {
	public int[] getSort(int a[])
	{
		for (int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1]) // Ascending for Descending change it to > 
				{
					int temp =a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
				else
					break;
				
			}
			
		}
		
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		Insertion in=new Insertion();
		int b[]=in.getSort(a);
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j] + " ");
		}
		

	}

}
