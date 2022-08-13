//Print all Alphabets  A=65,Z=90,a=97,z=122;
package set1;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PrintAlpha {

	public static void main(String[] args) 
	{ 
		
		System.out.println("UpperCase");
		for(int i=65;i<=90;i++) 
		{
			System.out.print((char)i);
			
		}
		System.out.println();
		System.out.println("LowerCase");
		for(int j = 97;j<=122;j++)
		{
			System.out.print((char)j);
			
		}
		System.out.println();
		System.out.println("using Char");
		for(char c='A';c <='Z';c++)
		{
			System.out.print(c);
		}
		System.out.println();
		System.out.println("using char");
		for (char d='a';d<='z';d++)
		{
			System.out.print(d);
		}

	}

}
