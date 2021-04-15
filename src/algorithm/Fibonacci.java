package algorithm;

import java.util.Arrays;

public class Fibonacci {

    // не эффективный алгоритм(просто число n), эффективен с помощью массива(нет лишних вычислений)
    private static long fiNaive(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }

        long result = fiNaive(n - 1, mem) + fiNaive(n - 2, mem);
        mem[n] = result;

        return result;
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
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);


        System.out.println(fiNaive(n, mem));
        System.out.println(fiEffective(n));
    }
}
