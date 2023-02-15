package kattistrik;

import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int scores[] =sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
        int scores[] = new int[5];
        for (int row = 0; row <5; row++) {
            for (int score = 0; score < 10; score++) {
                scores[row] += sc.nextInt();
            }

        }
        System.out.println(scores);

        int winner = maxIndex(scores);
        System.out.println((winner + 1) + " ");
    }

    public static int maxIndex(int[] scores) {
        int maxIndex = 0;
        for (int i = 0; i < scores.length; i++) {

            //if the value at the current index I value at the max Index
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
            return maxIndex;
        }
        
    
