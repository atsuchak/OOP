package Problem4;

public class MachineB extends Efficiency{
    int a, b, c, d;
    MachineB(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        totalEfficiency = this.a+this.b+this.c+this.d;
    }
    @Override
    double getEfficiencyPercentage() {
        return (totalEfficiency/(4*100))*100;
    }
}
