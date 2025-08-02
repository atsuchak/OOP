package NegativeNumberException;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException(String st) {
        super(st);
    }
}

public class Main {

    static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n < 0) throw  new NegativeNumberException("Entered number is a non positive number");
            int result = factorial(n);
            System.out.println("Factorial of number " +n+ " is: " +result);
        } catch (NegativeNumberException e) {
            System.out.println("Exception found: " +e);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
