package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(50);
        ts.add(30);
        ts.add(123);
        Iterator<Integer>IItr=ts.iterator();
        while (IItr.hasNext()){
            System.out.print(IItr.next()+" ' ");
        }
        ts.isEmpty();
        ts.add(50);
        ts.clear();
        System.out.println(ts);

    }
}
