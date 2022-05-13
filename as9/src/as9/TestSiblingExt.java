package as9;

import javax.swing.JOptionPane;

public class TestSiblingExt {

	public static void main(String[] args) 
	{
		String in, out, name;

		int age, weight, height;

		 
		//Create SiblingExt references

		SiblingExt sibe1, sibe2, sibe3;

		// input name, age, weight, height values for first SiblingExt object

		name=JOptionPane.showInputDialog("Enter name");

		in=JOptionPane.showInputDialog("Enter age");

		age=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter weight");

		weight=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter height");

		height=Integer.parseInt(in);

		//Create the first SiblingExt object

		sibe1 = new SiblingExt (name, age, weight, height);

		 
		// input name, age, weight, height values for second SiblingExt object

		name=JOptionPane.showInputDialog("Enter name");

		in=JOptionPane.showInputDialog("Enter age");

		age=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter weight");

		weight=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter height");

		height=Integer.parseInt(in);

		//Create the second SiblingExt object

		sibe2 = new SiblingExt (name, age, weight, height);

		 
		// input name, age, weight, height values for third SiblingExt object

		name=JOptionPane.showInputDialog("Enter name");

		in=JOptionPane.showInputDialog("Enter age");

		age=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter weight");

		weight=Integer.parseInt(in);

		in=JOptionPane.showInputDialog("Enter height");

		height=Integer.parseInt(in);

		//Create the third SiblingExt object

		sibe3 = new SiblingExt (name, age, weight, height);
		
		//create SiblingExt references

		SiblingExt youngest=null, lightest=null, tallest=null;

		 
		//Find the youngest

		if (sibe1.getAge()<= sibe2.getAge() && sibe1.getAge()<= sibe3.getAge())

		 {
			youngest=sibe1;

		 }

		else if (sibe2.getAge()<= sibe1.getAge() && sibe2.getAge()<= sibe3.getAge())

		 {
		      youngest=sibe2;
		 }
		else
		 {
		      youngest=sibe3;
		 }

		//Find the lightest

		 if (sibe1.getWeight()<= sibe2.getWeight() && sibe1.getWeight()<=sibe3.getWeight())
			 
		 {			 
			 lightest=sibe1;			 
		 }
		 
		 else if (sibe2.getWeight()<= sibe1.getWeight() && sibe2.getWeight()<=sibe3.getWeight())
			 
		 {			 
			 lightest=sibe2;			 
		 }
		 
		 else
			 
		 {			 
			 lightest=sibe3;
		 }

		//Find the tallest
		 
		 if(sibe1.getHeight()<=sibe2.getHeight() && sibe1.getHeight()<=sibe3.getHeight())
			 
		 {			 
			 tallest=sibe1;			 
		 }
		  
		 else
			 
		 {			 
			 tallest=sibe3;
		 }
		 

		//Build output in string out
		 

		out = "";		
		out = out + "The Youngest Sibling: " + 
				youngest.getName() + " " +
				youngest.getAge() + " " +
				youngest.getWeight() + " " +
				youngest.getHeight() + " \n";
		
		out = out + "The Lightest Sibling: " +
				lightest.getName() + " " +
				lightest.getAge() + " " + 
				lightest.getWeight() + " " + 
				lightest.getHeight() + " \n";
		
		out = out + "The Tallest Sibling: " + 
				tallest.getName() + " " + 
				tallest.getAge() + " " +
				tallest.getWeight() + " " + 
				tallest.getHeight() + " \n";

		//display output

		JOptionPane.showMessageDialog(null, out);		            

	}

}
