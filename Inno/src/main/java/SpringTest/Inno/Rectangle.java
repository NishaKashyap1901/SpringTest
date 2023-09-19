package SpringTest.Inno;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

@Override
    public double calculateArea() {
        return length * width;
    }
}
