package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import graphics.StarCycle;
import main.Game;
import main.KeyManager;
import main.MouseManager;

public class GameOverState extends State 
{
	
	private GameState gameState;
	private int difficulty;

	public GameOverState(StateManager stateManager, StarCycle starCycle,KeyManager keyManager, MouseManager mouseManager, int width, int height,GameState gameState, int difficulty) 
	{
		super(stateManager,starCycle,keyManager, mouseManager, width, height);
		this.gameState = gameState;
		this.difficulty = difficulty;
	}

	@Override
	public void update()
	{
		gameState.update();
		
		if(keyManager.enter)
			stateManager.setState(new GameState(stateManager, starCycle, keyManager, mouseManager,width, height, difficulty));
		
		if(keyManager.backspace)
			stateManager.setState(new MenuState(stateManager,starCycle, keyManager, mouseManager, width, height));
	}

	@Override
	public void render(Graphics g) 
	{
		gameState.render(g);
	
		g.setFont(new Font("Courier New",1,100));
		g.setColor(Color.RED);
		g.drawString("GAME OVER",(width/2)-(g.getFontMetrics().stringWidth("GAME OVER"))/2,height/2);
		g.setFont(new Font("New Courier",1,25));
		g.setColor(Color.WHITE);
		g.drawString("Press enter for a new game or backspace to return to the menu.",25,520);
	}

}
