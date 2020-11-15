
/**
 * Write a description of class AWTTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
public class Maths implements MouseListener, MouseMotionListener,ActionListener
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
    JLabel find; 
    
    /**The frame of this class*/
    JFrame frame;
    
    /***/
    JLabel text;
    JLabel click1;
    JLabel intro;
    JLabel intro2;
    Button right;
    Maths()
    {  
        //Intializes the intance variables
        clicX = 0;
        clicY = 0;
        drag = false; 
        find = new JLabel("What is the Value of x");   
        right = new Button("30");
        
        screens();          
    } 
    
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
    public void labels()
    {
        //Declaration of the text
        text = new JLabel("WRONG");  
        intro = new JLabel("Welcome to your first class math.");
        intro2 = new JLabel("Please answer this math problem to continue");
        
        //sets the bounds of the labels
        text.setBounds(374, 300, 100, 100);
        intro.setBounds(250, 260, 350, 100);
        intro2.setBounds(230, 280, 400, 100);
        
        //sets the fonts of the labels
        Font font = new Font("Serif", Font.BOLD,20);
        text.setFont(font);
        intro.setFont(font);
        intro2.setFont(font);
        
        //sets the WRONG text to invisible until triggered by user
        text.setVisible(false);
        
        //adds all three labels onto the classroom image
        click1.add(text);
        click1.add(intro);
        click1.add(intro2);
    }
    
    
    public void button()
    {
        JButton wrong = new JButton("35");
        JButton wrong2 = new JButton("40");
        JButton wrong3 = new JButton("45");
        JButton wrong4 = new JButton("50");
        JButton wrong5 = new JButton("55");                
        wrong.setBounds(210, 380, 80, 30);
        wrong2.setBounds(300, 380, 80, 30);
        wrong3.setBounds(380, 380, 80, 30);
        wrong4.setBounds(460, 380, 80, 30);
        wrong5.setBounds(540, 380, 80, 30);             
        right.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                frame.remove(pan);
            }  
        });           
        wrong.addActionListener(this);
        wrong2.addActionListener(this);
        wrong3.addActionListener(this);       
        wrong4.addActionListener(this);
        wrong5.addActionListener(this);
        click1.add(wrong);
        click1.add(wrong2);
        click1.add(wrong3);
        click1.add(wrong4);
        click1.add(wrong5);                                     
    }
    
    
    
    
    public void actionPerformed( ActionEvent e )  
    {  
        intro.setVisible(false);
        intro2.setVisible(false);
        text.setVisible(true);
    }  
    
    public void mousePressed(MouseEvent e)
    {
        drag = true;
        if (e.getSource() == find) 
        {
            clicX = e.getX();
            clicY = e.getY();
        }
    }
        
    @Override
    public void mouseReleased(MouseEvent e)
    {
        drag = false;
    }
        
    @Override
    public void mouseDragged(MouseEvent e) 
    {
        if (e.getSource() == find) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
    }
    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    
}
