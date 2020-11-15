import java.util.*;

public class HashTable 
{
	private int size;                                    //Number of entries
    private int capacity;                //Number of cells in the array
    private ArrayList <ListNode> myHashTable;
    
    /**
     * constructor - initializes size, capacity, myHashTable
     */
    public HashTable()
    {
        size = 0;
        capacity = 600;
        myHashTable = new ArrayList <ListNode>(capacity);
        fillWithNulls();
    }
    
    /**
     * constructor - initializes size, capacity, myHashTable, calls fillWithNulls
     */
    public HashTable(int numSlots)
    {
        size = 0;
        capacity = numSlots;
        myHashTable = new ArrayList <ListNode>(capacity);
        fillWithNulls();
    }
    
    /**
     * <b>summary</b>: fills hash table with nulls
     */
    public void fillWithNulls()
    {
        for (int i = 0; i < capacity; i++)
        {
            myHashTable.add(null);
        }
    }
    
    /**
     * <b>summary</b>: returns size
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * <b>summary</b>: returns the number of slots in the hashtable
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * <b>summary</b>:adds another Item to the hashtable
     */
    public void add(Object obj)
    {
        int location = obj.hashCode() % capacity;
        if (myHashTable.get(location) == null)
        {
            myHashTable.set(location, new ListNode(obj, null));
        }
        else
        {
            myHashTable.set(location, new ListNode(obj, myHashTable.get(location)));
        }
        size++;
    }
    
    /**
     * <b>summary</b>:finds target value within hashtable
     * returns Object(Item)
     */
    public Object find(Comparable target)
    {
        // will attempt to find idToFind in table, if found return inv amount, else return null
      int location = target.hashCode() % capacity;
      ListNode temp;
      temp = myHashTable.get(location);
      
      while (temp != null && !temp.getValue().equals(target))
      {
    	  temp = temp.getNext();
      }
      
      if (temp == null)
      {
    	  return temp;
      }
      
      else
      {
    	  return temp.getValue();
      }
    }
    
    /**
     * <b>summary</b>: returns the number of empty spots in the hashtable
     */
    public int getNumberOfNulls(){
        int count = 0;
        for (int k = 0; k < capacity; k++)
        {
            if (myHashTable.get(k) == null)
               count++;
        }
       return count;
    }
    
    /**
     * <b>summary</b>: returns the longest linked list length
     */
    public int getLongestList ()
    {
        int longest=0;
        ListNode temp;
        
        for (int k = 0; k < capacity; k++)
        {
        	int length = 0;
            temp = myHashTable.get(k);
            while (temp != null)
            {
            	length++;
                temp = temp.getNext();
            }
	        if (length > longest)
	        {
	        	longest = length;
	        }
        }
        
      return longest;
     }
}
