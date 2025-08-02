package InvalidParameterException;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st value: ");
            int val1 = sc.nextInt();
            if(val1 < 0) throw new InvalidParameterException();
            System.out.println("Enter 2nd value: ");
            int val2 = sc.nextInt();
            if(val2 < 0) throw new InvalidParameterException();
            int sum = val1 + val2;
            System.out.println("Sum of the 2 numbers are: " +sum);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
