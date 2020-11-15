
/**
 * This runs the PE class of the game "This is Not Del Norte." 
 * During the PE class, the user must figure out how to start the badminton game and then play the game.
 * The badminton game is based off the breakout/pong game.
 * The player moves a racket using arrow keys to make a birdie hit the blocks above it.
 * The player loses if the birdie hits the ground (bottom edge of the court, below the racket)
 * The player wins if they destroy all of the blocks.
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.javatpoint.com/java-awt
 * 
 */

import javax.swing.JFrame;
import java.awt.EventQueue; 

public class Badminton implements Commons
{

    /**
     * Constructor for objects of class Breakout
     */
    public Badminton()
    {        
        frame.add(new Board());       
        frame.setSize(900, 900);
        frame.setResizable(false);
        frame.setTitle("PE Class");
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
   
}
