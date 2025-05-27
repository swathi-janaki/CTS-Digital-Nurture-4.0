import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter student ID and name (type 'exit' to stop):");

        while (true) {
            System.out.print("Enter student ID: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                int id = Integer.parseInt(input);
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                studentMap.put(id, name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a numeric value.");
            }
        }

        System.out.print("\nEnter an ID to retrieve the name: ");
        try {
            int searchId = Integer.parseInt(scanner.nextLine());
            String studentName = studentMap.get(searchId);

            if (studentName != null) {
                System.out.println("Student Name: " + studentName);
            } else {
                System.out.println("No student found with ID " + searchId);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input.");
        }

        scanner.close();
    }
}
