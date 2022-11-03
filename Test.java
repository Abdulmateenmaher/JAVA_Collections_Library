package ArraList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(44);
        al.add("Ball");
        al.add(55.4);
        al.add('m');
        al.add("maher");
        System.out.println(al);
        al.remove('m');
        System.out.println(al);
        System.out.println(al.contains('a'));
        System.out.println(al.get(2));
        System.out.println(al.size());

    }
}
