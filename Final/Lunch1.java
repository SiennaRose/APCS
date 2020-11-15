import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
/**
 * Write a description of class Lunch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lunch extends Frame implements MouseListener, MouseMotionListener,ActionListener
{
    int check;
    /**The x value, location, of the mouse*/
    private int clicX;
    private int clicX1;
    
    /**The y value, location, of the mouse*/
    private int clicY;
    private int clicY1;

    
    /**Boolean value used to tell whether text was dragged*/
    private boolean drag; 
     private boolean drag1; 
   
    
    /**This label is the one that is being dragged*/
    JLabel pack;
    JLabel books;
    

    
    public Lunch()
    {
        JFrame frame = new JFrame(); 
        frame.setLayout(null);
        JPanel panel = new JPanel(); 
        panel.setLayout(null);
        panel.setBackground(Color.blue);
        panel.setBounds(0,0,900,900); 
        clicX = 0;
        clicY = 0;
        clicX1 = 0; 
        clicY1 = 0;
        drag = false;
        drag1 = false;
        Icon ic0 = new ImageIcon("foodWaitMed.jpg");
        JLabel foodlines = new JLabel(ic0);
        foodlines.setBounds(0,0,900,900);
        
        check = 0; 
        
        JButton money = new JButton();
        money.setBounds(300,500,150,55);
        money.setOpaque(false);
        money.setContentAreaFilled(false);
        money.setBorderPainted(false);
        
        Icon ic2 = new ImageIcon("5dollarsSmall.jpg");
        final JLabel cash = new JLabel(ic2);
        cash.setBounds(300,500,150,55);
        
        Icon ic3 = new ImageIcon("5dollars.jpg");
        final JLabel sticker1 = new JLabel(ic3);
        sticker1.setBounds(10,735,240,130);
        sticker1.setVisible(false); 
        
        JButton idButt = new JButton();
        idButt.setBounds(600,179,100,100);
        idButt.setOpaque(false);
        idButt.setContentAreaFilled(false);
        idButt.setBorderPainted(false);
        
        Icon ic4 = new ImageIcon("idCardSmall.png");
        final JLabel id = new JLabel(ic4);
        id.setBounds(600,179,100,100);
        
        Icon ic5 = new ImageIcon("idCardMed.png");
        final JLabel sticker2 = new JLabel(ic5);
        sticker2.setBounds(240,735,200,130);
        sticker2.setVisible(false); 
        
        Icon ic1 = new ImageIcon("backpackTiny.png"); 
        pack = new JLabel(); 
        pack.setIcon(ic1);
        pack.setBounds(270, 400, 200, 200);
        pack.addMouseMotionListener(this);
        pack.addMouseListener(this);
        
        Icon ic6 = new ImageIcon("booksSmall.png"); 
        books = new JLabel(); 
        books.setIcon(ic6);
        books.setBounds(550, 160, 230, 200);
        books.addMouseMotionListener(this);
        books.addMouseListener(this);
        
        JLabel title = new JLabel("It's Lunch Time!!"); 
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.white); 
        title.setBounds(290,1,500,100); 
        
        JLabel descrip = new JLabel("However, you can't buy lunch without your ID card or money. You'll have to search for it.");
        descrip.setFont(new Font("Serif", Font.BOLD, 20));
        descrip.setForeground(Color.white); 
        descrip.setBounds(75,50,1000,100);
        
        Icon ic7 = new ImageIcon("MrLSmall.jpg");
        JLabel man = new JLabel(ic7);
        man.setBounds(600,550,200,200);
        
        final JButton push = new JButton();
        push.setBounds(600,550,200,200);
        push.setOpaque(false);
        push.setContentAreaFilled(false);
        push.setBorderPainted(false);
        push.setVisible(false);
        
        final JLabel quote = new JLabel("A great man once said 'There are 10 types of people in this world.");
        quote.setFont(new Font("Serif", Font.BOLD, 20));
        quote.setForeground(Color.black); 
        quote.setBounds(20,120,1000,100);
        quote.setVisible(false);
        
        final JLabel quote2 = new JLabel("Those who know binary and those who don't.' - Mr.L");
        quote2.setFont(new Font("Serif", Font.BOLD, 20));
        quote2.setForeground(Color.black); 
        quote2.setBounds(20,150,1000,100);
        quote2.setVisible(false);
        
        final JLabel quote1 = new JLabel("Always pick fuchsia.");
        quote1.setFont(new Font("Serif", Font.BOLD, 20));
        quote1.setForeground(Color.black); 
        quote1.setBounds(400,670,1000,100);
        quote1.setVisible(false);
        
        Icon ic8 = new ImageIcon("congratsSmall.gif");
        final JLabel party = new JLabel(ic8);
        party.setBounds(10,200,200,200);
        party.setVisible(false);
        
        Icon ic9 = new ImageIcon("footballSmall.png");
        JLabel play = new JLabel(ic9);
        play.setBounds(40,500,150,200);
        
        final JLabel bye = new JLabel("Good Job!"); 
        bye.setFont(new Font("Serif", Font.BOLD, 40));
        bye.setForeground(Color.white); 
        bye.setBounds(600,750,500,100);
        bye.setVisible(false);
        
        final JLabel bye1 = new JLabel("Now give Mr.L a high five"); 
        bye1.setFont(new Font("Serif", Font.BOLD, 20));
        bye1.setForeground(Color.white); 
        bye1.setBounds(570,790,500,100);
        bye1.setVisible(false);
        
        final JButton finish = new JButton("Continue");
        finish.setBounds(800,800,70,70);
        finish.setVisible(false);
        
        finish.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        
         push.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                quote.setVisible(true); 
                quote1.setVisible(true);
                quote2.setVisible(true);
                party.setVisible(true);
                finish.setVisible(true); 
            }
        });
        
        money.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                cash.setVisible(false); 

                 check++; 
                if(check == 2)
                {
                    bye.setVisible(true);
                    bye1.setVisible(true);
                    push.setVisible(true);
                    
                }
            }
        });
        
        idButt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                id.setVisible(false); 
                sticker2.setVisible(true);
                 check++; 
                if(check == 2)
                {
                     bye.setVisible(true);
                     bye1.setVisible(true);
                     push.setVisible(true);
                }
            }
        });
        
        panel.add(finish); 
        panel.add(bye1);
        panel.add(play);
        panel.add(bye);
        panel.add(party);
        panel.add(quote2);
        panel.add(push);
        panel.add(quote1);
        panel.add(quote);
        panel.add(man);
        panel.add(books);
        panel.add(sticker2);
        panel.add(idButt); 
        panel.add(id); 
        panel.add(sticker1);
        panel.add(pack);
        panel.add(cash);
        panel.add(money);
        panel.add(descrip); 
        panel.add(title); 
        panel.add(foodlines);
        
        
        frame.add(panel); 
        frame.setSize(900,900); 
        frame.setVisible(true); 
    }
    
  
    
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
        

    public void mouseReleased(MouseEvent e)
    {
        drag = false;
        drag1 = false;
    }
        

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
    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void actionPerformed( ActionEvent e ) {} 
    
    
}
