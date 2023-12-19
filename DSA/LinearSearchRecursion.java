import java.util.ArrayList;
import java.util.List;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 8, 10, 1, 2, 3, 4, 5, 6, 7, 7, 7, 200 };
        int target = 7;
        List<Integer> indices = new ArrayList();
        search(arr, target, 0, indices);
        for (Integer list : indices) {
            System.out.println(list);
        }
    }

    public static void search(int arr[], int target, int index, List<Integer> indices) {
        if (index == arr.length) {
            return;
        }

        if (target == arr[index]) {
            indices.add(index);
        }
        search(arr, target, index + 1, indices);
    }
}
