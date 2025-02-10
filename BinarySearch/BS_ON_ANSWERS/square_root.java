package BinarySearch.BS_ON_ANSWERS;

public class square_root {
    int floorSqrt(int n) {
        int start=0;
        int end=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid<n){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
