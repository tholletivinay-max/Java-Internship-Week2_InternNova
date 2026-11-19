package Task3_Calculator;

import java.util.Scanner;

public class Calculator {

    // Method for Addition
    static double addition(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    static double subtraction(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    static double multiplication(double a, double b) {
        return a * b;
    }

    // Method for Division
    static double division(double a, double b) {
        return a / b;
    }

    // Method for Modulus
    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        // Display calculator results
        System.out.println("\n----- CALCULATOR RESULTS -----");

        System.out.println("Addition: " +
                addition(num1, num2));

        System.out.println("Subtraction: " +
                subtraction(num1, num2));

        System.out.println("Multiplication: " +
                multiplication(num1, num2));

        // Check division by zero
        if (num2 != 0) {

            System.out.println("Division: " +
                    division(num1, num2));

            System.out.println("Modulus: " +
                    modulus(num1, num2));

        } else {

            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulus: Cannot calculate with zero");
        }

        sc.close();
    }
}
