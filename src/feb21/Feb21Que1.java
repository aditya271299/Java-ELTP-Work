package feb21;
import java.lang.*;

class Student implements Cloneable{
    int rollno;
    String name;

    public Student(String name,int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}



public class Feb21Que1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object obj1=new Object();
        Feb21Que1 obj2=new Feb21Que1();
        System.out.println("get class : "+obj1.getClass());
        System.out.println("hash code : "+obj1.hashCode());
        System.out.println("to string : "+obj1.toString());
        System.out.println("obj1 equals to obj 2 : "+obj1.equals(obj2));
        Student o1=new Student("adi",45);
        Student o2=(Student)o1.clone();
        System.out.println("student object : "+ o1);
        System.out.println("clone object : "+ o2);

    }
}
/*
output is
get class : class java.lang.Object
hash code : 460141958
to string : java.lang.Object@1b6d3586
obj1 equals to obj 2 : false
student object : Student{rollno=45, name='adi'}
clone object : Student{rollno=45, name='adi'}

Process finished with exit code 0
 */