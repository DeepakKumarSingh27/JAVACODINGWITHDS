package com.OOPS.StaticExamples;
public class StaticBlock {
    static int a = 4;
    static  int b;
    static {
        System.out.println(" i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
      StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
    }
}
