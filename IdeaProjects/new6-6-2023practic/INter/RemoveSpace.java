package INter;

public class RemoveSpace {
    public static void main(String[] args) {
        String st = "Amelia Website";
                   // 012345  678910..
        String str = removeSpace(st);
        System.out.println(str);
    }

    public static String removeSpace(String st) {
        String str="";
        for (int i = 0; i <st.length() ; i++) {
            char ch = st.charAt(i);
            if (ch ==' ')
                continue;
            else
                str+=ch;
        }
        return str;
    }
}
