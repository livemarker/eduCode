package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Greedy3ArraySort {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            a.add(r.nextInt(100000));
        }
        System.out.println(a.toString());
        System.out.println(sort(a).toString());
    }

    public static ArrayList sort(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        while (!a.isEmpty()) {
            int num = a.get(0);
            int temp=0;
            for (int j = 1; j < a.size(); j++) {
                if (num > a.get(j)) {
                    num = a.get(j);
                    temp=j;
                }
            }
            b.add(num);
            a.remove(temp);
        }
        return b;
    }
}
