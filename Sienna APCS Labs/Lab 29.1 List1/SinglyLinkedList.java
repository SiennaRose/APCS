import java.util.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private ListNode last; 

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = null;
    last = null; 
  }

  /**
   *  Returns the first element in this list.
   *
   * @return  the first element in the linked list.
   */
  public Object getFirst()
  {
    if (first == null)
    {
      throw new NoSuchElementException();
    }
    else
      return first.getValue();
  }

  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addFirst(Object value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(value, first);
  }

  /**
   *  Inserts the given element at the end of this list
   *  
   *  @param value  the element to be inserted at the end of t
   */
  public void addLast(Object value)
  {
      //takes in the value, creates a new node, adds the new node at the end of the list
       if(first == null)
       {
            first = new ListNode(value, first); 
            last = new ListNode(value);
       } 
       else
       {
           last.setNext(new ListNode(value));
           //still needs last to refernce the new node
       }
  }
  
  /**
   * Returns the number of elements in the linked list
   * 
   * @return the number of elements in the linked list
   */
  public int size()
  {
      return 0; 
  }
  
  /**
   * Returns the last element in the list
   * 
   * @return the last element in the linked list 
   */
  public Object getLast()
  {
      return last.getValue(); 
  }
  
  /**
   *  Print the contents of the entire linked list
   */
  public void printList()
  {
    ListNode temp = first;// start from the first node
    while (temp != null)
    {
      System.out.print(temp.getValue() + " ");
      temp = temp.getNext();// go to next node
    }
  }

  /**
   *  Returns a string representation of this list. The string
   *  representation consists of the list's elements in order,
   *  enclosed in square brackets ("[]"). Adjacent elements are
   *  separated by the characters ", " (comma and space).
   *
   * @return    string representation of this list
   */
  public String toString()
  {
    String s = "[";

    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      s += temp.getValue(); // append the data
      temp = temp.getNext();      // go to next node
      if (temp != null)
        s += ", ";
    }
    s += "]";
    return s;
  }
}
