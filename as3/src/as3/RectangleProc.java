package as3;

import javax.swing.JOptionPane;

public class RectangleProc {

	public static void main(String[] args) {
		
		String in, out;
		int l,w;
		int area, perim;
		
		in=JOptionPane.showInputDialog("Enter length");
		l= Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter width");
		w=Integer.parseInt(in);
		
		area = computeArea(l, w);
		perim= computePerim(l, w);
		
		out="Length: " + l + "\n";
		out= out +"Width: " + w + "\n";
		out= out +"Area: " + area + "\n";
		out= out +"Perimeter: " + perim + "\n";
		
		// display the whole out in a single dialog box
		JOptionPane.showMessageDialog(null, out);
		
	}
	public static int computeArea(int len, int wid)
	{
		int a;
		a = len * wid;
		return a;
	}
	public static int computePerim(int len, int wid)
	{
		int p;
		p = 2 * (len + wid);
		return p;

	}

}
