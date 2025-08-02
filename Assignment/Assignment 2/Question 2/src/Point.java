import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point> al = new ArrayList<>();
        al.add(new Point(10, 20));
        al.add(new Point(12, 17));
        al.add(new Point(14, 33));
        al.add(new Point(20, 13));
        al.add(new Point(30, 16));
        al.add(new Point(31, 32));
        al.add(new Point(15, 22));
        Collections.sort(al.reversed());
        System.out.println(al);
    }

    @Override
    public int compareTo(Point p) {
        int sum1 = this.x + this.y;
        int sum2 = p.x + p.y;
        return sum1 - sum2;
    }
}
