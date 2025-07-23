package week4.homeassign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Sample array
        Integer[] numbers =  {3, 2, 11, 4, 6, 7};

        // Convert array to List
        List<Integer> numberList = Arrays.asList(numbers);

        // Sort the list in ascending order
        Collections.sort(numberList);

        // Print the entire sorted list (optional)
        System.out.println("Sorted List: " + numberList);

        // Get the second largest number using get()
        int secondLargest = numberList.get(numberList.size() - 2);
        System.out.println("Second Largest Number: " + secondLargest);
        
	}
}