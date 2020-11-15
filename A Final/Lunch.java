import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
/**
 *  Sienna Sacramento
 *  Mr.Lansberger
 *  APCS: Period 3
 *  31 May 2017
 *  
 *  Lunch class - Could use lunch line picture as background
 *                  SolutionA: Need to find student ID to buy food
 *  
 *  helpful links in the making of this class:
 *      https://www.javatpoint.com/java-awt 
 *  
 */
public class Lunch extends Frame implements MouseListener, MouseMotionListener,ActionListener
{
    /**checks when both the id card and cash is found*/
    private int check;
    
    /**The x value, location, of the mouse - for backpack*/
    private int clicX;
    
    /**The x value, location, of the mouse - for books*/
    private int clicX1;
    
    /**The y value, location, of the mouse - for backpack*/
    private int clicY;
    
    /**The y value, location, of the mouse - for book*/
    private int clicY1;

    /**Boolean value used to tell whether text was dragged - for backpack*/
    private boolean drag; 
    
    /**Boolean value used to tell whether text was dragged - for books*/
    private boolean drag1; 
   
    /**This label is the one that is being dragged*/
    JLabel pack;
    
    /**JLabel also being dragged*/
    JLabel books;
    
    /**creates console window*/
    JFrame frame;
    
    /**creates panel which will be added to the JFrame*/
    JPanel panel;
    
