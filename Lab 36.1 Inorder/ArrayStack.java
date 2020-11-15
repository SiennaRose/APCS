
/**
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * April 4, 2017
 * 
 * holds the implementation of the methods in Stack interface
 */
public class ArrayStack implements Stack
{
   private java.util.ArrayList array; 
   
   /**
    * constructor- a new array is instansiated
    */
   public ArrayStack()
   {
       array = new java.util.ArrayList();
   }
   
   /**
    * returns boolean telling whether array is empty or not
    */
   public boolean isEmpty()
   {
       return array.size() == 0;
   }
   
   /**
    * recieves an object to push onto the array stack
    */
   public void push(Object obj)
   {
       array.add(obj);
   }
   
   /**
    * returns an object that was lastly placed on the stack...FILO
    */
   public Object pop()
   {
       return array.remove(array.size() - 1);
   }
   
   /**
    * returns an object of what will come off the top of the array stack, but does not 
    * pop it from the stack 
    */
   public Object peekTop()
   {
       return array.get(array.size() - 1); 
   }
}
