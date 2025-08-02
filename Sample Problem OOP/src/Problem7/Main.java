package Problem7;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square();

        s1.printShape();
        ((Shape)s1).printShape();
        ((Rectangle)s1).printShape();
    }
}