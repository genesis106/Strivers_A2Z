package Arrays.MEDIUM;

import java.util.ArrayList;

public class leaders_in_array {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length - 1]);
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                list.add(0,arr[i]);
                max = arr[i];
            }
        }
        return list;
    }
}
