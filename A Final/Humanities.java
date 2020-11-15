import java.awt.*;  
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 * This class is after the Math Class.
 * The player will have to try to find the answer to the riddle in order to proceed to the next class
 * There are a lot of JButtons as well as Panel, and Frame used in order to build this class.
 * MouseMotionListener, MouseListener, and ActionListener detects what the user does in the class that will solve the problem.
 * @author Yeonjae Hong
 *
 *
 * Sources used: https://www.javatpoint.com/java-awt 
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html 
 * https://www.tutorialspoint.com/awt/awt_event_listeners.htm
 * http://stackoverflow.com/questions/5895829/resizing-image-in-java  
 */

public class Humanities extends Frame implements MouseListener, MouseMotionListener,ActionListener
{
	/**The x value, location, of the mouse*/
    private int clicX;
    
    /**The y value, location, of the mouse*/
    private int clicY;

    /**The panel of this class*/
    private Panel panel;
    
    /**Boolean value used to tell whether text was dragged*/
    private boolean drag;   
    
    /**This label is the one that is being dragged*/
    JLabel find; 
    
    /**The frame of this class*/
    JFrame frame;
    
    /***The labels of the class*/
    JLabel click1;
    JLabel intro;
    JLabel intro2;
    Button right;
    
    //Creating a new image that would import the image of the clock.
    ImageIcon image2 = new ImageIcon("hi.gif");
    
    /**
     * The constructor of the class that initializes all the instance variables
     */
    Humanities()
    {  
        //Initializes the instance variables
        clicX = 0;
        clicY = 0;
        drag = false; 
        find = new JLabel();
        find.setIcon(image2);
        right = new Button("Time");
        
        screens();          
    } 
    
    /**
     * Method that creats a new panel and JFrame to build the class upon.
     * It calls upon helper methods in order to create the panel.
     */
    public void screens()
    {
        //Intializes the panel and frame
        panel = new Panel();
        frame = new JFrame();
        
        //Three helper methods
        images();
        labels();   
        
        //adds the panel onto the frame
        frame.add(panel);
        
        //sets the size and 
        frame.setSize(900,900);
        frame.setVisible(true);          
    }
    
    /**
     * This methods loads all the images necessary for the Humanities class to be made.
     * There are two imported images, one of the humanities class that is used as the background
     * Another for the riddle the user/player must solve.
     */
    public void images()
    {
    	JLabel click2;
        //Creates three images
        ImageIcon class1, problem;
        
        //intializes the images
        class1 = new ImageIcon("DelNorteHighSchool.jpg");
        problem = new ImageIcon("Webp.net-resizeimage.jpg");
        
        //Assigns the images to JLabels
        click1 = new JLabel(class1);
        click2 = new JLabel(problem);
        
        //sets the bounds and adds mouse action listeners to find
        find.setBounds(720, 300, 100, 100);
        find.addMouseMotionListener(this);
        find.addMouseListener(this);
        
        //Sets the bounds of right, which is the right answer
        right.setBounds(720, 300, 100,100);    
        right.setBackground(Color.white); 
        
        //Action listener for the right answer
        right.addActionListener ( new ActionListener()  
        {  
            
            /**
             * Sets the frame to be invisible and calls the executable class
             */
            
            public void actionPerformed( ActionEvent e )  
            {  
                frame.setVisible(false);
                new Badminton();
            }  
        }); 
        
        //Sets the bounds of the problem picture
        click2.setBounds(250, 300, 370, 200);
        
        //problem.setBounds(300, 130, 200, 200);
        
        //adds the three elements onto the classroom image
        click1.add(find);
        click1.add(right);
        click1.add(click2);
        
        //adds the classroom image onto the panel
        panel.add(click1);
    }
    
    /**
     * The labels method essentially gives directions on the class of what the user
     * needs to do in order to complete the class.
     */
    public void labels()
    {
        //Declaration of the text
        intro = new JLabel("Welcome to your second class English.");
        intro2 = new JLabel("Please answer this riddle to continue.");
        
        //sets the bounds of the labels
        intro.setBounds(190, 100, 500, 100);
        intro2.setBounds(200, 150, 500, 100);
        
        //sets the fonts of the labels
        Font font = new Font("Serif", Font.BOLD,30);
        intro.setFont(font);
        intro2.setFont(font);
               
        //adds all three labels onto the classroom image
        click1.add(intro);
        click1.add(intro2);
    }
    
    /**
     * The actionPerformed method sets visibility
     * As false to all the labels.
     */
    public void actionPerformed( ActionEvent e )  
    {  
        intro.setVisible(false);
        intro2.setVisible(false);
    }  
    
    /**
     * The method mousePressed method makes the game able 
     * to detect the location of where the user clicked the mouse,
     * essentially making it possible to see whether or not the user clicked 
     * the picture and the answer to go on to the next class.
     */
    public void mousePressed(MouseEvent e)
    {
        drag = true;
        if (e.getSource() == find) 
        {
            clicX = e.getX();
            clicY = e.getY();
        }
    }
        
    /**
     * The mouseReleased method determines whether or not the mouse button 
     * was released right after it was clicked. This is crucial for the game to 
     * be able to detect whether or not the user clicked on the answer button or when dragging
     * the picture to reveal the answer.
     */
    public void mouseReleased(MouseEvent e)
    {
        drag = false;
    }
        
    /**
     * The mouseDragged method determines whether or not the user had
     * dragged the mouse around. This is crucial to detect whether or not the
     * picture was moved in order to reveal the answer.
     */
    public void mouseDragged(MouseEvent e) 
    {
        if (e.getSource() == find) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
    }
    
    /**
     * Called in response to the user moving the mouse with no mouse buttons pressed. 
     * This event is fired by the component that's currently under the cursor.
     */
    public void mouseMoved(MouseEvent e) {}
    
    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent e) {}
    
    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent e) {}
    
    /**
     * Invoked when the mouse button has been clicked (pressed and released) on a component.
     */
    public void mouseClicked(MouseEvent e) {}
}
