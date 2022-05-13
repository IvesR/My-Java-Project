package as15;

public class Manager extends Employee
{
	private double pctBonus;
	private double travelExpense;
	
	public Manager(String n, double s, double pctB, double te) 
	{
		super(n,s);
		pctBonus=pctB;
		travelExpense=te;
	}
	public double getPctBonus() 
	{
		return pctBonus;
	}
	public double getTravelExpense() 
	{
		return travelExpense;
	}
	public double computeBonus() 
	{
		double bonus = (salary * pctBonus)+ 500;
		return bonus;
	}
}