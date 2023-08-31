package Raghusirclasswork.groomingsessionQuestions;
import java.util.Scanner;
public class Test4 {
    public static int len(String str){
        int count =0;
        try {
            while (true){
                str.charAt(count);
                count++;
            }
        }catch (Exception e){
            return count;
        }
    }
    public static boolean equal(String s1,String s2){
        int len1=len(s1);
        int length2=len(s2);
        if (len1!=length2){
            return false;
        }
        char[] c1=s1.toCharArray();
        char[] c2= s2.toCharArray();
        for (int i = 0; i <len1 ; i++) {
            if (c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the main String");
        String s= sc.nextLine();
        System.out.println("Enter the replace string");
        String replace = sc.nextLine();
        System.out.println("Enter the new String");
        String newWord= sc.nextLine();
        int length= len(s);
        char[] ch = s.toCharArray();
        for (int i = 0; i <length; i++) {
            String temp="";
            int k =i;
            while (k<length && ch[k]!=' '){
                temp=temp+ch[k];
                k++;
            }
            boolean flag= equal(temp,replace);
            if (flag){
                temp=newWord;
            }
            System.out.print(temp);
            if (k<length){
                System.out.print(" ");
            }
            i=k;
        }
    }
}
