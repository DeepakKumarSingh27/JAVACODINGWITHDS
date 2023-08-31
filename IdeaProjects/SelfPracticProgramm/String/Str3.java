package String;
import java.util.Scanner;
public class Str3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String  str=sc.nextLine();
        char[] ch=str.toCharArray();
        int sum=0;
      for (int i=0;i<ch.length;i++)
      {
          if (Character.isDigit(ch[i]))
          {
              int b=Integer.parseInt(String.valueOf(ch[i]));
              sum=sum+b;
          }
//          if (ch[i]>='0'&& ch[i]<='9')
//          {
//             // int d=(int)+ch[i];
//              sum=sum+ch[i]-'0';
//          }
      }
        System.out.println("sum of Digits is "+sum);
    }
}
