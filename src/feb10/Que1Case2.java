package feb10;

import java.util.Scanner;

public class Que1Case2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student id");
        int id=sc.nextInt();
        System.out.println("enter student marks");
        float marks=sc.nextFloat();
        System.out.println("enter student name");
        String name= sc.next();
        System.out.println("student name is:"+name+" student id is:"+id+" student marks is:"+marks);
    }
}
