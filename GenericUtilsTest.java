import java.util.*;

/**
 * Test class for GenericUtils.
 * Tests the reverse and sum methods with different types and edge cases.
 *
 * @author Florian Kovacevic
 * @version 2026-02-22
 */
public class GenericUtilsTest {

    /**
     * Runs all tests for the GenericUtils class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("=== Testing reverse ===");

        // Reverse a string array
        String[] words = {"Hello", "World", "Java"};
        System.out.println("Before: " + Arrays.toString(words));
        GenericUtils.reverse(words);
        System.out.println("After: " + Arrays.toString(words));

        // Reverse an integer array
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before: " + Arrays.toString(numbers));
        GenericUtils.reverse(numbers);
        System.out.println("After: " + Arrays.toString(numbers));

        // Array with one element should stay the same
        Integer[] single = {15};
        GenericUtils.reverse(single);
        System.out.println("Single element after reverse: " + single[0]);

        // Empty array should not crash
        Integer[] empty = {};
        GenericUtils.reverse(empty);
        System.out.println("Good - Empty array reversed without error");

        System.out.println("\n=== Testing sum ===");

        // Sum of integers
        Integer[] ints = {1, 2, 3, 4, 5};
        System.out.println("Sum of {1, 2, 3, 4, 5}: " + GenericUtils.sum(ints));

        // Sum of doubles
        Double[] doubles = {1.5, 2.5, 3.0};
        System.out.println("Sum of {1.5, 2.5, 3.0}: " + GenericUtils.sum(doubles));

        // Sum of floats
        Float[] floats = {1.1f, 2.2f, 3.3f};
        System.out.println("Sum of {1.1f, 2.2f, 3.3f}: " + GenericUtils.sum(floats));

        // Empty array should return 0
        Double[] emptyDouble = {};
        System.out.println("Sum of empty array: " + GenericUtils.sum(emptyDouble));
    }
}
