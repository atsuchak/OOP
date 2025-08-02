package Problem8;

public class Spider extends Animal{

    Spider(int leg) {
        super(leg);
    }

    @Override
    void eat() {
        System.out.println("Spider is eating");
    }
    @Override
    void walk() {
        super.walk();
    }
}
