package as14;

import javax.swing.JOptionPane;

public class Student implements Status
{
	private int id;
	private String name;
	private int[]scores;
	
	public Student(int id, String n, int[]s) 
	{	
		//below id refers to local variable.
		//this.id refers to the instance variable.
		this.id = id;
		name = n;
		//create scores array of same length as s array
		scores = new int[s.length];	
		
		//copy contents form array s to scores
		System.arraycopy(s, 0, scores, 0, s.length);
	}	
	public int getId()
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public int[] getScores()
	{
		return scores.clone();
	}
	public String getStatus()
	{
		String status ="";
		status = "Student\nid="+id+", name="+name+", scores=";
		for(int i=0; i<scores.length; i++)
		{
			status=status+scores[i]+" ";
		}
		status = status+"\n";
		return status;
	}
	public void displayStatus()
	{
		String status=getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
	
}