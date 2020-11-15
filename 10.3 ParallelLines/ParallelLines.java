import apcslib.*; 

/**
        * class ParallelLines - a class which creates 
        * a gird of scaures that are slightly off from alignment.
        * @author Sienna Sacarmento 
        * @version 1.0
        */

public class ParallelLines
{
    public static void main(String[] args)
    {
        //variable declarations
        /** creates a new SketchPad called paper */ 
        SketchPad paper = new SketchPad(800, 700);
        /** creates a new DrawingTool called pen, which gets associateed with paper */ 
        DrawingTool pen = new DrawingTool(paper); 
        /** y represents the y coordinate point */
        /** x represents the x coordinate point */
        /** rY gets y and uses it to make the columns */
        /** rX gets x and uses it to make the rowws */ 
        int y = 0, x = 0, rY = 0, rX = 0; 
        
        /**
             *creates 8 rows of squares-
             *increments row by one and changes position of starting square
             */
        for (int row = 0; row < 8; row++)
        {
            // calculate the start of the row of squares
            /* 
                  * checks to see if row is creating the first square 
                  * if so then it will start at these coordinates: (-105, 105).
                  * If row is beginning the fourth row it changes it's coordinates to 
                  * (-105, -15). If row is on any other row it goes down and draws a line
                  */ 
            if(row == 0)
            {
                pen.up();
                pen.move(-105, 105);
                y = 105;
                x = -105; 
            }
            else
                if(row == 4)
                {
                    pen.up();
                    pen.move(-105, -15);  
                    y = -15; 
                    x = -105; 
                }
                else
                {
                    
                    pen.up(); 
                    y -= 30;  
                    pen.move(-120, (y - 15)); 
                    pen.down(); 
                    pen.move(-100, (y - 15));
                    pen.up();
                    pen.move(-105, y); 
                }
            // calculate and add a horizontal offset
            /** 
                 *if row is an even number then it has a ten offset start
                 *if row is odd it has a 20 offset start
                 */
            if((row % 2) != 0)
            { 
                pen.move(-95, y); 
                x = -95; 
            }
            else
                if((row == 2) || (row == 6))
                {
                    pen.move(-85, y); 
                    x = -85; 
                }
            
            /** rY and rX are getting the coordinates calculated from the offset and row start */
             rY = y; 
             rX = x; 
             
            /**
                    *this for loop draws 14 squares in each row.
                    *at the last sqaure the row will finish with a line ending at 300.
                    */
            for (int col = 0; col < 7; col++)
            {
                // draw the square
                pen.down(); 
                
                if(col != 6)
                {
                    pen.fillRect(30, 30);
                    // calculate and position for the next square
                    pen.move(rX, (rY -= 15)); 
                    pen.move((rX += 60), (rY)); 
                    pen.move((rX), (rY += 15)); 
                }
                else
                {
                    pen.fillRect(30,30);
                    // calculate and position for the next square
                    pen.move(rX, (rY -= 15)); 
                    pen.move(300, (rY)); 
                }
            }
        }
    }
}
