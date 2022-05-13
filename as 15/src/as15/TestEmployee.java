package as15;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;
// Preferably, modify the code below to input via StringTokenizer
public class TestEmployee
{

		public static void main(String[] args)
	{
		String in, out;
	
	    String name;
	
	    double salary, pctBonus, bonus, travelExpense;
	
	    int optionCount;
	    
	    in = JOptionPane.showInputDialog("Enter Number of Workers: ");
	    in = JOptionPane.showInputDialog("Enter Number of Managers: ");
	    in = JOptionPane.showInputDialog("Enter Number of Executives: ");
	    //create an array of 6 Employee references
	
	    Employee[] emp=new Employee[6];
	
	    //create a empIndex to index into status array
	
	    int empIndex=0;
	
	    //create three Worker objects and store their references in status array        
	
	
	
	    for (int i=0; i<3; i++)
	    {
	    		in = JOptionPane.showInputDialog("Enter a Worker data:");
	    		String delim =",";
	    		String token;
	    		StringTokenizer st = new StringTokenizer(in, delim);
	    		
	    		String name1 = st.nextToken().trim();
	    		
	    		token = st.nextToken().trim();
	    		double salary1 = Double.parseDouble(token);
	    		token = st.nextToken().trim();
	    		double pctBonus1 = Double.parseDouble(token);
	    			    
	               //create a Worker object and store its reference in emp array
	
	                emp[empIndex]=new Worker(name1,salary1,pctBonus1);
	
	                empIndex++;
	
	    }
	
	    //create two Manager objects and store their references in emp array 
	
	    for (int i=0; i<2; i++)
	    {
	    	
	    	in = JOptionPane.showInputDialog("Enter a Manager data: ");
	    	
	    	String delim =",";
	    	String token;
	    	StringTokenizer st = new StringTokenizer(in, delim);
	    	
	    	String name1 = st.nextToken().trim();
	    	
	    	token =st.nextToken().trim();
	    	double salary1 = Double.parseDouble(token);
	    	token = st.nextToken().trim();
	    	double pctBonus1 = Double.parseDouble(token);
	    	token =st.nextToken().trim();
	    	double travelExpense1 = Double.parseDouble(token);
	   
	        //create a Worker object and store its reference in emp array
	
	         emp[empIndex]=new Manager(name1,salary1,pctBonus1,travelExpense1);
	
	         empIndex++;
	
	    }
	
	   //create one Executive object and store its references in emp array      
	
	    for (int i=0; i<1; i++)
	    {
	    	in =JOptionPane.showInputDialog("Enter an Executive data: ");
	    	
	    	String delim = ",";
	    	String token;
	    	
	    	StringTokenizer st = new StringTokenizer(in, delim);
	    	
	    	String name1 = st.nextToken().trim();
	    	
	    	token =st.nextToken().trim();
	    	double salary1 = Double.parseDouble(token);
	    	token =st.nextToken().trim();
	    	double pctBonus1 = Double.parseDouble(token);
	    	token =st.nextToken().trim();
	    	double travelExpense1 = Double.parseDouble(token);
	    	token = st.nextToken().trim();
	    	int optionCount1 = Integer.parseInt(token);
	             
	        //create a Worker object and store its reference in emp array
	
	         emp[empIndex]=new Executive (name1,salary1,pctBonus1,travelExpense1,optionCount1);
	
	         empIndex++;
	
	    }
	
	    //outW will accumulate output for workers
	
	    //outM will accumulate output for manager
	
	    //outE will accumulate output for executive
	
	    //outAll will be the accumulated output for all
	
	    String outAll, outW="", outM="", outE="";
	
	    for (int i=0; i < emp.length; i++)
	    {
	
	        //Methods in the Employee class can be accessed without type casting
	
	        name = emp[i].getName ( );
	
	        salary = emp[i].getSalary ( );
	
	        //computeBonus is polymorphic call
	
	        bonus = emp[i].computeBonus();
	
	        //Methods that are not in the Employee class can be accessed using type casting
	
	        //Type casting should be done within an if statement containing instanceof
	
	        //The instanceof clause is used to ensure a safe down casting (widening).
	
	        if (emp[i] instanceof Worker)
	        {
	
	                    //pctBonus = ( (Worker) emp[i] ).getPctBonus ( );
	
	                    pctBonus = ((Worker) emp[i]).getPctBonus();
	
	                    //accumulate Worker output in outW
	
	                    outW +=  "Name: " + name + "\n";
	
	                    outW +=  "Salary: " + salary + "\n";
	
	                    outW +=  "PercentBonus: " + pctBonus + "\n"; 
	
	                    outW +=  "Total Bonus: " + bonus + "\n"; 
	                    
	                    outW += "\n";
	
	        }
	
	        else if (emp[i] instanceof Manager) 
	        {
	
	                    pctBonus = ( (Manager) emp[i] ).getPctBonus ( );
	
	                    travelExpense = ( (Manager) emp[i] ).getTravelExpense ( );
	
	                    //accumulate Manager output in outM
	
	                    outM +=  "Name: " + name + "\n";
	
	                    outM +=  "Salary: " + salary + "\n";
	
	                    outM +=  "PercentBonus: " + pctBonus + "\n"; 
	
	                    outM +=  "Total Bonus: " + bonus + "\n"; 
	
	                    outM +=  "Travel Expense: " + travelExpense + "\n"; 
	                    
	                    outM += "\n";
	
	        }
	
	        else if (emp[i] instanceof Executive) 
	        {
	                    pctBonus = ( (Executive) emp[i] ).getPctBonus ( );
	
	                    travelExpense = ( (Executive) emp[i] ).getTravelExpense ( );
	
	                    optionCount = ( (Executive) emp[i] ).getOptionCount ( );
	
	                    //accumulate Executive output in outE
	
	                    outE = outE + "Name: " + name + "\n";
	
	                    outE +=  "Salary: " + salary + "\n";
	
	                    outE +=  "PercentBonus: " + pctBonus + "\n"; 
	
	                    outE +=  "Total Bonus: " + bonus + "\n"; 
	
	                    outE +=  "Travel Expense: " + travelExpense + "\n"; 
	
	                    outE +=  "Option Count: " + optionCount + "\n";
	                    
	                    outE += "\n";
	
	        }
	
	    }
	
	    //After getting out of the for loop, concatenate various outputs
	
	    outAll = outW + outM + outE;
	
	    //display outAll
	
	    JOptionPane.showMessageDialog(null, outAll);
	
	  }

}
