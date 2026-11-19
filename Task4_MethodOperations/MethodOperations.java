package Task4_MethodOperations;

public class MethodOperations {

    // Method to find square
    static int square(int number) {
        return number * number;
    }

    // Method to find cube
    static int cube(int number) {
        return number * number * number;
    }

    // Method to find average of three numbers
    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    // Method to find maximum of two numbers
    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {

        java.util.Scanner sc =
                new java.util.Scanner(System.in);

        // Input for square
        System.out.print("Enter a number for square: ");
        int num1 = sc.nextInt();

        // Input for cube
        System.out.print("Enter a number for cube: ");
        int num2 = sc.nextInt();

        // Input for average
        System.out.println("Enter three numbers for average:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Input for maximum
        System.out.println("Enter two numbers to find maximum:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        // Display results
        System.out.println("\n----- METHOD OPERATIONS -----");

        System.out.println("Square: " + square(num1));

        System.out.println("Cube: " + cube(num2));

        System.out.println("Average: " + average(a, b, c));

        System.out.println("Maximum: " + maximum(x, y));

        sc.close();
    }
}
