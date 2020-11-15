/**
 * Class Title1 is the first screen the user will see. It will provide the user with a little background
 * of what our program is and what the user will expect. It will ask the user to a yes and no question. 
 * If answered yes, it will send the user to the Maths class. If no, it will prompt the user to hit the yes key
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
 */

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Title1 implements ActionListener
{  
    /**The button for yes that will send the program to the next class*/
    private Button b1;
    
    /**The button for no that will print out a message*/
    private Button b2;
    
    /**The frame for this class*/
    private JFrame frame;
    
    /**The panel for this class*/
    private Panel panel;  
    
    /**A label that will be printed out when a button is pressed*/
    private Label l2;
    
    /**The main label of the program*/
    private Label l1;  
    
    /**
     * Contructor Ttile1 intializes the frame and the panel and calls screens
     */
    
    Title1()  
    {  
        //Initializes the frame and panel
        frame = new JFrame("Title");    
        panel=new Panel(); 
        
        //sends to screen method
        screen();
    }  
    
    /**
     * Method screen sets the panel's bounds and background color. Next it will add the panel onto
     * the frame and will set the size of the frame. Finally, it will set the visiblity of the frame
     */
    
    private void screen()  
    {  
        //sets the bounds and color of the panel
        panel.setBounds(0,0,900,900);    
        panel.setBackground(Color.black);  
        
        //In order to make the labels and buttons

        labels();
        button();
        
        //adds the panels to the frame and sets the size of the frame
        frame.add(panel);
        frame.setSize(900,900);  
        
        frame.setLayout(null);    
        frame.setVisible(true); //to make the frame visible  
        sleeps();
    }
    
    /**
     * Method labels creates two labels and changes their background color and foreground color
     * Then it changes the fonts of both of the color and adds both of the labels to the panel
     */
    
    private void labels()
    {
        //Creates the first label
         l1 =new Label("Are You A Del Norte Student");  
        l1.setBounds(0,0, 700,50);
        l1.setForeground(Color.white); //sets the color to white
        l1.setBackground(Color.black); //sets the background color to black
        Font font = new Font("Serif", Font.BOLD,50); //in order to change the font
        l1.setFont(font);
        
        //Creates the second label
        l2=new Label("NOW YOU'RE A DEL NORTE STUDENT SO CLICK YES");  
        l2.setLocation(500,500);
        l2.setForeground(Color.black); //sets the color to white
        l2.setBackground(Color.black); //sets the backgorund color to black
        Font font1 = new Font("Serif", Font.BOLD,20); //changes the font
        l2.setFont(font1);       
    }
    
    /**
     * Method button creates two button, one with YES on it and the other with NO on it
     * Then is will change the bounds and background color of both of the buttons. Next, it will add
     * and ActionListener to both of the buttons, so if either of them are pressed, an action will occur
     * Both buttons are added to the frame
     */
    
    private void button() 
    {
         //Creates the first button
         b1 = new Button("YES");                 
         b1.setBounds(350,400,80,30);    
         b1.setBackground(Color.black);   
         
         //Creates the second button
         b2=new Button("NO");   
         b2.setBounds(500,400,80,30);    
         b2.setBackground(Color.black);
         
         //Adds an action listener to the first button
         b1.addActionListener(this);
         
         //Adds an Action listener to the second button
         b2.addActionListener ( new ActionListener()  
         {  
             
             /**
              * This actionPreformed method will change the color of l2 in order to make it visible
              */
             
             public void actionPerformed( ActionEvent e )  
             {                   
                 l2.setForeground(Color.white); //sets the color to white
             }  
         }); 
         
         //Adds buttons to frame
         frame.add(b1); 
         frame.add(b2); 
    }
    
    /**
     * Method sleeps creates three labels. The method sets the bounds, fonts, background, and color of the labels.
     * Also, it uses thread.sleep() in order to create a pause between labels and it sets two buttons onto the frame
     */
    
    public void sleeps()  
    {
        //Declaration
        Font font2 = new Font("Serif", Font.BOLD,25);
        JLabel intro = new JLabel("Welcome to our program. This Is Del Norte.");
        JLabel intro3 = new JLabel("I will be taking you on an adventure through the life of a Del Norte student.");
        JLabel intro2 = new JLabel("First you must answer the question");
        
        //Sets the bounds of all three labels
        intro.setBounds(150,50, 700,50);
        intro2.setBounds(150,50, 700,50);
        intro3.setBounds(150,50, 700,50);
        
        //Sets the background color of all three labels
        intro.setBackground(Color.white);
        intro2.setBackground(Color.white);
        intro3.setBackground(Color.white);
        
        //Sets the color of all three labels
        intro.setForeground(Color.white);    
        intro2.setForeground(Color.white);
        intro3.setForeground(Color.white); 
        
        //Sets the font of all three labels
        intro.setFont(font2);
        intro2.setFont(font2);
        intro3.setFont(font2);
        b1.setVisible(false);
        b2.setVisible(false);
        //Adds the first label
        panel.add(intro);
        
        //Four second pause
        try
        {
            Thread.sleep(4000);        
        } 
        catch (InterruptedException e) {}
        
        //sets the first label invisible adds the second one
        intro.setVisible(false);
        panel.add(intro3);
    
        //Four second pause
        try
        {
            Thread.sleep(4000);        
        } 
        catch (InterruptedException e) {}
                  
        //sets the seond label invisible adds the third one
        intro3.setVisible(false);
        panel.add(intro2);
    
        try
        {
            Thread.sleep(4000);        
        } 
        catch (InterruptedException e) {}

        //sets the third label invisible and adds the two main labels
        intro2.setVisible(false);
        panel.add(l1);
        panel.add(l2);  
        b1.setVisible(true);
        b2.setVisible(true);
    }
    
    /**
     * This actionpreformed method is for the YES button and will get rid of the frame and call the math class
     */
    
    public void actionPerformed(ActionEvent e) 
    {
       frame.setVisible(false);

       new Maths();            
    }
    
}  

