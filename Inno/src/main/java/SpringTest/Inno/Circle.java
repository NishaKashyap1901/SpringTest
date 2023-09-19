package SpringTest.Inno;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
