import chn.util.*; 
import apcslib.Format; 
/**
 * class Store - makes an array of items that will be organized from increasing id order
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Store
{
    private Item[] myStore;
    
     /**
     * Constructor for the Store object. Loads Items from file.
     *
     * @param fName File name containing Item data
     */ 
    public Store(String fileName) 
    {
       loadFile(fileName);
    }
    
     /**
     * Displays the contents of the myStore array
     */ 
    public void displayStore()
    {
        int check = 1; 
        System.out.println(Format.right("Id",12) + Format.right("Inv", 10) + "\n");
        
        for(int index = 0; index < myStore.length; index++)
        {
           System.out.println(Format.right(check, 2) + myStore[index]); 
           
           if(check % 10 == 0)
                System.out.println(); 
           
           check++; 
        }
    }
    
    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     */ 
    public String toString()
    {
        String report = "";
        for (int numItems = 0; numItems < myStore.length; numItems++)
        {
            report += (numItems + 1) + " " + myStore[numItems] + "\n";
        }
        return report;  
    }
    
    /**
     *  Helper method to invoke the recursive quicksort method 
     */
    public void doSort() 
    {
        quickSort(myStore, 0, myStore.length - 1); 
    }
    
    /**
     * Sorts Item objects in an array between first index and last
     * index using a quicksort algorithm.
     *
     * @param list an array of type Item
     * @param first start location in array to be sort
     * @param last end location in the array to be sorted
     */ 
    private void quickSort(Item[] list, int first, int last)
    {
        int g = first, h = last;
        int midIndex = (first + last) / 2; 
        Item dividingValue = list[midIndex]; 
        do
        {
            while (list[g].compareTo(dividingValue) < 0)
            {
                g++;
            } 
            while (list[h].compareTo(dividingValue) > 0) 
            { 
               h--;
            }
            if (g <= h)
            {
                //swap(list[g], list[h]); 
                Item temp = list[g]; 
                list[g] = list[h]; 
                list[h] = temp;
                g++;
                h--; 
              
            }
        }
        while (g < h);
        
        if (h > first)
        {
            quickSort(list,first,h); 
        }
        if (g < last)
        {
            quickSort (list,g,last);
        }
    }
    
     /**
     * Loads a file containing Item data. The first line of the file
     * contains the number of Item records contained in the file.
     * Each Item record consists of 2 ints (id num, invetory num)
     *
     * @param inFileName Name of file to be opened and read
     */ 
    private void loadFile(String inFileName)
    {
        int id = 0, inv = 0; 
        
        FileInput inFile = new FileInput(inFileName);
        
        int numItems = inFile.readInt(); 
        myStore = new Item[numItems];
        
        for(int recNum = 0; recNum < numItems; recNum++)
        {
            id = inFile.readInt(); 
            inv = inFile.readInt(); 
            
            myStore[recNum] = new Item(id, inv);
        }
    }
    
    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO console = new ConsoleIO();
        System.out.println("Testing search algorithm\n"); System.out.print("Enter Id value to search for (-1 to quit) ---> "); idToFind = console.readInt();
        while (idToFind >= 0)
        {
            index = bsearch(new Item(idToFind, 0));
            // recursive version call
            // index = bsearch (new Item(idToFind, 0), 0, myStore.length-1); System.out.print("Id # " + idToFind);
            if (index == -1)
                  System.out.println("     No such part in stock");
            else
                  System.out.println("     Inventory = " + myStore[index].getInv());
                  
            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        } 
    }
    
    /**
     *  Searches the myStore array of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for             FIX ME SIENNA!!!!! PLEASE!!! 20000 DOES NOT WORK
     * @return             index of Item if found, -1 if not found
     */
    int bsearch(Item idToSearch)
    {
        int first = 0, last = myStore.length; 
        int index = -1;
        boolean check = false; 
        do
        {
            int midIndex = (first + last) / 2;
            Item dividingValue = myStore[midIndex];
            
            if(idToSearch.compareTo(dividingValue) == 0) //change to equals()
            {
                index = midIndex;
                check = true; 
            }       
            if(idToSearch.compareTo(dividingValue) > 0)
            {
                  first = midIndex + 1;
            } 
            if(idToSearch.compareTo(dividingValue) < 0) //not a necessacery if 
            {
                 last = midIndex - 1; 
            }
            if(first > last)
            {
                    check = true; 
            }
              
            //counter++; counter not efficient; replace with if (first > last  check = true and index = -1
        }
        while(check == false);
        
        return index;
    }
    
    /**
     *  Searches the specified array of Item Objects for the specified
     *  item object using a recursive binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
    * @param  first Starting index of search range
    * @param  lastEnding index of search range
    * @return index of Item if found, -1 if not found
    */
    
    int bsearch (Item idToSearch, int first, int last)
    {
        return -1;
    }
}
