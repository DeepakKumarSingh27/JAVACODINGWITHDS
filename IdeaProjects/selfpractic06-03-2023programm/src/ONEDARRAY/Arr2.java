package ONEDARRAY;
public class Arr2 {
    public static void main(String[] args) {
        int[]x=ArrayOperation.readArray();
        System.out.println("user entered element is ");
        ArrayOperation.dispArray(x);
        int sum=0;
        for (int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        System.out.println("Average of Array element is "+sum/x.length);
    }
}
