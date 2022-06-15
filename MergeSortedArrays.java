package Sorting;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array a: ");
        int m = sc.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("size of array b: ");
        int n = sc.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int res[] = new int[m + n];

        int i = 0;
        int k = 0;
        int j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                k++;
                i++;
            } else {
                res[k] = b[j];
                k++;
                j++;
            }
        }
        for (; i < m; i++) {
            res[k] = a[i];
            k++;
        }
        for (; j < n; j++) {
            res[k] = b[j];
            k++;
        }
        for (i = 0; i < m + n; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
