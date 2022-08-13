package practice;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int [][]a=new int[size][size];
	int [][]t=new int[size][size];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[0].length;j++)
		{	
			a[i][j]=sc.nextInt() ;
					
		}
	}
	for(int i=0;i<t.length;i++) 
	{
		for(int j=0;j<t[0].length;j++)
		{
			t[i][j]=a[j][i];
		}
	}
	System.out.println("TRANSPOSED MATRIX \n");
	for(int i=0;i<t.length;i++)
	{
		for(int j=0;j<t.length;j++)
		{
			System.out.print(t[i][j]+" ");
			if(j==size-1)
			System.out.println();
		}

	}
	
	
	}

}
