// The file name must match the public class name exactly (HelloWorld.java)
public class HelloWorld {
    // The main method is the entry point of any Java application
    public static void main(String[] args) {
        // Prints "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
}
----------------second code--------------
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Perform the arithmetic calculation based on user choice
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Quick check to avoid dividing by zero
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator selected.");
                return;
        }

        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

        // Close the scanner resource
        scanner.close();
    }
}

