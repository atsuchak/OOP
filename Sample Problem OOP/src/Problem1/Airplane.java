package Problem1;

public class Airplane {
    public String model;
    public int year;
    private int seatingCapacity;
    private double unit_cost;
    private int[] availableSeats;
    int temp = 0;

    Airplane(String model, int year, int seatingCapacity, double unit_cost, int[] availableSeats) {
        this.model = model;
        this.year = year;
        this.seatingCapacity = seatingCapacity;
        this.unit_cost = unit_cost;
        this.availableSeats = availableSeats;
    }
    Airplane(String model, int year, int seatingCapacity) {
        this.model = model;
        this.year = year;
        this.seatingCapacity = seatingCapacity;

        this.availableSeats = new int[seatingCapacity];
        for(int i = 0; i < seatingCapacity; i++) {
            availableSeats[i] = 1;
        }
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    public double getUnit_cost() {
        return unit_cost;
    }
    public void setUnit_cost(double unit_cost) {
        this.unit_cost = unit_cost;
    }
    public void setAvailableSeats(int[] availableSeats) {
        this.availableSeats = availableSeats;
    }
    public int[] getAvailableSeats() {
        return availableSeats;
    }
    int totalLugCost = 0;
    double totalCost = 0;
    public void Booking(int n, int luggage) {
        if(n <= seatingCapacity) {
            boolean seatFound = false;
            int startSeat = 0;
            for (int i = 0; i < availableSeats.length -n; i++) {
                boolean consecutive = true;
                for(int j = 0; j < n; j++) {
                    if(availableSeats[i+j] != 1) {
                        consecutive = false;
                        break;
                    }
                }
                if(consecutive) {
                    seatFound = true;
                    startSeat = i;
                }
            }
            if(seatFound) {
                for(int i = startSeat; i < startSeat+n; i++) {
                    availableSeats[i] = 0;
                }
                if(luggage > n*3) {
                    totalLugCost = (luggage-(n*3)) * 600;
                }
                totalCost = (double)totalLugCost + n * getUnit_cost();
                System.out.println("Total Cost: " +totalCost);
                }else {
                    System.out.println("Seats are not available");
                }
        }else {
            System.out.println("Exceeds seating capacity");
        }

    }

}
