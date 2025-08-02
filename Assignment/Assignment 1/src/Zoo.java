import java.util.ArrayList;

public class Zoo implements ZooKeeper{

    Animal[] animals;
    int capacity = 10;

    Zoo() {
        this.animals = new Animal[capacity];
    }

    public void addAnimal(Animal animal) {
        for(int i = 0; i < capacity; i++) {
            if(i < capacity) {
                animals[i] = animal;
            }else{
                System.out.println("Zoo capacity exceeded!");
            }
        }
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println("Zookeeper is feeding " +animal.name);
        animal.eat();
        animal.makeSound();
    }



}
