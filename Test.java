package Priority_Queue;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.add(5);
        pq.add(4);
        pq.add(2);
        pq.add(3);
//        pq.add('A');
//        pq.add('D');
//        pq.add('C');
//        pq.add('B');
        pq.offer(1);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq.peek());
        pq.clear();
        System.out.println(pq);

    }
}
