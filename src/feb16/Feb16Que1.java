package feb16;

import java.util.LinkedList;
import java.util.Queue;

public class Feb16Que1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(6);
        q.offer(7);
        System.out.println(q);
        q.remove();
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.contains(3));
        System.out.println(q.isEmpty());
        System.out.println("size is "+q.size());
        System.out.println(q);
        q.clear();
        System.out.println(q);
    }
}
