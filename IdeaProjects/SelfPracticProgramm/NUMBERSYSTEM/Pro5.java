package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temp in cal");
        int cal=sc.nextInt();
        int temp=(cal*9)/5+32;
        System.out.println("faranhit temp is "+temp);
    }
}
