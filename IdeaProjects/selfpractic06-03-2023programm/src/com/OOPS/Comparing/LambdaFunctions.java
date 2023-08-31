package com.OOPS.Comparing;
import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
       // arr.forEach((iteam) -> System.out.print(iteam * 2+" "));
        Consumer<Integer> fun = (iteam) -> System.out.println(iteam * 2+" ");
        arr.forEach(fun);
        Operation sum = (a, b)-> a + b;
        Operation prod = (a, b)-> a * b;
        Operation sub = (a, b)-> a - b;
      LambdaFunctions myscal = new LambdaFunctions();
        System.out.println(myscal.operation(5,3,sum));
        System.out.println(myscal.operation(5,3,prod));
        System.out.println(myscal.operation(5,3,sub));

    }
   private int operation(int a, int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}