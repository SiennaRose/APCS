/**
 * Class Maths is the second frame the user will see. It first provides the user with an introduction of the
 * class and what the user will have to do. They are in a classroom setting and the user must answer a math
 * problem that is on a table. There will also be 5 buttons across the table with answer choices. However, all
 * the answer chooses are wrong and the correct answer is underneath the label. The answer will
 * send the user to the next class.
 * 
 * Author: Igor Landa
 * Version: 1.1 
 * 
 * Outside Resources: 
 * http://www.cokeandcode.com/info/tut2d.html
 * https://www.javatpoint.com/java-awt
 * http://zetcode.com/tutorials/javagamestutorial/
 * https://www.abeautifulsite.net/java-game-programming-for-beginners
 * http://stackoverflow.com/questions/7358775/java-gui-frameworks-what-to-choose-swing-swt-awt-swingx-jgoodies-javafx
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html
 * https://www.reddit.com/r/java/comments/383e2c/whats_the_actual_modern_way_to_make_a_gui_with/?st=j2cuy46i&sh=7a64e608
 * https://docs.oracle.com/javase/7/docs/api/java/awt/event/MouseListener.html
 * 
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
public class Maths implements MouseListener, MouseMotionListener, ActionListener
{    
    /**The x value, location, of the mouse*/
    private int clicX;
    
    /**The y value, location, of the mouse*/
    private int clicY;

    /**The panel of this class*/
    private Panel pan;
    
    /**Boolean value used to tell whether text was dragged*/
    private boolean drag;   
    
    /**This label is the one that is being dragged*/
    private JLabel find; 
    
    /**The frame of this class*/
    private JFrame frame;
     
    /**A label that is a hint to solve the problem*/
    private JLabel hint;

    /**This prints out wrong when the user clicks on a wrong answer*/
    private JLabel text;
    
    /**click1 is the classroom image*/
    private JLabel click1;
    
    /**intro is the introduction to the class*/
    private JLabel intro;
    
    /**intro2 is the second line introduction*/
    private JLabel intro2;
    
    /**This is the right button to the question*/
    private Button right;
    
    /**To monitor how many buttons is pressed*/
    private int x;
    
    /**
     * Contructor Maths intializes the variables
     */
    Maths()
    {  
        //Intializes the intance variables
        clicX = 0;
        clicY = 0;
        drag = false; 
        find = new JLabel("What is the Value of x");   
        right = new Button("30");
        x = 0;
        screens();          
    } 
    
    /**
     * Method screens creates a Panel and a Frame. Then invokes three methods. Then adds the panel to the frame
     * Adjust the size of the frame and sets it visible
     */
    
    public void screens()
    {
        //Intializes the panel and frame
        pan = new Panel();
        frame = new JFrame();
        
        //Three helper methods
        images();
        labels();       
        button();
        
        //adds the panel onto the frame
        frame.add(pan);
        
        //sets the size and 
        frame.setSize(900,900);
        frame.setVisible(true);          
    }
    
    /**
     * Method images creates three images. One is the classroom, the second is a piece of paper, and the 
     * third is the problem. All the images are turned into JLabels so that they can be put onto the frame.
     * The bounds of the images areadjusted. Also, the label that is going to be dragged is being changed as well.
     * A mouse listener is added on the label and then added to the panel.
     */
    
    public void images()
    {
        //Creates three images
        ImageIcon image2;
        ImageIcon image3;
        ImageIcon image4;
        
        //intializes the three images
        image2 = new ImageIcon("class.jpg");
        image3 = new ImageIcon("paper2.jpg");
        image4 = new ImageIcon("problem.png");
        
        //Assigns the three images to JLabels
        click1 = new JLabel(image2);
        JLabel click2 = new JLabel(image3);
        JLabel click3 = new JLabel(image4);
        
        //Sets the bounds of the images
        click2.setBounds(320, 500, 300, 395);
        click3.setBounds(370, 525, 200, 300);
        
        //sets the bounds and adds mouse action listeners to find
        find.setBounds(400, 430, 200, 200);
        find.addMouseMotionListener(this);
        find.addMouseListener(this);
        
        
        //Sets the bounds of right, which is the right answer
        right.setBounds(450,520,50,20);    
        right.setBackground(Color.black); 
        
        //adds the four elements onto the classroom image
        click1.add(find);
        click1.add(right);
        click1.add(click3);
        click1.add(click2);
        
        //adds the classroom image onto the panel
        pan.add(click1);
    }
    
    /**
     * Method Labels creates four labels. The bounds and font are set on all four labels. Two labels are set
     * to invisible so that they can not be seen. All labels are added onto the classroom
     */
    
    public void labels()
    {
        //Declaration of the text
        text = new JLabel("WRONG");  
        intro = new JLabel("Welcome to your first class math.");
        intro2 = new JLabel("Please answer this math problem to continue");
        hint = new JLabel("Hint: The answer lies in the question");
        
        //sets the bounds of the labels
        text.setBounds(374, 300, 100, 100);
        intro.setBounds(250, 260, 350, 100);
        intro2.setBounds(230, 280, 400, 100);       
        hint.setBounds(265, 300, 350, 100);
        
        //sets the fonts of the labels
        Font font = new Font("Serif", Font.BOLD,20);
        text.setFont(font);
        intro.setFont(font);
        intro2.setFont(font);
        hint.setFont(font);
        
        //sets the WRONG text to invisible until triggered by user
        text.setVisible(false);
        hint.setVisible(false);
        
        //adds all three labels onto the classroom image
        click1.add(text);
        click1.add(intro);
        click1.add(hint);
        click1.add(intro2);
    }
    
    /**
     * Method button instantiates five buttons, which are wrong answers to the problem. It sets the bounds for the five wrong answers
     * then it adds an action listener for the right answer, which was instantiated in the contructor. Then, there is another 
     * action listener for the remaining five wrong answers. Finally, all five wrong answers are added to the classroom image
     */
    
    public void button()
    {
        //Declaration
        JButton wrong = new JButton("35");
        JButton wrong2 = new JButton("40");
        JButton wrong3 = new JButton("45");
        JButton wrong4 = new JButton("50");
        JButton wrong5 = new JButton("55");  
        
        //Sets the bounds of the buttons
        wrong.setBounds(210, 380, 80, 30);
        wrong2.setBounds(300, 380, 80, 30);
        wrong3.setBounds(380, 380, 80, 30);
        wrong4.setBounds(460, 380, 80, 30);
        wrong5.setBounds(540, 380, 80, 30);  
        
        //Action listener for the right answer
        right.addActionListener ( new ActionListener()  
        {  
            
            /**
             * Sets the frame to be invisible and calls the humanities class
             */
            
            public void actionPerformed( ActionEvent e )  
            {  
                frame.setVisible(false);
                new Humanities();
            }  
        });        
              
        //Action listeners for the wrong answers
        wrong.addActionListener(this);
        wrong2.addActionListener(this);
        wrong3.addActionListener(this);       
        wrong4.addActionListener(this);
        wrong5.addActionListener(this);
        
        //Adds the buttons onto the classroom image
        click1.add(wrong);
        click1.add(wrong2);
        click1.add(wrong3);
        click1.add(wrong4);
        click1.add(wrong5);                                     
    }
   
    /**
     * The actionPreformed method is for the wrong buttons. If the user clicks the buttons less than five times
     * then it will set the orginal labels to be invisible and will print out the text label
     * If the user clicks the button five times. It will set the text label to invisible and makes the hint label visible
     */
    
    public void actionPerformed( ActionEvent e )  
    {  
        if(x == 4) //If the user clicks 5 butttons
        {
           text.setVisible(false);
           hint.setVisible(true);
           text.setVisible(false);
        }
        else //if the user clicks less than 5 buttons
        {
            intro.setVisible(false);
            intro2.setVisible(false);
            text.setVisible(true);
            x++;
        }
    }  
    
    /**
     * Actions preformed if the mouse is pressed
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
     * Actions preformed if the mouse is released
     */
    
    @Override
    public void mouseReleased(MouseEvent e)
    {
        drag = false;
    }
        
    /**
     * Actions preformed if the mouse is dragged
     */
    
    @Override
    public void mouseDragged(MouseEvent e) 
    {
        if (e.getSource() == find) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
    }
    
    /**
     * Method mouseMoved invokes when the mouse moves
     */
    
    public void mouseMoved(MouseEvent e) {}
    
    /**
     * Method mouseEntered invoked when the mouse enters a component.
     */
    
    public void mouseEntered(MouseEvent e) {}
    
    /**
     * Method mouseExited invoked when the mouse exits a component.
     */
    
    public void mouseExited(MouseEvent e) {}
    
    /**
     * Method mouseClicked invoked when the mouse button has been clicked (pressed and released) on a component.
     */
    
    public void mouseClicked(MouseEvent e) {}
    
}
