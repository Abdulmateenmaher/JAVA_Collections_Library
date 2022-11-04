package Vector;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for (int i=0; i<=5; i++){
            v.add(i);
            System.out.print(v+" ");

            System.out.println(v);
        }
        v.remove(3);
        v.add(3,10);
            for(int i=0; i<v.size(); i++){
                System.out.print(v.get(i)+" ");
            }


    }
}
