import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSorter {
    // Method to separate even and odd numbers
    public static void sortEvenOdd(int[] numbers, ArrayList<Integer> even, ArrayList<Integer> odd) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
    }
}
