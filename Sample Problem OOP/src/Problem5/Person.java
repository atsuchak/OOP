package Problem5;

public abstract class Person extends Main {
    protected String  name;
    protected int age;

    public abstract void attend();
    public abstract void leave();
    public abstract void leave(String  reason);
}
