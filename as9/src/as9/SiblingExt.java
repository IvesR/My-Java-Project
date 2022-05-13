package as9;

public class SiblingExt extends Sibling
{
	private int height;
	
	public SiblingExt(String n, int a, int w, int h)
	{
		super(n,a,w);
		height=h;
	}
	
	public int getHeight()
	{
		return height;
	}

}
