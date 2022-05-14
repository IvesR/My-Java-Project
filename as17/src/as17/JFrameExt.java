package as17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameExt extends JFrame implements ActionListener
{
	private JPanel jpMain = new JPanel();
	private JPanel jpFrom = new JPanel();
	private JPanel jpTo = new JPanel();
	private JPanel jpOp = new JPanel();
	private JLabel jlbFrom = new JLabel("From: ");
	private JLabel jlbTo = new JLabel("To: ");
	private JTextField jtfFrom = new JTextField(10);
	private JTextField jtfTo = new JTextField(10);
	private JButton jbtFtoC = new JButton("F to C");
	private JButton jbtCtoF = new JButton("C to F");
	
	public JFrameExt()
	{
		setTitle("Converter");
		setSize(400, 200);
		setVisible(true);
		
		// set jpMain layout
		GridLayout gl = new GridLayout(3, 1);
		jpMain.setLayout(gl);
		
		//add panels to jpMain
		jpMain.add(jpFrom);
		jpMain.add(jpTo);
		jpMain.add(jpOp);
		
		//set background color
		jpFrom.setBackground(Color.red);
		jpTo.setBackground(Color.green);
		jpOp.setBackground(Color.magenta);
		
		//Make jpMain as the content pane
		this.setContentPane(jpMain);
		
		//add components to panels
		
		jpFrom.add(jlbFrom);
		jpFrom.add(jtfFrom);
		jpTo.add(jlbTo);
		jpTo.add(jtfTo);
		
		jtfTo.setEditable(false);
		jpOp.add(jbtFtoC);
		jpOp.add(jbtCtoF);
		
		//register this object as a listener with buttons
		
		jbtFtoC.addActionListener(this);
		jbtCtoF.addActionListener(this);		
	}
	
	//Listener method
	public void actionPerformed(ActionEvent ev)
	{
		String sFrom, sTo;
		double dFrom, dTo;
		sFrom = jtfFrom.getText().trim();
		dFrom =Double.parseDouble(sFrom);
		
		if(ev.getSource()==jbtFtoC) {
			dTo = 5.0 / 9.0 *(dFrom - 32.0);
			sTo =""+dTo;
			jtfTo.setText(sTo);
		}
		else if(ev.getSource()==jbtCtoF) {
			dTo =(dFrom * 9.0 / 5.0)+ 32.0;
			sTo =""+dTo;
			jtfTo.setText(sTo);
		}
	}
}