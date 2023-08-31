package Dsir;
public interface Interf {
    void add(int a,int b);
}
 class Test {
     public static void main(String[] args) {
      Interf i = (a,b)-> System.out.println("sum is "+(a+b));
      i.add(10,20);
      i.add(100,200);
     }
 }
