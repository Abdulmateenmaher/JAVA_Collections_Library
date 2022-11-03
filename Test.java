package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue q=new ArrayDeque();
        //add element
        q.add(55);
        //also add element
        q.offer("maher");
        //peek the first element
        System.out.println(q);
        System.out.println(q.peek());
        //remove the last element
        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());

        q.add('A');
        System.out.println(q);
        q.clear();


    }
}
