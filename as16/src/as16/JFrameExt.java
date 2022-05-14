package as16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrameExt extends JFrame implements ActionListener
{
	//Declare and Create GUi objects
	private JTextField jtfMessage = new JTextField(10);
	private JButton jbtClickMe = new JButton("Click Me");
	private JButton jbtClickMeToo = new JButton("Click Me Too");
	private JPanel jpMain = new JPanel();
	private int count =0;
	
	// prepare the Gui interface in the constructor.
	
	public JFrameExt()
	{
		super();
		
		//Create a layout manager objcet
		FlowLayout fl = new FlowLayout();
		
		//set fl to the jbMain layout manger
		jpMain.setLayout(fl);
		
		//make jbMain as the content pane
		this.setContentPane(jpMain);
		
		//add the GUI objects to the container
		jpMain.add(jbtClickMe);
		jpMain.add(jtfMessage);
		jpMain.add(jbtClickMeToo);
		
		// MAke the next field non editable
		jtfMessage.setEditable(false);
		
		//Register this object as an ActionListener with each button
		jbtClickMe.addActionListener(this);
		jbtClickMeToo.addActionListener(this);
	}
	
	//Action Event handler method.
	//jbttClickMe and jbtClickMeToo objects will call this method when clicked.
	public void actionPerformed(ActionEvent e)
	{
		//Find out which button was clicked.
		if(e.getSource()==jbtClickMe)
		{
			count++;
			jtfMessage.setText("Hello " + count);
		}
		else if(e.getSource()==jbtClickMeToo)
		{
			count--;
			jtfMessage.setText("Hello "+ count);
		}
	}
}