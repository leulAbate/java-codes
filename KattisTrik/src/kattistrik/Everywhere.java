package kattistrik;

import java.util.Scanner;

public class Everywhere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int cities = sc.nextInt();
            System.out.println(
                    sc.tokens().limit(cities).distinct().count()
            );
        }
    }
}
