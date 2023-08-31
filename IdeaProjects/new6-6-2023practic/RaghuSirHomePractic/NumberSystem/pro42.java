package RaghuSirHomePractic.NumberSystem;

public class pro42 {
    public static void main(String[] args) {
        int n = 12345;
 //       String st ="";
//        do {
//            int d= n%10;
//            st+=d;
//            n/=10;
//        }while (n!=0);
        int rev=0;
        while (n!=0){
            int d= n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        System.out.println(rev);
        System.out.println();
    }
}
