import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

class DivisibilityCounter {

    /**
     * Calculates the count of numbers in the list that are multiples of divisors [1..9].
     */
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        
        // Map to store the result: {Divisor: Count}
        Map<Integer, Integer> results = new HashMap<>();
        
        // Define the divisors to check (1 through 9)
        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Initialize the map with all divisors and a count of 0
        for (int divisor : divisors) {
            results.put(divisor, 0);
        }

        // Iterate through each number in the input list
        for (int number : numbers) {
            
            // For each number, check divisibility against all divisors
            for (int divisor : divisors) {
                
                // Use the modulus operator (%) to check for exact divisibility
                if (number % divisor == 0) {
                    
                    // Increment the count for the current divisor
                    results.put(divisor, results.get(divisor) + 1);
                }
            }
        }
        
        return results;
    }

    public static void main(String[] args) {
        // The input list of numbers (dictionary)
        List<Integer> inputList = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        // Get the result map
        Map<Integer, Integer> outputMap = countMultiples(inputList);

        // Print the output in the desired format
        System.out.println("Input List: " + inputList);
        System.out.println("Output: " + outputMap);
    }
}