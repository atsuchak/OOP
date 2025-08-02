import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    ArrayList<Integer> grades = new ArrayList<>();

    void addGrade(int grade) {
        if(grade != -1) grades.add(grade);
    }
    double calculateAverage() {
        int sum = 0;
        for(int num: grades) {
            sum += num;
        }
        double avg = (double)sum / grades.size();
        return avg;
    }
    int highestGrade() {
        return  Collections.max(grades);
    }
    void listPassingStudents() {
        System.out.println("Passing students:");
        for(int num: grades) {
            if(num >= 50) System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Student Grade Tracker \n");

        while (true) {
            System.out.print("Enter a student's grade (or -1 to stop): ");
            int grade = sc.nextInt();
            if(grade == -1) break;
            obj.addGrade(grade);
        }
        double avg = obj.calculateAverage();
        System.out.println("Average grade: " +String.format("%.2f", avg));
        System.out.println("Highest grade: " +obj.highestGrade());
        obj.listPassingStudents();
    }
}
