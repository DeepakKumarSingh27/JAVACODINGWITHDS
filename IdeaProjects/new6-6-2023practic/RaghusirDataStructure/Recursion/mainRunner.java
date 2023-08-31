package RaghusirDataStructure.Recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainRunner {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter two number");
//        String a = sc.next(); //"3444444444555555566666";
//        String b =sc.next(); // "3444444444555555566666";
//        BigInteger sum = new BigInteger(a);
//       sum= sum.add(new BigInteger(b));
//        System.out.println(sum);
//        String sum = veryBigSum(null);
//        System.out.println(sum);

        Scanner sc= new Scanner(System.in);
        ArrayList<Long> mylist = new ArrayList<Long>();
        System.out.println("Enter the long values to press 0");
        while (true)
        {
            long ele = sc.nextLong();
            if (ele==0)
            {
                break;
            }
            mylist.add(ele);
        }
        System.out.println("sum of above values: "+veryBigSum(mylist));
    }

    static String veryBigSum(List<Long> values)
    {
//      Long a = Long.MAX_VALUE;
//      Long b = Long.MAX_VALUE;
//      String s1=a.toString();
//      String s2= b.toString();
//      BigInteger ba = new BigInteger(s1);
//      BigInteger bb = new BigInteger(s2);
//      BigInteger sum = ba.add(bb);
//      return sum.toString();

     // return new BigInteger(a.toString()).add(new BigInteger(b.toString())).toString();

        BigInteger sum = new BigInteger(values.get(0).toString());
        for (int i = 1; i < values.size(); i++) {
            BigInteger ele = new BigInteger(values.get(i).toString());
            sum=sum.add(ele);
        }
        return sum.toString();


    }
}
