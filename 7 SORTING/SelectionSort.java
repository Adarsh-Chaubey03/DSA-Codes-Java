import java.util.Scanner;

/*
-------------------------======================SELECTION SORT ALGORITHM========================-------------------------
  * *
-------------Space Complexity = O(n)------------------------------------------------------------------------------------
- no extra space is created
- same array is altered

 * *
=============================================================================================
||    TIME COMPLEXITY-                                                                     ||
||    ----------------                                                                     ||
||    Best Case:       O(n^2)                                                                ||
||    Average Care:    O(n^2)                                                              ||
||    Worst Case:      O(n^2)                                                              ||
=============================================================================================

* *
-------------------------------------------------------------Note-------------------------------------------------------
- unstable sort
- in-place algorithm

 */
  public class SelectionSort {
      static void selectionSort(int[] arr,int n){
          for (int i = 0 ; i < n ; i ++){ // i => representing the current index
              // Finding minimum element in the unsorted array
          int min_index = i;
          for (int j = i+1; j < n ; j ++){
              if (arr [j]< arr[min_index]){
                  min_index=j;
              }
          }
          // swap current element and minimum element
              int temp = arr[i];
          arr[i] = arr[min_index];
          arr[min_index]= temp;
          }
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< n ;i++){
            arr[i]= sc.nextInt();
        }
        selectionSort(arr,n);
        for (int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
