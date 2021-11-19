
/**
 * Write a description of class Employee here.
 *
 * @author (Amirah Hasya)
 * @version (25/5/2021)
 */
public class Employee
{
    private String empId;
    private String empName;
    private String empPosition;
    private double salary;
    private double spend;

    public Employee(String a, String b, String c, double d) {
        empId = a;
        empName = b;
        empPosition = c;
        salary = d;
        spend = 0;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.printf("Employee ID: %s, Name: %s, Position: %s, Salary: RM %.2f\n", empId, empName, empPosition, salary);
    }
}


    
    

