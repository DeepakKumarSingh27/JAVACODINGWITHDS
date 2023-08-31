package com.OOPS.Abstract;
public class Daughter extends Parent{
    Daughter(int age){
        super(22);
    }
    void career() {
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love Iron man");
    }
}
