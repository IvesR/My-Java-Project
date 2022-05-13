package as8;

import java.util.Arrays;

public class Statistics {
	
		//instance variables
		private double[]data;
		private double []sdata;
		
		//Create static variable count
		public static int count=0;
	
		//constructor Statistics
		public Statistics (double[]d)
		
		{
			
			// increment satatic variable count
			count=count+1;
			
			//create the array data, sdata
			data= new double [d.length];
			sdata= new double [d.length];
		
			//copy the data from array d into array data and sdata
			
			System.arraycopy(d, 0, data, 0, d.length);
			System.arraycopy(d, 0, sdata, 0, d.length);
			
			//sort the array sdata
			Arrays.sort(sdata); //to access arrrays, import java.util.Arrayss:
		
		}	
	
		//instance methods
		public double findMin()
	
		{
			double min=sdata[0];
			return min;
		
		}
	
		public double findMax()
	
		{
		
			double max=sdata[sdata.length-1];
			return max;
			
		}
		
		public double findMean()
	
		{
			double sum, mean;
			sum=0;
			for (int i=0; i<sdata.length; i++)
			{
				sum=sum+sdata[i];
			}
			mean=sum/sdata.length;
			return mean;
		}
		
		//put below the code of method findMedian given in a later section below
			
		public double findMedian()
	
		{
			int index, indexHi, indexLo;
			double median=0;
			if ((sdata.length %2)!=0)
			{
				index=sdata.length/2;
				median= sdata[index];
			}
			else
			{
				indexHi=sdata.length/2;
				indexLo=indexHi-1;
				median=(sdata[indexLo]+sdata[indexHi])/2;
			}
			//delete line below after add real code. it is put there temporarily
			return median;
		}	
		
			//method return a copy of the arrays data containing the original data.
		public double []getOrigData()
		
		{
			//create a new array d
			double[]d = new double [data.length];
			
			//copy the array data into array d
			System.arraycopy(d, 0, d, 0, data.length);
			double [] d1 = data.clone();
			
			//return the reference of the array d
			return d1;
			
		}
		// methods returns acopy of the instance variable array sdata containing the sorted data.
		//write this method much like getOrigData above
		public double []getSortedData()
		
		{
			// create a new array d
			double []d = new double [sdata.length];
			
			// copy the array sdata into array d
			
			System.arraycopy(d, 0, d, 0, sdata.length);
			double [] d2 = sdata.clone();
			//return the reference of the array d
			//delete the line below. it is put there temporarity
			return d2;
			
		}
		
		//static methods
		public static double [] computeSortedData(double[]sdata)
		{
			
			new Statistics(sdata);
			return sdata;
		}
		
		public static double computeMin(double[] data)
		{
		  //Create a Statistics object. Pass it the array data during the creation
		   Statistics st = new Statistics(data);
		   
		 //Ask Statistics object to find min of array passed during creation.
		   double min = st.findMin();
		 // return min to the caller
		   return min;
		}
			
		public static double computeMax(double[] data)	
			
		{
			// Create a statistics object. pass it array data durring creation.
			Statistics st = new Statistics (data);
			
			//Ask Statistics object to find max of array passed during creation.
			double max = st.findMax();
			
			//return max to the caller
			return max;
		
		}

		public static double computeMean(double[] data) 
		{
			
			Statistics st = new Statistics (data);
			double mean = st.findMean();
			return mean;
		}

		public static double computeMedian(double[] data) 
		{

			Statistics st = new Statistics (data);
			double median = st.findMedian();
			return median;
		}
		
}
