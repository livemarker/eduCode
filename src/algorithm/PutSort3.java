package algorithm;

import java.util.Arrays;
import java.util.Random;

public class PutSort3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println("\n"+Arrays.toString(a));
    }
    public static void sort(int[] a){

        for (int i = 0; i <a.length ; i++) {
            for (int j=0;j<a.length;j++){
                int temp;
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
    }
}
