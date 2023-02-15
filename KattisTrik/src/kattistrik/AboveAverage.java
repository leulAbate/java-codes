package kattistrik;

import java.util.*;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //number of lines
         //number of grades
        int lines = sc.nextInt();
        
        for (int i = 0; i < lines; i++) {
            //how many grades
            int num = sc.nextInt();
            //make a list, and read in'num'grades into it
            ArrayList<Integer> grades = new ArrayList<>();//reset after each line
            for (int j = 0; j < num; j++) {
                grades.add(sc.nextInt());
                
            }
           //we now have a list of all the grades.
           //we need to find the averge
            double sum = grades.stream().reduce(0, (a,b)->a+b);
            double avg = sum/grades.size();
            
            double above =grades.stream().filter(grade->grade >avg).count();
            double abovePct =100* above/grades.size();
            System.out.printf("%.3f",abovePct);
            System.out.println("%");
        }
    }
  
}
