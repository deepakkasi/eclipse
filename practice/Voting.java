package practice;

public class Voting  
{
	int age;
	Voting(int age)
	{
		this.age=age;
	}
	public void checkAge() throws NotEligible
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new NotEligible();
		}
	}
}
