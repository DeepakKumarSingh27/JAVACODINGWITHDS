package kunalsirAssignment3;
import java.util.Scanner;
public class pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.next();
        int vc=0,cc=0;
        for (int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vc++;
            }
            else
            {
                cc++;
            }
        }
        System.out.println("vowels are "+vc);
        System.out.println("consonants are "+cc);

    }
}
