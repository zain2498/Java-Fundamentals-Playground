package designPatterns.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String type){
        return switch (type){
            case "circle" -> new Circle();
            case "square" ->  new Square();
            default -> null;
        };
    }
}
