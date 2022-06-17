package Sorting;

import java.util.Scanner;

public class QuickSortLomuto {
    public static int partition(int arr[],int l , int h ){
        int pivot = arr[h] ;
        int i = l-1;
        for(int j = l ;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[h];
        arr[h] = temp;
        return i+1;
    }
    public static void QuickSort(int arr[],int l ,  int h){
        if(l < h ){
            int p = partition(arr,l,h);
            QuickSort(arr,l,p-1);
            QuickSort(arr,p+1,h);
        }
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
        QuickSort(arr,0,n-1);
        for (int i = 0 ;i<n ;i++){
            System.out.print( arr[i]+" " );
        }
    }
}
