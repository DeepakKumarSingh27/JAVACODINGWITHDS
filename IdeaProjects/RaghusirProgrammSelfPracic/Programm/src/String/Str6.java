package String;
import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        int ct=isCount(st);
        System.out.println("special character is "+ct);
    }
    static int isCount(String st)
    {
      int count=0;
      for (int i=0;i<st.length();i++)
      {
          char ch=st.charAt(i);
          if ((ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch>='9')==false)
              count++;
      }
      return count;
    }
}
