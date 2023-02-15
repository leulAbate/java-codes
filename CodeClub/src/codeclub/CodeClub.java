package codeclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeClub {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
       int value1 = (a+b)-c;
            if (value1>=0){
                list.add(value1);
            }
       int value2 = (a+b)/c;
            if (value2>=0){
                list.add(value2);
            }    
       int value3 = (a+b)*c;
            if (value3>=0){
                list.add(value3);
            }
       int value4 = (a-b)+c;
            if (value4>=0){
                list.add(value4);
            }        
       int value5 = (a-b)*c;
            if (value5>=0){
                list.add(value5);
            }
        int value6 = (a-b)/c;
            if (value6>=0){
                list.add(value6);
            }    
        int value7 = (a*b)-c;
            if (value7>=0){
                 list.add(value7);
            }     
       int value8 = (a*b)+c;
            if (value8>=0){
                list.add(value8);
            }    
        int value9 = (a*b)/c;
            if (value9>=0){
                list.add(value9);
            }    
        int value10 = (a/b)+c;
            if (value10>=0){
                list.add(value10);
            }    
        int value11 = (a/b)-c;
            if (value11>=0){
                list.add(value11);
            }
        int value12 = (a/b)*c;
            if (value12>=0){
                list.add(value12);
            }        
        int value13 = (a-b)-c;
            if (value13>=0){
                list.add(value13);
            }    
        int value14 = (a*b)*c;
            if (value14>=0){
                list.add(value14);
            }    
        int value15 = (a/b)/c;
            if (value15>=0){
                list.add(value15);
            }
            int min = list.get(0);
          for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i); 
            }           
            }
          System.out.println(list);
                System.out.println(min);
    }
    }

   
