import java.util.Scanner;

class ConditionalSeriesGenerator {

    public static void generateSeries(int a) {
        
        int loopCount;
        
        if (a <= 0) {
            System.out.println("Input must be a positive integer.");
            return; 
        }
        
        // Determine the length of the series
        // If 'a' is odd (remainder is not 0), loop 'a' times.
        if (a % 2 != 0) {
            loopCount = a;
        } 
        // If 'a' is even, loop 'a - 1' times.
        else { 
            loopCount = a - 1;
        }
        
        int currentOddNumber = 1;
        System.out.print("Input a = " + a + ", then output: ");

        // Generate the series
        for (int i = 1; i <= loopCount; i++) {
            
            System.out.print(currentOddNumber);
            
            // Print comma separator
            if (i < loopCount) {
                System.out.print(", ");
            }
            
            currentOddNumber += 2;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single integer (a): ");
        
        if (scanner.hasNextInt()) {
            int inputA = scanner.nextInt();
            generateSeries(inputA);
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }
        
        scanner.close();
    }
}