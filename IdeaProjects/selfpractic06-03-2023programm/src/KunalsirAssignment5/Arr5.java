package KunalsirAssignment5;
import java.util.ArrayList;
import java.util.List;

public class Arr5 {
    public static void main(String[] args) {
       // List<Boolean> candies =new ArrayList() ;
      //  int extraCandies = 3;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                int big = 0;
                List<Boolean> li = new ArrayList<>();
                if(extraCandies == 1){
                    for(int i = 0; i < candies.length; i++){
                        if(big < candies[i])
                            big = candies[i];
                    }
                    for(int i = 0; i < candies.length; i++){
                        if(big == candies[i])
                            li.add(true);
                        else
                            li.add(false);
                    }
                    return li;
                }
                else{
                    for(int i = 0; i < candies.length; i++){
                        if(candies[i] + extraCandies >= big){

                            li.add(true);
                        }else{
                            li.add(false);
                        }
                        big = candies[i] + extraCandies;
                    }
                    return li;
                }
            }
        }

