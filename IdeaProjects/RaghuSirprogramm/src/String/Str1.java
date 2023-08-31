package String;
import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String st=sc.nextLine();
        int cp=0,sm=0,dig=0,spl=0;
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch>='A' && ch<='Z')
                cp++;
            else if (ch>='a' && ch<='z')
                sm++;
            else if (ch>='0' && ch<='9')
                dig++;
            else
                spl++;
        }
        System.out.println("Number of Upper case letter "+cp);
        System.out.println("Number of lower case letter "+sm);
        System.out.println("Number of digits are "+dig);
        System.out.println("Number of special character are "+spl);

    }
}
