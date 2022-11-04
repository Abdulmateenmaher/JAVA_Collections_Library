package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(4,"wasi");
        hm.put(1,"maher");
        
        hm.put(0,"farid");
        hm.put(5,"doublow");
        hm.get(4);
        hm.remove(4);
        System.out.println(hm.entrySet());
        System.out.println(hm.containsKey(5));

        System.out.print(hm);
    }
}
