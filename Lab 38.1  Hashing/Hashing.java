
import chn.util.*;

public class Hashing 
{
    HashTable table;

    final int TABLESIZE = 600;                //final means variable cannot be changed later in the program

    public Hashing()
    {
        table = new HashTable(TABLESIZE);
    }

    public void search()
    {
        int idToFind;
        Item location;
        ConsoleIO console = new ConsoleIO();
        
        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) --> ");
        
        idToFind = console.readInt();

        while (idToFind >= 0)
        {
            location = (Item)table.find(new Item(idToFind, 0));
            if (location == null)
            {
                System.out.println("Id = " + idToFind + " No such part in stock");
            }
            else
            {
                System.out.println(location);
            }
    
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) --> ");
            idToFind = console.readInt();
        }
    }

  
    public void stats()
    { 
        // will print out required stats for this lab
        System.out.println();
        int emptySpots = table.getNumberOfNulls();
        System.out.println("Number of NULLs = " + emptySpots);
        System.out.printf("%2.2f%% of pointers are NULL%s", (double)emptySpots*100.0/table.getCapacity(),"\n");

        double avgListLen = (double)table.getSize()/(table.getCapacity() - emptySpots);
        System.out.printf("Average list length = %2.2f",avgListLen);
        System.out.println();
        System.out.println("The longest list = " + table.getLongestList());
    }

    public void loadFile()
    {
        FileInput inFile = new FileInput("file400.txt");
        
        int id, inv;
        int howMany = inFile.readInt();
        for (int k = 1; k <= howMany; k++)
        {
            id = inFile.readInt();
            inv = inFile.readInt();
            table.add(new Item(id, inv));
        }
    }
}
