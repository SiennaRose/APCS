import java.util.*;
import apcslib.*;
/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class BinaryTreeList
{
  private TreeNode root;  // first element
  private int size; 

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public BinaryTreeList()
  {
    root = null;
    size = 0; 
  }

  /**
   *  Returns true if this tree contains no elements.
   *
   * @return    true if the tree is empty
   */
  public boolean isEmpty()
  {
    if(root == null)
        return true;
    else
        return false; 
  }

  /**
   * Passes the element given and the root TreeNode to the overlaoding insert method to recursively 
   * insert the new element. 
   * 
   * @param  element    element to be passed
   */
  public void insert(Object element)
  {
      // Will insert data into an ordered binary tree. 
      // The solution is recursive. 
      //sends object to helper method to find where to insert
      //will get back a TreeNode to insert
      root = insert(root, element);
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
  private TreeNode insert(TreeNode node, Object element)
  {
    // Will insert data into an ordered binary tree. 
    // The solution is recursive. 
    
    //if spot where element needs to be inserted is found create a new TreeNode and send back to 
    //original insert method
    if(node == null)
      {
          size++; 
          return new TreeNode(element, null, null); 
        }
        else
            if(((Item)node.getValue()).compareTo(element) > 0)
                node.setLeft(insert(node.getLeft(), element));  //finding where to insert on left
            else
                if(((Item)node.getValue()).compareTo(element) < 0)
                {
                    node.setRight(insert(node.getRight(), element)); //finding where to insert on right
                } 
    return node; 
    //need a marker to connect the nodes. something that's next/.getRight() can connect to root

    //System.out.println("insert: " + element);
  }
  
  /**
   * Passes root of Binary tree and element to find to the helper method: overloading
   * 
   * returns and item that either is null or is the item 
   */
  public Item find(Comparable element)
  {
      TreeNode tree = null;  
      tree = find(root, element);
      if(tree == null)
        return null; 
      else
        return (Item)tree.getValue(); 
  }
  
  /**
   *  Returns the first occurrence of the specified element, or null
   *  if the List does not contain this element.
   *
   * @param  element  element to search for.
   * @return        first occurrence of the specified element, or null
   *                if the list doesn not contain the element.
   */
  private TreeNode find(TreeNode tree, Comparable valueToFind)
  {
      TreeNode node = tree; 
      
      while(node != null)
      {
          int result = valueToFind.compareTo(node.getValue()); 
          if(result == 0)
            return node; 
          else
              if(result < 0)
                   node = node.getLeft();
               else     //if result > 0
                    node = node.getRight(); 
      }
      return null;
  }

  /**
   * deletes the specified target from the binary tree, however it does this by replacing 
   * the target value with the left most node in the right subtree(mirror perspective)
   * 
   * pasees the traget as well as the root to deleteHelper
   */
  public void delete(Comparable target)
  // post: deletes a node with data equal to target, if present,
  // preserving binary search tree property
  {
       root = deleteHelper(root, target);
  } 
  
  /**
   * </>summary</>: attempts to locate the target node to be deleted within the binary tree recursively
   * if the node passed is smaller than the target value the recursive call will call the node on its right
   * if the node passed is larger than the target value than the recursive call will call the node on its left
   * if there is no node within the binary tree that matches the target value then a exception is thrown
   * 
   * when the target is found within the binary tree it passes the target on to the deleteTargetNode method where 
   * it will be deleted
   * 
   * parameter TreeNode node        starts out as root and advances along the binary tree searching for target
   * parameter Comparable target    the value being searched for   
   * 
   * return TreeNode    the root
   */
  private TreeNode deleteHelper(TreeNode node, Comparable target)
  // pre : node points to a non-empty binary search tree
  // post: deletes a node with data equal to target, if present,
  // preserving binary search tree property
  {
      if (node == null)
            throw new NoSuchElementException();
      else
        if (target.compareTo(node.getValue()) == 0)
        {
            return deleteTargetNode(node);
        }   
        else 
            if (target.compareTo(node.getValue()) < 0)
            {
                node.setLeft(deleteHelper(node.getLeft(), target));
                return node;
            }
            else //target.compareTo(root.getValue()) > 0
            {
                node.setRight(deleteHelper(node.getRight(), target));
                return node;
            }
  } 
  
  /**
   * </>summary</>: Deletes the specified target within the binary tree by replacing 
   * the value of the target node with the value of the left most node in the right 
   * subtree(mirror perspective of the code in lesson 35)
   * 
   * parameter TreeNode target  the node with the target value 
   *
   * return TreeNode    the node replacement for the one deleted(left most node in right subtree)
   */
  private TreeNode deleteTargetNode(TreeNode target)
  // pre : target points to node to be deleted
  // post: target node is deleted preserving binary search tree property
  {
      size--; 
      if (target.getRight() == null)
      {
          return target.getLeft();
        }
        else 
            if (target.getLeft() == null)
            {
                return target.getRight();
            }
            else
                if (target.getLeft().getRight() == null)
                {
                    target.setValue(target.getLeft().getValue());
                    target.setLeft(target.getLeft().getLeft());
                    return target;
                }
                else //where mirror perspective is made: goes to right subtree and goes to leftmost node
                {
                    TreeNode marker = target.getRight();
                    while (marker.getLeft().getLeft() != null)
                        marker = marker.getLeft();
                    target.setValue(marker.getLeft().getValue());
                    marker.setLeft(marker.getLeft().getRight()); 
                    return target;
                  }
  } 
  

  /**
   *  Returns the number of elements in this list.
   *
   * @return    number of elements in this list.
   */
  public int size()
  {
      return size;
  }
  
  /**
   * Prints all the elements of the list
   */
  public void inorder()
  {
      inorderHelper(root); 
  }
  
  /**
   *  Prints all the elements of the list
   */
  public void inorderHelper(TreeNode root)
  {
      //list to be printed
      System.out.println(Format.right("Id", 6) + Format.right("Inv", 10));
      ArrayStack tree = new ArrayStack(); 
      TreeNode temp = root; 
     
      do
      {
          
      }
      while(!isEmpty() || temp != null); 
      
      if(temp != null)
      {
          inorderHelper(temp.getLeft());
          System.out.println(Format.right(((Item)(temp.getValue())).getId(),6) + Format.right(((Item)(temp.getValue())).getInv(),10));
          inorderHelper(temp.getRight()); 
      }
      //System.out.println("List Print"); 
  }
  
  /**
   *  Removes all of the elements from this binary tree.
   */
  public void clear()
  {
    root = null;
  }
}
