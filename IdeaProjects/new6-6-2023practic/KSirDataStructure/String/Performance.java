package KSirDataStructure.String;
public class Performance {
    public static void main(String[] args) {
      String series ="";
        for (int i = 0; i < 26; i++) {
           char ch = (char) ('a'+i);
            series = series + ch;
        }
        System.out.println(series);
//        int []n = 1000;
//        System.out.println((int)(Math.log10(n)+1));

    }
}
