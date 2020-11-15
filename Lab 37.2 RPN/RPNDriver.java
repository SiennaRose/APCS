import chn.util.*; 
/**
 * Sienna Sacramento 
 * Mr. Lantsberger
 * APCS: Period 3
 * 23 May 2017
 * 
 */
public class RPNDriver
{
    public static void main(String[] args)
    {
        ConsoleIO console = new ConsoleIO(); 
        RPNStack stack = new RPNStack(); 
        RPNQueue que = new RPNQueue(); 
        String input;
        
        do
        {
            System.out.print("next input: ");
            input = console.readLine();
            
            if(input.matches("[0-9]++"))
            {
                que.enqueue(new Integer(input)); 
                stack.push(new Integer(input)); 
            }
            else
                if(input.equals("+"))
                {
                    que.enqueue(new String(input)); 
                    stack.add(); 
                }
                else
                    if(input.equals("-"))
                    {
                        que.enqueue(new String(input)); 
                        stack.subtract(); 
                    }
                    else
                        if(input.equals("*"))
                        {
                            que.enqueue(new String(input)); 
                            stack.multiply(); 
                        }
                        else
                            if(input.equals("/"))
                            {
                                que.enqueue(new String(input)); 
                                stack.divide(); 
                            }
                            
                            
        }
        while((!input.equals("q")) && ((!input.equals("Q"))));
        
        while(!que.isEmpty())
        {
            System.out.print(que.dequeue() + " ");
        }
        
        System.out.print(" = " + stack.peekTop() + "\n"); 
    }
}
