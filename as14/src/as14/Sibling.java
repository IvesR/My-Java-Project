package as14;

import javax.swing.JOptionPane;

public class Sibling implements Status

{
	//instance variables
	private String name;
	private int age;
	private int weight;
	
	public Sibling (String n, int a, int w)
	{
		//constructor
		name=n;
		age=a;
		weight=w;
	}
	//accessor methods
	public String getName()
	{
		return name;
	
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getWeight()
	{
		return weight;
	}
	public String getStatus()
	{
		String status="";
		//add code
		status="Sibling\n name ="+name+", age ="+age+", weight ="+weight+"\n";
		return status;
	}
	public void displayStatus()
	{
		String status=getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
}