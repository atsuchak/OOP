public class Bird extends Animal{
    double wingSpan;
    Bird(String name, String gender, double wingSpan) {
        super(name, gender);
        this.wingSpan = wingSpan;
    }

    void fly() {
        System.out.println("The bird is flying in the sky");
    }

    @Override
    void sleep(int sleepTime) {
        System.out.println(name+ " is sleeeping for " +sleepTime+ " hours");
    }

    @Override
    void eat() {
        System.out.println(name+"("+getGender()+", Wing Span: " +wingSpan+ ") is eating.");
    }

    @Override
    void makeSound() {
        System.out.println(name+ " makes a bird sound.");
    }
}
