package as15;

public class Worker extends Employee
{
	private double pctBonus;
	public Worker(String n, double s,double pctB) {
		super(n,s);
		pctBonus=pctB;
	}
	public double getPctBonus() {
		return pctBonus;
	}
	public double computeBonus() {
		double bonus = salary * pctBonus;
		return bonus;
	}
}