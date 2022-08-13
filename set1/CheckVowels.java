package set1;
import java.util.Scanner;
public class CheckVowels 
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Value");
		char c = sc.next().charAt(0);
		if (c =='A' || c =='E' || c=='I' || c=='O' || c=='U'|| c =='a' || c =='e' || c=='i' || c=='o' || c=='u'  ) 
		{
			System.out.println("It is Vowels");
		}
		else
			{
			System.out.println("It is consonant");
		
			}
		
	}
	

}
