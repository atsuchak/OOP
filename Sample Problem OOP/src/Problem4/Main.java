package Problem4;

public class Main {
    public static void main(String[] args) {
        MachineA machineA = new MachineA(85, 88, 90);
        MachineB machineB = new MachineB(92, 89, 90, 87);

        System.out.println("Efficiency percentage for MachineA: " +machineA.getEfficiencyPercentage() + "%");
        System.out.println("Efficiency percentage for MachineB: " +machineB.getEfficiencyPercentage() + "%");
    }
}
