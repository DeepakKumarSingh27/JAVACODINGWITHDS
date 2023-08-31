package TwoArray;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Row");
        int row = sc.nextInt();
        System.out.println("Enter the Column ");
        int col = sc.nextInt();
          int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+" values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("user entered element is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
    for(int j =i+1;j<3;j++)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[2-i][j];
        arr[2-i][j]=temp;

    }
    for(int i =0;i<3;i++)
    {
    for(int j =0;j<4;j++)
    cout<<arr[i][j]<<" ";
    cout<<endl;
    }
 */