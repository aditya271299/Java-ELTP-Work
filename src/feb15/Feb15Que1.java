package feb15;
import java.util.*;
public class Feb15Que1 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(1);
        l.add(null);
        List<Integer> l1 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Itereating by for loop
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("**********************************************");
        //      // Itereating by for each
        for (Integer i: l){
            System.out.println(i);
        }
        //add one list into another list
        l1.addAll(l);
        //      // Itereating by  iterator
        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("**********************************************");
        ListIterator lit = l.listIterator();
        System.out.println("Iterating the elements in forward direction: ");
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("Iterating the elements in backward direction: ");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
        // list of method
        System.out.println(l.remove(2));
        System.out.println(l.isEmpty());
        System.out.println(l.contains(2));
        System.out.println(l.retainAll(l1));
    }
}
/**
    ==>1)NULL        ==>ALLOWED
    ==>2)DUPLICATES  ==>Allowed
    ==>3)ORDER       ==>Insertion Order
 */

