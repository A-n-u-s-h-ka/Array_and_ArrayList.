import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverter {
    // Convert Array to ArrayList
    public static ArrayList<Integer> arrayToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    // Convert ArrayList to Array
    public static int[] listToArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
