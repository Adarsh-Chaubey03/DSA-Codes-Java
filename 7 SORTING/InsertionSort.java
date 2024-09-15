import java.util.Arrays;
import java.util.Scanner;

/*
-------------====================> INSERTION SORT <============================--------

 * * Tke one element form the one unsorted part => iterate => find the correct position

 * *
-------------Space Complexity = O(n)------------------------------------------------------------------------------------
- no extra space is created
- same array is altered

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:       O(n)                             * while loop unused              ||
||    Average Care:    O(n^2)                                                              ||
||    Worst Case:      O(n^2)                                                              ||
=============================================================================================

* *
-------------------------------------------------------------Note-------------------------------------------------------
- stable sort
- in-place algorithm
- applications:
--------------
   * * when n  is small
   * * when some part of array is already sorted

 */
public class InsertionSort {
    static void insertionSort(int[] arr, int n){
        // assuming first element to be a part of the sorted list
        for (int i = 1; i < n; i++){
            int j =i;
            while (j>0 && arr[j]<arr[j-1]){
                // swap arr[j],arr[j-1]
               int temp = arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< n ;i++){
            arr[i]= sc.nextInt();
        }
        insertionSort(arr,n);
        System.out.print(Arrays.toString(arr) + " ");

    }
}

