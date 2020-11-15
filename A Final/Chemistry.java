import java.awt.*;
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;
/**
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * 31 May 2017
 * 
 * Chemistry class - trying to find the right combination of mixtures for a chemistry class
 * Have a big empty flask and give hints to which combination.
 * Resets when user chooses wrong combination.
 * Have a riddle in order to give hints as to what they have to mix. 
 * (i.e. when wanting to make green → The sun and the sky molded together and created a nighthawk
 * (since it’s green))
 * 
 * helpful links in the making of this class:
 *      https://www.javatpoint.com/java-awt 
 * 
 */
public class Chemistry
{
    /**y coordinate for colored bar icons*/
    static private int y = 610; 
    
    /**tracks problem number user is on*/
    private int x;
    
    /**accumulates point values for each color*/
    private int value; 
    
    /**checks if input matches answer*/
    private boolean correct;
    
    /**creates console window*/
    private JFrame f; 
    
    /**puts up to screen whether the answer given was wrong*/
    private JLabel response;
    
    /**puts up to screen whether the answer given was correct*/
    private JLabel response2;
    
    /**an array of Strings holding the questions needed to be ansered*/
    private String[] questions;
    
    /**label which gets put on screen when all problems are completed*/
    private JLabel game; 
    
    /**button appears when all problems are completed*/
    private JButton end;
    
    /**array of numbers which hold the correct point values for each problem*/
    private int[] points;
    
    /**creates panel which will be added to the JFrame*/
    JPanel panel;
    
    /**creates a textField where the questions will be presented**/
    TextField tf;
  
