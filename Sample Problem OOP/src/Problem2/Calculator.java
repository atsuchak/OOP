package Problem2;

public class Calculator {
    int a, b;
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int getFactorial () {
        return this.a*this.b;
    }
    int getFactorial (int a) {
        if(a == 0 || a == 1) return 1;
        else{
            return a * getFactorial(a-1);
        }
    }
    int pow() {
        return (int)Math.pow(this.a, this.b);
    }
    int pow(int a, int b) {
        return (int)Math.pow(a,b);
    }
    int multiply() {
        return this.a*this.b;
    }
    int multiply(int a, int b) {
        return a*b;
    }
}
