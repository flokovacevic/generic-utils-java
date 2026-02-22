/**
 * A collection of generic utility methods that work with any type.
 *
 * @author Florian Kovacevic
 * @version 2026-02-22
 */
public class GenericUtils {

    /**
     * Reverses the given array in-place.
     * The first element becomes the last and the last becomes the first.
     * No new array is created.
     *
     * @param <T>   the type of elements in the array
     * @param array the array to reverse
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap left and right element
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in the given array and returns it as a double.
     * Only works with subclasses of Number (e.g. Integer, Double, Float).
     *
     * @param <T>   the type of elements in the array — must extend Number
     * @param array the array to sum up
     * @return the sum of all elements as a double, or 0.0 if the array is empty
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;

        for (T number : array) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
