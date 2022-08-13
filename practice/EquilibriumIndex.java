package practice;

import java.util.Scanner;

// Java program to find equilibrium
// index of an array
class EquilibriumIndex{

static int equilibrium(int a[], int n)
{
	if (n == 1)
		return (0);
	
	int[] front = new int[n];
	int[] back = new int[n];

	// Taking the prefixsum from front end array
	for (int i = 0; i < n; i++)
	{
		if (i != 0)
		{
			front[i] = front[i - 1] + a[i];
			
		}
		else
		{
			front[i] = a[i];
		}
	}
	
	// Taking the prefixsum from back end of array
	for (int i = n - 1; i > 0; i--)
	{
		if (i <= n - 2)
		{
			back[i] = back[i + 1] + a[i];
			System.out.println(front[i]);
		}
		else
		{
			back[i] = a[i];
		}
	}
	
	// Checking for equilibrium index by
	//comparing front and back sums
	for(int i = 0; i < n; i++)
	{
		
		
		//System.out.print(back[i]);
		if (front[i] == back[i])
		{
			return a[i];
		}
	}
	
	// If no equilibrium index found,then return -1
	return -1;
}

// Driver code
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size");
	int size =sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the value");
	for(int i=0;i<size;i++)
	{
	arr[i] = sc.nextInt();
	}
	int arr_size = arr.length;
	
	System.out.println("First Point of equilibrium " +
					"is at index " +
					equilibrium(arr, arr_size));
}
}

// This code is contributed by Lovish Aggarwal
