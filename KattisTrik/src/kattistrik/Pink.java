package kattistrik;

import java.util.Scanner;

public class Pink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        
        //tokens grabs all the words from scanner
        //limit onlytakes certain number of lines
        //map, turn each string to lowercase
        //filter keep only the strings that contain pink or rose
        //count how any
        long c =sc.tokens().limit(lines).map(s-> s.toLowerCase())
                .filter(s-> s.contains("pink") || s.contains("rose"))
                .count();
        if(c==0){
            System.out.println("I must watch Star Wars with my daughter");
        }else{
        System.out.println(c);
        }
    }
  
}
