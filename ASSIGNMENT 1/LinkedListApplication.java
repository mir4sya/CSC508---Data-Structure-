
/**
 * Write a description of class LinkedListApplication here.
 *
 * @author (Amirah Hasya)
 * @version (Part II 25/5/2021)
 */
public class LinkedListApplication
{
    public static void main(String[] args)
    {
        // 1
        LinkedList<Employee> empLinkedList = new LinkedList();
     
        empLinkedList.addLast(new Employee("01", "Michael Co", "Designer", 20000));
        empLinkedList.addLast(new Employee("02", "Rahim Maarof", "PAR", 15000));
        empLinkedList.addLast(new Employee("03", "Jessica Jung", "Manager", 21000));
        empLinkedList.addLast(new Employee("04", "Adam Michael", "Developer", 30000));
        empLinkedList.addLast(new Employee("05", "Rachel Park", "Money handler", 12000));
        empLinkedList.addLast(new Employee("06", "Ayu Filzah", "Money handler", 12000));
        empLinkedList.addLast(new Employee("07", "Brian Lee", "Accountant", 18000));
        empLinkedList.addLast(new Employee("08", "Shila Nur", "Developer", 30000));
        empLinkedList.addLast(new Employee("09", "Hanbin Kim", "Manager", 21000));
        empLinkedList.addLast(new Employee("010", "Nia Song", "Designer", 20000));
        
        //ii. print the information of all employees whose names start with the letter ‘N
        int i;
        empLinkedList.setCurrrentNode();
        ListNode<Employee> currentNode = empLinkedList.getCurrrentNode();
        while(currentNode != null) {
            if(currentNode.getData().getEmpName().charAt(0) == 'N') {
                currentNode.getData().display();
            }
            currentNode = empLinkedList.getNextNode();
        }

        //iii.Remove employees who have a monthly salary less than RM1500 
        //    from the empLinkedList and store these employees into a new linkedlist
        //    named lowerIncomeLinkedList
        LinkedList<Employee> lowerIncomeLinkedList = new LinkedList<>();
        empLinkedList.setCurrrentNode();
        currentNode = empLinkedList.getCurrrentNode();
        while(currentNode != null) {
            if(currentNode.getData().getSalary() < 1500) {
                empLinkedList.getPrevNode().setNext(currentNode.getNext());
                lowerIncomeLinkedList.addLast(currentNode.getData());
            }
            //currentNode.setNext(null);
            currentNode = empLinkedList.getNextNode();
        }


        //iv.from the lowerIncomeLinkedList, 
        //   calculate and display the average income of the employees in the list
        lowerIncomeLinkedList.setCurrrentNode();
        currentNode = lowerIncomeLinkedList.getCurrrentNode();

        int n = 0;
        double aver_income = 0;
        while(currentNode != null) {
            n++;
            currentNode.getData().display();
            aver_income += currentNode.getData().getSalary();
            currentNode = lowerIncomeLinkedList.getNextNode();
        }
        aver_income /= n;
        System.out.printf("Average income of employees with lower income: %.2f\n", aver_income);
    }
}




