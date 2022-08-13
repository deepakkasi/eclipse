package practice;

import java.util.Scanner;

public class SumOfDigits {

	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 =sc.nextInt();
		int start=0,end=0,temp1=num1,temp2=num2,val=temp1,sum=0;boolean flag=false;
		while (num1!=0)
		{
			start=num1%10;	 //setting start
			break;
		}
		while (num2!=0)
		{
 			end=num2%10;	//setting end
			break;
		}		
		for(int i=0;i<2;i++)
		{			
			while(val!=0) 
			{ 
				if(i>0) 
				{ 	
					int rem =val/10;
					if(start>end)
					{
						for(int j=start;j>end;j++) // 9 to 1
						{ 
						    sum=sum+rem+j;
							if(j==9) 
							{	
							j=0;
							start=0;
							val=temp2;	
							}
						}
					}
					if(start<end)
					{		
						rem =val/10;
						for(int j=start;j<=end;j++) //1 to 9
						{ 
							sum=sum+rem+j;							
						}
					}
				}	
			break;	
			}	
		}System.out.println(sum);	
	}
}
