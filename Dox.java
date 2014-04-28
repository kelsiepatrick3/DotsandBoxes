// Kelsie Patrick
//DotandBox.java CS 212

package dotsandboxes;

import java.awt.*;
import javax.swing.*;

public class Dox extends JFrame
{
	Board theBoard;
	Player[] player;
	
	public static void main(String[] args)
	{
		new Dox();
	}
	
	public Dox()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setTitle("Dox");
	    
	    setLayout( new FlowLayout() );
	    theBoard = new Board(10);
	    add( theBoard );
	    
	    
	    setSize( new Dimension(600,600) );
	    setVisible(true);
	    
	    
	}
}
