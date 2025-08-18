//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        double rectangleArea = shape.area(10.5, 4.0);
        double circleArea = shape.area(3.5);
        double squareArea = shape.area(5);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Square: " + squareArea);
    }
}