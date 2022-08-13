package sort;

import java.util.Scanner;

public class OddDecreaseEvenIncrease 
{
	public static int[] sort(int a[])
	{
		for(int i=0;i<a.length;i+=2)
		{
			for(int j=i+2;j<a.length;j+=2)
			{
				
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=1;i<a.length;i+=2)
		{
			for(int j=i+2;j<a.length;j+=2)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int size =sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int b[]=sort(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
			
		}


	}

}
