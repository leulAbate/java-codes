package crapssimulator;

public class CrapsSimulator {

    public static void main(String[] args) {
        double wins =0;
        for (int i = 0; i < 1000000; i++) {
            if (play()){
                wins++;
            }
            
        }
        System.out.println(wins/1000000);
    }
//play 1 game of craps. return true fro a win . false for a loss
    public static boolean play() {
        int first = roll();
        if (first == 2 || first == 3 || first == 12) {
            return false;
        }
        if (first == 7 || first == 11) {
            return true;
        }
        while (true) {
            int next = roll();
            if (next == 7) {
                return false;
            } else if (next == first) {
                return true;

            }
        }

    }

    public static int roll() {

        int d1 = (int) (Math.random() * 6 + 1);
        int d2 = (int) (Math.random() * 6 + 1);
       // System.out.println(d1+d2);
       return d1 +d2;
    }

}
