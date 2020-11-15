import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
     public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
     }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List <Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        int size = selectedCards.size();
        boolean valid = true; 
        
        if(size == 3)
        {
            if(containsJQK(selectedCards))
                valid = true; 
            else
                valid = false; 
        }
        else
            if(size == 2)
            {
                if(containsPairSum11(selectedCards))
                    valid = true; 
                else 
                    valid = false; 
            }
            else
                valid = false; 
        return valid; 
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        boolean possible = false; 
       
        
        if(containsPairSum11(cardIndexes()))
            possible = true;
        else
            if(containsJQK(cardIndexes()))
                possible = true;
        return possible;
        
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        int size = selectedCards.size() - 1;
        int one;
        int two;
        
        for(int a = 0; a <= size; a++)
            for(int b = a + 1 ; b <= size; b++)
            {
                one = ((cardAt(selectedCards.get(a))).pointValue());
                two = ((cardAt(selectedCards.get(b))).pointValue());
                if(one + two == 11)
                    return true;
            }
        return false;
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        
        boolean jqk = false;
        int jack = 0;
        int queen = 0;
        int king = 0;
        int size = selectedCards.size() - 1;
        ArrayList board = new ArrayList(10);
        for(int k = 0; k <= size; k++)
            board.add(cardAt(selectedCards.get(k)));
            
        for(int x = 0; x <= size; x++)
        {
            
            if((((Card)board.get(x)).rank()).equals("jack"))
                jack++;
            if((((Card)board.get(x)).rank()).equals("queen"))
                queen++;
            if((((Card)board.get(x)).rank()).equals("king"))
                king++;     
        }
        if(jack > 0 && queen > 0 && king > 0)
            jqk = true;
        return jqk;
    }
}
