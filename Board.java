// Kelsie Patrick
// Board.java

package dotsandboxes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

import twixt.Link;
import twixt.Peg;

public class Board extends JPanel implements MouseListener 
{
	Dots[][] dot; 		    // array for all the dots on the board
	Square[][] box;			// array for all the edges on the board 
	int boardSize = 10;     // size of the board 
	int spacing;		    // space between dots 
	int xoffset = 15; 	    // scoot the pegs this much from left edge
    int yoffset = 15;       // scoot the pegs this much from top edge
    int whoseTurn;          // 0 or 1, index of player in player array
    static Player[] player; // array of the players: computer/human
    int dotWidth = 10;		// the width of the dots on board 
        
	
    // constructor 
	public Board(int size)
	{
		boardSize = size;
		dotWidth = 5 + 100 / boardSize;
	    Dots.dotWidth = dotWidth;
	    whoseTurn = 0;
	      
	    setPreferredSize( new Dimension(500,500) );
		
	    Dots.theBoard = this;
	    Square.theBoard = this;	   
	      
	    spacing = 500 / boardSize;
	      
	    // declare array for dots and fill with dots 
	    dot = new Dots[boardSize][boardSize];
	    for ( int i=0; i<boardSize; i++ ) // i horizontal from left
	    {
	      for ( int j=0; j<boardSize; j++ ) // j vertical from top
	      {
	          dot[i][j] = new Dots( i, j );
	      }
	    }
	    
	    box = new Square[boardSize][boardSize];
	    for ( int k = 0; k<boardSize; k++)
		   { 
		    	for ( int m = 0; m<boardSize; m++)
		    	{
		    		box[k][m] = new Square(k,m);
		    	}			   
		   }    
	    
	    
	    addMouseListener(this);  // board listens to you click on an edge
	    
	}

	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e)  {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e){}
	
	@Override
	public void paintComponent( Graphics g )
	{
	   super.paintComponent(g);
	      
	   for ( int i=0; i<boardSize; i++ ) // i horizontal from left
	   {
	   
	      for ( int j=0; j<boardSize; j++ ) // j vertical from top
	      {
	          dot[i][j].drawMe(g);
	          
	      }
	   }
	   
	   for ( int k = 0; k<boardSize; k++)
	   { 
	    	for ( int m = 0; m<boardSize; m++)
	    	{
	    		box[k][m].drawMe(g);
	    	}			   
	   } 
	   	   
	}
}
