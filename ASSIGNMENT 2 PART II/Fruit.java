
/**
 * Write a description of class Fruit here.
 *
 * @author (Nuramirah Hasya binti Mohd Nizam)
 * @version (Part II 25/5/2021)
 */
public class Fruit
{
    private String type;
    private double price;
    
    public Fruit()
    {
        type = "";
        price = 0.00;
    }
    
    public void setFruit(String t, double p)
    {
        type = t;
        price = p;
    }
    
    public String getType() 
    {
        return type;
    }
    
    public double getPrice()
    {
        return price;
    }
}
