package INter;

public class reverse {
    public static void main(String[] args) {
        String name= "Deepak";
        String rev= reversefun(name);
        System.out.println(rev);
    }
    public static String reversefun(String name) {
        char[] ch = name.toCharArray();
        int i =0,j=ch.length-1;
        while (i < j){
            char temp = ch[i];
            ch[i]= ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        name = new String(ch);
        return name;
    }
}
