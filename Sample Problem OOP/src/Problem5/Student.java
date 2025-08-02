package Problem5;

public class Student extends Person {
    int gradeLevel;

    @Override
    public void attend() {
        System.out.println("Student attending the class");
    }
    @Override
    public void leave() {}
    @Override
    public void leave(String reason) {}
}
