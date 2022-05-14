package as21;

import javax.swing.*;

public class Validate {

public static void main(String[] args) throws Exception
	{
	String out;
	
		while (true) {
			
			//input id
            String id= JOptionPane.showInputDialog("Enter Id: ");
            System.out.println("Enter id: "+ "\n"+ id);			
            
            //validate id
            try {
	            validateId(id);
	            out="Validated Id: " + id + "\n";
	            System.out.println(out);
    
            //input name
            String name = JOptionPane.showInputDialog("Enter Name: ");
             System.out.println("Enter name: "+ "\n"+ name);          	  
	            //validate name
	            validateName(name);
	            out="Validated Name: "+ name +"\n";
	            System.out.println(out);
	            
            }
            catch (IdNotWholeNumberException e) {

                String msg = e.getMessage();
                System.out.println(msg+"\n");
                //e.printStackTrace();

            }
            catch (IdOutOfRangeException e) {

                 String msg = e.getMessage();                
                 System.out.println(msg+"\n");

                 //e.printStackTrace();

            }
          
            catch (NotAlphabeticException e) {

                 String msg = e.getMessage();                 
                 System.out.println(msg+"\n");

                //e.printStackTrace();
            }
            catch (NotSpecifiedException e) {

                String msg = e.getMessage();               
                System.out.println(msg+"\n");

                //e.printStackTrace();
            }
             
        }
		
	}
		
//code for validate ID
private static void validateId(String id) 
	
		throws IdNotWholeNumberException,IdOutOfRangeException
		{
			int idInt;
			try {
				idInt = Integer.parseInt(id);
			}
			catch(NumberFormatException ex) {
				throw new IdNotWholeNumberException();
			}
			if(idInt >= 1 && idInt > 999) {
				throw new IdOutOfRangeException();
			}
			else if(id.matches("[0]")) {
				
				System.out.println("Bye!"+ "\n");;
				System.exit(0);
			}
		
		}
		
//code for validate name	
private static void validateName(String name)
	
		throws NotSpecifiedException,NotAlphabeticException
		{
	
		if(name.equals("")) {
			throw new NotSpecifiedException();
			
		}
		else if(!name.matches("[a-zA-Z]+")) {
			throw new NotAlphabeticException();
			
		}
	  }
}