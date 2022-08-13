package practice;

import java.util.Arrays;

public class PhoneDriver {

	public static void main(String[] args) {
		Phone p[]= {new Phone(10,4,10000,"oppo"),new Phone(7,3,8000,"mi"),new Phone(11,6,50000,"vivo"),new Phone(8,8,180000,"realme"),new Phone(1,16,20000,"apple")};
		System.out.println("BEFORE SORTING");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		Arrays.sort(p);
		System.out.println("SORTED BY ID ");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}

}