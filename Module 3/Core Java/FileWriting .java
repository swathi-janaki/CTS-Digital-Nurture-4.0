import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String input = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        scanner.close();
    }
}
