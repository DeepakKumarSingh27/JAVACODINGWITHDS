package AssignMent7;

import java.util.Arrays;

public class AverageSalEmp {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        double z = average(salary);
        System.out.println(z);
    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
      //  System.out.println(Arrays.toString(salary));
        double sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length - 1 ; i++) {
            sum += salary[i];
            count++;
        }
        return sum/count;
    }
}

/*
    double sum = 0;
       int small = salary[0];
       int big = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (small > salary[i]){
                small = salary[i];
            }
            if (big < salary[i]){
                big = salary[i];
            }
        }
        return big;
 */