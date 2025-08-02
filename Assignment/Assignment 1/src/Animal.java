abstract public class Animal {

    String name;
    int age;
    private String gender;
    private String habitat;

    Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }

    void eat(){
        System.out.println("The animal is eating");
    }
    void makeSound(){

    }
    void sleep(int sleepTime) {
        System.out.println("The animal is sleeping");
    }

}
