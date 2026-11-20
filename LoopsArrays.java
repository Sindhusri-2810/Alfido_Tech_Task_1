import java.util.Scanner;

public class LoopsArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Array and For Loop
        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        // Display Marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }

        // Calculate Average
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        // If-Else Condition
        if (average >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // While Loop
        System.out.println("\nWhile Loop:");

        int count = 1;

        while (count <= 3) {
            System.out.println(count);
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 3);

        sc.close();
    }
}