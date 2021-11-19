
/**
 * Write a description of class Node here.
 *
 * @author (Nuramirah Hasya binti Mohd Nizam)
 * @version (a version number or a date)
 */
public class Node
{
    Object data;    // store data 
    Node next;      // store address of next node

   // Constructor: Create a Node that refers to Object o.
   Node( Object obj ) 
   { //this( o, null ); 
       data = obj;
       next = null;
   }

   // Constructor: Create a Node that refers to Object o and
   // to the next Node in the List.
   Node( Object o, Node nextNode )
   {
      data = o;         // this node refers to Object o
      next = nextNode;  // set next to refer to next
   }

   // Return a reference to the Object in this node
   Object getData()
   { return data; }

   // Return the address of next node
   Node getNext() { return next; }
}


