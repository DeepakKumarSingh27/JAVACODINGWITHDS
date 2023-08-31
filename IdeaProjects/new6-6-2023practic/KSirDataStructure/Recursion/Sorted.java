package KSirDataStructure.Recursion;
public class Sorted {
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,99,8};
        System.out.println(sorted(arr,0));
    }
    static public boolean sorted(int[] arr,int index){
     if (index == arr.length-1){
         return true;
     }
     return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
