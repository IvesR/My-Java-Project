package as14;

import javax.swing.JOptionPane;

public class Rectangle implements Status

{	
		// instance variables
		private int length;
		private int width;
		
		//constructor
		public Rectangle (int l, int w)
		
		{
			//initialize instance variables 
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
		public String getStatus()
		{
			String status="Rectangle\nLength="+length+",Width="+width+"\n";
			return status;
		}
		public void displayStatus()
		{
			String status=getStatus();
			JOptionPane.showMessageDialog(null, status);
		}

}