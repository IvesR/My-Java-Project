package as13;

import javax.swing.JOptionPane;

public class TestDay {

	
	public static void main(String[] args) 
	{
		
		 String in;
		 int day, month, year, dayNum;
		 
         //Prompt the user for entering day, month, year values
			
			in = JOptionPane.showInputDialog("Enter Day");
			day=Integer.parseInt(in);
						
			in = JOptionPane.showInputDialog("Enter Month");
			month=Integer.parseInt(in);
						
			in = JOptionPane.showInputDialog("Enter Year");
			year=Integer.parseInt(in);
				
	
         //Create an object of class LeapDay and pass its constructor
		 // day, month, and year provided by user
			
			LeapDay d = new LeapDay(day, month, year);
								
		 //day month and year values provided by the user		
		 //Call findDayNum of LeapDay object & get day number.
			
			
			dayNum = d.findDayNum();
			
		

		//Display the original date and the day number
		
		JOptionPane.showMessageDialog(null,"Test Run 1"+"\n"+ "Output: "+"\n"+ " Day Number for " + month+ "/" + day + " is " + dayNum);
		
	}
} 