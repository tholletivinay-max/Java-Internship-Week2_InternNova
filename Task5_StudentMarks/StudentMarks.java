package Task5_StudentMarks;


public class StudentMarks {

    public static void main(String[] args) {

        // Create Scanner object
        java.util.Scanner sc =
                new java.util.Scanner(System.in);

        // Create a 1D array to store 5 students' marks
        int[] marks = new int[5];

        // Input marks from the user
        System.out.println("ENTER MARKS OF 5 STUDENTS:");

        for (int i = 0; i < 5; i++) {

            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Initialize total, highest and lowest
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        // Calculate total, highest and lowest
        for (int i = 0; i < 5; i++) {

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Calculate average
        double average = total / 5.0;

        // Display all marks
        System.out.println("\n----- STUDENT MARKS -----");

        for (int i = 0; i < 5; i++) {

            System.out.println(
                "Student " + (i + 1) + " Marks: " + marks[i]
            );
        }

        // Display calculated results
        System.out.println("\n----- MARKS ANALYSIS -----");

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
