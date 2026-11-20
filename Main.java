import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Department: ");
    String department = sc.nextLine();

    System.out.print("Enter Marks: ");
    int marks = sc.nextInt();

    // Creating Student object
    Student s1 = new Student(id, name, age, department, marks);

    // Display student details
    System.out.println("\n===== STUDENT DETAILS =====");
    s1.displayDetails();

    // Updating marks
    System.out.print("\nEnter updated marks: ");
    int updatedMarks = sc.nextInt();

    s1.setMarks(updatedMarks);

    System.out.println("\n===== UPDATED DETAILS =====");
    s1.displayDetails();
s1.displayRole();
s1.displayMarks(450);
s1.displayMarks(450, 20);
    sc.close();
}

}