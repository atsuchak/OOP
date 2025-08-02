package OutOfRangeException;
import java.util.Scanner;

class OutOfRangeException extends Exception {
    OutOfRangeException(String st) {
        super(st);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a value between 1 to 100: ");
            int val = sc.nextInt();
            if(val < 0 || val > 100) throw new OutOfRangeException("Value is out of range");
            System.out.println("Entered value is: " +val);
        }catch (Exception e) {
            System.out.println("Exception found: " +e);
        }

    }
}
