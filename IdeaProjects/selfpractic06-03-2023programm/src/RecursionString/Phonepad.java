package RecursionString;
import java.util.ArrayList;
import java.util.List;

public class Phonepad {
    public static void main(String[] args) {
        System.out.println(padRet("","12").size());
        System.out.println(padcount("","12"));
    }
    static void pad(String p, String up){
     if (up.isEmpty()){
         System.out.println(p);
         return;
     }
     int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
          char ch = (char) ('a' + i);
          pad(p + ch,up.substring(1));
        }
    }
    static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p +ch,up.substring(1)));
        }
        return list;
    }
    static int padcount(String p,String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch =(char)('a' + i);
            count = count + padcount(p + ch, up.substring(1));
        }
        return count;
    }
    public static List<String> letterCombinations(String digits) {
      if (digits.isEmpty()) {
          return new ArrayList();
      }
      List<String> result = new ArrayList();
      String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      result.add("");
      for (char d : digits.toCharArray()){
          List<String> list = new ArrayList();
          for (String comb : result){
              for (char c : mapping[d - '0'].toCharArray()){
                  list.add(comb + c);
              }
          }
          result = list;
      }
      return result;
    }


}
