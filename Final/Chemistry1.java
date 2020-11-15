import java.awt.*;
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;
public class Chemistry
{
    static private int y = 610; 
    int x;
    int value; 
    boolean correct;
    JFrame f; 
    JLabel response = new JLabel("Wrong! Try Again.");
            JLabel response2 = new JLabel("Correct!! Keep Going.");
                    String[] questions = new String[3];
                            JLabel game = new JLabel("A++"); 
                                    JButton end = new JButton("Finish");
                                            int[] points = new int[3];
    Chemistry()
    { 

        questions[0] = "Orange, violet, yellow, blue, red, and indigo. What’s the missing color that is in a rainbow?";
        questions[1] = "This is a type of fruit, but it is not a lime. There are no other words with which this word can rhyme.";
        questions[2] = "It rhymes with frown and it is something you'll see if you look down.";
        

        points[0] = 87;
        points[1] = 111;
        points[2] = 103;
        
        x = 0; value = 0; correct = false;
        
         f = new JFrame("Chemistry Class"); 
        f.setLayout(null);
        
        JPanel panel = new JPanel(); 
        panel.setLayout(null); 
        panel.setBounds(0,0,900,900);
        panel.setBackground(Color.blue); 
  
        
        JLabel title = new JLabel("Chemistry Class"); 
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.white); 
        title.setBounds(315,5,500,100); 
        
        JLabel descrip = new JLabel("Today in Chemistry class you will be combining various solutions");
        descrip.setFont(new Font("Serif", Font.BOLD, 20));
        descrip.setForeground(Color.white); 
        descrip.setBounds(315,70,1000,100);
        
        JLabel descrip1 = new JLabel("to create one powerful chemical. Have fun, but also be careful.");
        descrip1.setFont(new Font("Serif", Font.BOLD, 20));
        descrip1.setForeground(Color.white); 
        descrip1.setBounds(315,100,1000,100);
        
        JLabel descrip2 = new JLabel("You are only allowed to mix two chemicals together to get the");
        descrip2.setFont(new Font("Serif", Font.BOLD, 20));
        descrip2.setForeground(Color.white); 
        descrip2.setBounds(315,130,1000,100);
        
        JLabel descrip3 = new JLabel("desired result. No more and no less.");
        descrip3.setFont(new Font("Serif", Font.BOLD, 20));
        descrip3.setForeground(Color.white); 
        descrip3.setBounds(315,160,1000,100);
        
        Icon ico = new ImageIcon("medMoving.gif"); 
        JLabel lab = new JLabel(ico);     
        lab.setBounds(-100,80,500,200);
        
        Icon ic1 = new ImageIcon("colors2.png"); 
        JLabel lab1 = new JLabel(ic1); 
        lab1.setBounds(25,550,400,285);
        
        Icon ic2 = new ImageIcon("beaker.png"); 
        JLabel lab2 = new JLabel(ic2); 
        lab2.setBounds(500,400,250,300);
        
        final TextField tf = new TextField(); 
        tf.setText(questions[x]);
        tf.setBounds(25,320,700,30); 
        
        JButton prob1 = new JButton("Next Question"); 
        prob1.setBounds(50,390,150,30); 
        
        JButton enter = new JButton("Enter Answer"); 
        enter.setBounds(300,390,150,30); 
        
        JButton orange = new JButton(); 
        orange.setBounds(58,550,50,285);
        orange.setOpaque(false);
        orange.setContentAreaFilled(false);
        orange.setBorderPainted(false);
      
        Icon obar = new ImageIcon("orangeBar.png"); 
        final JLabel lab3 = new JLabel(obar); 
        lab3.setVisible(false); 
        
        JButton yellow = new JButton(); 
        yellow.setBounds(130,550,50,285);
        yellow.setOpaque(false);
        yellow.setContentAreaFilled(false);
        yellow.setBorderPainted(false);
        
        Icon ybar = new ImageIcon("yellowBar.jpg"); 
        final JLabel lab4 = new JLabel(ybar); 
        lab4.setVisible(false); 
        
        JButton green = new JButton(); 
        green.setBounds(200,550,50,285);
        green.setOpaque(false);
        green.setContentAreaFilled(false);
        green.setBorderPainted(false);
        
