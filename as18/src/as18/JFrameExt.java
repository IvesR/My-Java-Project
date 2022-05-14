package as18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameExt extends JFrame implements ActionListener
{
	private JPanel jpMain = new JPanel();//mainPanel is the content Panel	private JPanel jpMouse = new JPanel();// mouse listener
	private JPanel jpNumber1= new JPanel();
	private JPanel jpNumber2= new JPanel();
	private JPanel jpResult= new JPanel();
	private JPanel jpOption = new JPanel();
	
	private JLabel jlbNumber1 = new JLabel("Number1");
	private JLabel jlbNumber2 = new JLabel("Number2");
	private JLabel jlbResult = new JLabel("Result");
	
	private JTextField jtfNumber1 = new JTextField(10);
	private JTextField jtfNumber2 = new JTextField(10);
	private JTextField jtfResult = new JTextField(10);
	
	private JButton jbtAdd = new JButton("Add");
	private JButton jbtSub = new JButton("Sub");
	private JButton jbtMult = new JButton("Mult");
	private JButton jbtDiv = new JButton("Div");
	private JButton jbtClear = new JButton("Clear");
	
	//build jMenubar
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenuItem jItemAdd = new JMenuItem("Add");
	private JMenuItem jItemSub = new JMenuItem("Sub");
	private JMenuItem jItemMult = new JMenuItem("Mult");
	private JMenuItem jItemDiv = new JMenuItem("Div");
	
	private JMenu operations = new JMenu("Operations");
	private JMenu misscellaneous = new JMenu("Misscellaneous");
	
	public JFrameExt() 
	{
		//make the panel jpMain as the content pane
		//so that everything in jpMain will show up in the frame
		//setContent Panel is method inherited from JFrame
		this.setContentPane(jpMain);
		this.setJMenuBar(menuBar);

		//create grid layout manager object for rows and one column
		GridLayout gl = new GridLayout(4,1);
		
		//set layout manager for jpMian to be above grid layout manager
		// a panel's defult layout manager is FlowLayout
		jpMain.setLayout(gl);
		
		//add menuBar	
				
		menuBar.add(operations);
		menuBar.add(misscellaneous);
	
		operations.add(jItemAdd);
		operations.add(jItemSub);
		operations.add(jItemMult);
		operations.add(jItemDiv);

		//add four panels in jpMian		
		jpMain.add(jpNumber1);//add saparated panels to main panel
		jpMain.add(jpNumber2);
		jpMain.add(jpResult);
		jpMain.add(jpOption);
				
		//set background color of four small panels
		jpNumber1.setBackground(Color.green);
		jpNumber2.setBackground(Color.red);
		//add code to set the color of remaining two small panels
		jpResult.setBackground(Color.cyan);
		jpOption.setBackground(Color.magenta);
		
		//add label. text field to the first two panels
		jpNumber1.add(jlbNumber1);
		jpNumber1.add(jtfNumber1);
		
		jpNumber2.add(jlbNumber2);
		jpNumber2.add(jtfNumber2);
		
		//add code to add the label and textfield to the third panel
		jpResult.add(jlbResult);
		jpResult.add(jtfResult);
		
		//add buttons to the fourth panel
		jpOption.add(jbtAdd);
		jpOption.add(jbtSub);
		jpOption.add(jbtMult);
		jpOption.add(jbtDiv);
		jpOption.add(jbtClear);
		
		//make result text field to non-modifiable by the user
		jtfResult.setEditable(false);
		
		//enable input on each button by registering your reference with each one
		//by call in its method addActionListener and giving it your reference
		jbtAdd.addActionListener(this);
		jbtSub.addActionListener(this);
		
		// write code to register with the remaining buttons
		
		jbtMult.addActionListener(this);
		jbtDiv.addActionListener(this);
		jbtClear.addActionListener(this);
		
		// menutItem operations
		jItemAdd.addActionListener(this);
		jItemSub.addActionListener(this);
		jItemMult.addActionListener(this);
		jItemDiv.addActionListener(this);
		
	}	
	// the button event handler
	//this method is invoked when a button (whose input in enabled) is clicked
	public void actionPerformed(ActionEvent ev)
	{
		String sNum1, sNum2, sResult;
		int dNum1, dNum2, dResult;
		if(ev.getSource()==jbtClear)
		{
			sNum1=" ";
			sNum2=" ";
			sResult=" ";
			jtfNumber1.setText(sNum1);
			jtfNumber2.setText(sNum2);
			jtfResult.setText(sResult);
			return;
		}
		sNum1= jtfNumber1.getText().trim();
		sNum2= jtfNumber2.getText().trim();
		
		dNum1= Integer.parseInt(sNum1);
		dNum2= Integer.parseInt(sNum2);
		
		if(ev.getSource()==jbtAdd)
		{
			dResult=dNum1+dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jItemAdd)
		{
			dResult=dNum1+dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jbtSub)
		{
			dResult=dNum1-dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jItemSub)
		{
			dResult=dNum1-dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jbtMult)
		{
			dResult=dNum1*dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jItemMult)
		{
			dResult=dNum1*dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jbtDiv)
		{
			dResult=dNum1/dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource()==jItemDiv)
		{
			dResult=dNum1/dNum2;
			sResult=""+dResult;
			jtfResult.setText(sResult);
		}
	}
}