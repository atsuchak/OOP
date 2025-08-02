package Problem5;

public class Staff extends Person{
    String position;

    void assist() {
        System.out.println("Staff member is assisting with school operations");
    }

    @Override
    public void attend() {}
    @Override
    public void leave() {}
    @Override
    public void leave(String reason) {}
}
