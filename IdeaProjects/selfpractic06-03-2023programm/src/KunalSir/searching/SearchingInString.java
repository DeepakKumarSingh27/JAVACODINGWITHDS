package KunalSir.searching;
public class SearchingInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'D';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
    if (str.length() == 0){
        return false;
    }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == target) return true;
        }
        return false;
    }
}
