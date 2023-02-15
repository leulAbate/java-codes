package kattistrik;

import java.util.Scanner;

public class KattisTrik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    boolean cup1=true,cup2=false,cup3=false;
    
      for (int i = 0; i < s.length(); i++) {
         
          if(s.charAt(i)=='A'){
              boolean temp = cup1;
              cup1=cup2;
              cup2=temp;
          }else if(s.charAt(i)=='B'){
              boolean temp= cup2;
              cup2=cup3;
              cup3=temp;
          }else{
              boolean temp = cup3;
              cup3=cup1;
              cup1=temp;
          }
          
      }
      if(cup1){
          System.out.println(1);
      }else if(cup2){
          System.out.println(2);
      }else{
          System.out.println(3);
      }
              
    }
    
}
