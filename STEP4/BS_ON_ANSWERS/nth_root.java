package STEP4.BS_ON_ANSWERS;

public class nth_root {
    private int floorSqrt(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int nthRoot(int n, int m) {
        if (n == 1) {
            return m;
        }
        if (n == 0) {
            return -1;
        }
        int times = (int) (Math.log(n) / Math.log(2));
        int num = m;
        for (int i = 1; i <= times; i++) {
            num = floorSqrt(num);
        }
        return num;
    }
}
