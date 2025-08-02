package Problem5;

public class Teacher extends Person {
    String subject;

    @Override
    public void leave(String reason) {
        System.out.println("Reason for leave: " + reason);
    }
    @Override
    public void leave() {}
    @Override
    public void attend() {}
}



