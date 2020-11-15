/**
 *  Demostrates the use of the SinglyLinkedList class.
 *
 * @author     G. Peck
 * @created    May 12, 2002
 */
public class ListDemo
{
  SinglyLinkedList myList;

  public ListDemo()
  {
    myList = new SinglyLinkedList();
  }

  /**
   *  Creates a SinglyLinkedList of 5 Integer nodes
   */
  public void createList()
  {
    for (int k = 1; k <= 20; k++)
    {
      myList.addLast(new Integer(k));
    }
  }

  /**
   *  Display the first element of the list
   */
  public void displayFirst()
  {
    System.out.println("First Element: " + myList.getFirst());
  }
  
  /**
   *  Display the last element of the list
   */
  public void displayLast()
  {
    System.out.println("Last Element: " + myList.getLast());
  }

  /**
   *  Print the contents of myList
   */
  public void print()
  {
    System.out.print("SinglyLinkedList: ");
    myList.printList();
    System.out.println(); 
  }
  
  /**
   * Prints out how many nodes are in the list
   */
  public void printSize()
  {
      System.out.print("Nodes: " + myList.size()); 
  }

  /**
   *  Demostrates the use of the SinglyLinkedList class.
   *  Creates and prints a list of 5 consecutive Integer ojects.
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
    ListDemo sList = new ListDemo();

    sList.createList();
    sList.displayFirst();
    sList.displayLast(); 
    sList.print();
    sList.printSize(); 
  }
}
