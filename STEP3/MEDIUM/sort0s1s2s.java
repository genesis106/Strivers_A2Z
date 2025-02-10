package STEP3.MEDIUM;

public class sort0s1s2s {
    public static void sort012(int[] arr) {
        int pointer0 = 0;
        int pointer2 = arr.length - 1;
        int iterator = 0;
        while (iterator <= pointer2) {
            if (arr[iterator] == 0) {
                arr[iterator] = arr[pointer0];
                if(iterator==pointer0){++iterator;}
                arr[pointer0++] = 0;
            } else if (arr[iterator] == 2) {
                arr[iterator] = arr[pointer2];
                arr[pointer2--] = 2;
            } else {
                ++iterator;
            }
        }
    }
    public static void main(String[] args) {
        sort012(new int[]{0 ,1 ,2 ,0 ,1, 2});
    }
}
