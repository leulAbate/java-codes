package kattistrik;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> countList = new ArrayList<>();
        int val = sc.nextInt();
        for (int i = 0; i < val; i++) {
            countList.add(sc.nextInt());

        }
        int lastNum = countList.get(countList.size() - 1);
        //how do we collect a stream into a list

        // list of numbers from1 to last num
        //boxed -> turns thm from int ti Integer
        //filter keeps only the ones not inside of countList
        //collect our stream into a list
        
        
        List<Integer> missed = IntStream.range(1, lastNum).boxed()
                .filter(n -> !countList.contains(n))
                .collect(Collectors.toList());
        if(missed.isEmpty()){
            System.out.println("good job");
        }else{
            missed.forEach(System.out::println);
        }
    }

}
