
/**
 * Sienna Sacramento
 * Mr. Lansberger
 * APCS: Period 3
 * April 4, 2017
 */
public interface Stack
{
    /**
     * returns a boolean and tells whether stack is empty
     */
   boolean isEmpty();
   
   /**
    * recieves an Object that will be pushed onto the stack
    */
   void push(Object x); 
   
   /**
    * returns an object that will be popped off the stack 
    */
   Object pop(); 
   
   /**
    * returns an object that will tell what is on the top of the stack without popping it off
    */
   Object peekTop(); 
}
