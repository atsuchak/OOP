package NullPointerException;

public class Person {
    String name;
    int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printAge() {
        System.out.println("Age: " +age);
    }

}
