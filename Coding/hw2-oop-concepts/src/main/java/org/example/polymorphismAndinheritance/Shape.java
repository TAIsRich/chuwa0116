package org.example.polymorphismAndinheritance;

public class Shape {
    public double getArea(){
        return 0;
    }

    public double getVolume() {
        return 0;
    }
}

// Example of Inheritance
class Rectangle extends Shape {
    double height;
    double width;
    double length;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Polymorphism: constructor overloading
    public Rectangle(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // Polymorphism: method overriding
    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getVolume() {
        return length * height * width;
    }
}

class Circle extends  Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

