
/**
 * Write a description of class Book here.
 *
 * @author (Nuramirah Hasya Mohd Nizam)
 * @version (Part II 25/5/2021)
 */
public class Book
{
     private String title;
     private float price;
     private int num;
        
     public Book(String t, float p, int n)
     {
        super();
        this.title = t;
        this.price = p;
        this.num = n;
     }
        
     public void setBook(String t, float p, int n)
     {
        this.title = t;
        this.price = p;
        this.num = n;
     }
     public String getTitle()
     {
        return title;
     }
     public float getPrice()
     {
        return price;
     }
     public int getNum() 
     {
        return num;
     }
}




