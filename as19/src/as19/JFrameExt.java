package as19;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class JFrameExt extends JFrame
{
	private double north;

    private double south;

    private double east;

    private double west;

    private double midwest;

    public JFrameExt(double north, double south, double east, double west,

                            double midwest) throws HeadlessException {

                super();

                this.north = north;

                this.south = south;

                this.east = east;

                this.west = west;

                this.midwest = midwest;

    }

@Override

    public void paint (Graphics g){

                //clean the surface of all drawings

                super.paint(g);

               

                double total=north+south+east+west+midwest;

               

                //draw arc for north region

                int startAngle=0;

                int arcLength=(int)(north/total*360.0);

                g.setColor(Color.red);

                g.fillArc(100,100,300,300,startAngle,arcLength);

                //draw arc for south region

                startAngle=startAngle+arcLength;

                arcLength=(int)(south/total*360.0);

                g.setColor(Color.green);

                g.fillArc(100,100,300,300,startAngle,arcLength);              

                //draw arc for east region

                startAngle=startAngle+arcLength;

                arcLength=(int)(east/total*360.0);

                g.setColor(Color.blue);

                g.fillArc(100,100,300,300,startAngle,arcLength);
                

                //draw arc for west region
                startAngle=startAngle+arcLength;

                arcLength=(int)(west/total*360.0);

                g.setColor(Color.magenta);

                g.fillArc(100,100,300,300,startAngle,arcLength);


                //draw arc for midwest region

                startAngle=startAngle+arcLength;

                arcLength=(int)(midwest/total*360.0);

                g.setColor(Color.yellow);

                g.fillArc(100,100,300,300,startAngle,arcLength);


                //draw the legend for north region

               

                int xRect=100;

                int rectWidth=50;

                int horSpacing=10;

                int vertSpacing=5;

               

                int yRect=500;

                int rectHeight=10;

                g.setColor(Color.red);

                g.fillRect (xRect,yRect,rectWidth,rectHeight);

               

                int xString=xRect+rectWidth+horSpacing;

                int yString=yRect+rectHeight;

                String theString="North - 20.0";

                g.drawString (theString,xString,yString);

               

                //draw the legend for south region

                //x-values stay the same

                //y-values change

                yRect=yRect+rectHeight+vertSpacing;

                rectHeight=10;

                g.setColor(Color.green);

                g.fillRect (xRect,yRect,rectWidth,rectHeight);

               

                //xString=xRect+rectWidth+horSpacing;

                yString=yRect+rectHeight;

                theString="South - 25.0";                  

                g.drawString (theString,xString,yString);

               

                //draw the legend for east region

                yRect=yRect+rectHeight+vertSpacing;

                rectHeight=10;

                g.setColor(Color.blue);

                g.fillRect (xRect,yRect,rectWidth,rectHeight);

               

                //xString=xRect+rectWidth+horSpacing;

                yString=yRect+rectHeight;

                theString="East - 15.0";                  

                g.drawString (theString,xString,yString);


               

                //draw the legend for west region
                yRect=yRect+rectHeight+vertSpacing;

                rectHeight=10;

                g.setColor(Color.magenta);

                g.fillRect (xRect,yRect,rectWidth,rectHeight);

               

                //xString=xRect+rectWidth+horSpacing;

                yString=yRect+rectHeight;

                theString="West - 30.0";                  

                g.drawString (theString,xString,yString);
         

                //draw the legend for Midwest region
                yRect=yRect+rectHeight+vertSpacing;

                rectHeight=10;

                g.setColor(Color.yellow);

                g.fillRect (xRect,yRect,rectWidth,rectHeight);

               

                //xString=xRect+rectWidth+horSpacing;

                yString=yRect+rectHeight;

                theString="Midwest - 10.0";                  

                g.drawString (theString,xString,yString);          

    }

}