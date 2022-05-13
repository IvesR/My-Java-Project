package as4;

public class Rectangle 
{
	
	// instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle (double l, double w)
	
	{
		//initialize instance variables using the parameters received in the constructor
		length = l;
		width = w;
	}
	 //accessor methods
	public double getLength()
	
	{
		return length;
	}
	
	//other instance medthods
	public double getWidth()
	
	{
		return width;
	}
	
	public double computeArea()
	
	{
		double a=0;
		a = length * width;
		return a;
	}
	
	public double computePerim()
	{
		double p=0;
		p = 2 * (length + width);
		return p;
	}

}