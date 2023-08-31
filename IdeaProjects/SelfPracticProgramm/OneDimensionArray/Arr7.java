package OneDimensionArray;
public class Arr7 {
    public static void main(String[] args) {
       ArrayOperation ao=new ArrayOperation();
       int[]x=ao.readArray();
        System.out.println("Before Reverse ");
        ao.disp(x);
        ao.isReverse(x);
        System.out.println("After Reverse ");
        ao.disp(x);
    }
}
