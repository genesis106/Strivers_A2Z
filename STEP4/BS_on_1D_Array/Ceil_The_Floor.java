package STEP4.BS_on_1D_Array;

public class Ceil_The_Floor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        if (a[0] > x) {
            return new int[] { -1, a[0] };
        }
        if (a[n - 1] < x) {
            return new int[] { a[n - 1], -1 };
        }
    
        int start = 0;
        int end = n - 1;
    
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == x) {
                return new int[] { x, x };
            } else if (a[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        return new int[] { a[end], a[start] };
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 4, 7, 8, 10 };
        int[] arr = getFloorAndCeil(a, 6, 2);
        System.out.println(arr[0] + " : " + arr[1]);
    }
}
