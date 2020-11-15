import java.util.Random; 
import apcslib.*; 
/**
 * 18.2 Knight's Tour 1
 * Sienna Sacramento 
 * Mr. Lansberger
 * APCS: Period 3
 * 19 December 2016
 */
public class KTour
{
    /**SIZE is a constant for how many moves are available*/
    private final int SIZE = 8;
    /**MAX is how many rows and cols there are total in array*/
    private final int MAX = 9; 
    /**board is a matrix of integers contatining knight movement*/
    private int[][] board; 
    /**count, row, col are instance variables*/
    private int count, row, col; 
    
    /**
     * constructor - initializes the board matrix and the ints count, row , and col
     */
    public KTour()
    {
        board = new int[MAX][MAX]; 
        count = 1; 
        row = 1; 
        col = 1; 
        
        board[row][col] = count; 
    }
    
    /**
     * <b>summary</b>: choses a random move set and sends coordinates to the check() method to 
     * determine if they are viable. If they are viable then that element gets filled with the 
     * value of count. If there are no spots viable then it goes to the printKnight() method
     */
    public boolean move()
    {
        int[] vertical = {-2,-1,1,2,2,1,-1,-2};
        int[] horizontal = {1,2,2,1,-1,-2,-2,-1}; 
        int[] goodMoves = new int[SIZE]; 
        boolean cross = false;
        Random rand = new Random(); 
        int randomMove = 1, flag = 0, hold = 0, j = 0, move = 0; 
   
        //traverses through moves possible and determines if they can actually be done 
        //uses check method to check whether possible or not
        for(int i = 0; i < SIZE; i++)
        {
            if(check(vertical[i], horizontal[i]))
            {
                goodMoves[i] = i;
                flag++;
            }    
            else
                goodMoves[i] = 0; 
        }
        
        //if no moves are possible then cross returns false
        //if there are possible moves RandomMove will get a random move and use it to move knight
        if(flag != 0)
        {
            //traverses through array and moves possible moves to front of array
            for(int y = 0; y < SIZE; y++)
            {
                 if(goodMoves[y] != 0)
                 {
                     hold = goodMoves[j]; 
                     goodMoves[j] = goodMoves[y];
                     goodMoves[y] = hold; 
                     j++; 
                 }
            }

            randomMove = rand.nextInt(flag);
            
            //move gets the random move number from goodMoves array 
            move = goodMoves[randomMove]; 
            
            row = row + vertical[move]; 
            col = col + horizontal[move]; 
            count++; 
            board[row][col] = count;
            
            cross = true; 
        }
        else
            cross = false; 

        return cross; 
    }
    
    /**
     * <b>summary</b>: accepts the row and col coordinates and sees if that spot on the board matrix
     * is open. Retuns a boolean value allGood. 
     */
    public boolean check(int vertical, int horizontal)
    {
        boolean allGood = false;
        int row1 = row + vertical; 
        int col1 = col + horizontal; 
        
        if((row1 >= 1) && (col1 >= 1))
            if((row1 <= 8) && (col1 <= 8))
                if(board[row1][col1] == 0)
                    allGood = true; 
        
        return allGood; 
    }
    
    /**
     * <b>summary</b>: when there is no more avaiable moves for the knight to make or if the knight
     * makes it to all 64 squares then the board is printed to screen 
     */
    public void printKnight()
    {
        System.out.print(" "); 
        for(int x = 1; x <= SIZE; x++)
            System.out.print(Format.right(x, 6)); 
            
        System.out.println("\n"); 
            
        for(int z = 1; z <= SIZE; z++)
        {
              System.out.print(z); 
              for(int a = 1; a <= SIZE; a++)
                System.out.print(Format.right(board[z][a], 6)); 
              System.out.println(); 
        }
        
        System.out.println("\n" + count + " squares were visted"); 
    }
}
