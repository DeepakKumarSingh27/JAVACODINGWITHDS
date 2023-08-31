package RaghusirDataStructure.Queue;
import java.util.*;
public class MainRunner1 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("A",700);
        m.put("B",800);
        m.put("C",200);
        m.put("D",500);
        System.out.println(m);
        System.out.println(m.put("A",1000));
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if (m1.getKey().equals("D")){
                m1.setValue(1000);
            }
        }
        System.out.println(m);
    }
}



