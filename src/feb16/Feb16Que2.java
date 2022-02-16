package feb16;
import java.util.*;
public class Feb16Que2 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(23);
        dq.offerFirst(12);
        dq.offerLast(45);
        dq.offer(26);
        dq.add(56);
        dq.addLast(21);
        dq.push(76);
        dq.push(26);

        System.out.println(dq);
        System.out.println("adq is empty : "+dq.isEmpty());
        System.out.println("size of adq is : "+dq.size());
        System.out.println("does adq contain 45 : "+dq.contains(45));

        System.out.println("peek element is "+dq.peek());
        System.out.println("peek first element is "+dq.peekFirst());
        System.out.println("peek last element is "+dq.peekLast());

        System.out.println(dq.poll());
        System.out.println("poll() " +dq);

        System.out.println(dq.pollFirst());
        System.out.println("pollFirst() " +dq);

        System.out.println(dq.pollLast());
        System.out.println("pollLast() " +dq);

        System.out.println(dq);
        System.out.println(dq.element());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.pop());
        dq.removeFirstOccurrence(26);
        System.out.println(dq);
    }

}