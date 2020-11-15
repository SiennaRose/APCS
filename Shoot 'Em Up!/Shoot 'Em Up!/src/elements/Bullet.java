package elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import graphics.Assets;

public class Bullet extends GameElement
{
	private int x;
	private int y;
	private boolean visible;
	boolean done;
	
	public Bullet(int x,int y)
	{
		this.x = x;
		this.y = y;
		visible = true;
		done = false;
	}
	
	@Override
	public void update()
	{
		y -= 4;
		if(y < -128)
			visible = false;
	}
	
	@Override	
	public void render(Graphics g)
	{
		g.drawImage(Assets.bullet,x,y,null);
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean isVisible()
	{
		return visible;
	}
	
	public void done()
	{
		done = true;
	}

	public boolean isDone()
	{
		return done || !isVisible();
	}
	@Override
	public Rectangle getCollisionBox() {
		// TODO Auto-generated method stub
		return new Rectangle(x+44,y+48,16,16);
	}

}
