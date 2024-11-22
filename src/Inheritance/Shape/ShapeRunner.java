package Inheritance.Shape;

public class ShapeRunner {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Circle", 9.0), new Rectangle("Rectangle", 9.0, 8.0)};

        for (Shape shape : shapes){
            shape.displayInfo();
        }
    }
}



