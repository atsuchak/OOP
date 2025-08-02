package Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person t1 = new Teacher();
        t1.leave("sick");
        Person s1 = new Student();
        s1.attend();
        Staff st1 = new Staff();
        st1.assist();
    }
}





