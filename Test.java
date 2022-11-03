package LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(55);
        ll.add(44.3);
        ll.add("maher");
        ll.add('A');
        System.out.println(ll);

        System.out.println( ll.removeFirst());
         System.out.println(ll.removeLast());
        System.out.println("this is first element now:"+ll.getFirst());
        System.out.println(ll);
        System.out.println();
        System.out.println(ll.size());
        System.out.println(ll.indexOf('A')+" must be deleted");
        ll.clear();
        System.out.println(ll+" must be empty");
    }
}
