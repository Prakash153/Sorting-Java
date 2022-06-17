package Sorting;

import java.util.Scanner;

public class QuicksortHoares {
    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition using Hoare's Partitioning scheme
    public static int partitionH(int[] a, int low, int high)
    {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;

        while (true)
        {
            do {
                i++;
            } while (a[i] < pivot);

            do {
                j--;
            } while (a[j] > pivot);

            if (i >= j) {
                return j;
            }

            swap(a, i, j);
        }
    }
    public static void quicksort(int[] a, int low, int high)
    {
        // base condition
        if (low >= high) {
            return;
        }

        // rearrange elements across pivot
        int pivot = partitionH(a, low, high);

        // recur on subarray containing elements less than the pivot
        quicksort(a, low, pivot);

        // recur on subarray containing elements more than the pivot
        quicksort(a, pivot + 1, high);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for (int i = 0 ;i<n ;i++){
            System.out.print( arr[i]+" " );
        }
    }
}
