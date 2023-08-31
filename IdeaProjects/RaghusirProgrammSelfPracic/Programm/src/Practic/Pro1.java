package Practic;
public class Pro1 {
    public static void main(String[] args) {
        String st = "nitin";
       int x= palindrome(st);
        if(x==1)
            System.out.println(x);
        else if(x==-1)
            System.out.println(x);

    }
    static int palindrome(String st) {

        char[] ch = st.toCharArray();
        int i = 0, j = st.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String    st1 = new String(ch);
        if (st1.equals(st))
            return 1;
        else
            return -1;
    }
    }
