package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PutSort {
    public static void main(String[] args) {
        String [] str={"qqq","w", "eee","aa","xxxx"};
        sort(str);
        System.out.println(Arrays.toString(str));
    }


    public static void sort(String[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(a[j-1]+">"+a[j]);
                if (a[j - 1].compareTo(a[j]) > 0) {
                    exchange(a, j - 1, j);

                } else break;
            }
        }
    }

    public static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
