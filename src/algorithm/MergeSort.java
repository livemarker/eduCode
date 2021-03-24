package algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length);
    }

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

        if (hi - lo <= 1) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++) {
            if (i == mid) {
                aux[k] = a[j++];
            } else if (j == hi) {
                aux[k] = a[i++];
            } else if (a[j].compareTo(a[i]) < 0) {
                aux[k] = a[j++];
            } else {
                aux[k] = a[i++];
            }
        }
        System.out.println(Arrays.toString(a));
        for (int k = lo; k < hi; k++) {
            a[k] = aux[k];
        }

    }

    public static void main(String[] args) {
        Comparable[] a=new Comparable[10];
        for (int i = 0; i <a.length ; i++) {
            a[i]=Math.random()*10;
        }
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
