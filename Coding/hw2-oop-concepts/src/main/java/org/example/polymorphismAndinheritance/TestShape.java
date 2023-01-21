package org.example.polymorphismAndinheritance;

public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(5);
        Shape cube = new Rectangle(10, 20, 5);

        System.out.println("Rectangle Area is: " + rectangle.getArea());
        System.out.println("Circle Area is: " + circle.getArea());
        System.out.println("Cube Volume is: " + cube.getVolume());

    }
}
