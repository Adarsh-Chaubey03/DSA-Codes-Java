/*------------------================================= Bubble Sort Algorithms ====================================================----------------

we do certain number of passes to compare adjacent number and if they are not it correct order
we swap them

 * * total number of pass = n -1
where n = arr.length

 * * maximum number of swap in worst case = n * (n-1) /2

--------------------------------------------------------------------------------------------------------------------------------------------------

Stable Sort-
-----------
 * * order of appearance of duplicate elements in sorted are same as given in unsorted array
Example_ BUBBLE SORT ( It is an in-place algorithm)

Unstable Sort-
-------------
 * * order of appearance of duplicate elements in sorted are not same as given in unsorted array

-------------------------------------------------------------------------------------------------------------------------------------------------
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:       O(n)                                                                ||
||    Average Care:    O(n^2)                                                              ||
||    Worst Case:      O(n^2)                                                              ||
=============================================================================================
*/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    static void isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {   // n-1 passes            //worst case time complexity =O(n^2)
            for (int j = 0; j < n - i - 1; j++) {
            if (arr[j]>arr[j+1]){
       //swap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
        }
    }
/*
------------------------optimised case for nearly sorted array---------------------------------
best case time complexity : O(n)

 static void isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {   // n-1 passes            // time complexity =O(n^2)
            boolean flag = false;   // any swapping happened
            for (int j = 0; j < n - i - 1; j++) {
            if (arr[j]>arr[j+1]){
       //swap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag= true;
              }
            }
            if (!flag){
                return; // has any swapping happened
            }
        }
    }
 ---------------------------------------------------------------------------------------------------
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 3
        int[] arr= new int[n];
        for (int i = 0 ; i< n ; i++){    // 4 0 1
            arr[i]= sc.nextInt();
        }
        isSorted(arr,n);
        System.out.println(Arrays.toString(arr) +" "); //[0,1,4]

    }
}
