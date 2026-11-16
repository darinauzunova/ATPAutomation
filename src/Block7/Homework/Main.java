package Block7.Homework;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Area: %.2f%n", shape.area());
            System.out.printf("Perimeter: %.2f%n", shape.perimeter());
            System.out.println();
        }
    }
}
