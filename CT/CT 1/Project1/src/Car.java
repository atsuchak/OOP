import java.util.Scanner;

class Car {

    double distance, fuel;

    Scanner scan = new Scanner(System.in);
    Car() {
        distance = scan.nextDouble();
        fuel = scan.nextDouble();
    }

//    Car(double distance, double fuel) {
//        this.distance = distance;
//        this.fuel = fuel;
//    }

    double getMileage() {
        double Mileage = distance/fuel;
        return Mileage;
    }

    double getCost() {
        double cost = fuel*4;
        return cost;
    }

//    void getMaxCost(int[] fuelCost) {
//        double max = 0;
//        max = fuel[0];
//        for(int i = 0; i < 4; i++) {
//            if(fuel[i] > max) {
//                max = fuel[i];
//            }
//        }
//        System.out.println("Max Cost: "+max);
//    }

}
