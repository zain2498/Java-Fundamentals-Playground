package Inheritance.Shape;

public class Circle extends Shape {


    double radius;

    public Circle(String name, double radius ) {
        super(name);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
