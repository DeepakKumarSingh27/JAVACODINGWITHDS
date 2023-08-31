package com.OOPS;
public class Wrapper {
    public static void main(String[] args) {
//    int a= 10;
//    int b= 20;
//    Integer num= 45;
    Integer a=10;
    Integer b= 20;
//   swap(a,b);
//        System.out.println(a+"  "+ b);
//        final int bonas=2;
//      final A kunal =new A("kunal");
//       kunal.name="ot";
        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj =new A("Random name");
        }
    }
  static   void swap(Integer a, Integer b)
    {
        Integer temp = a;
        a=b;
        b=temp;
    }
}
class A
{
    final int num=2;
    String name;
   public A(String name){
       System.out.println("object is created");
       this.name=name;
   }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object is destroyed");
    }
}