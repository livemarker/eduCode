package algorithm;

public class Fibonacci {

    // не эффективный алгоритм
    private static long fiNaive(int n) {
        if (n <= 1) {
            return n;
        }

        return fiNaive(n - 1) + fiNaive(n - 2);
    }

    private static long fiEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public void start() {
        System.out.println(fiNaive(5));
        System.out.println(fiEffective(100));
    }
}
