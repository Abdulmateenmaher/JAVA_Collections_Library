package Dequeue;

import java.util.ArrayDeque;

public class Test {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add("maher");
        ad.add("sabir");
        ad.add("farid");
        System.out.println(ad);
        //adding in first or last possition
        ad.addFirst("Sadiqi");
        ad.addLast("malik");
        ad.removeFirst();
        ad.removeLast();
        ad.clear();

    }
}
