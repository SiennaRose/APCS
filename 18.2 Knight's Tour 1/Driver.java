
/**
 * 18.2 Knight's Tour 1
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * 19 December 2016
 */
public class Driver
{
    /**
     * driver class - declares a KTour class which attempts to solve Loenhard Euler's chess puzzle
     * a knight chess piece must move across a chess board hitting ever square only once or until
     * it gets stuck. 
     */
    public static void main(String[] args)
    {
        KTour k = new KTour(); 
        boolean gallop = false; 
        int count = 0; 
        
        do
        {
            gallop = k.move(); 
            count++; 
        }
        while((gallop) && count != 64); 
        
        k.printKnight(); 
    }
}
