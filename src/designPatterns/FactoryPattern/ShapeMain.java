package designPatterns.FactoryPattern;

public class ShapeMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("square");
        shape.draw();
    }
}
