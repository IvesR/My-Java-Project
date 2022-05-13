package as13;

public class LeapDay extends Day
{
	 private int year;

     public LeapDay (int d, int m, int y )

     		{
                 //Call parent constructor to initialize day and month

                 super (d, m);

                 //Initialize year yourself

                 year=y;

     		}
		
			//over-ride the parent method
			
			public int findDayNum ( )
			
			{
			
			     //Call the parent findDayNum to determine dayNum
			
			     int dayNum=super.findDayNum();
			
			
			
			     //Handle if it is a leap year.
			
			if (((year % 400) == 0) || 
			
			         (((year %   4) == 0) && ((year%100) != 0) ) ) 
			
			{
			
			     //It is a leap year

                 //If month is greater than 2 add 1

                 if (month > 2)

                 {

                             dayNum = dayNum + 1;

                 }
		
			}
			
			return dayNum;          
			
			}
					
			public int getYear ( )
			
			{
			
			                 return year;

			} 

}