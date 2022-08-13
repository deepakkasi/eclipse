package set1;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		String str []= {"java","mava","c","c++","java","c++"};
		for(int i =0;i< str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
				
			{
				if (str[i]==str[j]) 
				{
					System.out.println("Duplicate value "+str[i]);
					
				}
				
			}
			
		}

	}

}
