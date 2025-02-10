package ContestsLC;

public class maxSubWqProducts {
    class Solution {
        public int maxLength(int[] nums) {
            int n = nums.length;
            int start = 0, maxLength = 0;
            long prod = 1, currentGCD = 0, currentLCM = 1;
    
            for (int end = 0; end < n; end++) {
               
                prod = Multiply(prod, nums[end]);
                currentGCD = gcd(currentGCD, nums[end]);
                currentLCM = lcm(currentLCM, nums[end]);
    
                while (start <= end && prod != Multiply(currentLCM, currentGCD)) {
                    prod /= nums[start];
                    start++;
    
                    if (start <= end) {
                        currentGCD = nums[start];
                        currentLCM = nums[start];
                        for (int i = start + 1; i <= end; i++) {
                            currentGCD = gcd(currentGCD, nums[i]);
                            currentLCM = lcm(currentLCM, nums[i]);
                        }
                    }
                }
    
                if (prod == Multiply(currentLCM, currentGCD)) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
    
            return maxLength;
        }
    
        private long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    
        private long lcm(long a, long b) {
            if (a == 0 || b == 0) return 0;
            long gcd = gcd(a, b);
            return Math.abs(a / gcd * b);
        }
    
        private long Multiply(long a, long b) {
            if (a == 0 || b == 0) return 0;
            if (b > Long.MAX_VALUE / a) return Long.MAX_VALUE;
            return a * b;
        }
    }
    