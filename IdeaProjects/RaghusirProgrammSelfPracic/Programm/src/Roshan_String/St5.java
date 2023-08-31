package Roshan_String;

import java.util.Scanner;

public class St5 {
    public static void main(String[] args) {
//        String s="MADAM";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the palindrome");
        String s=sc.nextLine();
        boolean rs = isPalindrome(s);
        {
            if (rs==true)
                System.out.print(s+ "  it is palindrome " );
            else
                System.out.println(s+ " is not Palindrome");
        }
    }

    static boolean isPalindrome(String s) {
//        String temp=s;
//        String space=" ";
        char[] ch = s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            for (int j = ch.length - i; j > ch.length ; j--) {
                if (ch[i] != ch[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

//                if (s.charAt(i) !=s.charAt(j))
//                    return false;
//
//            }
//        }return true;










//    int i = 0, j = s.length() - 1;
//        while (i < j)
//        {
//            if (s.charAt(i) != s.charAt(j))
//
//                return false;
//                i++;
//                j--;
//
//        }
//        return true;