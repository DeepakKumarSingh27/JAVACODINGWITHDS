package KunalSir.StringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//       String name = "Deepak kumar";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.indexOf('a'));
//        System.out.println(Arrays.toString(name.split(" ")));



String str ="";
        System.out.println(isPalindrome(str));




    }
    static  boolean isPalindrome(String str){
        if (str == null || str.length() ==0){
            return false;
        }
      str.toLowerCase();
        for (int i = 0; i <= str.length() / 2 ; i++) {
           char start = str.charAt(i);
           char end = str.charAt(str.length()-1-i);
           if (start != end){
               return false;
           }
        }
        return true;
    }
}
