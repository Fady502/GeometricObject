/* Fady Zaki SDEV200 1/26/24
---------------------------------------
|          GeometricObject            |
---------------------------------------
| - color: String                     |
| - filled: boolean                   |
| + GeometricObject()                 |
| + GeometricObject(color: String,    |
|    filled: boolean)                 |
| + getColor(): String                |
| + setColor(color: String): void     |
| + isFilled(): boolean               |
| + setFilled(filled: boolean): void  |
| + toString(): String                |
---------------------------------------

---------------------------------------
|             Triangle                 |
---------------------------------------
| - side1: double                     |
| - side2: double                     |
| - side3: double                     |
---------------------------------------
| + Triangle()                        |
| + Triangle(side1: double, side2:    |
|    double, side3: double)           |
| + getSide1(): double                |
| + setSide1(side1: double): void     |
| + getSide2(): double                |
| + setSide2(side2: double): void     |
| + getSide3(): double                |
| + setSide3(side3: double): void     |
| + getArea(): double                 |
| + getPerimeter(): double            |
| + toString(): String                |
---------------------------------------
*/
import java.util.Scanner;

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "color: " + color + ", filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("Enter the color of the triangle:");
        String color = scanner.next();

        System.out.println("Is the triangle filled? (true/false):");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("Triangle properties:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
