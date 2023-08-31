package com.OOPS.Abstract;

public class Son extends Parent{
   public Son(int age){
       super(23);
     }
     @Override
     public void normal(){
       super.normal();
     }
    @Override
    void career() {
        System.out.println("i am going to be a Doctor" );
    }

    @Override
    void partner() {
        System.out.println("i love pepper pots");
    }
}
