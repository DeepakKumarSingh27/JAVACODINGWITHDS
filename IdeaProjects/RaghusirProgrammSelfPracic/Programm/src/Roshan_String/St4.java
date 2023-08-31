package Roshan_String;

import java.util.Scanner;

// count how many Vowel and Consonants present in String
public class St4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thw word ");
        String s=sc.nextLine();
//        String s="India";
        int vc=0,cc=0;
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (ch>='A' && ch<='Z')
            {
                if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
                {
                    vc++;
                }
                else cc++;
            }
            if (ch>='a' && ch<='z')
            {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                {
                    vc++;
                }
                else cc++;
            }
        }
        System.out.println("vowels present  "  +vc);
        System.out.println("consonant are "+cc);
    }
}
