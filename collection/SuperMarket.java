package collection;
import java.util.Scanner;
public class SuperMarket {
	static int minval;
	public static int checkPrice(int product[][],int input[])
	{
		int totalprod[][]=new int[product.length][product[0].length];
		for(int i=0;i<product.length;i++)
		{
			for(int j=0;j<totalprod[0].length;j++)
			{
				totalprod[i][j]= (product[i][j])*input[i];
			}
		}
		int sum[]=new int[totalprod[0].length];
		for(int i=0;i<totalprod[0].length;i++)
		{	
			int sum1=0;
			for(int j=0;j<totalprod.length;j++)
			{
				sum1=sum1+totalprod[j][i];
			}
			sum[i]=sum1;
		}
		int min=sum[0],columnindex=0;
		
		for(int i =1;i<sum.length;i++)
		{
			if(min>sum[i])
			{
				min=sum[i];
				columnindex=i;
			}
		}minval=min;
		return  columnindex;
		}
	public static int minValue()
	{
		return minval;
	}
	public static void main(String[] args) 
	{
		String [] portal= {"FreshToHome","BigBasket","Namdhari","FarmToHome","Fresh"};
		int product[][]={{800,850,799,750,1000},{200,200,199,190,350},{600,500,899,700,1100},{40,40,39,40,40},{60,50,49,55,78}};
		Scanner sc =new Scanner (System.in);
		int input[]=new int [5];
		boolean flag=false;
		System.out.println("Welcome to Ekart SuperMarket\n\n");
		System.out.println("===============================================================");
		while(!flag) 
		{
		System.out.println("Choose the  item : \n1.Meat\n2.Chicken\n3.Fish\n4.Milk\n5.Egg\n6.Exit");
		int item=sc.nextInt();		
		switch(item)
		{
		case 1:
			System.out.println("You choosed meat \nchoose the quantity in (kg):"); 
			input[0]=sc.nextInt();
			System.out.println("Meat added succesfully");
			System.out.println("===============================================================");
			break;
		case 2:
			System.out.println("You choosed chicken \nchoose the quantity in (kg):"); 
			input[1]=sc.nextInt();
			System.out.println("Chicken added succesfully");
			System.out.println("===============================================================");
			break;
		case 3:
			System.out.println("You choosed Fish \nchoose the quantity in (kg):"); 
			input[2]=sc.nextInt();
			System.out.println("Fish added succesfully");
			System.out.println("===============================================================");
			break;
		case 4:
			System.out.println("You choosed Milk \nchoose the quantity in (kg):"); 
			input[3]=sc.nextInt();
			System.out.println("Milk added succesfully");
			System.out.println("===============================================================");
			break;
		case 5:
			System.out.println("You choosed Egg \nchoose the quantity in (kg):"); 
			input[4]=sc.nextInt();
			System.out.println("Egg added succesfully");
			System.out.println("===============================================================");
			break;
		case 6:
			flag=true;
			System.out.println("Thankyou  for shopping");
			System.out.println("===============================================================");
			break;
			}	
		}
		int col=checkPrice(product,input);
		System.out.print(portal[col]+ " is the cheapest  rs "+minValue());
	}
}
