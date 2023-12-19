import java.util.ArrayList;

public class LinearSearchImpConcept {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 8, 10, 1, 2, 3, 4, 5, 6, 7, 7, 7, 200 };
        int target = 7;
        ArrayList<Integer> indices = search(arr, target, 0);
        for (Integer list : indices) {
            System.out.println(list);
        }
    }

    public static ArrayList<Integer> search(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (index == arr.length) {
            return list;
        }

        if (target == arr[index]) {
            list.add(index);
        }
        ArrayList<Integer> ans = search(arr, target, index + 1);
        ans.addAll(list);
        return ans;

    }
}
