package kattistrik;

import java.util.ArrayList;
import java.util.Scanner;

public class Queens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Queen> list = new ArrayList<>();
        for (int row = 0; row < 8; row++) {
            String s = sc.next();
            for (int col = 0; col < 8; col++) {

                if (s.charAt(col) == '*') {
                    System.out.println(row + " " + col + ": " + s.charAt(col));
                    Queen q = new Queen();
                    q.r = row;
                    q.c = col;
                    list.add(q);
                    list.add(p);
                }

            }
            if(list.size()!=8)
            for(Queen q : list);
              for(Queen p : list);
              if (q ==p)continue;
              if(q.r ==p.r){
                  System.out.println("invalid");
                  return;
              }else if(q.c ==p.c){
                  System.out.println("invalid");
              }else if(p.r -p.c == q.r - q.c){
                  System.out.println("invalid");
              }else if(p.r+p.c == q.r+q.c) {
                  System.out.println("");
              }   
        }
    }

}

class Queen {

    int r, c;
}
