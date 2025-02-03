import java.util.*;
public class SmallestNeighborDistance {
    // Method to find index of first number with smallest difference
    public static int findSmallestDistance(int[] arr) {
        if (arr.length < 2) return -1; // Edge case: less than 2 elements

        int minDiff = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }
        return index;
    }
}
