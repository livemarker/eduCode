package algorithm;

import java.util.Arrays;
//dont work
public class QuickSort {
    public static int[] sort(int[] a) {

        if (a.length == 1) {
            return a;
        }
        int hi = a.length - 1;
        int lo = a[0];
        int mid = a.length / 2;
        int[] b = new int[mid];
        int[] c = new int[hi - mid];
    

        return null;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(sort(a)));
    }
}
