package KSirDataStructure.Recursion;
import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
        String[]  s = {"h","e","l","l","o"};
       // reverseString(s);
        System.out.println(Arrays.toString(s));
    }
//    public static void reverseString(String[] s) {
//        //String st = new String(s);
//        int start = 0, end = s.length-1;
//        while (start < end) {
//            char temp = s[start];
//            s[start] = s[end];
//            s[end] = temp;
//            start++;
//            end--;
//        }
//    }
}
   /* StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();

    */