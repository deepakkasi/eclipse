package practice;

import java.util.Objects;

public class Phone  implements Comparable
{
	private int id,ram;
	private double price;
	private String brand;
	Phone(int id,int ram,double price, String brand)
	{
		this.id=id;
		this.ram=ram;
		this.price=price;
		this.brand=brand;
		
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
		Phone p=(Phone)o;
		return this.id==p.id && this.price==p.price&&this.ram==p.ram&&this.brand.equals(p.brand);
		
	}
	@Override
	public  int  compareTo(Object o)
	{
		Phone p=(Phone)o;
		if(this.id >p.id)
		return 1;
		else if (this.id == p.id)
			return 0;
		else
			return -2;
	}
	
	
}
