package Problem8;

public abstract class Animal {
    public int leg;

    Animal() {

    }
    Animal(int leg) {
        this.leg = leg;
    }
    abstract void eat();
    void walk() {
        System.out.println("Animal walks with " +leg+ " legs");
    }
}
