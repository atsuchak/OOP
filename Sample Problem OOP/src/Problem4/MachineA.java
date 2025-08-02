package Problem4;

public class MachineA extends Efficiency{
    int a, b, c;
    MachineA(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        totalEfficiency = this.a+this.b+this.c;
    }



    @Override
    double getEfficiencyPercentage() {
        return (totalEfficiency/(3*100))*100;
    }
}
