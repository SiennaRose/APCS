import java.util.*;

/**
 * This class implements the PriorityQueue interface using
 * a binary heap.
 *
 * the basic idea is that the node whose index is k
 * has children stored with indexes 2*k and 2*k+1 for left/right
 * children, respectively. The root of the binary heap has index 1.
 *
 * @author Your Name
 */

public class HeapPriorityQueue implements PriorityQueue
{
  private List items;
  private int mySize;

  /**
   * Constructs an empty priority queue.
   */
  public HeapPriorityQueue()
  {
    items = new ArrayList();
    items.add(null);            // first add should go at index 1
    mySize = 0;
  }

  /**
   * <b>summary</b>:adds Object(Item) to the end of the list and reheapifies
   */
  public void add(Object obj)
  {
    mySize++; 
    int i = mySize;
    items.add(obj); 
    
    while(i != 1 && ((Item)(items.get(i))).compareTo((items.get(i/2))) < 0)
    {
        Object x = items.remove(i/2); 
        items.add(i/2,items.remove(i-1));
        items.add(i,x); 
        i = i/2; 
    }
    
  }

  /**
   * <b>summary</b>: removes the Item with the smallest id value
   */
  public Object removeMin()
  {
    if(isEmpty())
    {
        throw new NoSuchElementException("Error removeMin: queue is empty");
    }
    else
    {
        items.add(1, items.remove(mySize - 1));        
        mySize--;                  
        heapify(1);            
        Object min;    
        return  min = items.remove(1);
    }
    
  }

  /**
   * returns the root
   */
  public Object peekMin()
  {
     if(isEmpty())
    {
        throw new NoSuchElementException("Error peekMin: queue is empty");
    }
    
    return items.get(0);    
  }

  /**
   * returns boolean on whether the array is empty
   */
  public boolean isEmpty()
  {
    return items.size() == 0;
  }

  /**
   * preconditon: subheaps of hroot satisfy heap property (and shape)
   * postcondition: heap rooted at hroot satisfies heap property
   */
  private void heapify(int hroot)
  {
     int left, r, min;         // declare variables


    left = 2 * hroot;           // left child
    r= 2 * hroot + 1;                   // right child
    if(left <= mySize && ((Item)(items.get(left))).compareTo((items.get(hroot))) < 0)       // find smallest child
            min = left;                 // save index of smaller child
    else
        min = hroot;

    if(r <= mySize && ((Item)(items.get(r))).compareTo((items.get(min))) < 0)
            min = r;                // save index of smaller child

    if(min != hroot)                // swap and percolate, if necessary
    {
           
            Object tmp = items.remove(hroot);           // exchange values at two indices
            
            
            items.add(hroot, items.remove(min -1));
            items.add(min, tmp);
            heapify(min);           // call Heapify

        }
    }
  }

