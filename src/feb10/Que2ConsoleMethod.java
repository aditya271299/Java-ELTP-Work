package feb10;
import java.io.Console;

class Employee2{
    String name;
    int id;
    int salary;
    public void getdetails2(){
        Console c=System.console();
        System.out.println("enter employee name,id,salary");
        name=c.readLine();
        id=Integer.parseInt(c.readLine());
        salary=Integer.parseInt(c.readLine());
    }
    public void displaydetails2(){
        System.out.println("employee name is::"+name);
        System.out.println("employee id is::"+id);
        System.out.println("employee salary is::"+salary);
    }
}


public class Que2ConsoleMethod {
    public static void main(String[] args) {
        Employee2 emp=new Employee2();
        emp.getdetails2();
        emp.displaydetails2();

    }
}
