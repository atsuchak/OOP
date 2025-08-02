package Problem8;

public class Parrot extends Bird{
    @Override
    void sing() {

    }
    @Override
    void wings(int wings) {
        System.out.println("Parrot has " +wings+ " wings");
    }
    void color() {
        System.out.println("Parrots are green in color");
    }
}
