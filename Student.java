public class Student extends Person {

private int studentId;
private String department;
private int marks;

// Constructor
public Student(int studentId, String name, int age,
               String department, int marks) {

    super(name, age);

    this.studentId = studentId;
    this.department = department;
    this.marks = marks;
}

// Getters
public int getStudentId() {
    return studentId;
}

public String getDepartment() {
    return department;
}

public int getMarks() {
    return marks;
}

// Setters
public void setMarks(int marks) {
    this.marks = marks;
}

// Display method
public void displayDetails() {
    displayPersonDetails();

    System.out.println("Student ID: " + studentId);
    System.out.println("Department: " + department);
    System.out.println("Marks: " + marks);
}

public void displayRole() {
    System.out.println("I am a Student");
}
public void displayMarks(int marks) {
    System.out.println("Marks: " + marks);
}

public void displayMarks(int marks, int bonus) {
    System.out.println("Total Marks: " + (marks + bonus));
}
}