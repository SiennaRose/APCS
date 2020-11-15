import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts
{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  Sorts()
  {
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(int[] list)
  {
    // Replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
    
    steps++; //initialization of outer
    for(int outer = 0; outer < list.length - 1; outer++)
    {
        steps += 3; 
        //1 - boundary check of outer loop
        //2 - increment outer++
        //3 - initialization of inner loop
        for(int inner = 0; inner < list.length - outer - 1; inner++)
        {
            steps += 3; 
            //1 - boundary check of inner loop
            //2 - increment inner++
            //3 - if comparison
            if(list[inner] > list[inner + 1])
            {
                //swap list[inner] & list[inner + 1]
                int temp = list[inner];
                list[inner] = list[inner + 1]; 
                list[inner + 1] = temp; 
                steps += 3; //swap of list[inner] & list[inner + 1] 
            }
        }
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(int[] list)
  {
    // Replace these lines with your code
    int min, temp; 
    
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
    
    steps++; //initialization of outer
    for(int outer = 0; outer < list.length - 1; outer++)
    {
        steps += 4; 
        //1 - boundary check of outer loop
        //2 - increment outer++
        //3 - mine gets initialized 
        //4 - initialization of inner loop
        min = outer; 
        for(int inner = outer + 1; inner < list.length; inner++)
        {
            steps += 3; 
            //1 - boundary check of inner loop
            //2 - increment inner++
            //3 - if comparison
            if(list[inner] < list[min])
            {
                steps++; //initializing min
                min = inner; //a new smalledt item is found
            }
        }
        //swap list[outer] & list[min] 
        temp = list[outer]; 
        list[outer] = list[min]; 
        list[min] = temp; 
        steps += 3; //swap of list[outer] & list[min] 
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(int[] list)
  {
    // Replace these lines with your code
    int position, key; 
    
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    
    steps++; //initialization of outer
    for(int outer = 1; outer < list.length; outer++)
    {
       steps += 5; 
       //1 - boundary check of outer loop
       //2 - increment outer++
       //3 - initialization of position 
       //4 - initialization of key
       //5 - while loop comparison 
       position = outer; 
       key = list[position]; 
       
       //shift larger values to the right
       while(position > 0 && list[position - 1] > key) 
       {
           list[position] = list[position - 1]; 
           position--; 
           steps += 2; //swap of list[position] & list[position - 1] 
       }
       list[position] = key; 
       steps++; //initialize list[position] with key
    }
  }

  /**
    *  Takes in entire vector, but will merge the following sections
    *  together:  Left sublist from a[first]..a[mid], right sublist from
    *  a[mid+1]..a[last].  Precondition:  each sublist is already in
    *  ascending order
    *
    * @param  a      reference to an array of integers to be sorted
    * @param  first  starting index of range of values to be sorted
    * @param  mid    midpoint index of range of values to be sorted
    * @param  last   last index of range of values to be sorted
    */
   private void merge(int[] a, int first, int mid, int last)
   {  
    int sub1 = first, sub2 = mid+1;
    int[] temp = new int[a.length]; 
    steps += 3; 
    //1- initialization of sub1
    //2- initialization of sub2
    //3- initialization of temp
    
    steps++; //initialization of j
    for(int j = first; j <= last; j++)
    {
        steps += 3; 
        //1- boundary check of for loop
        //2- increment of j
        if(sub1 > mid)
        {
            steps++; 
            for(int i = sub2; i <= last; i++)
            {
                 //List A is done, so pull a value from List B.
                 steps += 4; 
                 
                 //2- sorted stored value in a[] placed in temp
                 //3- increment j
                 
                 //5- boundary check of for loop
                 //6- increment of i 
                 temp[j] = a[i];
                 j++; 
            }
        }
        else
        {
            steps++;
            if(sub2 > last) 
            {
                steps++; 
                for(int i = sub1; i <= mid; i++)
                {
                    //List B is done, so pull a value from List A.
                    steps += 4; 
                    
                    //2- sorted stored value in a[] placed in temp
                    //3- increment j
                    //4- initialization of i
                    //5- boundary check of for loop
                    //6- increment of i 
                    temp[j] = a[i]; 
                    j++;
                } 
            }
              else
              {
                  steps++;
                  if(a[sub1] < a[sub2]) 
                  {
                     //Neither is done, and if List a[sub1] < List a[sub2] (j is an index
                     //marker in temp[]) then pull from sublist 1.
                     steps += 2; 
                     //1- if comparison
                     //2- sorted stored value in a[] placed in temp
                     //3- increment sub1
                     temp[j] = a[sub1];  
                     sub1++; 
                  }
                  else
                  {
                      steps++; 
                      if(a[sub2] <= a[sub1])
                      {
                         //Neither is done, and if List a[sub2] <= List a[sub1] then pull from sublist 2.
                         steps += 2; 
                         //1- if comparison
                         //2- sorted stored value in a[] placed in temp
                         //3- increment sub2
                         temp[j] = a[sub2]; 
                         sub2++; 
                      }
                  }
             }
        }
    }
    
    //fills the a array from where it starts(first) to where it ends(last) using the sorted value 
    //arrangement in temp[]
    steps++; //initialization of i
    for(int i = first; i <= last; i++)
    {
        steps += 3; 
       //1 - boundary check of for loop
       //2 - increment i++
       //3 - a[i] gets temp[1] = stores sorted value in correct place
        a[i] = temp[i]; 
    }
  }

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(int[] a, int first, int last)
  {
    // Replace these lines with your code
    int mid = 0; 
    int temp = 0; 
    int length = (last - first) + 1; 
    steps += 3; 
    //1- initialization of length
    
    // Recursively divides a list in half, over and over. When the 
    // sublist has one or two values, stop subdividing.
         
    steps++; 
    //1- if compariosn 
    if(length != 1)
    {
        steps++; //1- if compariosn
        if(length == 2)
        {
            steps++; 
            if(a[first] > a[last])
            {
                 temp = a[first]; 
                 a[first] = a[last]; 
                 a[last] = temp; 
                 steps += 3; 
            }  
        }
        else
        {
            // recursion, divide list into two halves
            steps += 4; 
            mid = (first + last) / 2;
            mergeSort(a, first, mid); 
            mergeSort(a, mid+1, last); 
            merge(a, first, mid, last); 
            
        }
    }
       
  }

  /**
   *  Recursive quicksort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void quickSort(int[] a, int first, int last)
  {
    steps += 4; 
    //1- initialization of g
    //2- initialization of h
    //3- intialization of midIndex
    //4- initialization of dividingValue
    int g = first, h = last;
    int midIndex = (first + last) / 2; 
    int dividingValue = a[midIndex]; 
    do
    {
        while (a[g] < dividingValue)
        {
            g++;
            steps += 2;
            //1- incrementing g
            //2- while loop 
        } 
        while (a[h] > dividingValue) 
        { 
           h--;
           steps += 2; 
           //1- incrementing h
           //2- while loop 
        }
        steps++; //if compariosn
        if (g <= h)
        {
            //swap(list[g], list[h]); 
            int temp = a[g]; 
            a[g] = a[h]; 
            a[h] = temp;
            g++;
            h--; 
            steps += 5; 
            //2- initializing temp[]
            //3- list[g] initialization
            //4- list[h] initialization
            //5- g incremetation
            //6- h incrementation
        }
        steps++; //do while check 
    }
    while (g < h);
    
    steps++; //if comparison
    if (h > first)
    {
        quickSort(a,first,h); 
        steps++; //calling quicksort
    }
    steps++; //if comparison
    if (g < last)
    {
        quickSort (a,g,last);
        steps++; //calling quicksort
    }
  }
  

  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount()
  {
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(int stepCount)
  {
    steps = stepCount;
  }
}
