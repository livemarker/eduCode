package algorithm;

import java.util.Scanner;

public class BinarySearchh {
    public static int binarySearch(int lo, int hi) {
        if (hi - lo == 1) {
            return lo;
        }
        int mid = lo + (hi - lo) / 2;
        System.out.println("Greater than or equal to " + mid + "? ");
        Scanner sc = new Scanner(System.in);
        if (sc.nextBoolean()) {
            return binarySearch(mid, hi);
        } else {
            return binarySearch(lo, mid);
        }

    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        int n = k * 20+200;
        System.out.println("Number between 0 and " + (n - 1));
        int guess = binarySearch(0, n);
        System.out.println("Ur number is " + guess);
    }
}
