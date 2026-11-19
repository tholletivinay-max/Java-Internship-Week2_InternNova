package Task2_NumberPractice;
public class NumberPractice {
    public static void main(String[] args) {
        // 1. Print numbers from 1 to 100
        System.out.println("NUMBERS FROM 1 TO 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        // 2. Print even numbers from 1 to 100
        System.out.println("\n\nEVEN NUMBERS FROM 1 TO 100:");

        int even = 2;

        while (even <= 100) {
            System.out.print(even + " ");
            even += 2;
        }
        // 3. Print odd numbers from 1 to 100
        System.out.println("\n\nODD NUMBERS FROM 1 TO 100:");
        int odd = 1;
        do {
            System.out.print(odd + " ");
            odd += 2;
        } while (odd <= 100);
        // 4. Calculate sum from 1 to 100
        System.out.println("\n\nSUM OF NUMBERS FROM 1 TO 100:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
