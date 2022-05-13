package as5;

import javax.swing.JOptionPane;

public class TestSibling {

	public static void main(String[] args) {
		String in, out, name;
		int age, weight;
		
		Sibling sib1, sib2, sib3;
		
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age");
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in);
		
		sib1 = new Sibling(name, age, weight);
		
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age");
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in);
		
		sib2 = new Sibling(name, age, weight);
		
		name=JOptionPane.showInputDialog("Enter name");
		in=JOptionPane.showInputDialog("Enter age");
		age=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter weight");
		weight=Integer.parseInt(in);
		
		sib3 = new Sibling(name, age, weight);
		
		Sibling youngest=null, lightest=null;
		
		// find youngest
		
		if(sib1.getAge()<=sib2.getAge() && sib1.getAge()<=sib3.getAge())
		{
			youngest=sib1;
		}
		else if(sib2.getAge()<=sib1.getAge() && sib2.getAge()<=sib3.getAge())
		{
			youngest=sib2;
		}
		else
		{
			youngest=sib3;
		}
		
		//find weight lightest
		if(sib1.getWeight()<=sib2.getWeight() && sib1.getWeight()<=sib3.getWeight())
		{
			lightest=sib1;
		}
		else if(sib2.getWeight()<=sib1.getWeight() && sib2.getWeight()<=sib3.getWeight())
		{
			lightest=sib2;
		}
		else
		{
			lightest=sib3;
		}
		
		out="";
		out=out + "The Lightest Sibling: " + 
				lightest.getName() + " " + 
				lightest.getAge() + " " + 
				lightest.getWeight() + " \n";
		
		out=out + "The Youngest Sibling: " + 
				youngest.getName() + " " + 
				youngest.getAge() + " " + 
				youngest.getWeight() + " \n";
		
		JOptionPane.showMessageDialog(null, out);
	}

}
