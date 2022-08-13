import java.util.Scanner;

public class WordsDuplicate {

	public static String[] duplicateString(String s)
	{	
		String s3 =s.toLowerCase();
		String s1[]=s3.split(" ");
		int a[]=new int [s1.length];
		int count=0;
		for(int i=0;i<s1.length;i++)
		{	a[i]=1;
			for(int j=i+1;j<s1.length;j++) 
			{
				if(s1[i].equals(s1[j]) && s1[i]!="0")
				{
					a[i]++;
					s1[j]="0";
					count++;
				}
			}
		}
		int temp=0;
		String s2[]=new String[count];
		for(int i=0;i<s1.length;i++)
		{
			if(a[i]>1 && s1[i]!="0") 
			{
			s2[temp++]=s1[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String s =sc.nextLine();
		String s1[] =duplicateString(s);
		for(int i=0;i<s1.length;i++)
		{
			System.out.println("the duplicate string is " + s1[i]);
		}
	}

}
