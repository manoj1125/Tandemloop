import java.util.Scanner;

/**
 * This class takes a single integer input 'a' and generates a series 
 * containing the first 'a' positive odd numbers (1, 3, 5, 7, ...).
 */
class IntegerSeriesGenerator {

    /**
     * Generates and prints the series of odd positive integers.
     * The method calculates and prints 'a' number of odd integers.
     * * @param a The count of odd numbers to generate.
     */
    public static void generateSeries(int a) {
        // --- 1. Initialize the starting odd number ---
        int currentOddNumber = 1;
        
        // Output header for clarity
        System.out.print("Output for input a = " + a + " is: ");
        
        // --- 2. Loop 'a' times to generate 'a' numbers ---
        // 'i' represents the number of terms generated so far.
        for (int i = 1; i <= a; i++) {
            
            // --- 3. Print the current odd number ---
            System.out.print(currentOddNumber);
            
            // --- 4. Print a comma and space unless it's the last number ---
            if (i < a) {
                System.out.print(", ");
            }
            
            // --- 5. Increment to the next odd number (1 -> 3, 3 -> 5, etc.) ---
            currentOddNumber += 2; 
        }
        
        System.out.println(); // Prints a newline for clean formatting
    }

    /**
     * Main method: handles user input and calls the generator method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a single integer (a) to determine the length of the series: ");
        
        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int inputA = scanner.nextInt();
            
            // Validate input: The count must be positive
            if (inputA > 0) {
                generateSeries(inputA);
            } else {
                System.out.println("Input must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }
        
        // Close the scanner to free resources
        scanner.close();
    }
}