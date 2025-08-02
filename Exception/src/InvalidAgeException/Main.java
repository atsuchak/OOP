package InvaolidAgeException;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String st) {
        super(st);
    }
}

public class Main {

     void validateAge(int age) {
        try {
            if(age < 0 || age > 120) throw new InvalidAgeException("Age invalid");
            else System.out.println("AGE: " +age);
        }catch (InvalidAgeException e) {
            System.out.println("Exception found: " +e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        try {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            obj.validateAge(age);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
