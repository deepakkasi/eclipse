package edu.Practice;

public interface Car {
	void start();
	void move();
	void stop();

}
class BMW implements Car
{	@Override
	public void start() 
	{
	System.out.println("Bmw Has Started");
	}
	@Override
	public void move() {
		System.out.println("Bmw Has Moved");
	}
	@Override
	public void stop() {
		System.out.println("Bmw Has Stoped");
	}
	
}
class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Benz Has Started");
		
	}

	@Override
	public void move() {
		System.out.println("Benz Has Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Benz Has Started");
		
	}
	
}


