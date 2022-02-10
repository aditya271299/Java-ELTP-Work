package feb10;

import java.io.Console;

public class Que2CommandLineArgument {
        public static void main(String[] args) {
            System.out.println("enter employee name,id,salary");
            String name=args[0];
            int id=Integer.parseInt(args[1]);
            int salary=Integer.parseInt(args[2]);
            System.out.println("employee name is::"+name);
            System.out.println("employee id is::"+id);
            System.out.println("employee salary is::"+salary);

        }
    }


