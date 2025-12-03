import java.util.Scanner;

// Class definition for the Calculator logic
class Calculator {

    // Method to perform the calculation based on inputs
    public double performOperation(double a, double b, String operation) {
        double result = 0;

        // Convert operation to lowercase to handle "Add", "ADD", "add" etc.
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                result = a + b;
                break;

            case "subtract":
            case "-":
                result = a - b;
                break;

            case "multiply":
            case "*":
                result = a * b;
                break;

            case "divide":
            case "/":
                // Check for division by zero to prevent errors
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN; // Return Not-a-Number to indicate error
                }
                break;

            default:
                System.out.println("Error: Invalid operation type.");
                return Double.NaN;
        }
        return result;
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // input: 'a' (double)
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        // input: 'b' (double)
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        // Consume the newline left-over
        scanner.nextLine(); 

        // input: 'type of operation' (string)
        // Accepts symbols (+, -, *, /) or words (add, subtract, etc.)
        System.out.print("Enter operation (+, -, *, / or add, subtract, etc): ");
        String typeOfOperation = scanner.nextLine();

        // Create an instance (object) of the Calculator class
        Calculator myCalc = new Calculator();

        // Perform the operation using the class method
        double result = myCalc.performOperation(a, b, typeOfOperation);

        // Display the result if it is valid
        if (!Double.isNaN(result)) {
            System.out.println("--------------------------------");
            System.out.println("Result: " + result);
            System.out.println("--------------------------------");
        }

        // Close the scanner
        scanner.close();
    }
}
