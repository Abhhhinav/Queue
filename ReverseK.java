package Queue;

import java.util.*;

public class ReverseK {
    public Queue<Integer> Rev(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        int shift = k;
        while (k-- > 0) {
            s.push(q.peek());
            q.remove();
        }
        while (!s.isEmpty()) {
            q.add(s.peek());
            s.pop();
        }
        int temp = q.size() - shift;

        while (temp > 0) {
            q.add(q.peek());
            q.remove();
            temp--;
        }

        return q;
    }
    public static void main(String[] args) {
        ReverseK r = new ReverseK();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        System.out.println("Original Queue: " + queue);
        Queue<Integer> reversedQueue = r.Rev(queue, k);
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}