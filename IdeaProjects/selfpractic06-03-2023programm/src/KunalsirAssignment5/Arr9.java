package KunalsirAssignment5;
public class Arr9 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean rs=panagram(sentence);
        if (rs==true)
            System.out.println(rs);
        else
            System.out.println(rs);
    }
    static boolean panagram(String sentence) {
        if (sentence.length()<26)
        {
            return false;
        }
        int[] count=new int[26];
        for (int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if (ch>='A' && ch<='Z')
                count[ch-65]++;
            else if (ch>='a' && ch<='z')
                count[ch-97]++;

        }
        for (int i = 0; i < 26 ; i++) {
            if (count[i]==0)
                return false;
        }
        return true;
    }
}
