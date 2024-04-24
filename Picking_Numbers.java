import java.util.*;

public class Picking_Numbers {

    public static int pickingNumbers(List<Integer> a) {
        // Create a frequency count of numbers
        int[] freq = new int[101]; // We have constraints on the maximum value of numbers
        for (int num : a) {
            freq[num]++;
        }

        // Iterate through frequencies to find the maximum sum of two frequencies
        int maxLength = 0;
        for (int i = 1; i <= 100; i++) {
            maxLength = Math.max(maxLength, freq[i] + freq[i - 1]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> arr1 = Arrays.asList(4, 6, 5, 3, 3, 1);
        List<Integer> arr2 = Arrays.asList(1, 2, 2, 3, 1, 2);
        System.out.println(pickingNumbers(arr1)); // Output: 3
        System.out.println(pickingNumbers(arr2)); // Output: 5
    }
}
