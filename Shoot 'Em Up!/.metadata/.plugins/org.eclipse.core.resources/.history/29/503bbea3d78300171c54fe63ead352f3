package audio;

import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * <h1>GameAudio Class</h1>
 * 
 * Created:6/25/17
 * Last Updated:8/17/17
 * 
 * <p>The game audio class is meant to handle all of the audio aspects of the game.</p>
 * 
 * @author Lauryn Jefferson
 *
 */
public class GameAudio
{
	private static ArrayList<Clip> loops;
	
	public static void init()
	{
		loops = new ArrayList<Clip>();
	}
	
	/**
	 *<h2>playAudio</h2>
	 *
	 *<p>This static method takes in one parameter which is a file path.
	 *It then takes the path, opens the file, and plays the audio in that
	 *file one time.
	 *
	 * @param path the path of the audio file to be played
	 */
	public static void playAudio(String path)
	{
		try 
	    {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(GameAudio.class.getResourceAsStream(path));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } 
	    catch(Exception e) 
	    {
	        e.printStackTrace();
	    }
	}
	
	public static void playAudioLoop(String path)
	{
		try 
	    {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(GameAudio.class.getResourceAsStream(path));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
	        loops.add(clip);
	    } 
	    catch(Exception e) 
	    {
	        e.printStackTrace();
	    }	
	}
	
	public static void stopAudioLoop(int id)
	{
		loops.get(id).stop();
	}
	
}