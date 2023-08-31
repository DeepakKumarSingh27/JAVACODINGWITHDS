package KSirDataStructure.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class RandomString {
    static String genrate(int size){
     StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
     int n = 20;
        String name = RandomString.genrate(n);
        System.out.println(name);

        String sentence = "Hi   Deeejeje     sjssjsjs  ";
        System.out.println(sentence.replaceAll("\\s",""));

        String arr = "Deepak Rahul senhal Apoorv";
        String[] names=  arr.split(" ");
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));
    }
}
