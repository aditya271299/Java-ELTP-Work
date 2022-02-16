package feb16;

import java.util.*;

class Emp implements Comparable{
    int id;
    String name;
    int salary;
    Emp(int id, String name, int salary){
        this.id =id;
        this.name=name;
        this.salary =salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        Emp e = (Emp) o;
        String name = e.name;
        return this.name.compareTo(name);
    }
}
class SortName implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
      return   o1.name.compareTo(o2.name);
    }
}
class SortSal implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return (int) (o1.salary- o2.salary);
    }
}




public class Feb16Que3 {
    public static void main(String args[]) {
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(101, "karan", 15500));
        al.add(new Emp(104, "adi", 12000));
        al.add(new Emp(103, "zyan", 13000));
        al.add(new Emp(106, "shri", 17000));
        al.add(new Emp(105, "akshay", 18900));
        al.add(new Emp(102, "parth", 15000));

       Collections.sort(al,new SortSal());
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getSalary() > 15000)
                System.out.println(al.get(i));
        }
        System.out.println("************");
        Collections.sort(al,new SortName());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("BY USING COMPARABLE Salary");
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getSalary() > 15000)
                System.out.println(al.get(i));
        }
        System.out.println("BY Using COMPARABLE names");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

   }

    }

