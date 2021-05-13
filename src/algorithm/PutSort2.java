package algorithm;

import java.util.Arrays;

public class PutSort2 {

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    exchange(a, j - 1, j);
                }
                else break;
            }
        }
    }

     static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = temp;
        a[i] = a[j];
        a[j] = temp;

    }
    public static void main(String[] args) {
        int[]a={5,4,8,5,66,1,2,5,44,5,677,8,555,99,61};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
