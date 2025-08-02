

public class Main {
    public static void main(String[] args) {


        Zoo zoo = new Zoo();

        Mammal lion = new Mammal("Lion", "Male",  "Golder");
        Mammal elephant = new Mammal("Elephant",  "Female",  "Gray");
        Mammal giraffe = new Mammal("Giraffe",  "Male",  "Spotted");

        Bird eagle = new Bird("Eagle", "Female", 2.0);
        Bird parrot = new Bird("Parrot", "Male", 0.5);
        Bird penguin = new Bird("Penguin", "Female", 1.0);

        Reptile snake = new Reptile("Snake", "Female", "Green");
        Reptile crocodile = new Reptile("Crocodile", "Male", "Brown");
        Reptile turtle = new Reptile("Turtle", "Female", "Green");



        zoo.feedAnimal(lion);
        zoo.feedAnimal(elephant);
        zoo.feedAnimal(giraffe);

        zoo.feedAnimal(eagle);
        eagle.sleep(6);
        zoo.feedAnimal(parrot);
        parrot.sleep(8);
        zoo.feedAnimal(penguin);
        penguin.sleep(10);

        zoo.feedAnimal(snake);
        snake.thermoregulation(1);
        zoo.feedAnimal(turtle);
        crocodile.thermoregulation(2);
        zoo.feedAnimal(turtle);
        turtle.thermoregulation(3);

    }
}
