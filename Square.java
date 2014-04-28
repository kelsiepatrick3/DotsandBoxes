// Kelsie Patrick
// Edges.java

package dotsandboxes;

import java.awt.*;
import java.awt.event.*;

public class Square implements MouseListener
{
	int x,y; 								// coordinate in pixels or this peg
	int ih,jv; 								// coordinates in the array in Board
    static Board theBoard; 					// points to the board this peg is on
    Player owner=null;
	boolean show1,show2,show3,show4 ; 		// true = this edge is on the board, 
											// false = invisible , no play
	
	
	public Square(int ih1, int jv1)
	{
		 ih = ih1; jv = jv1;
	      
	     int spacing = 500 / theBoard.boardSize;
	     x = theBoard.xoffset + ih * spacing;
	     y = theBoard.yoffset + jv * spacing;
	     
	     show1 = false;
	     show2 = false;
	     show3 = false;
	     show4 = false;
	}
	
	
	public void mouseClicked(MouseEvent e) 
	{
		
		
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	public void drawMe(Graphics g)
	{
		g.setColor(Color.cyan);
		
		g.fillRect(x+15,y+4,35,5);
		
		g.fillRect(x+4,y+15,5,35);
	}
}
