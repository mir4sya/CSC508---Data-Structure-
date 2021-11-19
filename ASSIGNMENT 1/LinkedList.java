
/**
 * Write a description of class LinkedList here.
 *
 * @author (Amirah Hasya)
 * @version (Part II 25/5/2021)
 */
public class LinkedList<Type> 
{
    private ListNode<Type> header;
    private ListNode<Type> currentNode;
    private ListNode<Type> prevNode;

    public LinkedList() 
    {
        header = null;
        currentNode = null;
        prevNode = null;
    }

    public void setCurrrentNode()
    {
        currentNode = header;
        prevNode = null;
    }

    public ListNode getCurrrentNode()
    {
        return currentNode;
    }

    public ListNode getPrevNode()
    {
        return prevNode;
    }

    public ListNode getNextNode()
    {
        if (currentNode != null)
        {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        else
        {
            currentNode = header;
        }
        return currentNode;
    }

    public boolean isEmpty() 
    {
        return header == null;
    }

    public void addFirst(Type x) 
    {
        ListNode<Type> newnode = new ListNode(x, null);
        if(header == null)
        {
            header = newnode;
        }

        else {
            newnode.setNext(header);
            header = newnode;
        }
    }

    public void addLast(Type x)
    {
        ListNode<Type> newnode = new ListNode(x, null);
        if(header == null) 
        {
            header = newnode;
        }

        else 
        {
            ListNode<Type> current = header;
            while(current.getNext() != null) 
            {
                current = current.getNext();
            }
            current.setNext(newnode);
        }
    }


    public void removeFirst() 
    {
        if(header != null)
            header = header.getNext();
    }

    public void removeLast()
    {
        if(header != null) 
        {
            ListNode current = header;
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(null);
        }
    }

    public ListNode getFirst() 
    {
        return header;
    }

    public ListNode getLast() 
    {
        if(header == null)
            return null;
        ListNode current = header;
        while(current.getNext() != null)
            current = current.getNext();
        return current;
    }
}



