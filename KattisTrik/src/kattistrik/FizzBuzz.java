package kattistrik;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt(), y =sc.nextInt(),n =sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if(x==0&&y==0){
                System.out.println("FizzBuzz");
            }
        }
          
    }
}
