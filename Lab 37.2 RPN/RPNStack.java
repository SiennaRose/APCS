import java.util.*;
/**
 * Sienna Sacramento 
 * Mr. Lantsberger
 * APCS: Period 3
 * 24 May 2017
 */
public class RPNStack implements Stack
{
    private LinkedList<Integer> list;
    
    /**
     * constructor RPNStack - initializes list LinkedList
     */
    public RPNStack()
    {
       list = new LinkedList<Integer>(); 
    }

    //Stack Methods
    /**
     * <b>summary</b>: checks if stack is empty
     * returns  boolean
     */
    public boolean isEmpty()
    {
        return list.isEmpty(); 
    }
    
    /**
     * <b>summary</b>: adds Object x to top of stack as an Integer
     */
    public void push(Object x)
    {
        list.addFirst((Integer)x); 
    }
    
    /**
     * <b>summary</b>: removes first Integer in the LisnkedList
     * return Object(Integer)
     */
    public Object pop()
    {
        return list.removeFirst();
    }
    
    /**
     * <b>summary</b>: shows what's at the stop of the stack
     * retuns Object(Integer)
     */
    public Object peekTop()
    {
        return list.getFirst();
    }
    
    //operator methods
    /**
     * <b>summary</b>: pops first two elements in list and adds them together. 
     * Then it pushes back on to the stack the sum.
     * 
     */
    public void add()
    {
        Integer num1 = list.pop(); 
        Integer num2 = list.pop(); 
        list.push(new Integer(num2.intValue() + num1.intValue())); 
    }
    
    /**
     * <b>summary</b>: pops first two elements in list and subtracts them. 
     * Then it pushes back on to the stack the sum.
     */
    public void subtract()
    {   Integer num1 = list.pop(); 
        Integer num2 = list.pop(); 
        list.push(new Integer(num2.intValue() - num1.intValue())); 
    }
    
    /**
     * <b>summary</b>: pops first two elements in list and multiplies them together. 
     * Then it pushes back on to the stack the product.
     */
    public void multiply()
    {
        Integer num1 = list.pop(); 
        Integer num2 = list.pop(); 
        list.push(new Integer(num2.intValue() * num1.intValue()));
    }
    
    /**
     * <b>summary</b>: pops first two elements in list and divides them. 
     * Then it pushes back on to the stack the quotient.
     */
    public void divide()
    {
        Integer num1 = list.pop(); 
        Integer num2 = list.pop(); 
        list.push(new Integer(num2.intValue() / num1.intValue()));
    }

}
