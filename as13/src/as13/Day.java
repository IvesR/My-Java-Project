package as13;

public class Day {
	
		
		 private int day;//a private variable for holding day values
		 
	     protected int month;//a protected variable for holding month values

	     public Day (int d, int m )

	     {
	    	 //initialize day and month values
	                 day = d;

	                 month = m;

	     }
	     	//public method finfDayNum the calculates the day number correspoding to the day and months values and store object
	     	// it calculates the day number assuming it a non-leap year.
	     public int findDayNum ( )

	     {

	                 int dayNum=0;

	                 switch (month)

	                 {

	                 case 1:

	                             dayNum = day;

	                             break;

	                 case 2:

	                             dayNum = 31 + day;

	                             break;

	                 case 3:

	                             dayNum = 31 + 28 + day;

	                             break;

	                 case 4:

	                             dayNum = 31 + 28 + 31 + day;

	                             break;

	                 case 5:

	                             dayNum = 31 + 28 + 31 + 30 + day;

	                             break; 
	                 
	               //write code for other cases
	                             
	                case 6:
	                	 
	         	 				dayNum = 31 + 28 + 31 + 30 + 31 + day;
	         	 		
	         	 				break;
	         	 				
	                case 7:
	                		
	                			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + day;
	                			
	                			break;
	                			
	                case 8:
	                	
	                			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
	                			
	                			break;
	                			
	                case 9:
	                	
	                			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
	                			
	                			break;
	                			
	                case 10:
	                	
	                			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
	                			
	                			break;
	                			
	                case 11:
	                	
			        			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			        			
			        			break;
			        			
	                case 12:
	                	
			        			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			        			
			        			break;
	                 }
			        			

	                 return dayNum;          

	     }
	     	

		//public accessor methods getDay that returns day value.
		public int getDay ( )
		
		{	
		                 return day;
		                 
		}
		
		//public accessor method getMonth and returns months value.
		public int getMonth ( )
		
		{
		
		                 return month;
		
		}
	
	}
