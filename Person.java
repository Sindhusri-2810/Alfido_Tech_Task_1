public class Person {

protected String name;
protected int age;

// Constructor
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

// Method
public void displayPersonDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
public void displayRole() {
    System.out.println("I am a Person");
}
}