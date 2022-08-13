package practice;

import java.util.Arrays;

public class LaptopDriver {

	public static void main(String[] args) 
	{
		Laptop l[]= {new Laptop(10,4,10000,"lenova"),new Laptop(7,3,8000,"mi"),new Laptop(11,6,50000,"hp"),new Laptop(8,8,180000,"dell"),new Laptop(1,16,20000,"mac")};
		System.out.println("BEFORE SORTING");
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
		Arrays.sort(l,new CompareById());
		System.out.println("SORTED BY ID ");
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}

	}

}
