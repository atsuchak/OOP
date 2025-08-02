package Problem9;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of rectangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Rectangle rc = new Rectangle(a, b);

        System.out.print("Please enter a choice: ");
        System.out.print("1. Area fo rectangle ");
        System.out.println("2. Perimeter fo rectangle");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Area: " +rc.CalculateArea());
        }else if(choice == 2) {
            System.out.println("Perimeter: " +rc.CalculatePerimeter());
        }else {
            System.out.println("Invalid choice");
        }
    }
}