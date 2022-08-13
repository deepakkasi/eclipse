package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Alist 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			int elements=sc.nextInt();
			al.add(elements);
		}
		System.out.println(al);
		System.out.println(al.contains(5));
		al.remove(4);
		System.out.println(al);
		al.add(0, 11);
		System.out.println(al);
		System.out.println(al.contains(5));
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
