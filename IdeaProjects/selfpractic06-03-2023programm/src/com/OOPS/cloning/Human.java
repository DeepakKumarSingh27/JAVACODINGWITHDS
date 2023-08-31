package com.OOPS.cloning;
public class Human implements Cloneable {
    int age;
    String name;
    int arr[];



    //       public Human(Human other) {
//           this.age = age;
//           this.name =name;
//           this.arr = new int[] {3,4,5,6,7,8};
//       }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {3,4,5,6,7,8};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//           return  super.clone();
//
//    }
    public Object clone() throws CloneNotSupportedException {
       Human twin = (Human) super.clone();
       twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
           twin.arr[i] = this.arr[i];

        }
        return twin;
    }
}
