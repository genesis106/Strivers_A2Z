package STEP3.EASY;

public class Linear_Search {
    static boolean searchInSorted(int arr[], int k) {
        for(int num:arr){
            if(num==k){return true;}
        }
        return false;
    }
}
