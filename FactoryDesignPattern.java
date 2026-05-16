package com.example.demo.design;

enum ShapeType{
    CIRCLE,
    RECTANGLE
}
interface Shape{
    public void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Printing Circle area");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Printing Rectangle Area");
    }
}

class Factory {

    public static Shape getShape(ShapeType shape){
        return switch (shape) {
            case CIRCLE -> {
                System.out.println("Circle shape received");
                yield new Circle(); //for multi line
            }
            case RECTANGLE -> {
                System.out.println("Rectangle shape received");
                yield new Rectangle();
            }
            default -> throw new IllegalArgumentException("Invalid Shape");
        };
    }
}
public class FactoryDesignPattern {
    public static void main(String[] args){
        System.out.println("Factory Design pattern");
        String input = "RECTANGLE";
        ShapeType shapeType=ShapeType.valueOf(input);
        Shape shape=Factory.getShape(shapeType);
        shape.draw();
        Shape shape1=Factory.getShape(ShapeType.CIRCLE);
        shape1.draw();
    }
}
