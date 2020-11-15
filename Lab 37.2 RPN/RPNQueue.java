import java.util.*;
/**
 * Sienna Sacramento 
 * Mr. Lantsberger
 * APCS: Period 3
 * 24 May 2017
 */
public class RPNQueue implements Queue
{
    private LinkedList list; 
    
    /**
     * constructor RPNQueue - initializes list as a LinkedList
     */
    public RPNQueue()
    {
     list = new LinkedList();    
    }
    
    /**
     * <b>summary</b>: checks if stack is empty
     * returns  boolean
     */
    public boolean isEmpty()
    {
        return list.isEmpty(); 
    }
    
    /**
     * <b>summary</b>: adds obj to the end of list
     */
    public void enqueue(Object obj)
    {
        list.addLast(obj);
    }
    
    /**
     * <b>summary</b>: removes the first element of list
     * return Object (string or Integer)
     */
    public Object dequeue()
    {
        return list.removeFirst(); 
    }
    
    /**
     * <b>summary</b>: shows what's at the top of the queue
     * return Object (String or Integer)
     */
    public Object peekFront()
    {
        return list.getFirst(); 
    }
}
