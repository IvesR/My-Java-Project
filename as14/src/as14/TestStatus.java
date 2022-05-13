package as14;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStatus {

	public static void main(String[] args)
	{
		String in, out;
		//create an array of 6 status reference
		Status[]status = new Status[6];
		//create a statusIndex to index into status array
		int statusIndex=0;
		
		//create three Rectangle objects and store their reference in status array
	
		for(int i=0; i<3; i++)
		{
			// first object
			in = JOptionPane.showInputDialog("Enter length");
			int length=Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter width");
			int width =Integer.parseInt(in);
			
			//create a Rectangle object and store its reference in status array
			status[statusIndex]=new Rectangle(length, width);
			statusIndex++;
		}
		
		//create two Sibling objects and store their reference in status array
		
		for (int i=0; i<2; i++)
		{
		
			String name = JOptionPane.showInputDialog("Enter name");			
			in = JOptionPane.showInputDialog("Enter age");
			int age = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter weight");
			int weight = Integer.parseInt(in);
			
			//create a Sibling object and store its reference in status array
			status[statusIndex]= new Sibling(name,age, weight);
			statusIndex++;			
		}
		
		//create one Student object and store its reference in status array
	
		for(int i=0; i<1; i++)
		{
			in = JOptionPane.showInputDialog("Enter Data for one Student Object:");
			
			String delim=",";
			String token;
			StringTokenizer st = new StringTokenizer(in,delim);
			token = st.nextToken().trim();
			
			int id = Integer.parseInt(token);
			String name = st.nextToken().trim();
			token = st.nextToken().trim();
			int nExams = Integer.parseInt(token);
			int[]scores = new int[nExams];
			 for(int j=0; j<scores.length; j++) {
				 token = st.nextToken().trim();
				 scores [j] = Integer.parseInt(token);
			 }
           
			//create a Student object and store its reference in status array
			status[statusIndex]= new Student(id, name, scores);
			statusIndex++;
			  
			
		}
		//First Polymorphic Loop
		//call displayStatus()in a loop as show below
		for(int index=0; index<status.length; index++)
		{
			status[index].displayStatus();
		}
		//Second Polumorphic loop
		//call getStatus() in a loop, display the accumulated output as show below.
		//after exiting from the loop, display the accumulated output.
		String out1 ="";
		for(int index=0; index<status.length; index++)
		{
			out1 = out1 + status[index].getStatus();
		}
		JOptionPane.showMessageDialog(null, out1);
	}

}