package week4.homeassign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumberFinder {
	
	public static void main(String[] args) {
		// Step 1: Declare and initialize the array
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));

        // Step 2: Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Step 3: Loop through the sorted list
        for (int i = 0; i < numbers.size() - 1; i++) {
            int current = numbers.get(i);       // Get current number
            int next = numbers.get(i + 1);      // Get next number

            // Step 4: Check if there's a gap between current and next
            if (next - current > 1) {
                // Step 5: Use a for loop to print all missing numbers between current and next
                for (int j = current + 1; j < next; j++) {
                    System.out.println("Missing number: " + j);
                }
            }
        }
    }
}


