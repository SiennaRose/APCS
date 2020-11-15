
/**
 * Provides methods for the proper interactions between the birdie, racket and blocks.
 * 
 * made by Sami Chang
 * 
 * outside sources:
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.javatpoint.com/java-awt
 * http://www.tutorialspoint.com/awt/
 * https://gamedev.stackexchange.com/questions/31733/breakout-ball-collision-detection-bouncing-against-the-walls
 * https://github.com/NatashaTheRobot/Stanford-CS-106A/blob/master/Assignment3/Breakout.java
 */
import java.awt.*; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Container; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JLabel; 
import java.util.Timer;
import java.util.TimerTask; 
import java.util.*; 
import javax.swing.ImageIcon;

public class Board extends JPanel implements Commons
{
    
    private Timer timer;
    private Racket racket; 
    private Birdie birdie; 
    private boolean ingame = true; //whether or not the player is still playing the game
    private ArrayList<Block> blocks; //An arrayList of blocks will be used since it is easier to 
        //delete the blocks that are destroyedto efficiently keep track of which blocks to display. 
    private JLabel badminton, moveArrows, aBird, winner, loser; //various labels used throughout the game
    
    /**
     * Constructor creates the racket, birdie, and block objects.
     * The blocks are positioned properly and given a character to display "It's time to play"
     */
    public Board()
    {
        int x, y; //used to determine the position of the blocks
        JLabel welcome; //tells the user that this is PE class
        String blockMessage = "It'sTimeToPlay"; //message that will be spelled by the blocks
        racket = new Racket();
        birdie = new Birdie(); 
        blocks = new ArrayList<Block>(); 
        setFocusable(true); //this allows both the mouse and the arrow keys to be used
        setLayout(null); //gets rid of default FlowLayout to absolutely position labels more easily
        
        //display the PE class label
        welcome = new JLabel("PE CLASS IS STARTING...");
        welcome.setBounds(15, 5, 800, 50);
        welcome.setForeground(Color.GREEN); 
        welcome.setFont(new Font("Serif", Font.BOLD, 32));
        add(welcome); 
        
        //positions the blocks so "It's time to" displays on a top line 
        //and "play" displays on the next line. The text is relatively centered and evenly spaced
        for(int a = 0; a < 14; a++)
        {
            blocks.add(new Block()); 
            (blocks.get(a)).addMessage(blockMessage.charAt(a));
            if(((a+1) / 10.0) > 1)
            {
                x = 270 + (90 * (a % 10));
                y = 130;
            }
            else
            {
                x = 20 + (90 * a);
                y = 40;
            }
            (blocks.get(a)).setX(x);
            (blocks.get(a)).setY(y);
        } 
        
        //calls a helper method to start the game
        starting();
    }
    
    /**
     * A Helper method that adds the badminton label on the bottom of the screen.
     * When the player loses, this method is called to reset the game. 
     * To start the game, the player must click the "a" in the word "badminton."
     */
    private void starting()
    {
        ingame = true; //to ensure the game properly resets when needed
        
        //creating the badminton label displayed on the bottom of the screen
        badminton = new JLabel("B     D  M  I  N  T  O  N"); //the "a" part is the aBird label
        badminton.setBounds(200, 700, 880, 90);
        badminton.setFont(new Font("Serif", Font.BOLD, 50));
        add(badminton); 
        
        //creating the aBird label. 
        aBird = new JLabel("");
        aBird.setBounds(245, 695, 90, 90);
        ImageIcon bird = new ImageIcon("aBirdie.png");
        aBird.setIcon(bird);
        add(aBird); 
        
        
        //the game is started when the aBird label is clicked on. 
        aBird.addMouseListener(new MouseAdapter()
        {
             /**
              * When the mouse is clicked, a label appears that tells the user to use the arrows.
              * The ball starts to move and the game begins. 
              */
             public void mouseClicked(MouseEvent e) 
             {
                    aBird.setVisible(false);
                    //must include this part to ensure a proper restart
                    birdie.setX(BALL_X); 
                    birdie.setY(BALL_Y);
                    
                    //this label is added to provide some instruction for the player
                    moveArrows = new JLabel("Use the arrow keys to move the racket");
                    moveArrows.setBounds(450, 450, 500, 50);
                    moveArrows.setFont(new Font("Serif", Font.PLAIN, 20));
                    add(moveArrows); 
                    
                    //helper method is used to add a timer and key listener
                    initBoard(); 
             }                
        });
    }
    
