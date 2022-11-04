package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<String> HS=new HashSet<>();
        HS.add("maher");
        HS.add("Sabir");
        HS.add("Qurishi");
        HS.add("Mohammadi");
        Iterator<String> Itr=HS.iterator();
        while (Itr.hasNext()){
            System.out.print(Itr.next()+" ");
        }
        HS.clone();
        HS.size();
        HashSet<String> hs=new HashSet<>();
        hs.add("Sidiqi");
        hs.add("wasi");
        hs.add("afghan");
        HS.addAll(hs);
        System.out.println();
        Iterator<String> itr=HS.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
