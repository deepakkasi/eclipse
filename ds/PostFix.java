package ds;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input =sc.nextLine();
		Stack <Integer> stack=new Stack<Integer>();
		for (int i=0;i<input.length();i++)
		{
		char c =input.charAt(i);
		if(c>='1' && c<='9')
		{
			stack.push((Character.getNumericValue(c)));
		}
		else
		{
			int val1=stack.pop();
			int val2=stack.pop();
			switch(c)
			{
			case '+':
				stack.push(val2+val1);
				break;
			case '-':
				stack.push(val2-val1);
				break;
			case '/':
				stack.push(val2/val1);
				break;
			case '*':
				stack.push(val2/val1);
				break;
			case '%':
				stack.push(val2%val1);
				break;
			default:
				System.out.println("Invalid data");
			
			}	
		
		}

	}System.out.println(stack.pop()); 

}
}
