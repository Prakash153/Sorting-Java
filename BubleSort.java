package Sorting;

import java.util.Scanner;

public class BubleSort {
    static void bubblesort(int a[], int n) {
        for (int round = 0; round < n; round++) {
            for (int i = 0; i < n - 1 - round; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubblesort(a, n);
    }
}
