import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

       
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
