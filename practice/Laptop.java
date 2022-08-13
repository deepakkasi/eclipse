package practice;

import java.util.Objects;

public class Laptop 
{
	private int id,ram;
	private double price;
	private String brand;
	Laptop(int id,int ram,double price, String brand)
	{
		this.id=id;
		this.ram=ram;
		this.price=price;
		this.brand=brand;
		
	}
	public int getId() {
		return id;
	}
	public int  getRam()
	{
		return ram;
	}
	public double getPrice()
	{
		return price;	
	}
	public String getBrand()
	{
		return brand;
	}
	@Override
	public String toString()
	{
		return "["+" id= "+id+" ram= "+ram+" price = "+price+" brand= "+brand+" ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, id, price, ram);
	}
	@Override
	public boolean equals(Object o)
	{
		Laptop l=(Laptop)o;
		return this.id==l.id && this.price==l.price&&this.ram==l.ram&&this.brand.equals(l.brand);
		
	}
}
