
/**
 * Holds all of the constants that each class will use
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * 
 */
import javax.swing.JFrame;
public interface Commons
{
    public static final int WIDTH = 900; //width of the board
    public static final int HEIGHT = 900; //height of the board
    public static final int BOTTOM_EDGE = 600; //the birdie cannot pass this point on the y axis
    public static final int PADDLE_X = 800; //initial paddle position on the x axis
    public static final int PADDLE_Y = 550; //constant paddle position on the y axis
    public static final int BALL_X = 450; //the ball's initial x position
    public static final int BALL_Y = 200; //the ball's initial y position
    public static final double SPEED = 1.5; //the spered at which the birdie moves 
    public static final int BLOCK_W = 50; //the width of the block
    public static final int BLOCK_H = 50; //the height of the block
    public static final int DELAY = 1000; //the delay value for the timer
    public static final int PERIOD = 10; //the period value for the timer
    public JFrame frame = new JFrame();
}
