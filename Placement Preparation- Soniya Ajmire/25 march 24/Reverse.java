import java.util.*;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scn.nextInt();
        int rev = 0;
        
        while(number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        
        System.out.println("Reverse of the numer:" +rev);
    }
}