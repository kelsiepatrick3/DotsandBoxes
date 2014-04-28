// Dots.java CS 212

package dotsandboxes;

import java.awt.*;

public class Dots 
{ 
	int ih, jv; // coordinates in grid of Board
	int x,y; // coordinates in pixels from upper left of panel 
	static Board theBoard; // pointer back to the pointer
	
	static int dotWidth;
	
	
	
	public Dots( int ih1, int jv1)
	{
		ih = ih1;
		jv = jv1; 
				
		int spacing = 500 / theBoard.boardSize;
	    x = theBoard.xoffset + ih * spacing;
	    y = theBoard.yoffset + jv * spacing;
		
	}
	 
	public void drawMe(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(x, y, dotWidth, dotWidth);
		
			
		
	}
}