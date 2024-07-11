import java.util.Scanner;

public class App {
    // Create an object of input
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App system = new App();
        system.run();
    }

    public void run() {
        try {
            int choice;
            do {
                // Displaying the main menu
                System.out.println("\n===== Student Record Management System =====");
                System.out.println("1. Add New Student");
                System.out.println("2. Delete A Student");
                System.out.println("3. Update Student Information");
                System.out.println("4. View Student Details");
                System.out.println("5. View All Students");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: "); // The print() method does not move the cursor to a new line0000.

                // Get the user's choice
                // nextInt() reads a int value from the user
                choice = input.nextInt();

                // Switch statements to perform actions based on the user's choice
                switch (choice) {
                    case 1:
                        StudentManagement.addNewStudent(input);
                        break;
                    case 2:
                        StudentManagement.deleteStudent(input);
                        break;
                    case 3:
                        StudentManagement.updateStudentInformation(input);
                        break;
                    case 4:
                        StudentManagement.viewStudentDetails(input);
                        break;
                    case 5:
                        StudentManagement.viewAllStudents();
                        break;
                    case 6:
                        // Exit the program
                        break;
                    default:
                        // Handle invalid input and display appropriate error messages
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 6);
        } finally {
            System.out.println("Goodbye!");
            // Close the input in a finally block to ensure it's always closed
            input.close();
        }
    }
}