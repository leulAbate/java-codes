package kattistrik;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int lines = sc.nextInt();
      sc.nextLine();
        for (int i = 0; i < lines; i++) {
            String s = sc.nextLine();
            if (s.startsWith("Simon says")) {
                System.out.println(s.substring(10));
            }
            
            
        }
    }
    
}
