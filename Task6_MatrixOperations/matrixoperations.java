package Task6_MatrixOperations;

public class matrixoperations {

    public static void main(String[] args) {

        // Create Scanner object for input
        java.util.Scanner sc =
                new java.util.Scanner(System.in);

        // Declare a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Variable to store sum
        int sum = 0;

        // Get matrix elements from user
        System.out.println("ENTER 3x3 MATRIX ELEMENTS:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter element [" + i + "][" + j + "]: "
                );

                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\n----- 3x3 MATRIX -----");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println();
        }

        // Calculate sum of all elements
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sum = sum + matrix[i][j];

            }
        }

        // Display total sum
        System.out.println("\nSum of Matrix Elements: " + sum);

        sc.close();
    }
}
