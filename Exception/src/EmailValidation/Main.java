package EmailValidation;

import java.util.Scanner;

class InvalidEmailException extends Exception {
    InvalidEmailException(String st) {
        super(st);
    }
}

public class Main {
    void validateEmail(String email) {
        try {
            if(!email.contains("@")) throw new InvalidEmailException("Email don't have a \"@\" sign");
            if(!email.contains(".")) throw new InvalidEmailException("Email don't have a \".\" sign");
            if(email.contains(" ")) throw new InvalidEmailException("Email has a space");
            System.out.println("Email address: " +email);
        }catch (InvalidEmailException e) {
            System.out.println("Exception found: " +e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        try {
            System.out.println("Enter your email address: ");
            String email = sc.nextLine();
            obj.validateEmail(email);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
