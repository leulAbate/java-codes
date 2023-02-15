package kattistrik;

import java.util.*;
import java.util.stream.Collectors;

public class LineThemUp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        List<String> names = sc.tokens().limit(n).collect(Collectors.toList());
        String forward = names.stream().sorted().collect(Collectors.joining());
        String reverse = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        String original = String.join("", names);
        
    }
    
}
