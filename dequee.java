package Queue;
import java.util.*;
public class dequee {
    public static void main(String[] args) {
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(2);
        deque.addLast(10);
        deque.addLast(11);
        deque.addLast(12);
        deque.addLast(13);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
