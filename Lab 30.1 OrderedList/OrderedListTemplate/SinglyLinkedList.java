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
  private ListNode last;   // last elementt

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = last = null;
  }

  /**
   *  Returns true if this list contains no elements.
   *
   * @return    true iff the list is empty
   */
  public boolean isEmpty()
  {
    return true;
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
   * @param  element  the element to be inserted at the beginning of this list.
   */
  public void addFirst(Object element)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(element, first);
    if (last == null)
    {
      last = first;
    }
  }

  /**
   *  Returns the last element in this list.
   *
   * @return  the last element in the linked list.
   */
  public Object getLast()
  {
    if (last == null)
    {
      throw new NoSuchElementException();
    }
    else
      return last.getValue();
  }

  /**
   *  Adds and object to the end of the list
   *
   * @param  element  adds element to end of list
   */
  public void addLast(Object element)
  {
    if (first == null)
    {
      first = last = new ListNode(element, first);
    }
    else
    {
      last.setNext(new ListNode(element, null));
      last = last.getNext();
    }
  }

  /**
   *  Inserts the specified element at the position in this list
   *  according to the natural ordering of its elements. All elements
   *  in the list must implement the Comparable interface. Shifts
   *  the element currently at that position (if any) and any
   *  subsequent elements to the right.
   *
   * @param  element  element to be inserted
   */
  public void insert(Comparable element)
  {
    System.out.println("insert: " + element);
  }

  /**
   *  Returns the first occurrence of the specified element, or null
   *  if the List does not contain this element.
   *
   * @param  element  element to search for.
   * @return        first occurrence of the specified element, or null
   *                if the list doesn not contain the element.
   */
  public Object find(Comparable element)
  {
    System.out.println("find: " + element);
    return null;
  }

  /**
   *  Removes the first occurrence of the specified element in
   *  this list. If the list does not contain the element, it
   *  is unchanged.
   *
   * @param  element  element to be removed from this list, if present.
   * @return          removes first element with matching element, if any.
   */
  public Object remove(Object element)
  {
    System.out.println("remove: " + element);
    return null;
  }

  /**
   *  Returns the number of elements in this list.
   *
   * @return    number of elements in this list.
   */
  public int size()
  {
    int count = 0;
    return count;
  }

  /**
   *  Prints all the elements of the list
   */
  public void printList()
  {
    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      System.out.println(((Item)temp.getValue()).getId() + " " +
                         ((Item)temp.getValue()).getInv());
      temp = temp.getNext();  // go to next node
    }
  }

  /**
   *  Prints all the elements of the list in reverse order
   */
  public void printBackwards()
  {
    printBackwards(first);
  }

  /**
   *  Recursive helper method to print all the elements of
   *  the list in reverse order
   */
  private void printBackwards(ListNode temp)
  {
    System.out.println("printBackwards");
  }
  /**
   *  Removes all of the elements from this list.
   */
  public void clear()
  {
    System.out.println("clear");
  }

  /**
   *  Returns a string representation of this list. The string
   *  representation consists of the list's elements in order,
   *  enclosed in square brackets ("[]"). Adjacent elements are
   *  separated by the characters ", " (comma and space).
   *
   * @return    Description of the Returned Value
   */
  public String toString()
  {// post: returns a string representing list

    String s = "[";

    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      s += temp.getValue() + ", "; // append the data
      temp = temp.getNext();      // go to next node
    }
    s += "]";
    return s;
  }
}
