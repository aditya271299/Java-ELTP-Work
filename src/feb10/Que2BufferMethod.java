package feb10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Employee1 {
    String name;
    int id;
    int salary;

    public void getdetails1() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter employee name,id,salary");
        name=bufferedReader.readLine();
        id=Integer.parseInt(bufferedReader.readLine());
        salary=Integer.parseInt(bufferedReader.readLine());
    }

    public void displaydetails1(){
        System.out.println("employee name is::"+name);
        System.out.println("employee id is::"+id);
        System.out.println("employee salary is::"+salary);
    }
}

public class Que2BufferMethod {
    public static void main(String[] args) throws IOException {
        Employee1 emp =new Employee1();
        emp.getdetails1();
        emp.displaydetails1();
    }
}