    /**
     * Helper method adds a key listener to read whether the player is moving the racket left or right.
     * Also adds a timer to properly display the frames.
     */
    private void initBoard() 
    {
        addKeyListener(new TAdapter()); 
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), DELAY, PERIOD); 
    }
    
    /**
     * This method uses the helper method drawObjects to properly display the badminton game.
     * Also uses the helper method stopGame if the player won/lost the game.
     */
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        //if the player is still playing the game, call drawObjects
        if(ingame)
        {
            drawObjects(g); 
        }
        //if the player lost or won, still draw the objects, but stop the game
        else
        {
            drawObjects(g);
            stopGame();
        }

        Toolkit.getDefaultToolkit().sync();
    }

    /**
     * Draws all of the objects on the court. 
     */
    private void drawObjects(Graphics g) 
    { 
        //displays the background iamge
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("court.jpg");  
        g.drawImage(i,0,0,this); 
        
        //displays the racket, birdie, and blocks
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(racket.getImage(), racket.getX(), racket.getY(), this);   
        g2d.drawImage(birdie.getImage(), birdie.getX(), birdie.getY(), this);
        //displays all blocks in the arrayList since the destroyed blocks were removed
        for(Block b: blocks)
        {
            g2d.drawImage(b.getImage(), b.getX(), b.getY(), this);
            //add the message to display the proper character
            g2d.setFont(new Font("Serif", Font.BOLD, 50)); 
            g2d.drawString(b.getMessage(), b.getX() + 10, b.getY() + 40);
        }
        
    }
    
    /**
     * If the player lost the game, by missing the birdie, the game is reset.
     * If the player won the game, by destroying all the blocks, a message is displayed.
     */
    private void stopGame()
    {
        ingame = false; //indicated the game ended
        timer.cancel(); //stops the timer which stops the movement of the objects
        
        //if there are no more blocks to destroy, the player won
        if(blocks.size() == 0)
         {
             //adds a label to indicate the player won
             winner = new JLabel("YOU ARE A BADMINTON GOD!!!");
             winner.setBounds(120, 300, 800, 90);
             winner.setFont(new Font("Serif", Font.BOLD, 40));
             add(winner);
             nextClass(); //helper class that takes the user from the PE class to the next class
         }
         else
         {
            //adds a label to indicate the player lost
            loser = new JLabel("Ouch, have you played badminton before?");
            loser.setBounds(100, 300, 800, 90);
            loser.setFont(new Font("Serif", Font.BOLD, 40));
            add(loser); 
            aBird.setVisible(true);
            
            //adds the mouse listener again, this time indicating it will reset the game when pressed
            aBird.addMouseListener(new MouseAdapter()
            {
                 /**
                  * When the label is clicked again, the board resets and calls starting again.
                  */
                 public void mouseClicked(MouseEvent e) 
                 {
                     Board.this.removeAll(); //removes components from the panel
                     starting(); //calls starting again to restart the game
                     aBird.setVisible(false);
                 }                
            });
         }
         
    }
    
    /**
     * This private method creates a button that will take the user to the next class/period 
     * during their day at Del Norte.
     */
    private void nextClass()
    {
        JLabel next = new JLabel("Go to the next period");
        next.setBounds(300, 360, 300, 70);
        next.setFont(new Font("Serif", Font.BOLD, 30));
        next.setForeground(Color.GREEN);
        add(next);
        next.addMouseListener(new MouseAdapter()
        {
            /**
             * When the button is clicked, the player moves to the next period.
             */
            public void mouseClicked(MouseEvent e)
            {
                frame.setVisible(false);
                new Chemistry();
            }
        });
    }
    
    /**
     * Checks to see if the birdie hit the bottom, hit the racket, or hit a brick using these object's
     * rectangles.
     * Attemps to imitate how a birdie would change direction when coming into contact with bricks and
     * a racket. The motions are not perfect, but closely imitate reality. 
     */
    private void checkCollision()
    {
        Block b; //used in the loop for checking if a block was hit
        
        //check if birdie hit the bottom boundary. if it did, the player lost
        if(birdie.getY() == BOTTOM_EDGE)
        {
            stopGame();
        }
        
        //check if the birdie hit the racket. if it hit, change the y direction only.
        //this motion mirrors the incoming motion of the birdie across a vertical line of reflection.
        if((birdie.getRect()).intersects(racket.getRect()))
        {
            birdie.setYDir(-SPEED); 
        }
        
        //check if the player won by seeing if they destroyed all the blocks
        if(blocks.size() == 0)
        {
            stopGame();
        }
        else
        {
            //otherwise checks if the birdie hit a block
            for(int x = 0; x < blocks.size(); x++)
            {
                b = blocks.get(x); 
                if((birdie.getRect()).intersects(b.getRect()))
                {
                    blocks.remove(x); //if the birdie hit a block, that block is removed 
                    blockHit(b); //calls a helper method to deal with the birdie's movement
                }
            }
        }
    }    
    
    /**
     * Attempts to more accurately imitate a birdie's motion when coming into contact with a brick.
     */
    private void blockHit(Block b)
    {
        //obtains the birdie's position
        int ballLeft = (int) birdie.getRect().getMinX(); //the image's leftmost point is the lowest x value
        int ballHeight = (int) birdie.getRect().getHeight(); 
        int ballWidth = (int) birdie.getRect().getWidth();
        int ballTop = (int) birdie.getRect().getMinY(); //the top of the image is the lowest y value since 
            //the origin is the top left corner
        Point pointRight = new Point(ballLeft + ballWidth + 3, ballTop); //birdie's right
        Point pointLeft = new Point(ballLeft - 3, ballTop); //birdie's left
        Point pointTop = new Point(ballLeft, ballTop - 3); //birdie's top
        Point pointBottom = new Point(ballLeft, ballTop + ballHeight + 3); //birdie's bottom
        
        if (b.getRect().contains(pointRight)) 
        {
            //if the block contains the birdie's right, it is coming from the left and must move
            //back towards the left
            birdie.setXDir(-SPEED); 
        } 
        else 
            if (b.getRect().contains(pointLeft)) 
            {
                //if the block contains the birdie's left, it is coming from the right and must move
                //back towards the right
                birdie.setXDir(SPEED);
            }

        if (b.getRect().contains(pointTop))
        {
            //if the block contains the birdie's top, it is coming from below and must move back down
            birdie.setYDir(SPEED);
        } 
        else 
            if (b.getRect().contains(pointBottom))
            {
                //if the block contains the birdie's bottom, it is coming from the top and must
                //move back upward
                birdie.setYDir(-SPEED);
            }
    }

        
    /**
     * Uses the KeyAdapter class to connect the keyboard actions to the racket's movements. 
     */
    private class TAdapter extends KeyAdapter 
    {

        /**
         * When the key is released, the racket's keyReleased() method is called
         */
        @Override
        public void keyReleased(KeyEvent e) {
            racket.keyReleased(e);
        }

        /**
         * When the key is pressed, the racket's keyPressed() method is called
         */
        @Override
        public void keyPressed(KeyEvent e) {
            racket.keyPressed(e);
        }
    }
   
    
    /**
     * Uses the TimerTask class to create a timer that properly moves the birdie, racket and check
     * collisions as it redraws each frame
     */
    private class ScheduleTask extends TimerTask
    {
        /**
         * While the program is running and the objects interact, the frames are properly displayed.
         */
        @Override
        public void run()
        {
            birdie.move();
            racket.move();
            checkCollision();
            repaint();
        }
    }
        
}
