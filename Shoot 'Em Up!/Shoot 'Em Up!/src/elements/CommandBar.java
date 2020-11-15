package elements;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.util.ArrayList;

import audio.GameAudio;
import graphics.Assets;

public class CommandBar
{
	private long score;
	private Ship ship;
	private OverheatBar overheatBar;
	
	private int width, height;
	
	private ArrayList<Heart> hearts;

	public CommandBar(Ship ship, int width, int height)
	{
		this.ship = ship;
		this.width = width;
		this.height = height;
		
		overheatBar = new OverheatBar(10,height -30, Color.RED);
		hearts = new ArrayList<Heart>();
		
		hearts.add(new Heart(width/2 - 95,height-90));
		hearts.add(new Heart(width/2- 65,height-90));
		hearts.add(new Heart(width/2 - 35, height-90));
				
	}
	
	
	public void update() 
	{
		score = ship.getScore();
		
		if(ship.hasShot())
		{
			overheatBar.setOverheat();
			GameAudio.playAudio("/audio/pew.wav");
		}
		
		overheatBar.update();
		
		ship.overheat(overheatBar.isOverheated());

		if(!hearts.isEmpty() && ship.getLives() < hearts.size())
			hearts.remove(hearts.size()-1);
	}


	public void render(Graphics g) 
	{
		//big box
		g.setColor(Color.BLACK);
		g.fillRect(0, height - height/7, width, height/7);
		g.setFont(new Font("Courier New",1,45));
		
		//label box
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(5, height - height/7 + 5, width-10, height/18);
		
		g.setColor(Color.BLACK);
		g.drawString("Command Bar",width/2 - g.getFontMetrics().stringWidth("Command Bar")/2,height - 70);
		
		g.setFont(new Font("Courier New",1,20));
		
		//score
		g.setColor(Color.WHITE);
		g.drawString("Score",width - g.getFontMetrics().stringWidth("Score") - 10,height -45);
		g.setFont(new Font("Courier New",1,45));
		g.drawString(((Long)score).toString(), width - g.getFontMetrics().stringWidth(((Long)score).toString()) - 10, height-10);
		
		g.setFont(new Font("Courier New",1,20));
		
		//overheat bar
		g.setColor(Color.ORANGE);
		g.drawString("Overheat",10,height -45);
		overheatBar.render(g);
		
		//hearts
		g.setColor(Color.RED);
		g.drawString("Lives",width/2 - g.getFontMetrics().stringWidth("Lives")/2,height -45);
		for(Heart h: hearts)
		{
			h.render(g);
		}
		
	}
	
	public boolean isOverheated()
	{
		return overheatBar.isOverheated();
	}

}
