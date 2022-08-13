package set1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the String to be Reversed");
		Scanner sc =new Scanner(System.in);
		String n=sc.nextLine();
		StringBuilder s=new StringBuilder(n);
		StringBuilder rs=new StringBuilder("");
		for(int i=s.length()-1;i>=0;i--)
		{
			rs.append(s.charAt(i));
			
		}System.out.println(rs);

	}

}
