public class Mammal extends Animal{
    String furType;
    Mammal(String name, String gender, String furType) {
        super(name, gender);
        this.furType = furType;
    }

    void nurseYoung() {
        System.out.print("The mammal is taking care of its child.");
    }

    @Override
    void eat() {
        System.out.println(name+"("+getGender()+", Fur Color: " +furType+ ") is eating.");
    }

    @Override
    void makeSound() {
        System.out.println(name+ " makes a mammal sound.");
    }

}
