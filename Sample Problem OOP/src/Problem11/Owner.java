package Problem11;

public class Owner {
    String name;
    Pet pet;

    Owner(String name, String petName, String type) {
        this.name = name;
        this.pet = new Pet(petName, type, 50, 50);
    }

    String displayOwnerInfo() {
        return (name + " is the owner of " +pet.name);
    }
    void feedPet() {
        pet.feed();
        System.out.println("Current feed level: " +pet.getHungerLevel());
    }
    void playWithPet() {
        pet.play();
        System.out.println("Current play level: " +pet.getHappinessLevel());
    }
}
