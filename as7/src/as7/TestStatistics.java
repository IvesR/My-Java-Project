package as7;

import java.text.DecimalFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		
				 // Create a String in for inputing data values.
				 String in="";
				 
				 // Create a String delim for specifying the delimeter(separator).
				 String delim=",";
				 
				 // Create an int count to get data count from user.
				 int count=0;
				 
				 // Create a String token value form the Stringtokenizer
				 String token="";
				 
				 //Get data input in String in
		         in = JOptionPane.showInputDialog
		        	("Enter Data <separated by commas/spaces>: ");
		         
		         //Create StringTokenizer and supply it with String in and String delim
		         StringTokenizer st = new StringTokenizer(in, delim);
		         
		         //get token count from StringTokenizer
		         count = st.countTokens();
		       
		         //create an array data of size count
		         double[] data= new double[count];
		         
		         // set up loop to go arount count times\
		         //In each pass through the loop, get the next token from StringTokenizer.
		         //Convert token into a double and store  it in corresponding array element.         

		         for(int i=0; i<count; i++)

		         {
		        	 token = st.nextToken();
		        	 //trim the token
		        	 //trim removes all leading and trailing spaces
		        	 token = token.trim();
		        	 data[i] = Double.parseDouble(token);
		        	 
		         }

		         //create an object of class Statistics and pass it the array data

		         Statistics stat=new Statistics(data);
		         
		         //find min, max, mean. median by calling stat object's methods

		         double min = stat.findMin();
		         double max = stat.findMax();
		         double mean = stat.findMean();
		         double median = stat.findMedian();

		         //get original and sorted data 
		         //by calling stat object's appropriate methods

		         double[] origData = stat.getOrigData();
		         double[] sortedData = stat.getSortedData();
		         
		         //Input the number of decimal places
		         in = JOptionPane.showInputDialog
		        		 	("Enter the Number of Decimal Places to which the Computed Values are Displayed: ");
		         int placesCount = Integer.parseInt(in);
		         
		         // Build patern string
		         String pattern = "0.";
		         for(int i=0; i<placesCount; i++)
		        	 pattern = pattern + "0";
		         
		         // Create a DecimalFormat object. Pass it the pattern string.
		         DecimalFormat df = new DecimalFormat("0.000");
		         //use applyPattern
		         df.applyPattern(pattern);
		         
		         //build output by accumulating output in variable out
		          String out = "";
		          
		          out = out + "Original Data: \n";
		          for (int i=0; i<origData.length; i++){
		        	 	out = out + origData [i] + " ";

		         }

		         out = out + "\n";
		        
		         out = out + "Sorted Data: \n";
		         for (int i=0; i<sortedData.length; i++) {
		        	 out = out + sortedData [i] + " ";
		        	 
		         }		         
		          out = out + "\n";
		          
		          out = out + "Computed Values Displayed To 3 Decimal Places: " + "\n";
		          out = out + "Min: " + df.format(min) + "\n";
		          out = out + "Max: " + df.format(max) + "\n";
		          out = out + "Mean: " + df.format(mean) + "\n";
		          out = out + "Median: " + df.format(median) + "\n";
		          

		        
		         //display output

		         JOptionPane.showMessageDialog ( null, out);
		

	}

}
