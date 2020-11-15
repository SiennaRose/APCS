package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import audio.GameAudio;
import elements.CommandBar;
import elements.RockManager;
import elements.Ship;
import graphics.StarCycle;
import main.Game;
import main.KeyManager;
import main.MouseManager;

public class GameState extends State
{
	private Ship ship;
	
	private RockManager rockManager;
	private CommandBar commandBar;
	
	private int difficulty;
	
	private boolean paused;
	
	public GameState(StateManager stateManager, StarCycle starCycle,KeyManager keyManager, MouseManager mouseManager, int width, int height, int difficulty)
	{
		super(stateManager,starCycle,keyManager, mouseManager, width, height);
		ship = new Ship(keyManager,width,height);
		
		this.difficulty = difficulty;
		
		rockManager = new RockManager(ship,difficulty,width,height);
		commandBar = new CommandBar(ship,width,height);
		
		paused = false;
		
		GameAudio.playAudioLoop("/audio/ShootEmUpSong.wav");
	}
	
	
	@Override
	public void update() 
	{
		if(keyManager.p)
		{
			paused = !paused;
			keyManager.p = false;
		}
			
		
		
		starCycle.update();
		
		if(!paused)
		{

			ship.overheat(commandBar.isOverheated());

			ship.update();

			rockManager.update();

			commandBar.update();


			if(ship.isGameOver())
			{
				GameAudio.stopAudioLoop(0);
				if(ship.getScore() > Game.getHighScores().get(Game.getHighScores().size()-1).getScore())
					stateManager.setState(new NewHighScoreState(stateManager,starCycle,keyManager,mouseManager,width,height,ship.getScore(),difficulty));
				else
					stateManager.setState(new GameOverState(stateManager,starCycle,keyManager,mouseManager,width,height,this,difficulty));
			}
		}
			
	}

	@Override
	public void render(Graphics g)
	{	
		starCycle.render(g);
		
		ship.render(g);
		
		rockManager.render(g);
		
		commandBar.render(g);
		
		if(paused)
		{
			g.setFont(new Font("Courier New",1,60));
			g.setColor(Color.WHITE);
			g.drawString("PAUSED",400 - (int)(g.getFontMetrics().stringWidth("PAUSED")/2),400);
		}
		
	}
	
	public Ship getShip()
	{
		return ship;
	}

}
