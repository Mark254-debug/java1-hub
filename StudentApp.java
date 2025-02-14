

import java.util.Scanner;

// Class StudentRecord
 class StudentRecord {
    // Fields
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Class StudentApp to interact with the user
public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object using user-provided data
        StudentRecord studentRecord = new StudentRecord(studentID, name, course);

        // Call displayInfo method to show student's details
        studentRecord.displayInfo();

        // Close scanner resource
        scanner.close();
    }
}