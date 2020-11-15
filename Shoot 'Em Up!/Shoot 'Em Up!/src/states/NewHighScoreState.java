package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import elements.InputField;
import elements.Score;
import graphics.StarCycle;
import main.Game;
import main.KeyManager;
import main.MouseManager;

public class NewHighScoreState extends State
{
	private InputField inputField;
	
	private boolean inputing;
	
	private long score;
	private ArrayList<Color> randomColors;
	
	private int color;
	private int width, height;

	private int difficulty;

	
	
	public NewHighScoreState(StateManager stateManager, StarCycle starCycle,KeyManager keyManager, MouseManager mouseManager, int width, int height, long score, int difficulty) 
	{
		super(stateManager,starCycle,keyManager, mouseManager, width, height);
		inputField = new InputField(keyManager,280,500,3);

		color = 0;
		
		inputing = true;
		this.score = score;
		randomColors = new ArrayList<Color>();
		randomColors.add(Color.RED);
		randomColors.add(Color.YELLOW);
		randomColors.add(Color.BLUE);
		randomColors.add(Color.GREEN);
		randomColors.add(Color.ORANGE);
		randomColors.add(Color.MAGENTA);
		
		this.width = width;
		this.height = height;
		this.difficulty = difficulty;
	}

	@Override
	public void update() 
	{
		starCycle.update();
		
		if(inputing)
			inputField.update();
		
		if(inputing && keyManager.enter && inputField.filledOut())
		{
			inputing = false;
			keyManager.enter = false;
			Game.newHighScore(new Score(inputField.getName(),score));
			
		}
		
		if(!inputing)
		{
			if(keyManager.enter)
				stateManager.setState(new GameState(stateManager, starCycle, keyManager, mouseManager,width, height, difficulty));
			
			if(keyManager.backspace)
				stateManager.setState(new MenuState(stateManager, starCycle, keyManager, mouseManager, width, height));
		}
		
		color = (int)(System.nanoTime()%6);
	}

	@Override
	public void render(Graphics g) 
	{
		starCycle.render(g);
		
		if(inputing)
			inputField.render(g);
		
		g.setFont(new Font("New Courier",1,75));
		g.setColor(randomColors.get(color));
		g.drawString("NEW HIGH SCORE",90,100);
		
		if(inputing)
		{
			g.setColor(Color.WHITE);
			g.setFont(new Font("New Courier",1,50));
			g.drawString("Please enter your intials:", 100, 200);
		}
		
		if(!inputing)
		{
			g.setColor(Color.WHITE);
			g.setFont(new Font("New Courier",1,25));
			g.drawString("Press enter for a new game or backspace to return to the menu.",25,520);
		}
	}

}
