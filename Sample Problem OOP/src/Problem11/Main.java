package Problem11;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Scripted Coder", "Kitty", "Monkey");

        System.out.println(owner.displayOwnerInfo());
        owner.feedPet();
        owner.playWithPet();
    }


}
