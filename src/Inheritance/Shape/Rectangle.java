package Inheritance.Shape;

public class Rectangle extends Shape{
    double width, length;


    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;

    }

    @Override
    public double calculateArea() {

        double area = length * width;
        return area;
    }
}
