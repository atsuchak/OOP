package Problem11;

public class Pet {
    String name;
    String type;
    int hungerLevel;
    int happinessLevel;

    Pet(String name, String type, int hungerLevel, int happinessLevel) {
        this.name = name;
        this.type = type;
        this.hungerLevel = 50;
        this.happinessLevel = 50;
    }

    void feed() {
        hungerLevel = Math.max(0, hungerLevel-20);
    }
    void play() {
        happinessLevel = Math.min(100, happinessLevel+35);
    }
    int getHungerLevel() {
        return hungerLevel;
    }
    int getHappinessLevel() {
        return happinessLevel;
    }
}
