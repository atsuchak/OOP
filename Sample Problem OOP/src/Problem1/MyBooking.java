package Problem1;

import java.util.Scanner;

public class MyBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airplane obj1 = new Airplane("boeing747", 2012, 30);
        Airplane obj2 = new Airplane("boeing757", 2018, 40);
        Airplane obj3 = new Airplane("boeing777", 2022, 70);
        System.out.println("1. model: boeing747, year: 2012, seating capacity: 30");
        System.out.println("2. model: boeing757, year: 2018, seating capacity: 40");
        System.out.println("3. model: boeing777, year: 2022, seating capacity: 70");
        System.out.print("Choose(1/2/3): ");
        int choose = sc.nextInt();
        int passenger, luggage;
        switch (choose) {
            case 1:
                System.out.println("1. model: boeing747, year: 2012, seating capacity: 30");
                System.out.print("Enter total passenger: ");
                passenger = sc.nextInt();
                System.out.print("Enter total luggage: ");
                luggage = sc.nextInt();
                obj1.setUnit_cost(12000);
                obj1.Booking(passenger, luggage);
                break;
            case 2:
                System.out.println("2. model: boeing757, year: 2018, seating capacity: 40");
                System.out.print("Enter total passenger: ");
                passenger = sc.nextInt();
                System.out.print("Enter total luggage: ");
                luggage = sc.nextInt();
                obj2.setUnit_cost(18000);
                obj2.Booking(passenger, luggage);
                break;
            case 3:
                System.out.println("3. model: boeing777, year: 2022, seating capacity: 70");
                System.out.println("2. model: boeing757, year: 2018, seating capacity: 40");
                System.out.print("Enter total passenger: ");
                passenger = sc.nextInt();
                System.out.print("Enter total luggage: ");
                luggage = sc.nextInt();
                obj3.setUnit_cost(25000);
                obj3.Booking(passenger, luggage);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}
