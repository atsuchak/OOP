public class Reptile extends Animal{
    String scaleColor;
    int thermoType;
    Reptile(String name, String gender, String scaleColor) {
        super(name, gender);
        this.scaleColor = scaleColor;
    }

    void thermoregulation() {
        System.out.println("The reptile is thermoregulating in it's unique way.");
    }
    void thermoregulation(int way) {
        System.out.println("The reptile is thermoregulating in way " +way);
    }

    @Override
    void eat() {
        System.out.println(name+"("+getGender()+", Color: " +scaleColor+ ") is eating.");
    }

    @Override
    void makeSound() {
        System.out.println(name+ " makes a reptile sound.");
    }


}
