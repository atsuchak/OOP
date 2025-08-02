import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance travelled and furl consumption of car: ");
        Car car1 = new Car();


        int choice;
        System.out.println("Please enter a choice: 1. Mileage of Car. 2. Cost of fuel. 3. Maximum Cost");
        choice = sc.nextInt();

        double[] fuelCost;
        fuelCost = new double[4];
        if(choice == 1) {
            System.out.println("Mileage: "+car1.getMileage());
        }else if(choice == 2) {
            System.out.println("Cost: "+car1.getCost()+"$");
        }else if(choice == 3) {
            System.out.println("Enter last 4 month fues cost: ");
            for(int i = 0; i < 4; i++) {
                fuelCost[i] = sc.nextDouble();
            }
//            car1.getMaxCost(5);
        }else {
            System.out.println("Invalid choice");
        }

    }
}
