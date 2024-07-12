import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private static ArrayList<Student> studentList = new ArrayList<>();  // List to store student objects
    private static int totalStudents = 0;  // Counter for the total number of students

    public static boolean studentIdExists(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static int getIntInput(Scanner input) {
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    public static void addNewStudent(Scanner input) {
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        int id;
        while (true) {
            System.out.print("Enter student ID: ");
            id = getIntInput(input);
            if (studentIdExists(id)) {
                System.out.println("Student with this ID already exists. Please enter a unique ID.");
            } else {
                break;
            }
        }

        System.out.print("Enter student age: ");
        int age = getIntInput(input);

        System.out.print("Enter student grades: ");
        String grade = input.nextLine();

        Student newStudent = new Student(id, age, name, grade);
        studentList.add(newStudent);
        totalStudents++;

        System.out.println("Student added successfully.");
    }

    public static void deleteStudent(Scanner input) {
        System.out.print("Enter student ID to delete: ");
        int id = getIntInput(input);

        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                totalStudents--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student ID not found. Deletion failed.");
    }

    public static void updateStudent(Scanner input) {
        System.out.print("Enter student ID to update: ");
        int id = getIntInput(input);

        for (Student student : studentList) {
            if (student.getId() == id) {
                // Display options for the user to choose the field to update
                System.out.println("Choose the field to update:");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Grade");
                System.out.println("4. Update All Fields");
                System.out.print("Enter your choice: ");

                int fieldChoice = StudentManagement.getIntInput(input);

                switch (fieldChoice) {
                    case 1:
                        System.out.print("Enter new student name: ");
                        String newName = input.nextLine();
                        student.setName(newName);
                        break;
                    case 2:
                        System.out.print("Enter new student age: ");
                        int newAge = StudentManagement.getIntInput(input);
                        student.setAge(newAge);
                        break;
                    case 3:
                        System.out.print("Enter new student grade: ");
                        String newGrade = input.nextLine();
                        student.setGrade(newGrade);
                        break;
                    case 4:
                        System.out.print("Enter new student name: ");
                        String updatedName = input.nextLine();

                        System.out.print("Enter new student age: ");
                        int updatedAge = StudentManagement.getIntInput(input);

                        System.out.print("Enter new student grade: ");
                        String updatedGrade = input.nextLine();

                        // Update all fields at once
                        student.setName(updatedName);
                        student.setAge(updatedAge);
                        student.setGrade(updatedGrade);
                        break;
                    default:
                        System.out.println("Invalid choice. No fields updated.");
                        return;
                }
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    public static void viewStudent(Scanner input) {
        System.out.print("Enter student ID to view details: ");
        int id = getIntInput(input);

        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println("Student Details:");
                System.out.println("Name: " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("Age: " + student.getAge());
                System.out.println("Grade: " + student.getGrade());
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    public static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found. Please add students first.");
        } else {
            // Display details (ID and name) of all students
            System.out.println("List of All Students:");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        }
    }
}
