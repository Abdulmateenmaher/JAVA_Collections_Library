package Linked_Hashset;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("maher");
        lhs.add("wasi");
        lhs.add("malik");
        LinkedHashSet Lhs=new LinkedHashSet();
        Lhs.add("saboor");
        Lhs.add("Danish");
        lhs.addAll(Lhs);
        Iterator<String>itr=lhs.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+",");
        }
        lhs.remove("malik");
        lhs.isEmpty();
        lhs.equals("dawood");

    }
}
