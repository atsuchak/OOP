package NullPointerException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = null;
            person.printAge();
        }catch (NullPointerException e) {
            System.out.println("Exception found: " +e);
        }
    }
}