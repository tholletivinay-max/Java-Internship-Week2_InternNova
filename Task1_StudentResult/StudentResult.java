package Task1_StudentResult;

public class StudentResult {

    public static void main(String[] args) {

        // Create Scanner object for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Get student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Get marks
        System.out.print("Enter Subject 1 Marks: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int subject3 = sc.nextInt();

        // Calculate total
        int total = subject1 + subject2 + subject3;

        // Calculate percentage
        double percentage = (total / 300.0) * 100;

        // Check result
        String result;

        if (subject1 >= 35 &&
            subject2 >= 35 &&
            subject3 >= 35) {

            result = "PASS";

        } else {

            result = "FAIL";
        }

        // Display result
        System.out.println("\n----- STUDENT RESULT -----");

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        sc.close();
    }
}
