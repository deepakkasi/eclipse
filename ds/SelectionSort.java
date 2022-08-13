package ds;

import java.util.Scanner;

public class SelectionSort 
{	public  int[] selectionSort(int arr[])

	{
	
	for(int i=0;i<arr.length;i++)
	{int min=arr[i],index=i;
		
		for(int j=i+1;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				index=j;
			}
			
			
		}
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
		
	}
	return arr;
	
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		SelectionSort s=new SelectionSort();
		int []res=s.selectionSort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
