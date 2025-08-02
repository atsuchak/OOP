package Problem9;

public class Rectangle {
    int length, width;

    Rectangle(){}

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int CalculateArea() {
        return this.length*this.width;
    }
    public int CalculatePerimeter() {
        return 2*(this.length+this.width);
    }

}