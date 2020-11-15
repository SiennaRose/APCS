
public class HashingDriver 
{
	public static void main(String[] args)
    {
        Hashing myHashing = new Hashing();
        myHashing.loadFile();
        myHashing.stats();
        myHashing.search();
    }
}
