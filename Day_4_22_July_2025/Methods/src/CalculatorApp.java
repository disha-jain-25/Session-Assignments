import java.util.Scanner;

public class CalculatorApp {

    // Addition method
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
