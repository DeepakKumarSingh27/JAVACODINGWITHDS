package KunalsirAssignment1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        boolean rs=isPalindrome(st);
        if (rs==true)
        {
            System.out.println(st+" is Palindrome");
        }
        else
        {
            System.out.println(st+" is not palindrome");
        }
    }
    static boolean isPalindrome(String st)
    {
        int i=0,j=st.length()-1;
        while (st.charAt(i)!=st.charAt(j))
        {
            return false;
        }
        return true;
    }
}
