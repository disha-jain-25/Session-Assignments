public class Shape {

    // Area of a rectangle (length × width)
    public double area(double length, double width) {
        return length * width;
    }

    // Area of a circle (π × radius²)
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a square (side × side)
    public double area(int side) {
        return side * side;
    }
}
