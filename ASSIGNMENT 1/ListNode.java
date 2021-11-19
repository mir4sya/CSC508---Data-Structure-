
/**
 * Write a description of class ListNode here.
 *
 * @author (Amirah Hasya)
 * @version (Part II 25/5/2021)
 */
public class ListNode<Type> 
{
    private Type data;
    private ListNode<Type> next;

    public ListNode(Type data, ListNode next) 
    {
        this.data = data;
        this.next = next;
    }

    public Type getData() 
    {
        return data;
    }

    public ListNode getNext()
    {
        return next;
    }

    public void setData(Type data)
    {
        this.data = data;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }

}
