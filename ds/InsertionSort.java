package ds;

import java.util.Scanner;

public class InsertionSort 
{
	public static int[] sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else
					break;
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array:");
		Scanner sc =new Scanner (System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.print("Enter the elements\n");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=sort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		

	}

}
