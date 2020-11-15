/**
 *  Description of the Class
 *
 * @author     Your Name
 * @created    Month 00, 2003
 */

import apcslib.*;
import chn.util.*;

public class HeapSort
{
  private static HeapPriorityQueue myHeapPQ;

  public HeapSort()
  {
    this("file20.txt");
  }

  public HeapSort(String fName)
  {
    myHeapPQ = new HeapPriorityQueue();
    loadFile(fName);
  }

  private void loadFile(String fileName)
  {
    int id, inv;

    FileInput inFile = new FileInput(fileName);

    int howMany = inFile.readInt();
    for (int k = 1; k <= howMany; k++)
    {
      id = inFile.readInt();
      inv = inFile.readInt();
      myHeapPQ.add(new Item(id, inv));
    }
  }

  public void sort()
  {
    System.out.println("sort");
  }

  public static void main(String[] args)
  {
    Object h;
    HeapSort heapTest = new HeapSort("file20.txt");
    h =  myHeapPQ.removeMin();
    heapTest.sort();
    myHeapPQ.printList();
  }
}