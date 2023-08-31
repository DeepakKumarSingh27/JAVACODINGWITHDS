package KSirDataStructure.StringBuffer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //costructor1
        StringBuffer sb = new StringBuffer();
       // System.out.println(sb.capacity());
        //costructor2
        StringBuffer sb2 = new StringBuffer("Deepak");
        //costructor3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("weMakeDevs");
        sb.append("is nice!");
       // sb.insert(2,"Rahul");
       // sb.replace(1,5,"Singh");
        //sb.delete(1,5);
        sb.reverse();

        String str = sb.toString();
        System.out.println(str);
        Random random = new Random();
        System.out.println(random.nextFloat());
        System.out.println();
        int n = 20;
        String name = RandomString.genrate(n);
        System.out.println(name);
    }
}
