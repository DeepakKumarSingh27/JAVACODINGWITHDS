package kunalsirAssignment3;
import java.util.Scanner;
public class Pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.next();
        String rev=isReverse(st);
        System.out.println("Reverse String is "+rev);
    }
    static String isReverse(String st)
    {
       char[] ch=st.toCharArray();
        int i=0,j=st.length()-1;
        while (i<j)
        {
          char temp=ch[i];
          ch[i]=ch[j];
          ch[j]=temp;
          i++;
          j--;
        }
        st=new String(ch);
        return st;
    }
}
