package Dsir;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaExpression {
    public static void main(String[] args) {
        Function<Integer,Integer>f = i->i*i;
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(4));
        System.out.println(f.apply(4));
    }
}