        Icon gbar = new ImageIcon("greenBar.png"); 
        final JLabel lab5 = new JLabel(gbar); 
        lab5.setVisible(false); 
        
        JButton blue = new JButton(); 
        blue.setBounds(272,550,50,285);
        blue.setOpaque(false);
        blue.setContentAreaFilled(false);
        blue.setBorderPainted(false);
        
        Icon bbar = new ImageIcon("blueBar.png"); 
        final JLabel lab6 = new JLabel(bbar); 
        lab6.setVisible(false);
        
        JButton purple = new JButton(); 
        purple.setBounds(342,550,50,285);
        purple.setOpaque(false);
        purple.setContentAreaFilled(false);
        purple.setBorderPainted(false);
        
        Icon pbar = new ImageIcon("purpleBar.png"); 
        final JLabel lab7 = new JLabel(pbar); 
        lab7.setVisible(false);
        
        response.setFont(new Font("Serif", Font.BOLD, 40));
        response.setForeground(Color.red); 
        response.setBounds(80,450,500,100);
        response.setVisible(false); 
        
        response2.setFont(new Font("Serif", Font.BOLD, 40));
        response2.setForeground(Color.red); 
        response2.setBounds(80,450,500,100);
        response2.setVisible(false); 
        

        game.setFont(new Font("Serif", Font.BOLD, 100));
        game.setForeground(Color.yellow); 
        game.setBounds(550,720,500,100); 
        game.setVisible(false); 
        

        end.setBounds(770,730,100,100);
        end.setVisible(false); 

          end.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                new Lunch1();
            }
        });
        
        prob1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                response.setVisible(false);
                response2.setVisible(false); 
                if(correct)
                {
                     if(x <= 1)
                     {
                         x++;
                         tf.setText(questions[x]);
                     }
                     else
                     {
                         game.setVisible(true); 
                         end.setVisible(true); 
                     }
                }
                
                correct = false; 
                            
            }
        });
        
        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                    response.setVisible(false);
                    response2.setVisible(false); 
                
                    if(points[x] == value)
                    {
                        correct = true; 
                        response2.setVisible(true); 
                    }
                    else
                    {
                        response.setVisible(true); 
                    }
                    
                    lab3.setVisible(false); 
                    lab4.setVisible(false);
                    lab5.setVisible(false);
                    lab6.setVisible(false);
                    lab7.setVisible(false);

                    value = 0; 
                    y = 610; 
                    
            }
        });
        
        orange.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)
                {
                    lab3.setBounds(510,y,230,60); 
                    lab3.setVisible(true); 
                    value += 27;
                    y -= 60;
                }
                else
                {
                    value = 0;
                     y = 610; 
                }
                   
            }
        });
        
        yellow.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)
                {
                    lab4.setBounds(510,y,230,60); 
                    lab4.setVisible(true); 
                    value += 82;
                    y -= 60;
                }
                else
                {
                    y = 610; 
                    value = 0;
                }  
            }
        });
        
        green.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)
                {
                    lab5.setBounds(510,y,230,60); 
                    lab5.setVisible(true); 
                    value += 76;
                    y -= 60;
                }
                else
                {
                   y = 610; 
                   value = 0;
                }
                   
            }
        });
        
        blue.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)
                {
                    lab6.setBounds(510,y,230,60); 
                    lab6.setVisible(true); 
                    value += 5;
                    y -= 60;
                }
                else
                {
                    y = 610;
                    value = 0;
                }
                     
            }
        });
        
        purple.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(y >= 550)
                {
                    lab7.setBounds(510,y,230,60); 
                    lab7.setVisible(true); 
                    value += 29;
                    y -= 60;
                }
                else
                {
                   y = 610;
                   value = 0;
                }
                     
           }
        });
        
        panel.add(end); 
        panel.add(game);
        panel.add(lab2);
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
        panel.add(descrip3);
        panel.add(orange); 
        panel.add(prob1);
        panel.add(lab1); 
        panel.add(lab);  
        panel.add(title);
        panel.add(descrip); 
        panel.add(descrip1);
        panel.add(descrip2);
        panel.add(tf); 
        f.add(panel);
        f.setSize(900,900); 
        f.setVisible(true); 
    }
    
   
   
    
    
}