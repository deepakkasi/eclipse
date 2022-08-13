package sort;

import java.util.Scanner;

public class Bubble {
	public static int [] bubbleSort(int a[])
	{
		for (int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				else
					continue;
				
			}
		}
		
		return a;
		
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size =sc.nextInt();
		int [] a=new int[size];
		System.out.print("ENTER THE ELEMENT\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("After sorting");
		int sortedArray[]=bubbleSort(a);
		System.out.print("[");
		for(int i=0;i<sortedArray.length;i++)
		{
		System.out.print(sortedArray[i]+" ");
		}
		System.out.println("]");

	}

}
