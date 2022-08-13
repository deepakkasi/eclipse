package ds;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Paranthesis 
{
	public static boolean isBalanced(String s)
	{
		Stack <Character>stack =new Stack<Character>();
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{
				stack.push(c);
				continue;
			}
			if(stack.isEmpty())
				return false;
			switch(c)
			{
			case ')':
				if(!stack.peek().equals('('))
					return false;
				stack.pop();
				break;
				
			case '}':
				if(!stack.peek().equals('{'))
					return false;
				stack.pop();
				break;
			case ']':
				if(!stack.peek().equals('['))
					return false;
				stack.pop();
				break;
			}
		}return(stack.isEmpty());
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String input= sc.nextLine();
		boolean flag=isBalanced(input);
		if(flag)
		{
			System.out.println("it is balanced");
		}
		else
			System.out.println("not balanced");
		}

}
