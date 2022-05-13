package as12;

import java.io.*;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
		
		
public class TestStudentExt
		
	{
		
	/*
		
In a function (method) that contains file input or output code, you should add the phrase: throws Exception in its header. 
That makes it possible for the function (method) code to compile without the need to add try/catch statements in the code.
Below, we do File IO in method main, so we added the phrase:  throws Exception in its header as shown below:
		
	*/
		
		public static void main(String[] args) throws Exception
		
		{
		
		  String in,  outAll, line;
		
		  int studentCount;
				
		  //Create a BufferedReader object for inputting from a text file in.txt
		
		  BufferedReader br = new BufferedReader(new FileReader("/Users/oy/ws225/as12/src/in.txt"));
		
		
		
		  //Create a PrintWriter object for outputting to a text file out.txt.
		
		  PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
		
		
		
		  //input the first line of the file
		
		 // This line contains the student count
		
		  in = br.readLine();
		
		  studentCount = Integer.parseInt(in);
		  
		  StudentExt[]st=new StudentExt[studentCount];
		  
		  //System.out.println(in);
		  //br.close();
				
		   //Set up a for loop.
		
		   // In each pass through the loop,
		
		   // input one student data, tokenize the data,
		
		   // and create a StudentExt object
		  //JOptionPane.showMessageDialog(null, studentCount);
		  
		  for (int i=0; i<studentCount; i++)
		
		  {
		
		    //read one line containing one student data.
		
		    in = br.readLine();
		    
		   		      		    	      	     		    	
		    //Create a StringTokenizer object and tokenize one student data.
		    
		   
		    	  //JOptionPane.showMessageDialog(null, in);		    
				  StringTokenizer stk = new StringTokenizer(in, ",");
				 				  
				  int id = Integer.parseInt(stk.nextToken().trim());
				   
				  String name = stk.nextToken().trim();
				   				 				   
				   
				  int nExams;
				  nExams=Integer.parseInt(stk.nextToken());
				  				    		    	
				   double[]scores =new double[nExams];
				   		for(int j=0; j<nExams;j++) {				   			
				   		scores[j]=Double.parseDouble(stk.nextToken());
				      }
				   		
				   String gradeType = stk.nextToken().trim();
				   
		    
		    		    	
		   //Using the input data, create a StudentExt object
		     
		   
		   st[i] = new StudentExt(id, name, scores, gradeType);	
	   
 }

		   //String variables for accumulating output lines
		
		   String outA="", outB="", outC="", outD="", outF="", outCr="", outNcr="";
		
		   //String outAll;
		
		    		
		
		  //Set up a for loop.
		
		  //In each pass through the loop,
		
		  //find grade of one student data, and depending on the grade,  
		
		  //add a line of output to the corresponding output variable
		   String grade="";
		   
		
		  for (int i=0; i<studentCount; i++)
		
		  {
		
		    //Find one student grade
			 
			  grade = st[i].findGrade();
		
		    //Depending on the grade,
		
		    //add a line of output to the corresponding output variable
			  			  				 			   
			  	if (grade.equalsIgnoreCase("A")) {
			  		
	    			outA = outA + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("B")) {
	    			
	    			outB = outB + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("C")) {
	    			
	    			outC = outC + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("D")) {
	    			
	    			outD = outD + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("F")) {
	    			
	    			outF = outF + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("CR")) {
	    			
	    			outCr = outCr + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
	    		else if(grade.equalsIgnoreCase("NCR")) {
	    			
	    			outNcr = outNcr + st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
	    		}
		
		
		} 
		  
		  //System.out.println(st[i].getId()+" "+st[i].getName()+" ("+grade+")");
		
	  
		  
		  //Concatenate all student output in a single String variable outAll
		
		  outAll=outA+outB+outC+outD+outF+outCr+outNcr;
		
		
		
		  //Output contents of outAll to the output file using PrintWriter object.
		
		  //make sure to also call flush( ) after calling println()
		
		  pw.print(outAll);
		
		  pw.flush();
		
		
		
		  //Close file input/output objects (br and pw).
		
		  if (br != null)
		
		    br.close();
		
		  if (pw != null)
		
		    pw.close();
		
		   }
		
		}
	
	

