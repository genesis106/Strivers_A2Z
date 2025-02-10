package Arrays.EASY;

import java.util.ArrayList;

public class find_Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int pointerA=0, pointerB=0;
        while(pointerA<a.length&&pointerB<b.length){
            int elementA=a[pointerA];
            int elementB=b[pointerB];
            if(elementA<elementB){
                list.add(elementA);
                while (pointerA<a.length&&a[pointerA]==elementA) {
                    ++pointerA;
                }
            }else if(elementB<elementA){
                list.add(elementB);
                while (pointerB<b.length&&b[pointerB]==elementB) {
                    ++pointerB;
                }
            }else{
                list.add(elementA);
                while (pointerA<a.length&&a[pointerA]==elementA) {
                    ++pointerA;
                }
                while (pointerB<b.length&&b[pointerB]==elementB) {
                    ++pointerB;
                }
            }
        }
        while(pointerA<a.length){
            int elementA=a[pointerA];
            list.add(elementA);
            while (pointerA<a.length&&a[pointerA]==elementA) {
                ++pointerA;
            }
        }
        while(pointerB<b.length){
            int elementB=b[pointerB];
            list.add(elementB);
            while (pointerB<b.length&&b[pointerB]==elementB) {
                ++pointerB;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5};
        int[] b={1, 2, 3};
        ArrayList<Integer> al=findUnion(a, b);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
