import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String st) {
        super(st);
    }
}

public class Main {

    void validateAge(int age) throws InvalidAgeException {
        //try {
            if(age < 0 || age > 120) throw new InvalidAgeException("INVALID AGE!!!");
            else System.out.println("VALID AGE!!!");
//        }catch (InvalidAgeException e) {
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main obj = new Main();
        System.out.print("Enter age: ");

        try {
            int age = sc.nextInt();
            obj.validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Exception found: " +e);
        }
    }
}
