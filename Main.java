//Name: Anushka Chatterjee
//PRN: 23070126015
//Batch: SY AIML A1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting Even and Odd numbers
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        EvenOddSorter.sortEvenOdd(numbers, even, odd);

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

        // Finding smallest neighboring difference
        int index = SmallestNeighborDistance.findSmallestDistance(numbers);
        if (index != -1) {
            System.out.println("Index of first number with smallest difference: " + index);
        } else {
            System.out.println("Not enough elements to compare.");
        }

        // Convert Array ↔ ArrayList
        ArrayList<Integer> numberList = ArrayConverter.arrayToList(numbers);
        int[] newArray = ArrayConverter.listToArray(numberList);

        System.out.println("Converted ArrayList: " + numberList);
        System.out.println("Converted Array: " + Arrays.toString(newArray));

        scanner.close();
    }
}
