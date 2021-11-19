
/**
 * Write a description of class BookApplication here.
 *
 * @author (Nuramirah Hasya binti Mohd Nizam)
 * @version (Part I 25/5/2021)
 */
import java.util.*;
public class BookApplication 
{
     public static void main(String[] args)
     {
          //i. Create a Stack object named as BookStack.
          Stack bookStack = new Stack();
                
          //ii. Input ten (10) Book objects and add them into the BookStack.
          Scanner sc = new Scanner(System.in);
                
          for(int i=0;i<10;i++)
          {
               System.out.println("-----------------------");
               System.out.println("Enter book "+ (i+1) + " details.");
               System.out.print("Title: ");
               String t = sc.nextLine();
               System.out.print("Price: ");
               float p = sc.nextFloat();
               System.out.print("Number of pages: ");
               int n = sc.nextInt();
               System.out.println("-----------------------");
               sc.nextLine();
               
               Book b = new Book(t,p,n);
               bookStack.push(b);
          }
                
          //iii. Transfer all the books from the BookStack with the price less than RM50 into another stack named CheapBookStack.
          Stack cheapBookStack=new Stack();
          while(!bookStack.isEmpty())
          {
                //Pop top book
                Book b = (Book) bookStack.pop();
                //Check price and add to cheapBookStack
                if(b.getPrice()<50)
                        cheapBookStack.push(b);
                }
                System.out.println("CheapBookStack created!!!");
                
        }

}