    /**
     * constructor - where the above instance variables are initialized and where the majority of 
     * work is done
     */
    public Lunch()
    {
        check = 0;      //initializes check 
        clicX = 0;      //initializes clicX
        clicY = 0;      //initializes clicY
        clicX1 = 0;     //initializes clicX1
        clicY1 = 0;     //initializes clicY1
        drag = false;   //initializes drag
        drag1 = false;  //initializes drag1
        
        //JFrame created  
        frame = new JFrame(); 
        frame.setLayout(null);  //allows the placement of diffrent objects without frame interference
        
        //JPanel created
        panel = new JPanel(); 
        panel.setLayout(null);  //allows the placement of diffrent objects without panel interference
        panel.setBackground(Color.blue);    //covers the whole frame
        panel.setBounds(0,0,900,900);    //sets background color to blue
        
        title();  //includes the title and other notes to the panel 
        
        //invisible JLabel which will be displayed at end of class game
        final JLabel bye = new JLabel("Good Job!"); 
        bye.setFont(new Font("Serif", Font.BOLD, 40));
        bye.setForeground(Color.white); 
        bye.setBounds(600,750,500,100);
        bye.setVisible(false);
        
        //invisible JLabel which will be displayed at end of class game
        final JLabel bye1 = new JLabel("Now give Mr.L a high five"); 
        bye1.setFont(new Font("Serif", Font.BOLD, 20));
        bye1.setForeground(Color.white); 
        bye1.setBounds(570,790,500,100);
        bye1.setVisible(false);
        
        //displays image of Del Norte's campus as a background
        Icon ic0 = new ImageIcon("foodWaitMed.jpg");
        JLabel foodlines = new JLabel(ic0);
        foodlines.setBounds(0,0,900,900);
        
        Icon ic3 = new ImageIcon("5dollars.jpg");
        final JLabel sticker1 = new JLabel(ic3);    //makes larger dollar invisible and in the lower
        sticker1.setBounds(10,735,240,130);         //left corner
        sticker1.setVisible(false); 
        
        JButton money = new JButton();
        money.setBounds(300,500,150,55);
        money.setOpaque(false);                 //makes money button invisible
        money.setContentAreaFilled(false);
        money.setBorderPainted(false);
        
        Icon ic5 = new ImageIcon("idCardMed.png");
        final JLabel sticker2 = new JLabel(ic5);    //makes larger id card invisible and in the lower corner
        sticker2.setBounds(240,735,200,130);
        sticker2.setVisible(false); 
        
        JButton idButt = new JButton();
        idButt.setBounds(600,179,100,100);
        idButt.setOpaque(false);            //makes idButt button invisible
        idButt.setContentAreaFilled(false);
        idButt.setBorderPainted(false);
        
        Icon ic1 = new ImageIcon("backpackTiny.png"); 
        pack = new JLabel();                                //backpack image made a dragable object
        pack.setIcon(ic1);
        pack.setBounds(270, 400, 200, 200);
        pack.addMouseMotionListener(this);
        pack.addMouseListener(this);
        
        Icon ic6 = new ImageIcon("booksSmall.png"); 
        books = new JLabel();                               //books image made a dragable object
        books.setIcon(ic6);
        books.setBounds(550, 160, 230, 200);
        books.addMouseMotionListener(this);
        books.addMouseListener(this);
        
        //Mr.L Quotes
        final JLabel quote = new JLabel("A great man once said 'There are 10 types of people in this world.");
        quote.setFont(new Font("Serif", Font.BOLD, 20));
        quote.setForeground(Color.black); 
        quote.setBounds(20,120,1000,100);           //creates invisible JLabel
        quote.setVisible(false);
        
        //Mr.L Quotes
        final JLabel quote2 = new JLabel("Those who know binary and those who don't.' - Mr.L");
        quote2.setFont(new Font("Serif", Font.BOLD, 20));
        quote2.setForeground(Color.black); 
        quote2.setBounds(20,150,1000,100);          //creates invisible JLabel
        quote2.setVisible(false);
        
        final JLabel quote1 = new JLabel("Always pick fuchsia.");
        quote1.setFont(new Font("Serif", Font.BOLD, 20));
        quote1.setForeground(Color.black); 
        quote1.setBounds(400,670,1000,100);         //creates invisible JLabel
        quote1.setVisible(false);
        
        Icon ic8 = new ImageIcon("congratsSmall.gif");
        final JLabel party = new JLabel(ic8);
        party.setBounds(10,200,200,200);            //creates invisible gif
        party.setVisible(false);
        
        final JButton finish = new JButton("Finish");     //makes finish button invisible
        finish.setBounds(790,770,90,40);
        finish.setVisible(false);
        
        finish.addActionListener(new ActionListener()
        {
            
            /**
             * actionPreformed to end the program
             */
            
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); //ends the program                
            }
        });
        
        final JButton push = new JButton();
        push.setBounds(600,550,200,200);
        push.setOpaque(false);                  //makes push button invisible
        push.setContentAreaFilled(false);
        push.setBorderPainted(false);
        push.setVisible(false);
        
        push.addActionListener(new ActionListener()
        {
            
            /**
             * An actionPreformed for button on mr. L hand
             */
            
            public void actionPerformed(ActionEvent e)
            {
                quote.setVisible(true);     //displays quote JLabel
                quote1.setVisible(true);    //displays quote1 JLabel
                quote2.setVisible(true);    //displays quote2 JLabel
                party.setVisible(true);     //displays gif
                finish.setVisible(true);    //displays finish button
            }
        });
        
        Icon ic2 = new ImageIcon("5dollarsSmall.jpg");  //creates a dollar image where the money button will be
        final JLabel cash = new JLabel(ic2);
        cash.setBounds(300,500,150,55);
        
        money.addActionListener(new ActionListener()
        {
            
            /**
             * actionPreformed for the money in order to drag it
             */
            
            public void actionPerformed(ActionEvent e)
            {
                cash.setVisible(false);     //sets the small dollar image under the money button invisible
                sticker1.setVisible(true);  //sets the larger dollar image to visible - located in corner

                check++; //indicates money was located
                if(check == 2)  //if both money and id have been found then...
                {
                    bye.setVisible(true);   //text appears
                    bye1.setVisible(true);  //text appears
                    push.setVisible(true);  //invisible button activated under Mr.L
                }
            }
        });
        
        Icon ic4 = new ImageIcon("idCardSmall.png");    //creates an id image where the idButt button will be
        final JLabel id = new JLabel(ic4);
        id.setBounds(600,179,100,100);
        
        idButt.addActionListener(new ActionListener()
        {
            
            /**
             * actionPreformed for the idCard in order to drag it
             */
            
            public void actionPerformed(ActionEvent e)
            {
                id.setVisible(false); //sets the small id image under the idButt button invisible
                sticker2.setVisible(true);  //sets the larger id image to visible - located in corner
                
                check++; //indicates id was located
                if(check == 2)//if both money and id have been found then...
                {
                     bye.setVisible(true);  //text appears
                     bye1.setVisible(true); //text appears 
                     push.setVisible(true); //invisible button activated under Mr.L
                }
            }
        });
        
        //adds objects above to panel 
        panel.add(finish); 
        panel.add(bye1);
        panel.add(bye);
        panel.add(party);
        panel.add(quote2);
        panel.add(push);
        panel.add(quote1);
        panel.add(quote);
        panel.add(books);
        panel.add(sticker2);
        panel.add(idButt); 
        panel.add(id); 
        panel.add(sticker1);
        panel.add(pack);
        panel.add(cash);
        panel.add(money);
        panel.add(foodlines);
        
        //panel added to frame and frame set to Visible
        frame.add(panel); 
        frame.setSize(900,900); 
        frame.setVisible(true); 
    }
    
    /**
     *  <b>summary</b>: creates the title and instructions then adds them to panel as JLables 
     */
    public void title()
    {
        //adds the major title of the class
        JLabel title = new JLabel("It's Lunch Time!!"); 
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.white); 
        title.setBounds(290,1,500,100); 
        
        //directions and instructions
        JLabel descrip = new JLabel("However, you can't buy lunch without your ID card or money. You'll have to search for it.");
        descrip.setFont(new Font("Serif", Font.BOLD, 20));
        descrip.setForeground(Color.white); 
        descrip.setBounds(75,50,1000,100);
        
        //displays picture of Mr.L
        Icon ic7 = new ImageIcon("MrLSmall.jpg");
        JLabel man = new JLabel(ic7);
        man.setBounds(600,550,200,200);
        
        //displays picture of a football
        Icon ic9 = new ImageIcon("footballSmall.png");
        JLabel play = new JLabel(ic9);
        play.setBounds(40,500,150,200);
        
        //adds objects above to panel
        panel.add(descrip); 
        panel.add(title); 
        panel.add(man);
        panel.add(play);
    }
    
    /**
     * <b>summary</b>: tracks mouse
     */
    public void mousePressed(MouseEvent e)
    {
        drag = true;
        if (e.getSource() == pack) 
        {
            clicX = e.getX();
            clicY = e.getY();
        }
        drag1 = true;
        if (e.getSource() == books) 
        {
            clicX1 = e.getX();
            clicY1 = e.getY();
        }
    }
        
    /**
     * <b>summary</b>: sets drag and drag1 to false beacuse the mouse no longer holds draggable object
     */
    
    public void mouseReleased(MouseEvent e)
    {
        drag = false;
        drag1 = false;
    }
        
    /**
     * <b>summary</b>: moves the draggable object along with the position of the mouse
     */
    
    public void mouseDragged(MouseEvent e) 
    {
        if (e.getSource() == pack) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
        if (e.getSource() == books) 
        {
            JComponent jc = (JComponent)e.getSource();
            jc.setLocation(jc.getX()+e.getX()-clicX, jc.getY()+e.getY()-clicY);
        }
    }
    
    /**
     * <b>summary</b>: methods a part of the MouseListener, MouseMotionListener, and ActionListener interfaces
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
    
    /**
     * Method actionPreformed invokes the action preformed by a button
     */
    
    public void actionPerformed( ActionEvent e ) {} 
    
    
}
