
/**
 * class Driver - creates a new store object and displays its sorted version of items in it by 
 * its id number. 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class Driver
{
    public static void main(String[] args)
    {
        Store store = new Store("file50.txt"); 
        store.doSort();
        System.out.println("List Sorted by Id Number");
        System.out.println();
        store.displayStore();
        store.testSearch(); 
    }
}
