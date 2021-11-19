
/**
 * Write a description of class FruitApplication here.
 *
 * @author (Nuramirah Hasya binti Mohd Nizam)
 * @version (Part II 25/5/2021)
 */
import javax.swing.*;
public class FruitApplication
{
    public static void main(String[] args)
    {
        Queue fruitQ = new Queue();
        String type;
        double price;
        
        //i. Input ten (10) Fruit objects and store them into a queue named fruitQ.
        for(int i = 0; i<10; i++)
        {
            type = JOptionPane.showInputDialog("Enter Type: ");
            price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price: "));
            
            Fruit pro = new Fruit();
            pro.setFruit(type, price);
            fruitQ.enqueue(pro);
        }
        
        Queue orangeQueue = new Queue();
        Queue appleQueue = new Queue();
        Queue tempQueue = new Queue();
        
        //ii. Get all apples from fruitQ and store them into a queue called appleQueue.
        //    Get all oranges from fruitQ and store them into a queue called orangeQueue
        Object obj;
        Fruit temp;
        while(!fruitQ.isEmpty())
        {
            obj = fruitQ.dequeue();
            temp = (Fruit)obj;
            tempQueue.enqueue(temp);
            
            if(temp.getType().equalsIgnoreCase("orange"))
            {
                orangeQueue.enqueue(obj);
            }
            else if(temp.getType().equalsIgnoreCase("apple"))
            {
                appleQueue.enqueue(obj);
            }
        }
                
        ///iii. Compute the total price of all apples. Store all the apples into another queue named appleQueue2.
        Queue appleQueue2 = new Queue();
        Queue orangeQueue2 = new Queue();
        Object ob;
        Object obj1;
        Fruit po;
        double total = 0.00, total2 = 0.00;
        while(!appleQueue.isEmpty())
        {
            ob = appleQueue.dequeue();
            po = (Fruit)ob;
            total += po.getPrice();
            tempQueue.enqueue(po);
        }
        while(!tempQueue.isEmpty())
        {
            obj1 = tempQueue.dequeue();
            appleQueue2.enqueue(obj1);
        }
        System.out.println("Total price of all apples: RM " + total);
    
        //iv Compute the total price of all oranges. Store all the oranges into another queue called orangeQueue2.
        while(!orangeQueue.isEmpty())
        {
            ob = orangeQueue.dequeue();
            po = (Fruit)ob;
            total2 += po.getPrice();
        }
        while(!tempQueue.isEmpty())
        {
            obj1 = tempQueue.dequeue();
            orangeQueue2.enqueue(obj1);
        }
        System.out.println("Total price of all oranges: RM " + total2);
        
        //v. Display the total price of all fruits.
        double totalPrice;
        totalPrice = total + total2;
        System.out.println("Total price of all fruits: RM " + totalPrice);
    }
}

