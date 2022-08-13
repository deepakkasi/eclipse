package sort;

import java.util.Scanner;

public class Selection 
{
	public static int[] selectionSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[i],index=0;
			for(int j=i;j<a.length;j++)
			{
				if(min>a[j])
				{
					min =a[j];
					index=j;
				}
				
			}
			int temp =a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		
		return a;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int sortedArray[]=selectionSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(sortedArray[i]+ " ");
			
		}
		

	}

}
