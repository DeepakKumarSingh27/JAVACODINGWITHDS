package String;
import java.util.Scanner;
public class Str3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        boolean rs= isPalindrome(st);
        if (rs==true)
            System.out.println(rs+" is palindrome");
        else
            System.out.println(rs+" is not palindrome");
    }
    static boolean isPalindrome(String st) {
     int i =0,j=st.length()-1;
     while (i<j)
     {
         if (st.charAt(i)!=st.charAt(j))

             return false;
         i++;
         j--;
     }
     return true;
    }
}
/*
  i j
madam
 */