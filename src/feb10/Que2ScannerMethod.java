package feb10;
import java.util.Scanner;
class Employee
{
    String empName;
    int empID;
    int empSalary;

    public void displayDetails(){
        System.out.println("employee name is::"+empName);
        System.out.println("employee id is::"+empID);
        System.out.println("employee salary is::"+empSalary);
    }

    public void getDetails(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter employee name,id,salary");
        empName= sc.nextLine();
        empID=sc.nextInt();
        empSalary=sc.nextInt();
    }
}
public class Que2ScannerMethod {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.getDetails();
        emp.displayDetails();

    }
}