    /**
     * constructor - where the above instance variables are initialized and where the majority of 
     * work is done
     */
    Chemistry()
    { 
        //sets label to screen at end of game
        game = new JLabel("A++");
        game.setFont(new Font("Serif", Font.BOLD, 100));
        game.setForeground(Color.yellow); 
        game.setBounds(550,720,500,100); 
        game.setVisible(false);         //game is invisible
        
        //sets label to screen if enter button is clicked and input was wrong
        response = new JLabel("Wrong! Try Again.");
        response.setFont(new Font("Serif", Font.BOLD, 40));
        response.setForeground(Color.red); 
        response.setBounds(80,450,500,100);
        response.setVisible(false);     //response is invisible
        
        //sets label to screen if enter button is clicked and input was correct
        response2 = new JLabel("Correct!! Keep Going.");
        response2.setFont(new Font("Serif", Font.BOLD, 40));
        response2.setForeground(Color.red); 
        response2.setBounds(80,450,500,100);
        response2.setVisible(false);    //response2 is invisible
        
        //questions posed to user. Will be presented in a textField
        //0 = blue yellow 
        //1 = purple yellow
        //2 = green orange
        questions = new String[3];
        questions[0] = "Orange, violet, yellow, blue, red, and indigo. What’s the missing color that is in a rainbow?";
        questions[1] = "This is a type of fruit, but it is not a lime. There are no other words with which this word can rhyme.";
        questions[2] = "It rhymes with frown and it is something you'll see if you look down.";
        
        //each color has a specified point value. The values in points represent the summation
        //of two different colors
        points = new int[3];
        points[0] = 87;
        points[1] = 111;
        points[2] = 103;
        
        x = 0; //starting problem number
        value = 0; //initializing value 
        correct = false;  //initializing correct
        
        f = new JFrame("Chemistry Class"); 
        f.setLayout(null);  //allows the placement of diffrent objects without frame interference
        
        panel = new JPanel(); 
        panel.setLayout(null);      //allows the placement of diffrent objects without panel interference
        panel.setBounds(0,0,900,900);   //covers the whole frame
        panel.setBackground(Color.blue);    //sets background color to blue
        
        title(); //includes the title and other notes to the panel 
        
        tf = new TextField();              
        tf.setText(questions[x]);       //textfield created to display questions
        tf.setBounds(25,320,700,30); 
        
        JButton orange = new JButton(); 
        orange.setBounds(58,550,50,285);
        orange.setOpaque(false);                //makes orange button invisible
        orange.setContentAreaFilled(false);
        orange.setBorderPainted(false);
      
        Icon obar = new ImageIcon("orangeBar.png");     //creates invisible orange bar Image
        final JLabel lab3 = new JLabel(obar); 
        lab3.setVisible(false); 
        
        orange.addActionListener(new ActionListener()
        {
            
            /**
             * Button for the orange bar
             */
            
            public void actionPerformed(ActionEvent e)
            {
                    if(y >= 550) //if the beaker is not filled
                    {
                        lab3.setBounds(510,y,230,60); 
                        lab3.setVisible(true); //displays orange bar image
                        value += 27;    //point value of orange
                        y -= 60;    //sets up to fill first half of beaker
                    }
                    else
                    {
                        //if beaker is full resets value and y coordinate
                        value = 0;  
                        y = 610; 
                    }
            }
        });
        
        JButton yellow = new JButton(); 
        yellow.setBounds(130,550,50,285);
        yellow.setOpaque(false);                //makes yellow button invisible
        yellow.setContentAreaFilled(false);
        yellow.setBorderPainted(false);
        
        Icon ybar = new ImageIcon("yellowBar.jpg");     //creates invisible yellow bar image
        final JLabel lab4 = new JLabel(ybar); 
        lab4.setVisible(false); 
        
        yellow.addActionListener(new ActionListener()
        {
            
            /**
             * Button for the yellow bar
             */
            
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)     //if the beaker is not filled
                {
                    lab4.setBounds(510,y,230,60); 
                    lab4.setVisible(true);  //displays yellow bar image
                    value += 82;    //point value of yellow
                    y -= 60; //sets up to fill first half of beaker
                }
                else
                {
                    //if beaker is full resets value and y coordinate
                    y = 610; 
                    value = 0;
                }  
            }
        });
        
        JButton green = new JButton(); 
        green.setBounds(200,550,50,285);
        green.setOpaque(false);                 //makes green button invisible
        green.setContentAreaFilled(false);
        green.setBorderPainted(false);
        
        Icon gbar = new ImageIcon("greenBar.png");      //creates invisible green bar image
        final JLabel lab5 = new JLabel(gbar); 
        lab5.setVisible(false); 
        
        green.addActionListener(new ActionListener()
        {
            
            /**
             * Button for the green bar
             */
            
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)     //if the beaker is not filled
                {
                    lab5.setBounds(510,y,230,60); 
                    lab5.setVisible(true); //displays green bar image
                    value += 76;    //point value of green
                    y -= 60; //sets up to fill first half of beaker
                }
                else
                {
                   //if beaker is full resets value and y coordinate
                   y = 610; 
                   value = 0;
                }
                   
            }
        }); 
        
        JButton blue = new JButton(); 
        blue.setBounds(272,550,50,285);
        blue.setOpaque(false);                  //makes blue button invisible
        blue.setContentAreaFilled(false);
        blue.setBorderPainted(false);
        
        Icon bbar = new ImageIcon("blueBar.png");       //creates invisible blue bar image
        final JLabel lab6 = new JLabel(bbar); 
        lab6.setVisible(false);
        
        blue.addActionListener(new ActionListener()
        {
            
            /**
             * This actionPreformed this is for the blue bar
             */
            
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)     //if the beaker is not filled
                {
                    lab6.setBounds(510,y,230,60); 
                    lab6.setVisible(true); //displays blue bar image
                    value += 5;     //point value of blue
                    y -= 60; //sets up to fill first half of beaker
                }
                else
                {
                    //if beaker is full resets value and y coordinate
                    y = 610;
                    value = 0;
                }
                     
            }
        });
        
        JButton purple = new JButton(); 
        purple.setBounds(342,550,50,285);
        purple.setOpaque(false);                //makes purple button invisible
        purple.setContentAreaFilled(false);
        purple.setBorderPainted(false);
        
        Icon pbar = new ImageIcon("purpleBar.png");         //creates invisible purple bar image
        final JLabel lab7 = new JLabel(pbar); 
        lab7.setVisible(false);
        
        purple.addActionListener(new ActionListener()
        {
            
            /**
             * Buttom for the purple bar
             */
            
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)     //if the beaker is not filled
                {
                    lab7.setBounds(510,y,230,60); 
                    lab7.setVisible(true); //displays purple bar image
                    value += 29;    //point value of purple
                    y -= 60; //sets up to fill first half of beaker
                }
                else
                {
                   //if beaker is full resets value and y coordinate
                   y = 610;
                   value = 0;
                }
                     
           }
        }); 
        
        JButton prob1 = new JButton("Next Question");   //button to move on to next question
        prob1.setBounds(50,390,150,30); 
        
        prob1.addActionListener(new ActionListener()
        {
            
            /**
             * Button for the next button
             */
            
            public void actionPerformed(ActionEvent e)
            {
                //sets correct or wrong notes to invisible
                response.setVisible(false); 
                response2.setVisible(false); 
                if(correct) //if answer inputed was correct - set in enter button
                {
                     if(x <= 1) //keeps track of which problem user is on
                     {
                         x++;
                         tf.setText(questions[x]);  //next question
                     }
                     else
                     {
                         //if all problems are solved class segways to next part of game
                         game.setVisible(true); 
                         end.setVisible(true); 
                     }
                }
                
                correct = false;         
            }
        });
        
        JButton enter = new JButton("Enter Answer");    //checks answer
        enter.setBounds(300,390,150,30); 
        
        enter.addActionListener(new ActionListener()
        {
            
            /**
             * Button to see whether the combination is correct. If it isn't it will reset the screen
             */
            
            public void actionPerformed(ActionEvent e)
            {
                    //sets correct or wrong notes to invisible
                    response.setVisible(false);
                    response2.setVisible(false); 
                    if(points[x] == value) //checks if input matches answer
                    {
                        correct = true; 
                        response2.setVisible(true); //tells user they were correct
                    }
                    else
                    {
                        response.setVisible(true); //tells user they were wrong
                    }
                    
                    //empties beaker 
                    lab3.setVisible(false); 
                    lab4.setVisible(false);
                    lab5.setVisible(false);
                    lab6.setVisible(false);
                    lab7.setVisible(false);

                    value = 0; //value to initial position and
                    y = 610;    //resets y coordinate 
            }
        });
        
        end = new JButton("Continue");        //snds user to next event in game
        end.setBounds(770,730,100,100);
        end.setVisible(false);      //end is invisible

        end.addActionListener(new ActionListener()
        {
            
            /**
             * Button to go to lunch class
             */
            
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);    //frame is set to invisible
                new Lunch();        //calls the Lunch class
            }
        });
        
        //adds above objects to panel
        panel.add(end); 
        panel.add(game);
        panel.add(response); 
        panel.add(response2);
        panel.add(purple);
        panel.add(lab7);
        panel.add(blue);
        panel.add(lab6);
        panel.add(lab5); 
        panel.add(green);
        panel.add(lab4); 
        panel.add(yellow); 
        panel.add(enter); 
        panel.add(lab3); 
        panel.add(orange); 
        panel.add(prob1);
        panel.add(tf); 
        
        //panel added to frame and frame set to Visible
        f.add(panel);
        f.setSize(900,900); 
        f.setVisible(true); 
    }
    
    /**
     * <b>summary</b>: creates the title and instructions then adds them to panel as JLables 
     */
    public void title()
    {
        //adds the major title of the class
        JLabel title = new JLabel("Chemistry Class"); 
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.white); 
        title.setBounds(315,5,500,100); 
        
        //directions and instructions
        JLabel descrip = new JLabel("Today in Chemistry class you will be combining various solutions");
        descrip.setFont(new Font("Serif", Font.BOLD, 20));
        descrip.setForeground(Color.white); 
        descrip.setBounds(315,70,1000,100);
        
        //new line of directions and instructions
        JLabel descrip1 = new JLabel("to create one powerful chemical. Have fun, but also be careful.");
        descrip1.setFont(new Font("Serif", Font.BOLD, 20));
        descrip1.setForeground(Color.white); 
        descrip1.setBounds(315,100,1000,100);
        
        //new line of directions and instructions
        JLabel descrip2 = new JLabel("You are only allowed to mix two chemicals together to get the");
        descrip2.setFont(new Font("Serif", Font.BOLD, 20));
        descrip2.setForeground(Color.white); 
        descrip2.setBounds(315,130,1000,100);
        
        //new line of directions and instructions
        JLabel descrip3 = new JLabel("desired result. No more and no less.");
        descrip3.setFont(new Font("Serif", Font.BOLD, 20));
        descrip3.setForeground(Color.white); 
        descrip3.setBounds(315,160,1000,100);
        
        //displays gif in the left corner of panel - a gif
        Icon ico = new ImageIcon("medMoving.gif"); 
        JLabel lab = new JLabel(ico);     
        lab.setBounds(-100,80,500,200);
        
        //displays the different color as varying liquids in containers - an image
        Icon ic1 = new ImageIcon("colors2.png"); 
        JLabel lab1 = new JLabel(ic1); 
        lab1.setBounds(25,550,400,285);
        
        //displays the beaker which will hold the liquids - an image
        Icon ic2 = new ImageIcon("beaker.png"); 
        JLabel lab2 = new JLabel(ic2); 
        lab2.setBounds(500,400,250,300);
        
        //adds objects above to panel 
        panel.add(lab); 
        panel.add(lab1);
        panel.add(lab2);
        panel.add(title);
        panel.add(descrip); 
        panel.add(descrip1);
        panel.add(descrip2);
        panel.add(descrip3);
    }
    
}