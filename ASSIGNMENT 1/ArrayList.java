
/**
 * Write a description of class ArrayList here.
 *
 * @author (Amirah Hasya)
 * @version (25/5/2021)
 */
import java.util.Arrays;
public class ArrayList 
{
    private Object elements[];   
    int current_size;            
    int max_vals = 50;            
    
    //constructor
    public ArrayList() 
    {
        elements = new Object[max_vals];
        current_size = 0;
    }

    public void insert(Object new_el, int index)
    {
        
        if (index > size() || index < 0)
            
            throw new IndexOutOfBoundsException();
        if(size() == max_vals) 
        {
            elements = Arrays.copyOf(elements, elements.length * 2);
            max_vals = elements.length;
        }
        for(int i = size(); i > index; i--) 
        {
            elements[i] = elements[i-1];
        }
        elements[index] = new_el;
        current_size++;
    }

    public void add(Object new_el) {
        insert(new_el, current_size);
    }

    public Object remove(int index)
    {
        if(index >= size() || index < 0)
            
            throw new IndexOutOfBoundsException();
        Object removed_el = elements[index];
        for(int i = index; i < size()-1; i++)
        {
            elements[i] = elements[i+1];
        }
        current_size--;
        return removed_el;
    }

    public int size() 
    {
        return current_size;
    }

    public String toString() {
        //arrayList object to print
        String result = "ArrayList:  ";
        for(int i = 0; i < current_size; i++) {
            result += elements[i] + " ";
        }
        return result;
    }

    public boolean isEmpty() {
        // returns if ArrayList is empty
        if(current_size == 0)
            return true;
        else
            return false;
    }

    public int indexOf(Object el)
    {
        
        for(int i = 0; i < current_size; i++) 
        {
            if(elements[i].equals(el))
                return i;
        }
        return -1;
    }

    public boolean equals(ArrayList a) {
        // returns if current ArrayList object is equal to a
        if(this == a) 
            return true;
        if(this == null || a == null) 
            return false;
        if(this.size() != a.size()) return false;

        for(int i = 0; i < this.size(); i++) {
            if(!this.elements[i].equals(a.elements[i]))
                return false;
        }
        return true;
    }

    public Object get(int index) {
        // returns element at index
        if(index >= size() || index < 0)
            throw new IndexOutOfBoundsException();
        return elements[index];
    }
}



