package edu.Practice;

public class CarMain {

	public static void main(String[] args) 
	{
		Driver d = new Driver();
		Car c =FactoryClass.getcar();
		d.driver(c);
		
		

	}

}
