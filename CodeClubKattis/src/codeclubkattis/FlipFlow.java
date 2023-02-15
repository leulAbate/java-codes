package codeclubkattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlipFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        int initialInput = 0;
        int currentInput = 0;
        for (int i=0;i<n;i++){
            currentInput = sc.nextInt();

            list.add(currentInput-initialInput);
            initialInput = currentInput;

        }

        int answer = s;

        list.remove(0);
//        System.out.println(list);

        for (int i=0;i<list.size();i++){
            if (i%2==0){
                answer = answer-list.get(i);
                if (answer<0){
                    answer=0;
                }
            }
            else {
                answer = answer+list.get(i);
                if (answer>s){
                    answer=s;
                }
            }
        }
        // find the difference between s and answer
        int finalAnswer = 0;

        if (n%2==0){
            finalAnswer = (currentInput+(s-answer))-t;
            if (finalAnswer<0){
                finalAnswer = 0;
            }
        }
        else {
            finalAnswer = (currentInput+answer)-t;
            if (finalAnswer<0){
                finalAnswer=0;
            }
        }
        System.out.println(finalAnswer);
    }
}

