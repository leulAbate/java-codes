package changemaker;
import java.util.Scanner;
public class ChangeMaker {
    public static void main(String[] args) {
    //the user will type in a number of cents
    //62 -> 2 quarters , 1 dime , 0 nickels , 2 pennies
    
    Scanner sc = new Scanner(System.in);
        System.out.println("enter change:");
      int cents = sc.nextInt();
      int q = cents/25;
      //option 1 ->q*25
      //option 2 ->remainder/mod/modulous
      //System.out.println(62%25);
      //System.out.println(62- (25*2));
        
        //change the value of cents
        cents = cents % 25;//quarters
        int d = cents /10; //dimes
        cents = cents %10; //dimes
        
        int n = cents /5;
        cents = cents %5;
        
        System.out.println("quarters:" + q);
        System.out.println("dimes" + d);
        System.out.println("nickels" + n);
        System.out.println("pennies" + cents);
    }
    
}
