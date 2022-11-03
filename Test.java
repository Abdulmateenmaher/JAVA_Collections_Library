package Lists;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add("Car");
        list.add("Bike");
        list.add('A');
        System.out.println(list);
        list.remove("Car");
        list.add(2022);
        list.add(55.4);
        System.out.println(list.get(3));

        list.add(4);
        System.out.println(list.equals(4));
        System.out.println(list);


    }
}
