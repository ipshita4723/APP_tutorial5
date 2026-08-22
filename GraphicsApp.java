import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class GraphicsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter length and width of Rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        System.out.print("Enter base and height of Triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        Shape[] shapes = new Shape[] {
            new Circle(radius),
            new Rectangle(length, width),
            new Triangle(base, height)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        scanner.close();
    }
}