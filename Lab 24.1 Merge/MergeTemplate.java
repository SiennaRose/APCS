import chn.util.*;
import apcslib.Format;
import java.util.*;

/**
 *  APCS: Period 3
 *
 * @author     Sienna Sacramento 
 * @created    April 13, 1999
 */
class Sorts
{
  /**
   *  Description of the Method
   *
   * @param  list  Description of Parameter
   */
  public static void selectionSort(int[] list)
  {
    int min, temp;

    for (int outer = 0; outer < list.length - 1; outer++)
    {
      min = outer;
      for (int inner = outer + 1; inner < list.length; inner++)
      {
        if (list[inner] < list[min])
        {
          min = inner;
        }
      }
      //swap(list[outer], list[flag]);
      temp = list[outer];
      list[outer] = list[min];
      list[min] = temp;
    }
  }
}

/**
 *  Description of the Class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */
public class MergeTemplate
{
  public void merge (int[] a, int[] b, int[] c)
  {
    // Replace these lines with your code
    System.out.println();
    System.out.println("merge method");
    System.out.println();
    
    //aMark and bMark keep track of where you are checking within list a and b
    int aMark = 0, bMark = 0; 
    for(int j = 0; j < c.length; j++)
    {
        if(aMark >= a.length)
        {
            for(int i = bMark; i < b.length; i++)
            {
                 //List A is done, so pull a value from List B.
                 c[j] = b[i];
                 j++;
            }
        }
        else
             if(bMark >= b.length) 
             {
                for(int i = aMark; i < a.length; i++)
                {
                    //List B is done, so pull a value from List A.
                    c[j] = a[i]; 
                    j++;
                } 
              }
              else
                  if(a[aMark] < b[bMark]) 
                  {
                     //Neither is done, and if List A[i] < List B[j] (where i & j are index
                     //markers in lists A and B) then pull from List A.
                     c[j] = a[aMark];  
                     aMark++; 
                  }
                  else
                      if(b[bMark] <= a[aMark])
                      {
                         //Neither is done, and if List B[j] <= List A[i] then pull from List B.
                         c[j] = b[bMark]; 
                         bMark++; 
                      }
    }
  }

  /**
   *  Initializes an returns temp with random integers in the range
   *  1..largestInt
   *
   * @return  an array of size specified by the user filled
   *          with random numbers
   */
  public int[] fillArray()
  {
    ConsoleIO console = new ConsoleIO();

    System.out.println();
    System.out.print("How many numbers do you wish to generate? ");
    int numInts = console.readInt();

    int[] temp = new int[numInts];

    System.out.print("Largest integer to generate? ");
    int largestInt = console.readInt();

    Random randGen = new Random();

    for (int loop = 0; loop < temp.length; loop++)
    {
      temp[loop] = randGen.nextInt(largestInt) + 1;
    }

    return temp;
  }

  /**
   *  prints out the contents of the array in tabular form, 20 columns
   */
  private void screenOutput(int[] temp)
  {
    for (int loop = 0; loop < temp.length; loop++)
    {
      if (loop % 15 == 0)
      {
        System.out.println();
      }
      System.out.print(Format.right(temp[loop], 5));
    }
    System.out.println();
  }

  /**
   *  Sorting Template:
   *  Provides a main method for access to the sorting menu
   *
   * @param  args  The command line arguments - not used
   */
  public static void main(String[] args)
  {
    MergeTemplate testMerge = new MergeTemplate();

    System.out.println("Filling list a");
    int[] a = testMerge.fillArray();
    System.out.println();
    System.out.println("Filling list b");
    int[] b = testMerge.fillArray();

    int[] c = new int[a.length + b.length];

    Sorts.selectionSort(a);
    Sorts.selectionSort(b);
    testMerge.merge(a,b,c);

    System.out.println();
    System.out.println("list a:  ");;
    testMerge.screenOutput(a);
    System.out.println();
    System.out.println();
    System.out.println("list b:  ");;
    testMerge.screenOutput(b);
    System.out.println();
    System.out.println();
    System.out.println("list c:  ");;
    testMerge.screenOutput(c);
    System.out.println();
  }
}

