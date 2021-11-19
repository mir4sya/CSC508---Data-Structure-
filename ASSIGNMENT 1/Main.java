
/**
 * Write a description of class TestEmployee here.
 *
 * @author (Amirah Hasya)
 * @version (Part I.25/5/2021)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList empArrayList = new ArrayList();
        
        empArrayList.add(new Employee("01", "Michael Co", "Designer", 20000));
        empArrayList.add(new Employee("02", "Rahim Maarof", "PAR", 15000));
        empArrayList.add(new Employee("03", "Jessica Jung", "Manager", 21000));
        empArrayList.add(new Employee("04", "Adam Michael", "Developer", 30000));
        empArrayList.add(new Employee("05", "Rachel Park", "Money handler", 12000));
        empArrayList.add(new Employee("06", "Ayu Filzah", "PAR", 15000));
        empArrayList.add(new Employee("07", "Brian Lee", "Accountant", 18000));
        empArrayList.add(new Employee("08", "Shila Nur", "Developer", 30000));
        empArrayList.add(new Employee("09", "Hanbin Kim", "Manager", 21000));
        empArrayList.add(new Employee("010", "Lia Song", "Designer", 20000));

        //ii. Search for an employee id and display the detail information of the employee.
        //    If the employee id is not found, display an appropriate message
        int i;
        String empID = "03";
        for(i = 0; i < empArrayList.size(); i++)
        {
            Employee e = (Employee)empArrayList.get(i);
            if(e.getEmpId().compareTo(empID) == 0) {
                System.out.println("Employee with Id " + empID + " found..");
                e.display();
                break;
            }
        }
        if(i == empArrayList.size())
        {
            System.out.println("Employee with Id " + empID + " not found!");
        }

        //iii. Update the position of "Rahim Maarof from "PAR" to "Technician". 
        //     If the employee is not found, display an appropriate message.
        String name = "Rahim Maarof";
        for(i = 0; i < empArrayList.size(); i++) 
        {
            Employee e = (Employee)empArrayList.get(i);
            if(e.getEmpName().compareTo(name) == 0) 
            {
                e.setEmpPosition("Technician");
                System.out.println("Position of employee with name " + name + " is updated.");
                break;
            }
        }
        if(i == empArrayList.size()) 
        {
            System.out.println("Employee with name " + name + " not found!");
        }

        //iv. From the empArrayList, copy all employees that have yearly income greater than RM50,000 into an arraylist named WajibZakatList 
        //    copy all employees with position "Manager" into an another arraylist named ManagerList.
        ArrayList WajibZakaList = new ArrayList();
        ArrayList ManagerList = new ArrayList();
        for(i = 0; i < empArrayList.size(); i++)
        {
            Employee e = (Employee)empArrayList.get(i);
            if(e.getSalary() > 50000) 
            {
                WajibZakaList.add(new Employee(e.getEmpId(), e.getEmpName(),
                                    e.getEmpPosition(), e.getSalary()));
            }
            if(e.getEmpPosition().compareTo("Manager") == 0) {
                ManagerList.add(new Employee(e.getEmpId(), e.getEmpName(),
                e.getEmpPosition(), e.getSalary()));
            }
        }

        //v. Calculate total amount of zakat from WajibZakatList and count the number of managers in ManagerList.
        //   Zakat is calculated by using the formula:
        double totalZakat = 0;
        for(i = 0; i < WajibZakaList.size(); i++) 
        {
            Employee  e = (Employee)WajibZakaList.get(i);
            totalZakat += (2.5/100 * 12 * e.getSalary());
        }
        System.out.println("\nTotal amount of zakat from WajibZakatList: " + totalZakat);
        System.out.println("Count of managers in ManagerList: " + ManagerList.size());
        
    }
}



