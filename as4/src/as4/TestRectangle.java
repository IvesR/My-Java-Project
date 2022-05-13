package as4;

import javax.swing.JOptionPane;

public class TestRectangle {

	public static void main(String[] args) {
		
		String in, out;
		double l, w;
		double area, perim;
		
		 //Input length for the first object

        //It will be in text form. So, convert it to a double form

        in=JOptionPane.showInputDialog ("Enter length");

        l=Double.parseDouble (in);



          //Input width for the first object

        //It is a in a String format. Convert it to double

        in=JOptionPane.showInputDialog ("Enter width");

        w=Double.parseDouble (in);



       //create the first Rectangle object

        Rectangle r1 = new Rectangle (l, w);



       //Input length for the second object

        //It is in String format. Convert it to a double

        in=JOptionPane.showInputDialog ("Enter length");

        l=Double.parseDouble (in);     



        //Input width for the second object
        
        in=JOptionPane.showInputDialog ("Enter width");

        w=Double.parseDouble (in);
        

       //create the second Rectangle object

        Rectangle r2 = new Rectangle (l, w);



        //Call methods of the first Rectangle object

        l = r1.getLength ( );

        w= r1.getWidth ( );

        area= r1.computeArea ( );

        perim= r1.computePerim ( );



        //build the output string in variable out

        out="First Rectangle:\n";

        out=out + "Length: " + l + "\n";

        out= out + "Width: " + w + "\n";

        out= out + "Area: " + area + "\n";

        out= out + "Perimeter: " + perim + "\n";



        //call methods of the second Rectangle objects
        
        l = r2.getLength ( );

        w= r2.getWidth ( );

        area= r2.computeArea ( );

        perim= r2.computePerim ( );


        //continue building output string

        //concatenate the output value relating to second object

        out=out+"\nSecond Rectangle:\n";
        
        out=out + "Length: " + l + "\n";

        out= out + "Width: " + w + "\n";

        out= out + "Area: " + area + "\n";

        out= out + "Perimeter: " + perim + "\n";

        //display the value of variable out in a single dialog box

        JOptionPane.showMessageDialog (null, out); 

         System.exit(0);                           
		
	}

}
