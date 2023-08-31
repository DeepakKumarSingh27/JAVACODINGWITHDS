package Roshan_String;
//   count how many Cpital ,small letters, digits and special char present in STRING
import java.util.Scanner;

public class St3 {
    public static void main(String[] args) {
//        System.out.println("hiiii");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the line");
        String s=sc.nextLine();
        int cp=0,sm=0,dg=0,sp=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch>='A' && ch<='Z')
            {
                cp++;
            } else if (ch >='a' && ch<='z')
            {
                sm++;
            } else if (ch >='0' && ch<='9') {
                dg++;
            }
            else sp++;
        }
        System.out.println(" Capital letter persent are "+cp);
        System.out.println("Small letter present are "+sm);
        System.out.println(" total digit  "+dg);
        System.out.println(" space present are "+sm);
    }
}
