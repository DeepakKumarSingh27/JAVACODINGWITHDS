package Assignment8;

import javax.swing.text.html.HTMLEditorKit;
import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
       int[] indices = {4,5,6,7,0,2,1,3};
       String s = restoreString(str,indices);
        System.out.println(s);
    }
    public static String restoreString(String s, int[] indices) {
        Arrays.sort(indices);
        String st = "";
        for (int i = 0; i < indices.length; i++) {
            
        }
        return null;
    }
}
