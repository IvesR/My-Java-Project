package as18;

public class TestJFrameExt {

	public static void main(String[] args) 
	{
		//create a JFrameExt object i.e. a frame or window
		JFrameExt f = new JFrameExt();
	
		//set the title, size, and visibility of the frame
		f.setTitle("Calculator");
		f.setDefaultCloseOperation(JFrameExt.EXIT_ON_CLOSE);
		f.setSize(600, 300);
		f.setVisible(true);
	
	}
	
}