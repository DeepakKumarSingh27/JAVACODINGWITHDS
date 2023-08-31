package com.OOPS.ExtendDemo2;

public interface A {
   static void greeting(){
       System.out.println("hey i am  static method");
   }


   default void fun(){
        System.out.println("i  am in a");
    }
}
