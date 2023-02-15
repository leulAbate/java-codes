package labdiamondcutter;

import java.util.HashMap;
import java.util.List;

public class LabDiamondCutter {
static List<Integer> startingVals = List.of(0,1,5,8,9,10,17,17,20);
    public static void main(String[] args) {
       // System.out.println(cut(11, 2));
        //System.out.println(isPrime(10));
        System.out.println(startingVals);
        System.out.println(listPrice(3));
        System.out.println(bestVal(20));
    }

    public static int cut(int size, int min) {
        System.out.println(size);
        if (size <= min || isPrime(size) == true) {
            return 1;
        }
        int a = 3 * size / 5;
        int b = 2 * size / 5;
        if (size % 2 == 0) {
            return cut(a, min + 1) + cut(b, min + 1);
        } else {
            return cut(a, min) + cut(b, min);
        }
    }
    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }

        }
        return prime;
    }
    public static int listPrice(int i){
        if(i>= startingVals.size()){
            return -1;
        }
        return startingVals.get(i);
    }
    //n,size,carats,
    static HashMap<Integer, Integer> memo = new HashMap<>();
     public  static int bestVal(int carats){
        
         if(memo.containsKey(carats)){//have i calculated this val
             return memo.get(carats);//if so, dont recalculate
         }
         
         //best value for diamond size carats is MAXIMUM of
         int max = listPrice(carats);         
         for (int i = 1; i <= carats/2; i++) {
            max =  Math.max(max, bestVal(i) + bestVal(carats-i));
         }
         memo.put(carats,max);
    return max;
    }
}