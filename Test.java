package Stack;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws Exception {
        Stack s=new Stack();
     s.add(55);
     s.add(55.3);
     s.add('A');
     s.add("maher");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.indexOf('A'));

        s.empty();
        s.push(45);
        s.push("sabir");
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);
        s.empty();
        System.out.println(s);

    }

}
