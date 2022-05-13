package as15;

public abstract class Employee 
{
	protected String name;
	protected double salary;
	
	public Employee (String n, double s) 
	{
		name =n;
		salary =s;
	}
	public String getName() 
	{
		return name;
	}
	public double getSalary() 
	{
		return salary;
	}
	//abstract method
	public abstract double computeBonus();
}
