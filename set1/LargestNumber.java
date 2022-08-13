//Write a Program to Find the Greatest and smallest Number using Ternary Operator
package set1;
import java.util.Scanner;

public    class LargestNumber {
	
	 public  static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value 1");
		int num1 =sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 =sc.nextInt();
	
		System.out.println((num1>num2)? "Num1 is Greater \nNum2 is Smaller": "Num2 is greater \nNum1 is Smaller");
		

	}

}
